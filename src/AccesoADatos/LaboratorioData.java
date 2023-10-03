package AccesoADatos;

import Entidades.Laboratorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LaboratorioData {

    private Connection con = null;

    public LaboratorioData() {
        con = Conexion.getConexion();
    }

    public void guardarLaboratorio(Laboratorio laboratorio) {
        String sql = "INSERT INTO laboratorio (cuit, nomLaboratorio, pais, domComercial, estado)"
                + "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, laboratorio.getCuit());
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

    public void modificarLaboratorio(Laboratorio laboratorio) {
        String sql = "UPDATE laboratorio SET cuit=?, nomLaboratorio=?, pais=?, domComercial=? WHERE idLaboratorio="
                + laboratorio.getIdLaboratorio() + "";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, laboratorio.getCuit());
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
}
