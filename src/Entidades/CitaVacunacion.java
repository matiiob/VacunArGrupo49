
package Entidades;

import java.time.LocalDate;

/**
 *
 * @AlexAnders
 */
public class CitaVacunacion {
    private int idCodCita;
    private int dni;
    private int codRefuerzo;
    private String fechaHoraCita;
    private String centroVacunacion;
    private LocalDate fechaHoraColoca; 
    private int dosis;
    private boolean estado;

    public CitaVacunacion() {
    }

    public CitaVacunacion(int idCodCita, int dni, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDate fechaHoraColoca, int dosis, boolean estado) {
        this.idCodCita = idCodCita;
        this.dni = dni;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoca = fechaHoraColoca;
        this.dosis = dosis;
        this.estado = estado;
    }

    public CitaVacunacion(int dni, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDate fechaHoraColoca, int dosis, boolean estado) {
        this.dni = dni;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoca = fechaHoraColoca;
        this.dosis = dosis;
        this.estado = estado;
    }

    public int getIdCodCita() {
        return idCodCita;
    }

    public void setIdCodCita(int idCodCita) {
        this.idCodCita = idCodCita;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCodRefuerzo() {
        return codRefuerzo;
    }

    public void setCodRefuerzo(int codRefuerzo) {
        this.codRefuerzo = codRefuerzo;
    }

    public String getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(String fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public String getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(String centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public LocalDate getFechaHoraColoca() {
        return fechaHoraColoca;
    }

    public void setFechaHoraColoca(LocalDate fechaHoraColoca) {
        this.fechaHoraColoca = fechaHoraColoca;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CitaVacunacion{" + "idCodCita=" + idCodCita + ", dni=" + dni + ", codRefuerzo=" + codRefuerzo + ", fechaHoraCita=" + fechaHoraCita + ", centroVacunacion=" + centroVacunacion + ", fechaHoraColoca=" + fechaHoraColoca + ", dosis=" + dosis + ", estado=" + estado + '}';
    }

    
    
}
