

package vacunasgrupo18;

import vacunasgrupo18.AccesoADatos.CiudadanoData;
import vacunasgrupo18.Entidades.Ciudadano;


public class VacunasGrupo18 {

    public static void main(String[] args) {
        
        Ciudadano pedro = new Ciudadano(42547958, "Pedro Mendoza", "pedro123@gmail.com", "2984145677", "diabetes", "Salud");
        
        CiudadanoData persona = new CiudadanoData();
        
        persona.guardarCiudadano(pedro);
        
    }
    
}
