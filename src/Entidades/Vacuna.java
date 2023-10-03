/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @aAlexAnders
 */
public class Vacuna {
    private int idVacuna;
    private long nroSerieDosis;
    private String marca;
    private double medida;
    private LocalDate fechaCaduca;
    private boolean colocada;
    private int laboratorio;

    public Vacuna() {
    }

    public Vacuna(long nroSerieDosis, String marca, double medida, LocalDate fechaCaduca, boolean colocada, int laboratorio) {
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
        this.laboratorio = laboratorio;
    }

    public Vacuna(int idVacuna, long nroSerieDosis, String marca, double medida, LocalDate fechaCaduca, boolean colocada, int laboratorio) {
        this.idVacuna = idVacuna;
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
        this.laboratorio = laboratorio;
    }

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public long getNroSerieDosis() {
        return nroSerieDosis;
    }

    public void setNroSerieDosis(long nroSerieDosis) {
        this.nroSerieDosis = nroSerieDosis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public LocalDate getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(LocalDate fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    public int getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(int laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "idVacuna=" + idVacuna + ", nroSerieDosis=" + nroSerieDosis + ", marca=" + marca + ", medida=" + medida + ", fechaCaduca=" + fechaCaduca + ", colocada=" + colocada + ", laboratorio=" + laboratorio + '}';
    }
    
    
}
