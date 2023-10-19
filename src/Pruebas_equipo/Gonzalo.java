
package Pruebas_equipo;

import AccesoADatos.CitaVacunacionData;
import AccesoADatos.CiudadanoData;
import AccesoADatos.LaboratorioData;
import AccesoADatos.VacunaData;
import Entidades.CitaVacunacion;
import Entidades.Laboratorio;
import Entidades.Vacuna;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;

public class Gonzalo {

    public static void main(String[] args) {
        //        CODIGO DE PRUEBAS

//      Prueba Guardar Ciudadano
//        Ciudadano carla = new Ciudadano(456, "Carla Gomez", "CarlaG123@hotmail.com", "15265948", "Gripe", "Seguridad");
//        CiudadanoData ciu = new CiudadanoData();
//        ciu.guardarCiudadano(carla);

//      Prueba metodo modificar ciudadano
        CiudadanoData ciu = new CiudadanoData();
//        Ciudadano carla = new Ciudadano(2,456, "Carla Gomez", "CarlaG123@hotmail.com", "15265948", "Resfriado", "Seguridad");
//        ciu.modificarCiudadano(carla);

//      Prueba metodo Buscar ciudadano por DNI
//        CiudadanoData ciu = new CiudadanoData();
//        System.out.println(ciu.buscarCiudadanoDni(456));

//      Prueba metodo Buscar ciudadano por ID
//        CiudadanoData ciu = new CiudadanoData();
//        System.out.println(ciu.buscarCiudadanoId(1));

//        Prueba método guardarVacuna.
//        Vacuna vacuna = new Vacuna(2345, "ChAdOx1-S", 0.5, LocalDate.of(2025, 10, 02), true, 3, false);              
//        VacunaData vacun = new VacunaData();
//        vacun.GuardarVacuna(vacuna);

//        Prueba Método guardarLaboratorio
//        Laboratorio labo = new Laboratorio(2, 44335566778L, "AstraZeneca", "U.K", "Por Panamericana", true);
//        LaboratorioData laboData = new LaboratorioData();
//        laboData.guardarLaboratorio(labo);
        
//        Prueba método modificarLaboratorio
//        Laboratorio labo = new Laboratorio(2, 11335566778L, "Chinofarm", "China", "Libertador", true);
//        LaboratorioData laboData = new LaboratorioData();
//        laboData.modificarLaboratorio(labo);

//          Prueba método guardarCita
//          CitaVacunacion cita1 = new CitaVacunacion(123, 2, "2022-10-25", "Centro", LocalDate.of(2020, Month.MARCH, 12), 1, true);
//          JOptionPane.showMessageDialog(null, ciu.buscarCiudadanoDni(123)); 
//
//          CitaVacunacionData citaVacun = new CitaVacunacionData();
//          citaVacun.guardarCitaVacunacion(cita1);
    
            VacunaData vc = new VacunaData();
            Vacuna vacuna = new Vacuna(1234567897, "marca", 0.3, LocalDate.of(2023, Month.MARCH, 10), false, 3, false);
            vc.GuardarVacuna(vacuna);
    }
    
    
}
