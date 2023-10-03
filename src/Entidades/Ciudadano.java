/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    //Constructor vacío.
    public Ciudadano() {
    }

    //Constructor con todos los parámetros.
    public Ciudadano(int idCiudadano, int dni, String nombreCompleto, String email, String celular, String patologia, String ambitoTrabajo) {
        this.idCiudadano = idCiudadano;
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.celular = celular;
        this.patologia = patologia;
        this.ambitoTrabajo = ambitoTrabajo;
    }

    //Constructor con todos los parámetros menos el idCiudadano.
    public Ciudadano(int dni, String nombreCompleto, String email, String celular, String patologia, String ambitoTrabajo) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.celular = celular;
        this.patologia = patologia;
        this.ambitoTrabajo = ambitoTrabajo;
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

    @Override
    public String toString() {

        return "DNI: " + dni + ", " + "Nombre completo: " + nombreCompleto + ", " + "Email: " + email
                + ", Número de celular: " + celular + ", Patología: " + patologia + ", ambito de trabajo: " + ambitoTrabajo;
    }
}
