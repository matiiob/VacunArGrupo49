
package vacunargrupo49;

import AccesoADatos.CiudadanoData;
import Entidades.Ciudadano;

public class VacunArGrupo49 {


    public static void main(String[] args) {
        
        Ciudadano juan = new Ciudadano(123, "Juan Lopez", "juan@lopez", "012", null, "Salud");
        CiudadanoData ciu = new CiudadanoData();
        ciu.guardarCiudadano(juan);
    }

}
