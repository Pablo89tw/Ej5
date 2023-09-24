package Coneccion;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con;
    AlumnoData aD = new AlumnoData();
    MateriaData mD = new MateriaData();
    
    public void AlumnoData() {
        con = Conectar.getConectar();
    }
    private ArrayList<Inscripcion> arrayInscripciones_x_alumno = new ArrayList<>();

    public void inscribirAlumno(int idMateria, int idAlumno) {
        AlumnoData();

        String sql = "INSERT INTO inscripcion (idAlumno,idMateria) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

             int filasAfectadas = ps.executeUpdate();          
             ResultSet rs = ps.getGeneratedKeys();
             if (filasAfectadas > 0){
                 JOptionPane.showMessageDialog(null, "Se realizaron " + filasAfectadas + " inscripciones.");
             }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "ERROR!");
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
    
    public ArrayList<Inscripcion> Inscripciones_x_Alumno(int usuario) {
        AlumnoData();
        Materia materia = new Materia();
        Alumno alumno = new Alumno();
        Inscripcion inscripcion;
        String sql, sql2;
        arrayInscripciones_x_alumno.clear();

//        sql1 = "SELECT idAlumno FROM alumno WHERE dni LIKE ?";
//        sql2 = "SELECT * FROM inscripcion WHERE idAlumno LIKE ?";
        
        sql = "SELECT * FROM inscripcion "
                + "INNER JOIN alumno "
                + "ON inscripcion.idAlumno = alumno.idAlumno "
                + "WHERE alumno.dni LIKE ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuario);
            ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    inscripcion = new Inscripcion();
                    inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                    alumno = aD.buscarAlumno(Integer.toString(rs.getInt("idAlumno")), "ID ALUMNO", null).get(0);
                    inscripcion.setAlumno(alumno);
                    materia = mD.buscarMateria(Integer.toString(rs.getInt("idMateria")), "ID MATERIA").get(0);
                    inscripcion.setMateria(materia);
                    inscripcion.setNota(rs.getInt("nota"));
                    arrayInscripciones_x_alumno.add(inscripcion);
                }
            }  catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error en la búsqueda: ");
        }
        System.out.println("Sali");

        return arrayInscripciones_x_alumno;
    }

}
