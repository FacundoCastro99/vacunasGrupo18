

package vacunasgrupo18;

import java.time.LocalDate;
import java.time.Month;
import vacunasgrupo18.AccesoADatos.CitaVacunacionData;
import vacunasgrupo18.AccesoADatos.CiudadanoData;
import vacunasgrupo18.AccesoADatos.LaboratorioData;
import vacunasgrupo18.AccesoADatos.VacunaData;
import vacunasgrupo18.Entidades.CitaVacunacion;
import vacunasgrupo18.Entidades.Ciudadano;
import vacunasgrupo18.Entidades.Laboratorio;
import vacunasgrupo18.Entidades.Vacuna;


public class VacunasGrupo18 {

    public static void main(String[] args) {
        
        //Ciudadano pedro = new Ciudadano(42547958, "Pedro Sanchez", "pedro123@gmail.com", "2984145677", "diabetes", "Salud");
        
        //CiudadanoData persona = new CiudadanoData();
        
//        persona.guardarCiudadano(pedro);
//        persona.modificarCiudadano(pedro);
        
        //Laboratorio lab = new Laboratorio(20124578,"Pfizer","Inglaterra","Calle falsa 1234");
       //  LaboratorioData labMet = new LaboratorioData();
        
        //labMet.guardarLaboratorio(lab);
        //labMet.modificarLaboratorio(lab);
        
      //   Laboratorio labEncontrado = labMet.buscarLaboratorioPorCuit(20124578);
        
       //  if(labEncontrado!=null){
            
      //       System.out.println("Cuit " + labEncontrado.getCuit());
       //      System.out.println("nombre del laboratorio " + labEncontrado.getNomLaboratorio());
      //   }
      
         /*LaboratorioData labData = new LaboratorioData();
         Laboratorio lab = labData.buscarLaboratorioPorCuit(20124578);
         VacunaData vacunD=new VacunaData();
         
         Vacuna vacu = new Vacuna(1234, lab, 0.3, LocalDate.of(2022, 12, 23), true);
         
         vacunD.guardarVacuna(vacu);*/
         
         CiudadanoData ciudaD = new CiudadanoData();
         VacunaData vacuD = new VacunaData();
         Ciudadano ciuda = ciudaD.buscarCiudadanoPorDni(42547958);
         Vacuna vacuna = vacuD.buscarVacunaPorSerie(0);
         CitaVacunacionData citaD = new CitaVacunacionData();
         
         CitaVacunacion cita = new CitaVacunacion(ciuda, 2, LocalDate.of(2024, 11, 22), "Lopez Lima", LocalDate.of(2024, 11, 22), vacuna);
            
         citaD.guardarCita(cita);
         
         
         
}
}
