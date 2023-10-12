
package vacunasgrupo18.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vacunasgrupo18.Entidades.Laboratorio;
import vacunasgrupo18.Entidades.Vacuna;


public class VacunaData {
    
     private Connection con = null;
    
    public VacunaData(){
       con = Conexion.getConexion();
    
    
}
     public void guardarVacuna(Vacuna vacu){
        
        String sql = "INSERT INTO vacuna (nroSerieDosis, marca, medida,	fechaCaduca, colocada)"
                + "VALUES(?, ?, ?, ?,?)";
        
         try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vacu.getNroSerieDosis());
            ps.setString(2, vacu.getMarca());
            ps.setDouble(3, vacu.getMedida());
            ps.setDate(4, Date.valueOf(vacu.getFechaCaduca()));
            ps.setBoolean(5, vacu.isColocada());
            
            ps.executeUpdate();

                            
            JOptionPane.showMessageDialog(null, "Vacuna Guardada");
                
                
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
        
        
    }
   
     
     
     
     }
    
