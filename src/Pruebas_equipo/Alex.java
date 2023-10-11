/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas_equipo;

import AccesoADatos.CitaVacunacionData;
import AccesoADatos.CiudadanoData;
import AccesoADatos.LaboratorioData;
import AccesoADatos.VacunaData;
import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import Entidades.Laboratorio;
import Entidades.Vacuna;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

/**
 *
 * @AlexAnders
 */
public class Alex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//          PRUEBA GUARDAR VACUNA
//
//         VacunaData vacu = new VacunaData();  
//         Vacuna vacuna = new Vacuna(1234567894, "Gam-Covid-VacM (Sputnik)", 0.3, LocalDate.of(2023, 06, 25), true, 2,false);
//         vacu.GuardarVacuna(vacuna);

//        PRUEBA MODIFICAR VACUNA
//          VacunaData vacu = new VacunaData();  
//          Vacuna vacuna = new Vacuna(3, 2345, "Astraseneca", 0.3, LocalDate.of(2022, 11, 21), true, 2);
//          vacu.modificarVacuna(vacuna);

//        PRUEBA ELIMINAR VACUNA
//          VacunaData vacu = new VacunaData(); 
//          vacu.eliminarVacuna(1);
           

//        PRUEBA LISTAR VACUNA
//           VacunaData vacu = new VacunaData(); 
//           for (Vacuna vacuna : vacu.listarVacunas(true)) {
//           System.out.println(vacu);
//           }


//        PRUEBA FECHA CADUCA VACUNA
//           VacunaData vacu = new VacunaData(); 
//           Vacuna vacuna : vacu.buscarVacunaFechaCaduca(LocalDate.MAX, true) {
//           System.out.println(vacu);    
//           }
//**************************************************************************************
//        CODIGO DE PRUEBAS CIUDADANO

//      Prueba Guardar Ciudadano
//        Ciudadano ciud = new Ciudadano(34567890,"Pedro Monte", "PedroM345@gmail.com", "15-5678-9012", "Diabetes", "Fuerza Armadas");
//        CiudadanoData ciu = new CiudadanoData();
//        ciu.guardarCiudadano(ciud);

//      Prueba metodo modificar ciudadano
//        CiudadanoData ciu = new CiudadanoData();
//        Ciudadano carla = new Ciudadano(2,456, "Carla Gomez", "CarlaG123@hotmail.com", "15265948", "Resfriado", "Seguridad");
//        ciu.modificarCiudadano(carla);

//      Prueba metodo Buscar ciudadano por DNI
//        CiudadanoData ciu = new CiudadanoData();
//        System.out.println(ciu.buscarCiudadanoDni(123));

//      Prueba metodo Buscar ciudadano por ID
//        CiudadanoData ciu = new CiudadanoData();
//        System.out.println(ciu.buscarCiudadanoId(1));
//**************************************************************************************
//        PRUEBAS LABORATORIO

//        Prueba modificar LAboratorio
//        Laboratorio labo = new Laboratorio(1,12345678900L, "Pfizer (Pfizer)", "ARG","Colec.Panamericana 1804 Piso 1°(Sector B),Lado Sur\n" +
//"V.Adelina, Prov.Bs As", true);
//        LaboratorioData laboData = new LaboratorioData();
//        laboData.modificarLaboratorio(labo);
        
//        PRUEBA Guardar LABORATORIO
       
//        Laboratorio labo = new Laboratorio(12345678904L, "Laboratorio Richmond(Spunik v)", "ARG","Bouchard 680, Ciudad Autónoma de Buenos Aires", true);
//        LaboratorioData laboData = new LaboratorioData();
//        laboData.guardarLaboratorio(labo);

//      Prueba Eliminar Laboratorio
//        Laboratorio lab = new Laboratorio(1,33556644339L, "Bayer", "Argentina", "CABA, Calle numero", true);
//        LaboratorioData labData = new LaboratorioData();
//        labData.eliminarLaboratorio(lab.getIdLaboratorio());

//      Prueba Buscar Laboratorio por ID
//        LaboratorioData labData = new LaboratorioData();
//        Laboratorio labo = labData.buscarLaboratorioId(1, true);
//        if (labo != null) {
//            System.out.println(labo.toString());
//        } else {
//            System.out.println("El laboratorio buscado no existe.");
//        }
        
//      Prueba Buscar Laboratorio por CUIT
//        LaboratorioData labData = new LaboratorioData();
//        Laboratorio labo = labData.buscarLaboratorioCuit(33556644339L, true);
//        if (labo != null) {
//            System.out.println(labo.toString());
//        } else {
//            System.out.println("El laboratorio buscado no existe.");
//        }
//      PRUEBA LISTAR LABORATORIOS
//        LaboratorioData labData = new LaboratorioData();
//        for (Laboratorio labo : labData.listarLaboratorios(true)) {
//            System.out.println(labo);
//        }
//**************************************************************************************
//        PRUEBA CITAVACUNACION:
//         GUARDAR CITA VACUNACION.
////        CitaVacunacion cita = new CitaVacunacion(4,01,Timestamp.valueOf(LocalDateTime.of(2023,Month.NOVEMBER,15,10,30)),"Centro de vacunacion ATE",Timestamp.valueOf(LocalDateTime.of(2023,Month.NOVEMBER,9,10,30)), 2,true);
////        CitaVacunacionData citaData = new CitaVacunacionData();
////        citaData.guardarCitaVacunacion(cita);
//******************************************************************************************    
//      Prueba listar Citas Mensual Matias
//        CitaVacunacionData citavData = new CitaVacunacionData();
//        for (CitaVacunacion citav : citavData.obtenerCitasMensual(LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 15), true)) {
//            System.out.println(citav);
//********************************************************************************************
//      BUSCAR CITAS POR ID Y ESTADO
//          
//        CitaVacunacionData citaData = new CitaVacunacionData();
////       
//        System.out.println(citaData.buscarCitaVacunacion(8, true)); //revisar antes de subir
//******************************************************************************************
//        MODIFICAR CITA
//        CitaVacunacion cita = new CitaVacunacion(1,02,"2023/10/15","Centro de vacunacion ATE", LocalDate.of(2023,Month.NOVEMBER,9), 2,true);
//        CitaVacunacionData citaData = new CitaVacunacionData();
//        citaData.modificarCitaVacunacion(cita);
//****************************************************************************************
////       ELIMINAR CITA
//         CitaVacunacion cita = new CitaVacunacion();
//         CitaVacunacionData citaData = new CitaVacunacionData();
//         citaData.eliminarCitaVacunacion(4);
//****************************************************************************************
//          PRUEBA LISTAR citas
       CitaVacunacionData citaData = new CitaVacunacionData();
        for (CitaVacunacion citaDat : citaData.obtenerTodasLasCitas()) {
            System.out.println(citaDat);
        }
//**************************************************************************************
    }
   }  

