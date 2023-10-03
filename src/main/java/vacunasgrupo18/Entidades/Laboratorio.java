
package vacunasgrupo18.Entidades;


public class Laboratorio {
    
    private int cuit;
    private String domComercial;
    private String nomLaboratorio;
    private String pais;

    public Laboratorio() {
    }

    public Laboratorio(int cuit, String domComercial, String nomLaboratorio, String pais) {
        this.cuit = cuit;
        this.domComercial = domComercial;
        this.nomLaboratorio = nomLaboratorio;
        this.pais = pais;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getDomComercial() {
        return domComercial;
    }

    public void setDomComercial(String domComercial) {
        this.domComercial = domComercial;
    }

    public String getNomLaboratorio() {
        return nomLaboratorio;
    }

    public void setNomLaboratorio(String nomLaboratorio) {
        this.nomLaboratorio = nomLaboratorio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "cuit=" + cuit + ", domComercial=" + domComercial + ", nomLaboratorio=" + nomLaboratorio + ", pais=" + pais + '}';
    }
    
    
    
}
