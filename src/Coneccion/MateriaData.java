package Coneccion;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con;

    public void AlumnoData() {
        con = Conectar.getConectar();
    }

    private ArrayList<Materia> arrayMateria = new ArrayList<>();
    
    public ArrayList<Materia> buscarMateria(String data, String codigo) {
        AlumnoData();
        String sql;
        arrayMateria.clear();
        switch (codigo) {
            case "ID MATERIA":
                sql = "SELECT * FROM materia WHERE idMateria LIKE (?)";
                break;
            case "AÑO":
                sql = "SELECT * FROM materia WHERE año LIKE (?)";
                break;
            case "NOMBRE":
                sql = "SELECT * FROM materia WHERE nombre LIKE (?)";
                break;
            case "NO_INSCRIPTO": sql = "SELECT * FROM materia WHERE idMateria NOT IN "
                    + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
                break;
            default:
                sql = "SELECT * FROM materia WHERE estado LIKE (?)";
                break;
        };
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, data + '%');
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setAnio(rs.getInt("año"));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(rs.getBoolean("estado"));
                materia.setCupo(rs.getInt("cupo"));
                arrayMateria.add(materia);
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda de materia");
        }
        return arrayMateria;
    }

    public ArrayList<Materia> materiaXalumno(int idAlumno) {
        AlumnoData();
        String sql;
        arrayMateria.clear();
        sql = "SELECT * FROM materia INNER JOIN inscripcion ON materia.idMateria = inscripcion.idMateria WHERE inscripcion.idAlumno = ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setAnio(rs.getInt("Año"));
                materia.setNombre(rs.getString("Nombre"));
                //          materia.setEstado(rs.getString("Estado")); 
                arrayMateria.add(materia);
            }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        return arrayMateria;
    }

    public void cargarMateria(String nombre, int anio, boolean estado, int cupo) {
        AlumnoData();

        String sql = "INSERT INTO materia (nombre,año,estado,cupo) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombre);
            ps.setInt(2, anio);
            ps.setBoolean(3, estado);
            ps.setInt(4, cupo);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }

    public void modificarMateria(Materia materia){
        AlumnoData();
        String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ?, cupo = ? WHERE idMateria = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4,materia.getCupo());
            ps.setInt(5, materia.getIdMateria());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no existe");
            }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }

    }
      
      public void eliminarMateria(int idMateria) {
        AlumnoData();
        try {
            String sql = "DELETE FROM materia WHERE idMateria LIKE ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Materia Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "No se eliminó la materia");
            }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "No existe materia cono ese id");
        }
    }    
}
