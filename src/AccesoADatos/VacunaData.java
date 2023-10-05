
package AccesoADatos;

import Entidades.Vacuna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;





public class VacunaData {

 private Connection con = null; //declaracion de 'con' tipo conexion

    public VacunaData() { //aca se inicializamos

        con = Conexion.getConexion();  //aca se conecta VacunaData con la bd
    }

    
                     // METODO GUARDAR-*-
    
    public void GuardarVacuna(Vacuna vacuna) {
    String sql = "INSERT INTO vacuna (nroSerieDosis, marca, medida, fechaCaduca, colocada, laboratorio)"
            + "VALUES(?,?,?,?,?,?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setLong(1, vacuna.getNroSerieDosis());
        ps.setString(2, vacuna.getMarca());
        ps.setDouble(3, vacuna.getMedida());
        ps.setDate(4, Date.valueOf(vacuna.getFechaCaduca()));
        ps.setBoolean(5, vacuna.isColocada());
        ps.setInt(6, vacuna.getLaboratorio());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            vacuna.setIdVacuna(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Vacuna añadida con exito!!!");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de vacuna" + ex.getMessage());
    }
}
    
                     // METODO MODIFICAR-*-
    
     public void modificarVacuna(Vacuna vacuna) {
     String sql = "UPDATE vacuna SET nroSerieDosis=?, marca=?, medida=?, fechaCaduca=? WHERE idVacuna=?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setLong(1, vacuna.getNroSerieDosis());
        ps.setString(2, vacuna.getMarca());
        ps.setDouble(3, vacuna.getMedida());
        ps.setDate(4, Date.valueOf(vacuna.getFechaCaduca()));
        ps.setInt(5, vacuna.getIdVacuna());
        int cargado = ps.executeUpdate();
        if (cargado == 1) {
            JOptionPane.showMessageDialog(null, "Vacuna modificada con exito!");
        } else {
            JOptionPane.showMessageDialog(null, "No existe la vacuna.");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());
    }
}
    
     
                     // METODO  BORRAR -*-
     
     
     public void eliminarVacuna(int id) {
    try {
        String sql = "DELETE FROM vacuna WHERE idVacuna=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        int fila = ps.executeUpdate();
        if (fila == 1) {
            JOptionPane.showMessageDialog(null, "Se eliminó la vacuna.");
        } else {
            JOptionPane.showMessageDialog(null, "No existe la vacuna.");
        }
        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar vacuna: " + e.getMessage());
    }
}
    
    
     
                     // METODO LISTAR VACUNA 
     
     
     public List<Vacuna> listarVacunas(boolean colocada) {
    List<Vacuna> vacunas = new ArrayList<>();
    String sql = "SELECT * FROM vacuna WHERE colocada = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setBoolean(1, colocada);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Vacuna vacuna = new Vacuna();
            vacuna.setIdVacuna(rs.getInt("idVacuna"));
            vacuna.setNroSerieDosis(rs.getLong("nroSerieDosis"));
            vacuna.setMarca(rs.getString("marca"));
            vacuna.setMedida(rs.getDouble("medida"));
            vacuna.setFechaCaduca(rs.getDate("fechaCaduca").toLocalDate());
            vacuna.setColocada(rs.getBoolean("colocada"));
            vacuna.setLaboratorio(rs.getInt("laboratorio"));

            vacunas.add(vacuna);
        }
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna" + ex.getMessage());
    }
    return vacunas;
}
     
    
                     // METODO BUSCAR FECHA CADUCA 
     
     
//    public List<Vacuna> buscarVacunaFechaCaduca(LocalDate fechaCaduca, boolean colocada) {
//    List<Vacuna> vacunasVencidas = new ArrayList<>();
//        String sql = "SELECT * FROM vacuna WHERE fechaCaduca = ? AND colocada = ?";
//    LocalDate fechaEncontrada = null;
//    try {
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setDate(1, Date.valueOf(fechaCaduca));
//        ps.setBoolean(2, colocada);
//        ResultSet rs = ps.executeQuery();
//
//        while (rs.next()) {
//            Vacuna vacuna = new Vacuna();
//            vacuna.setIdVacuna(rs.getInt("IdVacuna"));
//            vacuna.
//            fechaEncontrada = rs.getDate("fechaCaduca").toLocalDate();
//        }
//        ps.close();
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna" + e.getMessage());
//    }
//    return fechaEncontrada;
//}
     
     
                     // METODO BUSCAR VACUNA POR LABORATORIO
    
    public Vacuna buscarVacunaPorLaboratorio(int laboratorio, boolean colocada) {
    String sql = "SELECT * FROM vacuna WHERE laboratorio = ? AND colocada = ?";
    Vacuna vacuna = null;
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, laboratorio);
        ps.setBoolean(2, colocada);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            vacuna = new Vacuna();
            vacuna.setIdVacuna(rs.getInt("idVacuna"));
            vacuna.setNroSerieDosis(rs.getLong("nroSerieDosis"));
            vacuna.setMarca(rs.getString("marca"));
            vacuna.setMedida(rs.getDouble("medida"));
            vacuna.setFechaCaduca(rs.getDate("fechaCaduca").toLocalDate());
            vacuna.setColocada(rs.getBoolean("colocada"));
            vacuna.setLaboratorio(laboratorio);
        }
        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna" + e.getMessage());
    }
    return vacuna;
}
    
     
    
}
