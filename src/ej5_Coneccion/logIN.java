package ej5_Coneccion;

import ej5_Entidades.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class logIN {
    private Alumno alumno;
    private Connection con;
    private int usuario;
    private String clave_in, clave;
    ej5_Coneccion.Select bC = new ej5_Coneccion.Select();
    
    public void AlumnoData() {
        con = Conectar.getConectar();
    }

    public void logIN(int usuario, String clave_in) {
        AlumnoData();
        String sql = "SELECT Clave FROM login WHERE Usuario LIKE (?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(usuario));

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                clave = rs.getString("Clave");
            }
            
            if (clave.equals(clave_in /*categoria == 0*/)) {
                System.out.println("pepe1");
              ej5.visualADM.Inscribir_Alumno_a_Materia id = new ej5.visualADM.Inscribir_Alumno_a_Materia();
              id.setVisible(true);
              
               
            } else {
                System.out.println("sos un queso");
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
    }

    public void modificarClave(String clave_in, String clave_n1, String clave_n2) {
        AlumnoData();
        String clave_usuario = "35001"; // Hay que sacarlo de la data del usuario cargada.
        String sq1;
        
        if (clave_in.equals(clave_usuario) && clave_n1.equals(clave_n2)) {

            sq1 = "UPDATE login SET Clave = ? WHERE Usuario LIKE ?";

            PreparedStatement ps = null;        

            try {
                ps = con.prepareStatement(sq1);
                ps.setString(1, clave_n1);
                ps.setString(2, "3500001");
                
                int rowsAffected = ps.executeUpdate();

            } catch (SQLException sqlE) {
                JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        
        }
    }
}