
package Pruebas_equipo;

import AccesoADatos.VacunaData;
import Entidades.Vacuna;
import java.time.LocalDate;

public class Gonzalo {

    public static void main(String[] args) {
        //        CODIGO DE PRUEBAS

//      Prueba Guardar Ciudadano
//        Ciudadano carla = new Ciudadano(456, "Carla Gomez", "CarlaG123@hotmail.com", "15265948", "Gripe", "Seguridad");
//        CiudadanoData ciu = new CiudadanoData();
//        ciu.guardarCiudadano(carla);

//      Prueba metodo modificar ciudadano
//        CiudadanoData ciu = new CiudadanoData();
//        Ciudadano carla = new Ciudadano(2,456, "Carla Gomez", "CarlaG123@hotmail.com", "15265948", "Resfriado", "Seguridad");
//        ciu.modificarCiudadano(carla);

//      Prueba metodo Buscar ciudadano por DNI
//        CiudadanoData ciu = new CiudadanoData();
//        System.out.println(ciu.buscarCiudadanoDni(456));

//      Prueba metodo Buscar ciudadano por ID
//        CiudadanoData ciu = new CiudadanoData();
//        System.out.println(ciu.buscarCiudadanoId(1));

        //Prueba método guardarVacuna.
        Vacuna vacuna = new Vacuna(123, "BNT162b2", 0.3, LocalDate.of(2025, 10, 02), true, 1, false);              
        VacunaData vacun = new VacunaData();
        vacun.GuardarVacuna(vacuna);

    }
    
}
