package ej5_Coneccion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class CargarMateria {

    private Connection con = null;

    public void AlumnoData() {
        con = Conexion.getConectar();
    }

    public void cargarMateria(String nombre, int anio, boolean estado) {
        
        AlumnoData();
        
        String sql = "INSERT INTO materia (nombre,año,estado) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,nombre);
            ps.setInt(2, anio);
            ps.setBoolean(3, estado);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }
}

