package ej5_Coneccion;

import ej5_Entidades.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class ModificarAlumnos {
    
    private Connection con = null;

    public void AlumnoData() {
        con = Conexion.getConectar();
    }
    
    public void modificarDataAlumno(Alumno alumno) {
        AlumnoData();
        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ?, estado = ?, año = ? WHERE idAlumno = ?";
        PreparedStatement ps = null;
       
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4,java.sql.Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5,alumno.isEstado());
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
    

}
