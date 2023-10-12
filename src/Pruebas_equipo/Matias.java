//
//package Pruebas_equipo;
//
//import AccesoADatos.CitaVacunacionData;
//import Entidades.CitaVacunacion;
//import java.time.LocalDate;
//
//
//public class Matias {
//
//
//    public static void main(String[] args) {
//     
//           
////      Prueba Modificar Laboratorio
////        Laboratorio labo = new Laboratorio(2, 33445566779L, "Pfizer", "USA", "Colectora Panamericana", true);
////        LaboratorioData laboData = new LaboratorioData();
////        laboData.modificarLaboratorio(labo);
//
////      Prueba Eliminar Laboratorio
////        Laboratorio lab = new Laboratorio(1,33556644339L, "Bayer", "Argentina", "CABA, Calle numero", true);
////        LaboratorioData labData = new LaboratorioData();
////        labData.eliminarLaboratorio(lab.getIdLaboratorio());
//
////      Prueba Buscar Laboratorio por ID
////        LaboratorioData labData = new LaboratorioData();
////        Laboratorio labo = labData.buscarLaboratorioId(1, true);
////        if (labo != null) {
////            System.out.println(labo.toString());
////        } else {
////            System.out.println("El laboratorio buscado no existe.");
////        }
//        
////      Prueba Buscar Laboratorio por CUIT
////        LaboratorioData labData = new LaboratorioData();
////        Laboratorio labo = labData.buscarLaboratorioCuit(33556644339L, true);
////        if (labo != null) {
////            System.out.println(labo.toString());
////        } else {
////            System.out.println("El laboratorio buscado no existe.");
////        }
////      Prueba listar laboratorios
////        LaboratorioData labData = new LaboratorioData();
////        for (Laboratorio labo : labData.listarLaboratorios(true)) {
////            System.out.println(labo);
////        }
//        
////      Prueba listar Citas Mensual
//        CitaVacunacionData citavData = new CitaVacunacionData();
//        for (CitaVacunacion citav : citavData.obtenerCitasMensual(LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 15), true)) {
//            System.out.println(citav);
//        } 
//    }
//}
