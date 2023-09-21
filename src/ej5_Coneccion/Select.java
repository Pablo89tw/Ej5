package ej5_Coneccion;

import ej5_Entidades.Alumno;
import ej5_Entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class Select {

    private Connection con;

    private ArrayList<Alumno> arrayAlumno = new ArrayList<>();
    private ArrayList<Materia> arrayMateria = new ArrayList<>();

    public void AlumnoData() {
        con = Conectar.getConectar();
    }

    public ArrayList<Alumno> buscarAlumno(String data, String codigo, LocalDate fecha) {
        AlumnoData();
        arrayAlumno.clear();
        String sql;

        switch (codigo) {
            case "ID ALUMNO": sql = "SELECT * FROM alumno WHERE iDAlumno LIKE (?)"; break; //reemplazar *
            case "APELLIDO":sql = "SELECT * FROM alumno WHERE apellido LIKE (?)";break;
            case "NOMBRE": sql = "SELECT * FROM alumno WHERE nombre LIKE (?)";break;
            case "DNI": sql = "SELECT * FROM alumno WHERE dni LIKE (?)";break;
            case "FECHA NACIMIENTO": sql = "SELECT * FROM alumno WHERE fechaNacimiento LIKE (?)";break;
            default: sql = "SELECT * FROM alumno WHERE estado LIKE (?)";break;
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
                arrayAlumno.add(alumno);
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        } return arrayAlumno;
    }

    public ArrayList<Materia> buscarMateria(String data, String codigo) {
        AlumnoData();
        String sql;
        arrayMateria.clear();
        switch (codigo) {
            case "ID MATERIA": sql = "SELECT * FROM materia WHERE idMateria LIKE (?)";break;
            case "AÑO": sql = "SELECT * FROM materia WHERE año LIKE (?)";break;
            case "NOMBRE": sql = "SELECT * FROM materia WHERE nombre LIKE (?)";break;
            default: sql ="SELECT * FROM materia WHERE estado LIKE (?)";break;
        };
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, data + '%');
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
        } return arrayMateria;
    }
    
    public ArrayList<Alumno> alumnosXmateria (int idMateria){
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
                arrayAlumno.add(alumno);
            }
            
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }  
        return arrayAlumno;
    }
    
    public ArrayList<Materia> materiaXalumno (int idAlumno){
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
    }
