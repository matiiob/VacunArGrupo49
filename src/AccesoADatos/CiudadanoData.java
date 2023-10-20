/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class CiudadanoData {

    private Connection con = null;

    public CiudadanoData() {
        con = Conexion.getConexion();
    }

    public void guardarCiudadano(Ciudadano ciudadano) {

        String sql = "INSERT INTO ciudadano (dni, nombreCompleto, email, celular, patologia, ambitoTrabajo, eliminado)"
                + "VALUES(?,?,?,?,?,?,?)";

        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          //  ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ciudadano.getDni());
            ps.setString(2, ciudadano.getNombreCompleto());
            ps.setString(3, ciudadano.getEmail());
            ps.setString(4, ciudadano.getCelular());
            ps.setString(5, ciudadano.getPatologia());
            ps.setString(6, ciudadano.getAmbitoTrabajo());
            ps.setBoolean(7, ciudadano.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ciudadano.setIdCiudadano(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ciudadano cargado con éxito..!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos" + ex);
        }

    }

    public void modificarCiudadano(Ciudadano ciudadano) {

        String sql = "UPDATE ciudadano SET dni=?, nombreCompleto=?, email=?,"
                + " celular=?, patologia=?, ambitoTrabajo=?, eliminado = ? WHERE idCiudadano="+ciudadano.getIdCiudadano();
                                                           // agregado 19-10 
        
      
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ciudadano.getDni());
            ps.setString(2, ciudadano.getNombreCompleto());
            ps.setString(3, ciudadano.getEmail());
            ps.setString(4, ciudadano.getCelular());
            ps.setString(5, ciudadano.getPatologia());
            ps.setString(6, ciudadano.getAmbitoTrabajo());
            ps.setBoolean(7, ciudadano.isEstado());  // agregado 19-10
            int cargado = ps.executeUpdate();
            if (cargado == 1) {
                JOptionPane.showMessageDialog(null, "Ciudadano modificado con éxito..!");
            } else {
                JOptionPane.showMessageDialog(null, "Error al querer encontrar el Ciudadano indicado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos" + ex.getMessage());
        }

    }

    public Ciudadano buscarCiudadanoDni(int dni) {
        // La busqueda permite al usuario buscar un Ciudadano por su dni.
        
        String sql = "SELECT dni, nombreCompleto, email, celular, patologia, "
                + "ambitoTrabajo FROM ciudadano WHERE dni = ?";

        Ciudadano ciudadano = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ciudadano = new Ciudadano();
                ciudadano.setDni(rs.getInt("dni"));
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
    
    public Ciudadano buscarCiudadanoId(int idCiudadano) {
        // La busqueda permite al usuario buscar un Ciudadano por su Id.
        
        String sql = "SELECT dni, nombreCompleto, email, celular, patologia, "
                + "ambitoTrabajo FROM ciudadano WHERE idCiudadano = ?";

        Ciudadano ciudadano = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudadano);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ciudadano = new Ciudadano();
                ciudadano.setDni(rs.getInt("dni"));
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
    
    
    
    
    public void eliminarCiudadano(int id) { 
    try {
        String sql = "UPDATE ciudadano SET eliminado = 1 WHERE idCiudadano = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        int fila = ps.executeUpdate();
            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "Se eliminó el Ciudadano.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar al Ciudadano: " + e.getMessage());
        }
    }
        
        
    
}
