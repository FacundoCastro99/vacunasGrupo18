
package vacunasgrupo18.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import vacunasgrupo18.Entidades.CitaVacunacion;



public class CitaVacunacionData {
    
    private Connection con = null;
    
    public CitaVacunacionData(){
       con = Conexion.getConexion();
    
    
}
    
    public void guardarCita(CitaVacunacion cita){
        
        String sql = "INSERT INTO citavacunacion (persona, codRefuerzo, fechaHoraCita, centroVacunacion)"
                + " VALUES(?, ?, ?, ?)";
        
         try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cita.getPersona().getNombreCompleto());
            ps.setInt(2, cita.getCodRefuerzo());
            ps.setDate(3, Date.valueOf(cita.getFechaHoraCita()));
            ps.setString(4, cita.getCentroVacunacion());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if(rs.next()){
                
                cita.setCodCita(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Cita guardada");
                
                
            }
                
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            ex.printStackTrace();
        }
        
        
    }
    
    public void modificarCita(CitaVacunacion cita){
        
        String sql = "UPDATE citavacunacion SET Persona = ?, codRefuerzo = ?, fechaHoraCita = ?, centroVacunacion = ?"
                + " WHERE codCita = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cita.getPersona().getDni());
            ps.setInt(2, cita.getCodRefuerzo());
            ps.setDate(3, Date.valueOf(cita.getFechaHoraCita()));
            ps.setString(4, cita.getCentroVacunacion()); 
            ps.setInt(5, cita.getCodCita());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                
                JOptionPane.showMessageDialog(null, "Cita modificado");
                
                
            }
           
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
        
    }
    
    public void eliminarCita(int codCita){
         
         String sql = "DELETE FROM citavacunacion WHERE codCita = ?";
         
         try{
             
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, codCita);
             int exito = ps.executeUpdate();
             
             if(exito == 1){
                 
                 JOptionPane.showMessageDialog(null, "Cita eliminada");
                 
             }
             
             
         } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
         
         
     }
    


}
