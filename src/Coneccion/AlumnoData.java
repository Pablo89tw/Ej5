package Coneccion;

import Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlumnoData {
    private Connection con;
    
    public void AlumnoData() {
        con = Conectar.getConectar();
    }
    
    private ArrayList<Alumno> arrayAlumno = new ArrayList<>();
   

    public ArrayList<Alumno> buscarAlumno(String data, String codigo, LocalDate fecha) {
        AlumnoData();
        arrayAlumno.clear();
        String sql;

        switch (codigo) {
            case "ID ALUMNO":
                sql = "SELECT * FROM alumno WHERE iDAlumno LIKE (?)";
                break; //reemplazar *
            case "APELLIDO":
                sql = "SELECT * FROM alumno WHERE apellido LIKE (?)";
                break;
            case "NOMBRE":
                sql = "SELECT * FROM alumno WHERE nombre LIKE (?)";
                break;
            case "DNI":
                sql = "SELECT * FROM alumno WHERE dni LIKE (?)";
                break;
            case "FECHA NACIMIENTO":
                sql = "SELECT * FROM alumno WHERE fechaNacimiento LIKE (?)";
                break;
            case "AÑO":
                sql = "SELECT * FROM alumno WHERE año LIKE (?)"; break;
            default:
                sql = "SELECT * FROM alumno WHERE estado LIKE (?)";
                break;
        };
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            if (data != null && fecha == null) {
                ps.setString(1, data + '%');
            } else if (data == null && fecha != null) {
                ps.setString(1, fecha.toString());
            }
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setAnio(rs.getInt("año"));
                alumno.setEstado(rs.getBoolean("estado"));
                alumno.setCategoria(rs.getInt("categoria"));
                arrayAlumno.add(alumno);
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        return arrayAlumno;
    }
    
    public void cargarAlumno(Alumno alumno) {
        AlumnoData();

        String sql = "INSERT INTO alumno (dni,apellido,nombre,fechaNacimiento,estado,año,categoria) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.setInt(6,alumno.getAnio());
            ps.setInt(7,1);
           
            int updates =  ps.executeUpdate();;
            if (updates > 0){
                JOptionPane.showMessageDialog(null, "El alumno " + alumno.getApellido() + " " + alumno.getNombre() +  " ha sido gregado con exito");
           } 
            if (updates == 0){
                JOptionPane.showMessageDialog(null, "El alumno no ha sido cargado.");
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }
    
    public void modificarDataAlumno(Alumno alumno) {
        AlumnoData();
        int exito = 0;
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

            exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no existe");
            }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }

    }
    
    public ArrayList<Alumno> alumnosXmateria(int idMateria) {
        AlumnoData();
        String sql;
        arrayAlumno.clear();
        sql = "SELECT * FROM alumno INNER JOIN inscripcion ON alumno.idAlumno = inscripcion.idAlumno WHERE inscripcion.idMateria = ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setAnio(rs.getInt("año"));
                alumno.setEstado(rs.getBoolean("estado"));
                alumno.setCategoria(rs.getInt("categoria"));
                arrayAlumno.add(alumno);
            }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        return arrayAlumno;
    }

    public void eliminarAlumno(int idAlumno) {
        AlumnoData();
        System.out.println(idAlumno);
        try {
            String sql = "DELETE FROM alumno WHERE idAlumno LIKE ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Alumno Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "No se eliminó el alumno");
            }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "No existe alumno cono ese id");
        }
    }
    
    
    

}
