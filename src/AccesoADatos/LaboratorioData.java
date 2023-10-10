package AccesoADatos;

import Entidades.Laboratorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LaboratorioData {

    private Connection con = null;

    public LaboratorioData() {
        con = Conexion.getConexion();
    }

//  METODO GUARDAR
    public void guardarLaboratorio(Laboratorio laboratorio) {
        String sql = "INSERT INTO laboratorio (cuit, nomLaboratorio, pais, domComercial, estado)"
                + "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, laboratorio.getCuit());
            ps.setString(2, laboratorio.getNomLaboratorio());
            ps.setString(3, laboratorio.getPais());
            ps.setString(4, laboratorio.getDomComercial());
            ps.setBoolean(5, laboratorio.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                laboratorio.setIdLaboratorio(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Laboratorio añadido con éxito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Laboratorio. " + ex.getMessage());
        }
    }

//  METODO MODIFICAR
    public void modificarLaboratorio(Laboratorio laboratorio) {
        String sql = "UPDATE laboratorio SET cuit=?, nomLaboratorio=?, pais=?, domComercial=? WHERE idLaboratorio="
                + laboratorio.getIdLaboratorio() + "";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, laboratorio.getCuit());
            ps.setString(2, laboratorio.getNomLaboratorio());
            ps.setString(3, laboratorio.getPais());
            ps.setString(4, laboratorio.getDomComercial());
            int modificado = ps.executeUpdate();
            if (modificado == 1) {
                JOptionPane.showMessageDialog(null, "Laboratorio modificado con exito!");
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Laboratorio.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Laboratorio" + ex.getMessage());
        }
    }

//  METODO ELIMINAR LOGICO
    public void eliminarLaboratorio(int idLaboratorio) {
        String sql = "UPDATE laboratorio SET estado = 0 WHERE idLaboratorio = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLaboratorio);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el laboratorio.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Laboratorio.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Laboratorio" + ex.getMessage());
        }
    }

//  METODO BUSCAR POR ID
    public Laboratorio buscarLaboratorioId(int idLaboratorio, boolean estado) {
        String sql = "SELECT cuit, nomLaboratorio, pais, domComercial FROM laboratorio "
                + "WHERE idLAboratorio = ? AND estado = ?";
        Laboratorio laboratorio = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLaboratorio);
            ps.setBoolean(2, estado);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                laboratorio = new Laboratorio();
                laboratorio.setIdLaboratorio(idLaboratorio);
                laboratorio.setCuit(rs.getLong("cuit"));
                laboratorio.setNomLaboratorio(rs.getString("nomLaboratorio"));
                laboratorio.setPais(rs.getString("pais"));
                laboratorio.setDomComercial(rs.getString("domComercial"));
                laboratorio.setEstado(estado);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Laboratorio" + ex.getMessage());
        }
        return laboratorio;
    }

//  METODO BUSCAR POR CUIT
    public Laboratorio buscarLaboratorioCuit(long cuit, boolean estado) {
        String sql = "SELECT idLaboratorio, nomLaboratorio, pais, domComercial FROM laboratorio "
                + "WHERE cuit = ? AND estado = ?";
        Laboratorio laboratorio = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, cuit);
            ps.setBoolean(2, estado);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                laboratorio = new Laboratorio();
                laboratorio.setIdLaboratorio(rs.getInt("idLaboratorio"));
                laboratorio.setCuit(cuit);
                laboratorio.setNomLaboratorio(rs.getString("nomLaboratorio"));
                laboratorio.setPais(rs.getString("pais"));
                laboratorio.setDomComercial(rs.getString("domComercial"));
                laboratorio.setEstado(estado);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Laboratorio" + ex.getMessage());
        }
        return laboratorio;
    }
    
//  METODO LISTAR LABORATORIOS
    public List<Laboratorio> listarLaboratorios (boolean estado){
        List<Laboratorio> laboratorios = new ArrayList<>();
        String sql = "SELECT * FROM laboratorio WHERE estado = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Laboratorio lab = new Laboratorio();
                lab.setIdLaboratorio(rs.getInt("idLaboratorio"));
                lab.setCuit(rs.getLong("cuit"));
                lab.setNomLaboratorio(rs.getString("nomLaboratorio"));
                lab.setPais(rs.getString("pais"));
                lab.setDomComercial(rs.getString("domComercial"));
                lab.setEstado(estado);
                laboratorios.add(lab);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Laboratorio" + ex.getMessage());
        }
        return laboratorios;
    }
}
