package Coneccion;

import Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Updates {

    private Connection con = null;

    public void AlumnoData() {
        con = Conectar.getConectar();
    }

    public void cargarAlumno(int dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        AlumnoData();

        String sql = "INSERT INTO alumno (dni,apellido,nombre,fechaNacimiento,estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);
            ps.setString(2, apellido);
            ps.setString(3, nombre);
            ps.setDate(4, Date.valueOf(fechaNacimiento));
            ps.setBoolean(5, estado);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                alumno.setIdAlumno(rs.getInt("idAlumno"));
//                JOptionPane.showMessageDialog(null, "Alumno agregado con exito");
//            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }

    public void cargarMateria(String nombre, int anio, boolean estado) {
        AlumnoData();

        String sql = "INSERT INTO materia (nombre,año,estado) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombre);
            ps.setInt(2, anio);
            ps.setBoolean(3, estado);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }

    public void cargarDNI_login() {
        AlumnoData();
        int dni = 0;
        String clave;

        for (int i = 1499; i <= 1663; i++) {

            String sql1 = "SELECT dni FROM alumno WHERE idAlumno = ?";
            String sql2 = "INSERT INTO login (Usuario, Clave) VALUES (?,?)";

            PreparedStatement ps1 = null;
            PreparedStatement ps2 = null;
            try {
                ps1 = con.prepareStatement(sql1);
                ps1.setInt(1, i);
                ResultSet rs1 = ps1.executeQuery();

                if (rs1.next()) {
                    dni = rs1.getInt("dni");
                }
                clave = Integer.toString((int) (dni / 1000));
                ps2 = con.prepareStatement(sql2);
                ps2.setInt(1, dni);
                ps2.setString(2, clave);
                int exito = ps2.executeUpdate();

            } catch (SQLException sqlE) {
                System.out.println("Error");
            }
        }
    }

    public void inscribirAlumno(int idMateria, int idAlumno) {
        AlumnoData();

        String sql = "INSERT INTO inscripcion (idAlumno,idMateria) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }

    public void modificarDataAlumno(Alumno alumno) {
        AlumnoData();
        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ?, estado = ?, año = ? WHERE idAlumno = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, java.sql.Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.setInt(6, alumno.getAnio());
            ps.setInt(7, alumno.getIdAlumno());

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

    public void eliminarAlumno(int idAlumno) {
        AlumnoData();
        try {
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Cambio exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se editó el estado del alumno");
            }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "No existe alumno cono ese id");
        }
    }

    public void cargarNota(int nota, int idAlumno, int idMateria) {
        AlumnoData();
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Cambio exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se editó el estado del alumno");
            }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "No existe alumno cono ese id");
        }
    }

}
