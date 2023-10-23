/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
//import java.util.Date;

/**
 *
 * @AlexAnders
 */
public class CitaVacunacionData {
   private Connection con = null;
   private LaboratorioData ld;
   private VacunaData vd;
   private CiudadanoData cd;
   private CitaVacunacionData cvd;
   
   public CitaVacunacionData() {
        con = Conexion.getConexion();

    }
   
   public void guardarCitaVacunacion(CitaVacunacion citav){
   
        String sql = "INSERT INTO citavacunacion(idCiudadano,codRefuerzo,fechaHoraCita,centroVacunacion,fechaHoraColoca,dosis,estado)VALUES (?,?,?,?,?,?,?)";
        try {                                                                  
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,citav.getIdCiudadano());
            ps.setInt(2,citav.getCodRefuerzo());
            ps.setDate(3, Date.valueOf(citav.getFechaHoraCita()));
//            ps.setTimestamp(3, new Timestamp(citav.getFechaHoraCita().getTime()));//se usa con java util date
            ps.setString(4,citav.getCentroVacunacion());
            ps.setDate(5, Date.valueOf(citav.getFechaHoraColoca()));
//            ps.setTimestamp(5, new Timestamp(citav.getFechaHoraColoca().getTime()));
            ps.setInt(6,citav.getDosis());
            ps.setBoolean(7,citav.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
             if (rs.next()) {
                citav.setIdCodCita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cita registrada");
            } else {
                JOptionPane.showMessageDialog(null, "No se registro la cita");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla CitaVacunacion" + ex.getMessage());

        }
    }
        
       public void eliminarCitaVacunacion(int idCodCita) {

        String sql = "UPDATE citavacunacion SET estado = 0  WHERE idCodCita= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCodCita);
            int citaEliminada = ps.executeUpdate();
            if (citaEliminada == 1) {
                JOptionPane.showMessageDialog(null, "Cita borrada con éxito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar a la tabla cita vacunacion" + ex.getMessage());
        }
   }
 
    public void modificarCitaVacunacion(CitaVacunacion citav){
       
       
       String sql ="UPDATE citavacunacion SET codRefuerzo=?,fechaHoraCita=?,centroVacunacion=?,fechaHoraColoca=?,dosis=?,estado=? WHERE idCiudadano="+citav.getIdCiudadano()+"";
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1,citav.getCodRefuerzo());
           ps.setDate(3, Date.valueOf(citav.getFechaHoraCita()));
//           ps.setTimestamp(2, new Timestamp(citav.getFechaHoraCita().getTime()));
           ps.setString(3,citav.getCentroVacunacion());
           ps.setDate(5, Date.valueOf(citav.getFechaHoraColoca()));
//           ps.setTimestamp(4, new Timestamp(citav.getFechaHoraColoca().getTime()));
           ps.setInt(5,citav.getDosis());
           ps.setBoolean(6,citav.isEstado());
            ps.setInt(8,citav.getIdCiudadano());
         
           int citaModificada = ps.executeUpdate();
           
           if (citaModificada == 1){
               JOptionPane.showMessageDialog(null, "Cita modificada");
           }
            ps.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo ingresar a la tabla cita vacunacion" + ex.getMessage());
       }
   }

    public CitaVacunacion buscarCitaVacunacion(int idcodCita, boolean estado){
        String sql = "SELECT idCodCita, idCiudadano,codRefuerzo,fechaHoraCita, centroVacunacion,fechaHoraColoca,dosis,estado FROM citavacunacion WHERE idCodcita=? AND estado=? ";

        CitaVacunacion cita = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1,idcodCita);
            ps.setBoolean(2, estado);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cita = new CitaVacunacion();
                
                cita.setIdCodCita(rs.getInt("idCodCita"));
                cita.setIdCiudadano(rs.getInt("idCiudadano"));
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getDate("fechaHoraCita").toLocalDate());
                cita.setCentroVacunacion(rs.getString("centroVacunacion"));
                cita.setFechaHoraColoca(rs.getDate("fechaHoraColoca").toLocalDate());
                cita.setDosis(rs.getInt("dosis"));
                cita.setEstado(rs.getBoolean("estado"));
             }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cita vacunacion" + e.getMessage());
        }
        return cita;
    }
   public List<CitaVacunacion> obtenerTodasLasCitas() {

        List<CitaVacunacion> citas = new ArrayList<>();

        String sql = "SELECT* FROM citavacunacion";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                CitaVacunacion cit = new CitaVacunacion();

                cit.setIdCodCita(rs.getInt("idCodCita"));
                cit.setIdCiudadano(rs.getInt("idCiudadano"));
                cit.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cit.setFechaHoraCita(rs.getDate("fechaHoraCita").toLocalDate());
                cit.setCentroVacunacion(rs.getString("centroVacunacion"));
                cit.setFechaHoraColoca(rs.getDate("fechaHoraColoca").toLocalDate());
                cit.setDosis(rs.getInt("dosis"));
                cit.setEstado(rs.getBoolean("estado"));
                
                citas.add(cit);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cita vacunacion" + ex.getMessage());
        }
       return citas;
   }
    
    public List<CitaVacunacion> obtenerCitasPorFechas(LocalDate fechaInicio, LocalDate fechaFin, boolean estado) {
        List<CitaVacunacion> citasMes = new ArrayList<>();
        String sql = "SELECT * FROM citavacunacion "
                + "WHERE fechaHoraCita >= ? AND fechaHoraCita <= ? AND estado = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaInicio));
            ps.setDate(2, Date.valueOf(fechaFin));
            ps.setBoolean(3, estado);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CitaVacunacion cita = new CitaVacunacion();
                cita.setIdCodCita(rs.getInt("idCodCita"));
                cita.setIdCiudadano(rs.getInt("idciudadano"));
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getDate("fechaHoraCita").toLocalDate());
                cita.setCentroVacunacion(rs.getString("centroVacunacion"));
                cita.setFechaHoraColoca(rs.getDate("fechaHoraColoca").toLocalDate());
                cita.setDosis(rs.getInt("dosis"));
                cita.setEstado(estado);
                citasMes.add(cita);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cita vacunacion" + e.getMessage());
        }
        return citasMes;
    }
    //entedemos por citas vencidas son anteriores a la fecha actual y no estan cumplidas , ni canceladas
    public List<CitaVacunacion> obtenerCitasVencidas() {
        List<CitaVacunacion> citasVencidas = new ArrayList<>();
        String sql = "SELECT * FROM citavacunacion WHERE fechaHoraCita < CURRENT_TIMESTAMP AND fechaHoraColoca IS null AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CitaVacunacion cita = new CitaVacunacion();
                cita.setIdCodCita(rs.getInt("idCodCita"));
                cita.setIdCiudadano(rs.getInt("idciudadano"));
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getDate("fechaHoraCita").toLocalDate());
                cita.setCentroVacunacion(rs.getString("centroVacunacion"));
                cita.setFechaHoraColoca(rs.getDate("fechaHoraColoca").toLocalDate());
                cita.setDosis(rs.getInt("dosis"));
                cita.setEstado(rs.getBoolean("estado"));
                citasVencidas.add(cita);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cita vacunacion" + e.getMessage());
        }
        return citasVencidas;
    }
    public List<CitaVacunacion> obtenerCitasCumplidas() {
        List<CitaVacunacion> citasCumplidas = new ArrayList<>();
        String sql = "SELECT * FROM citavacunacion WHERE fechaHoraCita < CURRENT_TIMESTAMP AND fechaHoraColoca IS NOT null AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CitaVacunacion cita = new CitaVacunacion();
                cita.setIdCodCita(rs.getInt("idCodCita"));
                cita.setIdCiudadano(rs.getInt("idciudadano"));
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getDate("fechaHoraCita").toLocalDate());
                cita.setCentroVacunacion(rs.getString("centroVacunacion"));
                cita.setFechaHoraColoca(rs.getDate("fechaHoraColoca").toLocalDate());
                cita.setDosis(rs.getInt("dosis"));
                cita.setEstado(rs.getBoolean("estado"));
                citasCumplidas.add(cita);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cita vacunacion" + e.getMessage());
        }
        return citasCumplidas;
    }
        public List<CitaVacunacion> obtenerCitasCanceladas() {

        List<CitaVacunacion> citas = new ArrayList<>();

        String sql = "SELECT* FROM citavacunacion WHERE estado = 0";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                CitaVacunacion cit = new CitaVacunacion();

                cit.setIdCodCita(rs.getInt("idCodCita"));
                cit.setIdCiudadano(rs.getInt("idCiudadano"));
                cit.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cit.setFechaHoraCita(rs.getDate("fechaHoraCita").toLocalDate());
                cit.setCentroVacunacion(rs.getString("centroVacunacion"));
                cit.setFechaHoraColoca(rs.getDate("fechaHoraColoca").toLocalDate());
                cit.setDosis(rs.getInt("dosis"));
                cit.setEstado(rs.getBoolean("estado"));
                
                citas.add(cit);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cita vacunacion" + ex.getMessage());
        }
       return citas;
   }
   public List<CitaVacunacion> obtenerVacunasAplicadasPorCentro(LocalDate fechaInicio, LocalDate fechaFin) {

        List<CitaVacunacion> citas = new ArrayList<>();

        String sql = "SELECT centroVacunacion, COUNT(dosis) AS dosis FROM `citavacunacion` "
                + "WHERE fechaHoraColoca >= ? AND fechaHoraColoca <= ? AND estado=1 GROUP BY centroVacunacion;";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaInicio));
            ps.setDate(2, Date.valueOf(fechaFin));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                CitaVacunacion cit = new CitaVacunacion();

