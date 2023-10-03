
package Entidades;

import java.time.LocalDate;

/**
 *
 * @AlexAnders
 */
public class CitaVacuna {
    private int codCita;
    private Ciudadano persona;
    private int codRefuerzo;
    private String fechaHoraCita;
    private String centroVacunacion;
    private LocalDate fechaHoraColoca; 
    private int dosis;

    public CitaVacuna() {
    }

    public CitaVacuna(Ciudadano persona, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDate fechaHoraColoca, int dosis) {
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoca = fechaHoraColoca;
        this.dosis = dosis;
    }

    public CitaVacuna(int codCita, Ciudadano persona, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDate fechaHoraColoca, int dosis) {
        this.codCita = codCita;
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoca = fechaHoraColoca;
        this.dosis = dosis;
    }

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public Ciudadano getPersona() {
        return persona;
    }

    public void setPersona(Ciudadano persona) {
        this.persona = persona;
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

    @Override
    public String toString() {
        return "CitaVacuna{" + "codCita=" + codCita + ", persona=" + persona + ", codRefuerzo=" + codRefuerzo + ", fechaHoraCita=" + fechaHoraCita + ", centroVacunacion=" + centroVacunacion + ", fechaHoraColoca=" + fechaHoraColoca + ", dosis=" + dosis + '}';
    }
    
    
}
