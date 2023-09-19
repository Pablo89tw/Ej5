package ej5_Coneccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CargarLogin {

    private Connection con;
    private int dni;
    private String clave;

    public void AlumnoData() {
        con = Conexion.getConectar();
    }

    public void cargarDNI() {
        AlumnoData();

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
}
