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
    private boolean eliminada;

    public Vacuna() {
    }

    public Vacuna(long nroSerieDosis, String marca, double medida, LocalDate fechaCaduca, boolean colocada, int laboratorio, boolean eliminada) {
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
        this.laboratorio = laboratorio;
        this.eliminada = eliminada;
    }

    public Vacuna(int idVacuna, long nroSerieDosis, String marca, double medida, LocalDate fechaCaduca, boolean colocada, int laboratorio, boolean eliminada) {
        this.idVacuna = idVacuna;
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
        this.laboratorio = laboratorio;
        this.eliminada = eliminada;
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

    public boolean isEliminada() {
        return eliminada;
    }

    public void setEliminada(boolean eliminada) {
        this.eliminada = eliminada;
    }

    @Override
    public String toString() {
        return "Vacuna{" +
                "idVacuna=" + idVacuna +
                ", nroSerieDosis=" + nroSerieDosis +
                ", marca='" + marca + '\'' +
                ", medida=" + medida +
                ", fechaCaduca=" + fechaCaduca +
                ", colocada=" + colocada +
                ", laboratorio=" + laboratorio +
                '}';
    }

    
    
}
