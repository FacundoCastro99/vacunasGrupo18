
package vacunasgrupo18.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import vacunasgrupo18.Entidades.CitaVacunacion;
import vacunasgrupo18.Entidades.Ciudadano;



public class CitaVacunacionData {
    
    private Connection con = null;
    private CiudadanoData cd = new CiudadanoData();
    
    public CitaVacunacionData(){
       con = Conexion.getConexion();
    
    
}
    
    public void guardarCita(CitaVacunacion cita){
        
        String sql = "INSERT INTO citavacunacion (persona, email, codRefuerzo, fechaHoraCita, centroVacunacion, citaConcretada)"
                + " VALUES(?, ?, ?, ?, ?, ?)";
        
         try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cita.getPersona().getNombreCompleto());
            ps.setString(2, cita.getEmail().getEmail());
            ps.setInt(3, cita.getCodRefuerzo());
            ps.setTimestamp(4, new java.sql.Timestamp(cita.getFechaHoraCita().getTime()));
            ps.setString(5, cita.getCentroVacunacion());
            ps.setBoolean(6, cita.isCitaConcretada());
            
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
        
        String sql = "UPDATE citavacunacion SET codRefuerzo = ?, fechaHoraCita = ?, centroVacunacion = ?"
                + " WHERE codCita = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cita.getCodRefuerzo());
            ps.setTimestamp(2, new java.sql.Timestamp(cita.getFechaHoraCita().getTime()));
            ps.setString(3, cita.getCentroVacunacion()); 
            ps.setInt(4, cita.getCodCita());
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
    
    public CitaVacunacion buscarCitaPorCod(int cod){
        
        String sql = "SELECT codCita, Persona, codRefuerzo, fechaHoraCita, centroVacunacion, fechaHoraColoca, Dosis FROM citavacunacion WHERE codCita = ?";
        
        CitaVacunacion cita = null;
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                cita = new CitaVacunacion();
                cita.setCodCita(rs.getInt("codCita"));
                Ciudadano ciuda = (Ciudadano) cd.buscarCiudadanoPorNombre(rs.getString("Persona"));
                cita.setPersona(ciuda);
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getTimestamp("fechaHoraCita"));
                cita.setCentroVacunacion(rs.getString("centroVacunacion"));
                
                
            }else{
                
                JOptionPane.showMessageDialog(null, "No se ha encontrado la cita");
                    
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
        
        return cita;
                  
    }
    
    public List<CitaVacunacion> listarCitas(){
        
        String sql = "SELECT codCita, Persona, email, codRefuerzo, fechaHoraCita, centroVacunacion, fechaHoraColoca, Dosis, citaConcretada FROM citavacunacion";
        
        ArrayList<CitaVacunacion> citas = new ArrayList<>();
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                CitaVacunacion cita = new CitaVacunacion();
                cita.setCodCita(rs.getInt("codCita"));
                Ciudadano ciuda = cd.buscarCiudadanoPorNombre(rs.getString("Persona"));
                cita.setPersona(ciuda);
                cita.setEmail(ciuda);
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getTimestamp("fechaHoraCita"));
                cita.setCentroVacunacion(rs.getString("centroVacunacion"));
                cita.setFechaHoraColoca(rs.getTimestamp("fechaHoraColoca"));
                cita.setDosis(rs.getDouble("centroVacunacion"));
                cita.setCentroVacunacion(rs.getString("centroVacunacion"));
                
                citas.add(cita);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
        
        return citas;
                
    }
    
    


}
