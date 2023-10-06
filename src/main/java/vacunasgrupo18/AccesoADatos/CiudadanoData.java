
package vacunasgrupo18.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import vacunasgrupo18.Entidades.Ciudadano;


public class CiudadanoData {
    
    private Connection con = null;
    
    public CiudadanoData(){
        
        con = Conexion.getConexion();
        
    }
    
    public void guardarCiudadano(Ciudadano ciuda){
        
        String sql = "INSERT INTO ciudadano (DNI, nombreCompleto, email, celular, patologia, ambitoTrabajo)"
                + "VALUES(?, ?, ?, ?, ?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciuda.getDni());
            ps.setString(2, ciuda.getNombreCompleto());
            ps.setString(3, ciuda.getEmail());
            ps.setString(4, ciuda.getCelular());
            ps.setString(5, ciuda.getPatologia());
            ps.setString(6, ciuda.getAmbitoTrabajo());
            ps.executeUpdate();

                            
            JOptionPane.showMessageDialog(null, "Ciudadano guardado");
                
                
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
        
        
    }
    
    public void modificarCiudadano(Ciudadano ciuda){
        
        String sql = "UPDATE ciudadano SET nombreCompleto = ?, email = ?, celular = ?, patologia = ?, ambitoTrabajo = ?"
                + "WHERE DNI = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ciuda.getNombreCompleto());
            ps.setString(2, ciuda.getEmail());
            ps.setString(3, ciuda.getCelular());
            ps.setString(4, ciuda.getPatologia());
            ps.setString(5, ciuda.getAmbitoTrabajo());
            ps.setInt(6, ciuda.getDni());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                
                JOptionPane.showMessageDialog(null, "Ciudadano modificado");
                
                
            }
           
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
        
    }
    
    
    public Ciudadano buscarCiudadanoPorDni(int dni){
        
        String sql = "SELECT DNI, nombreCompleto, email, celular, patologia, ambitoTrabajo FROM ciudadano WHERE dni = ?";
        
        Ciudadano ciuda = null;
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                ciuda = new Ciudadano();
                ciuda.setDni(rs.getInt("dni"));
                ciuda.setNombreCompleto(rs.getString("nombreCompleto"));
                ciuda.setEmail(rs.getString("email"));
                ciuda.setCelular(rs.getString("celular"));
                ciuda.setPatologia(rs.getString("patologia"));
                ciuda.setAmbitoTrabajo(rs.getString("ambitoTrabajo"));
                
                
            }else{
                
                JOptionPane.showMessageDialog(null, "No se ha encontrado al ciudadano");
                
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
        
        return ciuda;
                  
    }
    
        
}
