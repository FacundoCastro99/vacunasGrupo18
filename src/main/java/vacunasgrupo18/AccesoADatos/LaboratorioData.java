
package vacunasgrupo18.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vacunasgrupo18.Entidades.Ciudadano;
import vacunasgrupo18.Entidades.Laboratorio;


public class LaboratorioData {
   
     private Connection con = null;
    
    public LaboratorioData(){
       con = Conexion.getConexion();
    }
    
    public void guardarLaboratorio(Laboratorio labo){
        
        String sql = "INSERT INTO laboratorio (CUIT, nomLaboratorio,pais,domComercial)"
                + "VALUES(?, ?, ?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, labo.getCuit());
            ps.setString(2, labo.getNomLaboratorio());
            ps.setString(3, labo.getPais());
            ps.setString(4, labo.getDomComercial());
            
            
            ps.executeUpdate();

                            
            JOptionPane.showMessageDialog(null, "Laboratorio guardado");
                
                
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
        
        
    }
    
    public void modificarLaboratorio(Laboratorio labo){
        
        String sql = "UPDATE laboratorio SET nomLaboratorio = ?, pais = ?, domComercial = ? "
                + "WHERE CUIT = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, labo.getNomLaboratorio());
            ps.setString(2, labo.getPais());
            ps.setString(3, labo.getDomComercial());
            ps.setInt(4, labo.getCuit());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                
                JOptionPane.showMessageDialog(null, "Laboratorio modificado");
                    
            }
           
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
        
    }
    
    
    
    public Laboratorio buscarLaboratorioPorCuit(int cuit){
        
        String sql = "SELECT CUIT, nomLaboratorio, pais, domComercial FROM laboratorio WHERE CUIT = ?";
        
        Laboratorio labo = null;
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cuit);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                labo = new Laboratorio();
                labo.setCuit(rs.getInt("CUIT"));
                labo.setNomLaboratorio(rs.getString("nomLaboratorio"));
                labo.setPais(rs.getString("pais"));
                labo.setDomComercial(rs.getString("domComercial"));
                
                
            }else{
                
                JOptionPane.showMessageDialog(null, "No se ha encontrado el laboratorio");
                
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
           ex.getStackTrace();
        }
        
        return labo;
                  
    }
    
    public Laboratorio buscarLaboratorioPorNombre(String nombre){
        
        String sql = "SELECT CUIT, nomLaboratorio, pais, domComercial FROM laboratorio WHERE nomLaboratorio = ?";
        
        Laboratorio labo = null;
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                labo = new Laboratorio();
                labo.setCuit(rs.getInt("CUIT"));
                labo.setNomLaboratorio(rs.getString("nomLaboratorio"));
                labo.setPais(rs.getString("pais"));
                labo.setDomComercial(rs.getString("domComercial"));
                
                
            }else{
                
                JOptionPane.showMessageDialog(null, "No se ha encontrado el laboratorio");
                
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
        
        return labo;
                  
    }
    
}
