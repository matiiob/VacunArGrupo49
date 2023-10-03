
package Entidades;

public class Laboratorio {
    
    private int idLaboratorio;
    private long cuit;
    private String nomLaboratorio;
    private String pais;
    private String domComercial;
    private boolean estado;
    
    // CONSTRUCTOR COMPLETO
    public Laboratorio(int idLaboratorio, long cuit, String nomLaboratorio, String pais, String domComercial, boolean estado) {
        this.idLaboratorio = idLaboratorio;
        this.cuit = cuit;
        this.nomLaboratorio = nomLaboratorio;
        this.pais = pais;
        this.domComercial = domComercial;
        this.estado = estado;
    }
    
    // CONSTRUCTOR SIN ID
    public Laboratorio(long cuit, String nomLaboratorio, String pais, String domComercial) {
        this.cuit = cuit;
        this.nomLaboratorio = nomLaboratorio;
        this.pais = pais;
        this.domComercial = domComercial;
    }
    
    // CONSTRUCTOR VACIO
    public Laboratorio() {
    }
    
    // GETTERS Y SETTERS
    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getNomLaboratorio() {
        return nomLaboratorio;
    }

    public void setNomLaboratorio(String nomLaboratorio) {
        this.nomLaboratorio = nomLaboratorio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDomComercial() {
        return domComercial;
    }

    public void setDomComercial(String domComercial) {
        this.domComercial = domComercial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    // TO STRING

    @Override
    public String toString() {
        return "Laboratorio{" + "idLaboratorio=" + idLaboratorio + ", cuit=" + cuit + ", nomLaboratorio=" + nomLaboratorio + ", pais=" + pais + ", domComercial=" + domComercial + ", estado=" + estado + '}';
    }
    
}
