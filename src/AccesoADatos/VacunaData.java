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
        String sql = "INSERT INTO vacuna (nroSerieDosis, marca, medida, fechaCaduca, colocada, laboratorio, eliminada)"
                + "VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, vacuna.getNroSerieDosis());
            ps.setString(2, vacuna.getMarca());
            ps.setDouble(3, vacuna.getMedida());
            ps.setDate(4, Date.valueOf(vacuna.getFechaCaduca()));
            ps.setBoolean(5, vacuna.isColocada());
            ps.setInt(6, vacuna.getLaboratorio());
            ps.setBoolean(7, vacuna.isEliminada());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                vacuna.setIdVacuna(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Vacuna añadida con exito!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Faltan datos o alguno es ta duplicado, verificar!");
            }
            ps.close();

        } catch (SQLException ex) {

            if (ex.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Error: Ya existe una vacuna con el número de serie de dosis ingresado.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de vacuna" + ex.getMessage());
            }
        }

    }

    // METODO MODIFICAR-*-
    public void modificarVacuna(Vacuna vacuna) {
        String sql = "UPDATE vacuna SET nroSerieDosis=?, marca=?, laboratorio=?, medida=?, fechaCaduca=? , colocada=?, eliminada=? WHERE idVacuna=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, vacuna.getNroSerieDosis());
            ps.setString(2, vacuna.getMarca());
            ps.setInt(3, vacuna.getLaboratorio());
            ps.setDouble(4, vacuna.getMedida());
            ps.setDate(5, Date.valueOf(vacuna.getFechaCaduca()));
            ps.setBoolean(6, vacuna.isColocada());
            ps.setBoolean(7, vacuna.isEliminada());
            ps.setInt(8, vacuna.getIdVacuna());
            
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

    // METODO BORRAR              
    public void eliminarVacuna(int nroSerieDosis) {

        try {
            String sql = "UPDATE vacuna SET eliminada = true WHERE nroSerieDosis = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroSerieDosis);
            int fila = ps.executeUpdate();
            if (fila == 1) {
        //  modificado 25-10        JOptionPane.showMessageDialog(null, "Se eliminó la vacuna.");
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una Vacuna.");
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
    public List<Vacuna> buscarVacunaVencida(LocalDate fechaActual) {
        List<Vacuna> vacunasVencidas = new ArrayList<>();
        String sql = "SELECT * FROM vacuna WHERE fechaCaduca < ?";
        // > busca la ultima fecha- < busca la fecha mas antigua- 'con Operadores'
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaActual));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Vacuna vacuna = new Vacuna();
                vacuna.setIdVacuna(rs.getInt("IdVacuna"));
                vacuna.setFechaCaduca(rs.getDate("fechaCaduca").toLocalDate());
                vacuna.setColocada(rs.getBoolean("colocada"));
                // Agrega la vacuna a la lista 'caducadas'
                vacunasVencidas.add(vacuna);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna" + e.getMessage());
        }
        return vacunasVencidas;
    }

    // METODO BUSCAR nroSerieDosis 
    public Vacuna buscarVacunaNroSerieDosis(long nroSerieDosis) {
        Vacuna vacuna = new Vacuna();
        String sql = "SELECT * FROM vacuna WHERE nroSerieDosis = ?";
        // > busca la ultima fecha- < busca la fecha mas antigua- 'con Operadores'
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, nroSerieDosis);
            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
                while (rs.next()) {

                    vacuna.setIdVacuna(rs.getInt("IdVacuna"));
                    vacuna.setNroSerieDosis(nroSerieDosis);
                    vacuna.setMarca(rs.getString("marca"));
                    vacuna.setMedida(rs.getDouble("medida"));
                    vacuna.setLaboratorio(rs.getInt("laboratorio"));
                    vacuna.setFechaCaduca(rs.getDate("fechaCaduca").toLocalDate());
                    vacuna.setColocada(rs.getBoolean("colocada"));
                    vacuna.setEliminada(rs.getBoolean("eliminada"));

                }

//            } else {
//                vacuna = null;
//            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna" + e.getMessage());
        }
        return vacuna;
    }
    
    // METODO BUSCAR VACUNA POR LABORATORIO
    public List<Vacuna> buscarVacunaPorLaboratorio(int laboratorio, boolean colocada) {
        List<Vacuna> vacunaPorLaboratorio = new ArrayList<>();
        //String sql = "SELECT * FROM vacuna WHERE laboratorio = ?";
        String sql = "SELECT idVacuna, nroSerieDosis, marca, medida, fechaCaduca, colocada, laboratorio FROM vacuna WHERE laboratorio = ? AND colocada = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, laboratorio);
            ps.setBoolean(2, colocada);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Vacuna vacuna = new Vacuna();
                vacuna.setIdVacuna(rs.getInt("idVacuna"));
                vacuna.setNroSerieDosis(rs.getLong("nroSerieDosis"));
                vacuna.setMarca(rs.getString("marca"));
                vacuna.setMedida(rs.getDouble("medida"));
                vacuna.setFechaCaduca(rs.getDate("fechaCaduca").toLocalDate());
                vacuna.setColocada(rs.getBoolean("colocada"));
                vacuna.setLaboratorio(laboratorio);
                vacunaPorLaboratorio.add(vacuna); // Agregar la instancia de Vacuna a la lista
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna" + e.getMessage());
        }
        return vacunaPorLaboratorio;
    }

    // METODO EXISTE VACUNA (evitar duplicados)-*-
    public boolean existeVacuna(int nroSerieDosis) {

        boolean existe = false;
        try {
            Connection con = Conexion.getConexion();
            String sql = "SELECT * FROM vacuna WHERE nroSerieDosis = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroSerieDosis);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                existe = true;
            }
//        rs.close();
//        ps.close();
//        con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return existe;

    }

    public void restaurarVacuna (int nroSerieDosis){
        try {
            String sql = "UPDATE vacuna SET eliminada = false WHERE nroSerieDosis = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroSerieDosis);
            int fila = ps.executeUpdate();
            if (fila == 1) {
        //  modificado 25-10        JOptionPane.showMessageDialog(null, "Se eliminó la vacuna.");
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una Vacuna.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar vacuna: " + e.getMessage());
        }
    }
}
