package ej5_Coneccion;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;

public class CargarAlumno {

    private Connection con = null;

    public void AlumnoData() {
        con = Conexion.getConectar();
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

    
    
}



