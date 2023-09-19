
package ej5_Coneccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Inscripcion {
    
    private Connection con = null;

    public void AlumnoData() {
        con = Conexion.getConectar();
    }

    public void inscribirAlumno(int idMateria, int idAlumno){
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
}
        
        
    