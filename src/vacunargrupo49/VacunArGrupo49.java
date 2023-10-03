
package vacunargrupo49;

import AccesoADatos.CiudadanoData;
import AccesoADatos.LaboratorioData;
import Entidades.Ciudadano;
import Entidades.Laboratorio;

public class VacunArGrupo49 {


    public static void main(String[] args) {
          
        // CODIGO DE PRUEBAS
        
//        Ciudadano juan = new Ciudadano(123, "Juan Lopez", "juan@lopez", "012", null, "Salud");
//        CiudadanoData ciu = new CiudadanoData();
//        ciu.guardarCiudadano(juan);
            Laboratorio labo = new Laboratorio(33445566779L, "Pfizer", "USA", "USA");
            LaboratorioData laboData = new LaboratorioData();
            laboData.guardarLaboratorio(labo);
    }

}
