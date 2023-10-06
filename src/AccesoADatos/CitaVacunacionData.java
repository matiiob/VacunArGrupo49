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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

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
        ld = new LaboratorioData();
        vd = new VacunaData();
        cd = new CiudadanoData();
        cvd = new CitaVacunacionData();
    }
   
   public void guardarCitaVacunacion(CitaVacunacion citav){
   
        String sql = "INSERT INTO citavacunacion(dni,codRefuerzo,fechaHoraCita,centroVacunacion, fechaHoraColoca, dosis, estado)VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,citav.getDni());
            ps.setInt(2,citav.getCodRefuerzo());
            ps.setString(3,citav.getFechaHoraCita());
            ps.setString(4,citav.getCentroVacunacion());
            ps.setDate(5,Date.valueOf(citav.getFechaHoraColoca()));
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
   public void eliminarCitaVacunacion(int idCiudadano, int idCitaVacunacion){
       
       String sql = "DELETE FROM citavacunacion WHERE idCiudadano=? AND idCitaVacunacion=?";
       try{
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, idCiudadano);
           ps.setInt(2,idCitaVacunacion);
           int citaEliminada = ps.executeUpdate();
           if (citaEliminada == 1){
               JOptionPane.showMessageDialog(null, "Cita borrada con éxito");
           }
           ps.close();
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "No se pudo ingresar a la tabla cita vacunacion" + ex.getMessage());
       }
   }
   
   public void modificarCitaVacunacion(int idCiudadano, int idCitaVacunacion){
       
       String sql ="UPDATE citavacuna SET fechaHoraCita WHERE idCiudadano=?";
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, idCiudadano);
           ps.setInt(2, idCitaVacunacion);
           int citaModificada = ps.executeUpdate();
           if (citaModificada > 1){
               JOptionPane.showMessageDialog(null, "Cita modificada");
           }
            ps.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo ingresar a la tabla cita vacunacion" + ex.getMessage());
       }
   }
    public void buscarCitaVacunacion(int idCiudadano){
        String sql = "SELECT citavacunacion WHERE idCiudadano=? ";

        CitaVacunacion cita = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idCiudadano);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cita = new CitaVacunacion();
                
                cita.setIdCodCita(rs.getInt("codigo cita"));
                cita.setCentroVacunacion(rs.getString("centro de vacunacion"));
             }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cita vacunacion" + e.getMessage());
        }
    }
   
//   public List<CitaVacunacion> obtenerTodasLasCitas() {
//
//        List<CitaVacunacion> citas = new ArrayList<>();
//
//        String sql = "SELECT idcitavacunacion,idCiudadano FROM citavacunacion";
//        try{
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//
//                CitaVacunacion cit = new CitaVacunacion();
//
//                cit.setIdCodCita(rs.getInt("idCodCita"));
//
//                Ciudadano ciu = cd.buscarCiudadanoDni(rs.getInt("idDni"));
//               
//                cit.setPersona(ciu);
//                
//                citas.add(cit);
//            }
//        }catch(SQLException ex){
//        
//        }
//       return citas;
//   }
}