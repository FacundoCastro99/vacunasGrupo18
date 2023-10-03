
package vacunasgrupo18.Entidades;

import java.sql.Date;


public class Vacuna {
    
    private int nroSerieDosis;
   private String marca;
   private double medida;
   private Date fechaCaduca;
   private boolean colocada=false;

    public Vacuna() {
    }

    public Vacuna(String marca, double medida, Date fechaCaduca) {
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
    }

    public Vacuna(int nroSerieDosis, String marca, double medida, Date fechaCaduca) {
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
    }
    

    public int getNroSerieDosis() {
        return nroSerieDosis;
    }

    public void setNroSerieDosis(int nroSerieDosis) {
        this.nroSerieDosis = nroSerieDosis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public Date getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(Date fechaCaduca) {
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
        return "Vacuna{" + "nroSerieDosis=" + nroSerieDosis + ", marca=" + marca + ", medida=" + medida + ", fechaCaduca=" + fechaCaduca + ", colocada=" + colocada + '}';
    }
    
}
