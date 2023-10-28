
package Entidades;

//Clase creada por Gonzalo

public class Ciudadano {

    private int idCiudadano;
    private int dni;
    private String nombreCompleto;
    private String email;
    private String celular;
    private String patologia;
    private String ambitoTrabajo;
    private boolean eliminado; 

    //Constructor vacío.
    public Ciudadano() {
    }

    //Constructor con todos los parámetros.

    public Ciudadano(int idCiudadano, int dni, String nombreCompleto, String email, String celular, String patologia, String ambitoTrabajo, boolean eliminado) {
        this.idCiudadano = idCiudadano;
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.celular = celular;
        this.patologia = patologia;
        this.ambitoTrabajo = ambitoTrabajo;
        this.eliminado = eliminado;
    }
   

    //Constructor con todos los parámetros menos el idCiudadano.
   

    public Ciudadano(int dni, String nombreCompleto, String email, String celular, String patologia, String ambitoTrabajo, boolean eliminado) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.celular = celular;
        this.patologia = patologia;
        this.ambitoTrabajo = ambitoTrabajo;
        this.eliminado = eliminado;
    }

    public int getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(int idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getAmbitoTrabajo() {
        return ambitoTrabajo;
    }

    public void setAmbitoTrabajo(String ambitoTrabajo) {
        this.ambitoTrabajo = ambitoTrabajo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }


    @Override
    public String toString() {

        return "DNI: " + dni + ", " + "Nombre completo: " + nombreCompleto + ", " + "Email: " + email
                + ", Número de celular: " + celular + ", Patología: " + patologia + ", ambito de trabajo: " + ambitoTrabajo + ", " + "Eliminado: " + eliminado;
    }
}
