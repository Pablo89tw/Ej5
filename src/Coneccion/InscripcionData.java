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
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }

    public int cargarNota(int nota, int idAlumno, int idMateria) {
        AlumnoData();
        int check = 0;
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int fila = ps.executeUpdate();
            
            if (fila == 0) {
                JOptionPane.showMessageDialog(null, "No se editó el estado del alumno");
            } else if (fila > 0){
                check = 1;
            }
            
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "No existe alumno cono ese id");
        } return check;
     }

    public ArrayList<Inscripcion> Inscripciones_x_Alumno(int usuario) {
        AlumnoData();
        Materia materia = new Materia();
        Alumno alumno = new Alumno();
        Inscripcion inscripcion;
        String sql = null;
        arrayInscripciones_x_alumno.clear();

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
                inscripcion.setEstado(rs.getInt("estado"));
                arrayInscripciones_x_alumno.add(inscripcion);
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error en la búsqueda.");
        }
        return arrayInscripciones_x_alumno;
    }

    public Inscripcion buscarInscripcion(int idMateria, int idAlumno){
        AlumnoData();
        Inscripcion iS = new Inscripcion();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        PreparedStatement ps = null;      
               
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2,idMateria);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                iS.setAlumno(aD.buscarAlumno(Integer.toString(idAlumno), "ID ALUMNO", null).get(0));
                iS.setMateria(mD.buscarMateria(Integer.toString(idMateria), "ID MATERIA").get(0));
                iS.setIdInscripcion(rs.getInt("idInscripcion"));
                iS.setNota(rs.getInt("nota"));
                iS.setEstado(rs.getInt("estado"));
                }        
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        return iS;
            
    }
    
     public void actualizarEstadoInscripcion(int estado, int idInscripcion) {
        AlumnoData();
        String sql = "UPDATE inscripcion SET estado = ? WHERE idInscripcion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ps.setInt(2, idInscripcion);
           
            int fila = ps.executeUpdate();
            
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Estado actualizado");
            }
            
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "No existe alumno cono ese id");
        } 
     }
     
     public void eliminarInscripcion(int idInscripcion){
        AlumnoData();
        try {
            String sql = "DELETE FROM inscripcion WHERE idInscripcion LIKE ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idInscripcion);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Inscripcion Eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "No se eliminó la Inscripción");
            }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "No existe una inscripcion cono ese id");
        }
     }
    
}
