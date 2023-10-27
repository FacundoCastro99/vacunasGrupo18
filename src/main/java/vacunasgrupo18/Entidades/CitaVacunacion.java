
package vacunasgrupo18.Entidades;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class CitaVacunacion {
    
    private int codCita;
   private Ciudadano persona;
   private Ciudadano email;
   private int codRefuerzo;
   private Timestamp fechaHoraCita;
   private String centroVacunacion;
   private Timestamp fechaHoraColoca;
   private double dosis;
   private boolean citaConcretada;
   private boolean citaCancelada;

    public CitaVacunacion() {
    }

    public CitaVacunacion(Ciudadano persona, Ciudadano email, int codRefuerzo, Timestamp fechaHoraCita, String centroVacunacion, Timestamp fechaHoraColoca, double dosis, boolean citaConcretada, boolean citaCancelada) {
        this.persona = persona;
        this.email = email;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoca = fechaHoraColoca;
        this.dosis = dosis;
        this.citaConcretada = citaConcretada;
        this.citaCancelada = citaCancelada;
    }
    
    

    public CitaVacunacion(Ciudadano persona, int codRefuerzo, Timestamp fechaHoraCita, String centroVacunacion, Timestamp fechaHoraColoca, double dosis) {
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoca = fechaHoraColoca;
        this.dosis = dosis;
    }
    
    

    public CitaVacunacion(int codCita, Ciudadano persona, int codRefuerzo, Timestamp fechaHoraCita, String centroVacunacion, Timestamp fechaHoraColoca, double dosis) {
        this.codCita = codCita;
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoca = fechaHoraColoca;
        this.dosis = dosis;
    }

    public CitaVacunacion(Ciudadano persona, Ciudadano email, int codRefuerzo, Timestamp fechaHoraCita, String centroVacunacion) {
        this.persona = persona;
        this.email = email;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
    }
    
    

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public Ciudadano getPersona() {
        return persona;
    }

    public void setPersona(Ciudadano persona) {
        this.persona = persona;
    }

    public int getCodRefuerzo() {
        return codRefuerzo;
    }

    public void setCodRefuerzo(int codRefuerzo) {
        this.codRefuerzo = codRefuerzo;
    }

    public Timestamp getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(Timestamp fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public String getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(String centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public Timestamp getFechaHoraColoca() {
        return fechaHoraColoca;
    }

    public void setFechaHoraColoca(Timestamp fechaHoraColoca) {
        this.fechaHoraColoca = fechaHoraColoca;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }

    public Ciudadano getEmail() {
        return email;
    }

    public void setEmail(Ciudadano email) {
        this.email = email;
    }

    public boolean isCitaConcretada() {
        return citaConcretada;
    }

    public void setCitaConcretada(boolean citaConcretada) {
        this.citaConcretada = citaConcretada;
    }

    public boolean isCitaCancelada() {
        return citaCancelada;
    }

    public void setCitaCancelada(boolean citaCancelada) {
        this.citaCancelada = citaCancelada;
    }
    
    

    @Override
    public String toString() {
        return "CitaVacunacion{" + "codCita=" + codCita + ", persona=" + persona + ", codRefuerzo=" + codRefuerzo + ", fechaHoraCita=" + fechaHoraCita + ", centroVacunacion=" + centroVacunacion + ", fechaHoraColoca=" + fechaHoraColoca + ", dosis=" + dosis + '}';
    }
    
    
    
}
