
package vacunasgrupo18.Entidades;

import java.sql.Date;
import java.time.LocalDate;


public class Vacuna {
    
   private int nroSerieDosis;
   private Laboratorio labMarca;
   private double medida;
   private LocalDate fechaCaduca;
   private boolean colocada;
   

    public Vacuna() {
    }

    public Vacuna(Laboratorio labMarca, double medida, LocalDate fechaCaduca, boolean colocada) {
        this.labMarca = labMarca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
    }

    public Vacuna(int nroSerieDosis, Laboratorio labMarca, double medida, LocalDate fechaCaduca, boolean colocada) {
        this.nroSerieDosis = nroSerieDosis;
        this.labMarca = labMarca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
    }

    public Vacuna(int nroSerieDosis, Laboratorio labMarca, double medida, LocalDate fechaCaduca) {
        this.nroSerieDosis = nroSerieDosis;
        this.labMarca = labMarca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
    }
    
    

    public Laboratorio getLabMarca() {
        return labMarca;
    }

    public void setLabMarca(Laboratorio labMarca) {
        this.labMarca = labMarca;
    }

    public int getNroSerieDosis() {
        return nroSerieDosis;
    }

    public void setNroSerieDosis(int nroSerieDosis) {
        this.nroSerieDosis = nroSerieDosis;
    }


    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public LocalDate getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(LocalDate fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "nroSerieDosis=" + nroSerieDosis + ", marca=" + labMarca + ", medida=" + medida + ", fechaCaduca=" + fechaCaduca + ", colocada=" + colocada + '}';
    }
    
}
