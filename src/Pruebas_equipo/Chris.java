
package Pruebas_equipo;

import AccesoADatos.VacunaData;
import Entidades.Vacuna;
import java.time.LocalDate;
import java.util.List;


public class Chris {

    public static void main(String[] args) {

        
        
//   -*-   PRUEBA GUARDAR VACUNA
//
//        Vacuna vacuna = new Vacuna(1212, "62b2", 0.3, LocalDate.of(2025, 10, 02), true, 2, false);              
//        VacunaData vacun = new VacunaData();
//        vacun.GuardarVacuna(vacuna);



//   -*-   PRUEBA MODIFICAR VACUNA

         VacunaData vacu = new VacunaData();  
         Vacuna vacuna = new Vacuna(3, 2345, "Astraseneca", 0.3, LocalDate.of(2022, 11, 21), true, 2, false);
         vacu.modificarVacuna(vacuna);



//   -*-   PRUEBA ELIMINAR VACUNA LOGICO
//           VacunaData vacu = new VacunaData();   
//           vacu.eliminarVacuna(1);


//   -*-   PRUEBA LISTAR VACUNA

//         VacunaData vacu = new VacunaData(); 
//         for (Vacuna vacuna : vacu.listarVacunas(true)) {
//         System.out.println(vacuna);
//         }


           
//   -*-  PRUEBA FECHA CADUCA VACUNA

//        LocalDate fechaCaducidad = LocalDate.of(2023, 1, 1); //fecha de vencimiento-*-
//        VacunaData vacu = new VacunaData(); 
//        List<Vacuna> vacunasVencidas = vacu.buscarVacunaVencida(fechaCaducidad);
//        System.out.println("Se encontro " + vacunasVencidas.size() + " vacuna/s vencida/s.");
//        for (Vacuna vacuna : vacunasVencidas) {
//        System.out.println("#########################################");
//        System.out.println("ID de la vacuna: " + vacuna.getIdVacuna());
//        System.out.println("Fecha de caducidad: " + vacuna.getFechaCaduca());
//        System.out.println("¿Fue colocada? " + vacuna.isColocada());
//        System.out.println("#########################################");
//        System.out.println();
//        }
        



//  -*-   PRUEBA BUSCAR VACUNA X LABORATORIO

//        VacunaData vacu = new VacunaData();
//        List<Vacuna> vacunaPorLaboratorio = vacu.buscarVacunaPorLaboratorio(2, true);
//        System.out.println("Se encontro " + vacunaPorLaboratorio.size() + " vacuna/s  del Laboratorio.");
//        for (Vacuna vacuna : vacunaPorLaboratorio) {
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//        System.out.println("ID de la vacuna: " + vacuna.getIdVacuna());
//        System.out.println("¿Fue colocada? " + vacuna.isColocada());
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//        }

    }
    
}
