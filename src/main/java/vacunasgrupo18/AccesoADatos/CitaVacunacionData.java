
package vacunasgrupo18.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import vacunasgrupo18.Entidades.CitaVacunacion;



public class CitaVacunacionData {
    
    private Connection con = null;
    
    public CitaVacunacionData(){
       con = Conexion.getConexion();
    
    
}
    
    public void guardarCita(CitaVacunacion cita){
        
        String sql = "INSERT INTO citavacunacion (persona, codRefuerzo, fechaHoraCita, centroVacunacion, fechaHoraColoca, dosis) "
                + "VALUES(?, ?, ?, ?, ?, ?)";
        
         try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cita.getPersona().getDni());
            ps.setInt(2, cita.getCodRefuerzo());
            ps.setDate(3, Date.valueOf(cita.getFechaHoraCita()));
            ps.setString(4, cita.getCentroVacunacion());
            ps.setDate(5, Date.valueOf(cita.getFechaHoraColoca()));
            ps.setInt(6, cita.getDosis().getNroSerieDosis());
            
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
        
        String sql = "UPDATE citavacunacion SET Persona = ?, codRefuerzo = ?, fechaHoraCita = ?, centroVacunacion = ?, fechaHoraColoca = ?, Dosis = ?"
                + " WHERE codCita = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cita.getPersona().getDni());
            ps.setInt(2, cita.getCodRefuerzo());
            ps.setDate(3, Date.valueOf(cita.getFechaHoraCita()));
            ps.setString(4, cita.getCentroVacunacion());
            ps.setDate(5, Date.valueOf(cita.getFechaHoraColoca()));
            ps.setInt(6, cita.getDosis().getNroSerieDosis());
            ps.setInt(7, cita.getCodCita());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                
                JOptionPane.showMessageDialog(null, "Cita modificado");
                
                
            }
           
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            
        }
        
    }
    
//public void postergarCitas() {
//    for (CitaVacunacion cita : citas) {
//        cita.setFechaHoraAsignada(addWeeks(cita.getFechaHoraAsignada(), 2));
//        // Actualizar la fecha y hora en la base de datos
//        String query = "UPDATE citas SET fecha_hora_asignada = ? WHERE dni = ?";
//        PreparedStatement pstmt = con.prepareStatement(query);
//        pstmt.setDate(1, cita.getFechaHoraAsignada());
//        pstmt.setString(2, cita.getDni());
//        pstmt.executeUpdate();
//    }
//}
    
//    public void cancelarCita(String dni) {
//    for (CitaVacunacion cita : citas) {
//        if (cita.getDni().equals(dni)) {
//            cita.setEstado("Cancelada");
//            citas.remove(cita);
//            // Actualizar el estado en la base de datos
//            String query = "UPDATE citas SET estado = ? WHERE dni = ?";
//            PreparedStatement pstmt = conexion.prepareStatement(query);
//            pstmt.setString(1, cita.getEstado());
//            pstmt.setString(2, cita.getDni());
//            pstmt.executeUpdate();
//            break;
//        }
//    }
//}
    
//    public List<CitaVacunacion> listarCitas(String estado) {
//    List<CitaVacunacion> citasFiltradas = new ArrayList<>();
//    String query = "SELECT * FROM citas WHERE estado = ?";
//    PreparedStatement pstmt = conexion.prepareStatement(query);
//    pstmt.setString(1, estado);
//    ResultSet rs = pstmt.executeQuery();
//    while (rs.next()) {
//        CitaVacunacion cita = new CitaVacunacion(rs.getString("dni"), rs.getDate("fecha_hora_asignada"), rs.getString("centro_vacunacion"), rs.getInt("codigo_refuerzo"), rs.getString("estado"));
//        citasFiltradas.add(cita);
//    }
//    return citasFiltradas;
//}
    
//    public Map<String, Integer> listarCentrosVacunacion() {
//    Map<String, Integer> centrosVacunacion = new HashMap<>();
//    String query = "SELECT centro_vacunacion, COUNT(*) as cantidad FROM citas GROUP BY centro_vacunacion";
//    PreparedStatement pstmt = conexion.prepareStatement(query);
//    ResultSet rs = pstmt.executeQuery();
//    while (rs.next()) {
//        centrosVacunacion.put(rs.getString("centro_vacunacion"), rs.getInt("cantidad"));
//    }
//    return centrosVacunacion;
//}


//public List<CitaVacunacion> listarVacunasAplicadas(String centro) {
//    List<CitaVacunacion> vacunasAplicadas = new ArrayList<>();
//    String query = "SELECT * FROM citas WHERE centro_vacunacion = ?";
//    PreparedStatement pstmt = conexion.prepareStatement(query);
//    pstmt.setString(1, centro);
//    ResultSet rs = pstmt.executeQuery();
//    while (rs.next()) {
//        CitaVacunacion cita = new CitaVacunacion(rs.getString("dni"), rs.getDate("fecha_hora_asignada"), rs.getString("centro_vacunacion"), rs.getInt("codigo_refuerzo"), rs.getString("estado"));
//        vacunasAplicadas.add(cita);
//    }
//    return vacunasAplicadas;
//}

    
    
}
