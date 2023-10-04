
package vacunasgrupo18.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        
        String sql = "INSERT INTO Laboratorio (CUIT, nomLaboratorio,pais,domComercial)"
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
    
}
