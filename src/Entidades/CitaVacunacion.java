
package Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @AlexAnders
 */
public class CitaVacunacion {
    private int idCodCita;
    private int idCiudadano;
    private int codRefuerzo;
    private Date fechaHoraCita;
    private String centroVacunacion;
    private Date fechaHoraColoca; 
    private int dosis;
    private boolean estado;

    public CitaVacunacion() {
    }

    public CitaVacunacion(int idCiudadano, int codRefuerzo, Date fechaHoraCita, String centroVacunacion, Date fechaHoraColoca, int dosis, boolean estado) {
        this.idCiudadano = idCiudadano;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoca = fechaHoraColoca;
        this.dosis = dosis;
        this.estado = estado;
    }

    public CitaVacunacion(int idCodCita, int idCiudadano, int codRefuerzo, Date fechaHoraCita, String centroVacunacion, Date fechaHoraColoca, int dosis, boolean estado) {
        this.idCodCita = idCodCita;
        this.idCiudadano = idCiudadano;
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

    public int getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(int idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public int getCodRefuerzo() {
        return codRefuerzo;
    }

    public void setCodRefuerzo(int codRefuerzo) {
        this.codRefuerzo = codRefuerzo;
    }

    public Date getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(Date fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public String getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(String centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public Date getFechaHoraColoca() {
        return fechaHoraColoca;
    }

    public void setFechaHoraColoca(Date fechaHoraColoca) {
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
        return "CitaVacunacion: "+"idCodCita: "+idCodCita+", idCiudadano: "+idCiudadano+", codRefuerzo: "+codRefuerzo+", fechaHoraCita: "+fechaHoraCita+", centroVacunacion: "+centroVacunacion+", fechaHoraColoca: "+fechaHoraColoca+", dosis: "+dosis+", estado: "+estado;
    }

    

    
    
}
