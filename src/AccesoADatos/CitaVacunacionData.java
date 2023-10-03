/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.CitaVacunacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

/**
 *
 * @AlexAnders
 */
public class CitaVacunacionData {
   private Connection con = null;
   private LaboratorioData ld;
//   private VacunaData vd;
   private CiudadanoData cd;
   
   public CitaVacunacionData() {
        con = Conexion.getConexion();
        ld = new LaboratorioData();
//        vd = new VacunaData();
        cd = new CiudadanoData();
    }
   
   public void guardarCita(CitaVacunacion citav){
   
        String sql = "INSERT INTO citavacuna (dniCiudadano,codRefuerzo,fechaHoraCita,centroVacunacion, fechaHoraColoca, dosis, estado)VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,citav.getPersona().getDni());
            ps.setInt(2,citav.getCodRefuerzo());
            ps.setString(3,citav.getFechaHoraCita());
            ps.setString(4,citav.getCentroVacunacion());
            ps.setDate(5,Date.valueOf(citav.getFechaHoraColoca()));
            ps.setInt(6,citav.getDosis());
            ps.setBoolean(7,citav.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
             if (rs.next()) {
                citav.setCodCita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cita registrada");
            } else {
                JOptionPane.showMessageDialog(null, "No se registro la cita");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla CitaVacunacion" + ex.getMessage());

        }
    }
}
