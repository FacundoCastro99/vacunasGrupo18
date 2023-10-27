
package vacunasgrupo18.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vacunasgrupo18.Entidades.Ciudadano;
import vacunasgrupo18.Entidades.Laboratorio;
import vacunasgrupo18.Entidades.Vacuna;


public class VacunaData {
    
     private Connection con = null;
     private LaboratorioData labData = new LaboratorioData();
    
    public VacunaData(){
       con = Conexion.getConexion();
    
    
}
     public void guardarVacuna(Vacuna vacu){
        
        String sql = "INSERT INTO vacuna (nroSerieDosis, marca, medida, fechaCaduca, colocada) "
                + "VALUES(?, ?, ?, ?, ?)";
        
         try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vacu.getNroSerieDosis());
            ps.setString(2, vacu.getLabMarca().getNomLaboratorio());
            ps.setDouble(3, vacu.getMedida());
            ps.setDate(4, Date.valueOf(vacu.getFechaCaduca()));
            ps.setBoolean(5, vacu.isColocada());
            
            ps.executeUpdate();

                            
            JOptionPane.showMessageDialog(null, "Vacuna Guardada");
                
                
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            ex.getStackTrace();
        }
        
        
    }
   
     public void modificarVacuna(Vacuna vacun) throws SQLException{
        
        String sql = "UPDATE vacuna SET nroSerieDosis = ?, marca = ?, medida = ?, fechaCaduca = ?, colocada = ?"
                + "WHERE 1 = ?";
                
               
      try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vacun.getNroSerieDosis());
            ps.setString(2, vacun.getLabMarca().getNomLaboratorio());
            ps.setDouble(3, vacun.getMedida());
            ps.setDate(4, Date.valueOf(vacun.getFechaCaduca()));
            ps.setBoolean(5, vacun.isColocada());
      int exito = ps.executeUpdate();
      if(exito == 1){
                
                JOptionPane.showMessageDialog(null, "Vacuna modificada");
                    
            }
           
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
     }
     
     public Vacuna buscarVacunaPorSerie(int nSerie){
        
        String sql = "SELECT nroSerieDosis, marca, medida, fechaCaduca, colocada FROM vacuna WHERE nroSerieDosis = ?";
        
        Vacuna vacu = null;
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nSerie);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                vacu = new Vacuna();
                Laboratorio lab = labData.buscarLaboratorioPorNombre(rs.getString("marca"));
                vacu.setLabMarca(lab);
                vacu.setMedida(rs.getDouble("medida"));
                vacu.setFechaCaduca(rs.getDate("fechaCaduca").toLocalDate());
                vacu.setColocada(true);
                
                
            }else{
                
                JOptionPane.showMessageDialog(null, "No se ha encontrado la vacuna");
                
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            ex.printStackTrace();
        }
        
        return vacu;
                  
    }
     
     public void vacunaColocada(int nSerie){
        
        String sql = "UPDATE vacuna SET colocada = 0 WHERE nroSerieDosis = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nSerie);
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                
                JOptionPane.showMessageDialog(null, "Vacuna colocada");
                
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }

    }
     
     

}
    
