

package vacunasgrupo18;

import vacunasgrupo18.AccesoADatos.CiudadanoData;
import vacunasgrupo18.AccesoADatos.LaboratorioData;
import vacunasgrupo18.Entidades.Ciudadano;
import vacunasgrupo18.Entidades.Laboratorio;


public class VacunasGrupo18 {

    public static void main(String[] args) {
        
        Ciudadano pedro = new Ciudadano(42547958, "Pedro Sanchez", "pedro123@gmail.com", "2984145677", "diabetes", "Salud");
        
        CiudadanoData persona = new CiudadanoData();
        
//        persona.guardarCiudadano(pedro);
//        persona.modificarCiudadano(pedro);
        
        Laboratorio lab = new Laboratorio(20124578,"Pfizer","Alemania","Calle falsa 123");
        LaboratorioData labMet = new LaboratorioData();
        
        labMet.guardarLaboratorio(lab);
    }
    
}