//                cit.setIdCodCita(rs.getInt("idCodCita"));
//                cit.setIdCiudadano(rs.getInt("idCiudadano"));
//                cit.setCodRefuerzo(rs.getInt("codRefuerzo"));
//                cit.setFechaHoraCita(rs.getTimestamp("fechaHoraCita"));
                cit.setCentroVacunacion(rs.getString("centroVacunacion"));
//                cit.setFechaHoraColoca(rs.getTimestamp("fechaHoraColoca"));
                cit.setDosis(rs.getInt("dosis"));
//                cit.setEstado(rs.getBoolean("estado"));
                
                citas.add(cit);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cita vacunacion" + ex.getMessage());
        }
       return citas;
   } 
   public Ciudadano buscarCiudadanoPorDni(int dni) {
        // La busqueda permite al usuario buscar un Ciudadano por su dni.
        
        String sql = "SELECT* FROM ciudadano WHERE dni = ?";

        Ciudadano ciudadano = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                ciudadano = new Ciudadano();
                
                ciudadano.setDni(rs.getInt("dni"));
                ciudadano.setIdCiudadano(rs.getInt("idCiudadano"));
                ciudadano.setNombreCompleto(rs.getString("nombreCompleto"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getString("celular"));
                ciudadano.setPatologia(rs.getString("patologia"));
                ciudadano.setAmbitoTrabajo(rs.getString("ambitoTrabajo"));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudadano" + e.getMessage());
        }
        return ciudadano;
    }
}