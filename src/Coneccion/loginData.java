package Coneccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class loginData {

    private int contadorIngresos = 0;
    private int categoriaResultado = 2;
    private Connection con;
    private int usuario;
    private String clave_in, clave;
    private int count = 0;

    public void AlumnoData() {
        con = Conectar.getConectar();
    }

    public int logIN(int usuario, String clave_in) {
        AlumnoData();

        String sql = "SELECT * FROM login WHERE Usuario LIKE (?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(usuario));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getString("Clave").equals(clave_in) && rs.getInt("estado") == 0) {
                    ingresosReseteo(usuario);
                    PreparedStatement ps2 = null;
                    String sq12 = "SELECT categoria FROM alumno WHERE dni LIKE (?)";
                    ps2 = con.prepareStatement(sq12);
                    ps2.setString(1, Integer.toString(usuario));
                    ResultSet rs2 = ps2.executeQuery();
                    if (rs2.next()) {
                        categoriaResultado = rs2.getInt("categoria");
                    }
                } else {
                    ingresoFallido(usuario);
                    if (rs.getInt("estado") == 1) {
                        JOptionPane.showMessageDialog(null, "Usuario Bloqueado");
                    } else if (!rs.getString("Clave").equals(clave_in)) {
                        JOptionPane.showMessageDialog(null, "La cuenta o la contraseña es incorrecta");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario inexistente");
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        return categoriaResultado;
    }

    public void modificarClave(String clave_in, String clave_n1, String clave_n2, int usuario) {
        AlumnoData();
        String clave_usuario = null;
        String sql = "SELECT Clave FROM login WHERE Usuario LIKE (?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(usuario));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                clave_usuario = rs.getString("Clave");
                System.out.println(clave_usuario);
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        if (clave_in.equals(clave_usuario) && clave_n1.equals(clave_n2)) {

            String sq1 = "UPDATE login SET Clave = ? WHERE Usuario LIKE ?";
            ps = null;

            try {
                ps = con.prepareStatement(sq1);
                ps.setString(1, clave_n1);
                ps.setInt(2, usuario);

                int rowsAffected = ps.executeUpdate();

            } catch (SQLException sqlE) {
                JOptionPane.showMessageDialog(null, "Error busqueda");
            }
        }
    }

    public void darAccesoNuevos() {
        int max_al = 0, max_log = 0;

        AlumnoData();
        String sql = "SELECT idAlumno FROM alumno";
        String sql1 = "SELECT alumno.idAlumno FROM alumno INNER JOIN logIN ON alumno.dni = logIN.usuario";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getInt("idAlumno") > max_al) {
                    max_al = rs.getInt("idAlumno");
                }
            }
            ps = con.prepareStatement(sql1);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getInt("idAlumno") > max_log) {
                    max_log = rs.getInt("idAlumno");
                }
            }
            cargarDNI_login(max_log, max_al);
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
    }

    public String buscarClave(int usuario) {
        AlumnoData();
        String resultado = null;
        String sql = "SELECT Clave FROM logIN WHERE Usuario LIKE (?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(usuario));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                resultado = rs.getString("clave");
            } else {
                JOptionPane.showMessageDialog(null, "sos un queso");
            }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        return resultado;
    }

    public void resteoClave(int idAlumno) {
        AlumnoData();
        int alumno_dni = 0;
        String sql = "SELECT dni FROM alumno WHERE idAlumno = ?";
        String sql2 = "UPDATE login SET Clave = ? WHERE usuario LIKE ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno_dni = rs.getInt("dni");
            }
            String clave_n = Integer.toString((int) alumno_dni / 1000);

            ps = con.prepareStatement(sql2);
            ps.setString(1, clave_n);
            ps.setInt(2, alumno_dni);

            int resultado = ps.executeUpdate();

            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "La clave ha sido prestablecida correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "La clave NO se ha restablecida");
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
    }

    public void cargarDNI_login(int min, int max) {
        AlumnoData();
        int dni = 0;
        String clave;
        if (min < max) {
            for (int i = (min + 1); i <= max; i++) {

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
        } else {
            JOptionPane.showMessageDialog(null, "La base ya se encuentra actualizada");
        }

    }

    public void ingresoFallido(int usuario) {
        int ingreso_n;
        String sql = "SELECT ingresos FROM login WHERE Usuario = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getInt("ingresos") < 2 && rs.getInt("estado") == 0) {
                    ingreso_n = rs.getInt("ingresos") + 1;

                    String sql2 = "UPDATE login SET ingresos = ? WHERE Usuario = ?";
                    PreparedStatement ps2 = null;

                    try {
                        ps2 = con.prepareStatement(sql2);
                        ps2.setInt(1, ingreso_n);
                        ps2.setInt(2, usuario);

                        int resultado = ps2.executeUpdate();

                    } catch (SQLException sqlE) {
                        JOptionPane.showMessageDialog(null, "Error en la actualización");
                    }
                } else {
                    if (rs.getInt("ingresos") >= 2) {
                        String sql2 = "UPDATE login SET estado = ?, ingresos = ? WHERE Usuario = ?";
                        PreparedStatement ps3 = null;

                        try {
                            ps3 = con.prepareStatement(sql2);
                            ps3.setInt(1, 1);
                            ps3.setInt(2, 0);
                            ps3.setInt(3, usuario);

                            int resultado2 = ps3.executeUpdate();

                            if (resultado2 == 1) {
                                JOptionPane.showMessageDialog(null, "Usuario Bloqueado");
                            }
                        } catch (SQLException sqlE) {
                            JOptionPane.showMessageDialog(null, "Error");
                        }
                    }
                }
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error en la búsqueda");
        }
    }

    private void ingresosReseteo(int usuario) {
        String sql2 = "UPDATE login SET ingresos = ? WHERE Usuario = ?";
        PreparedStatement ps2 = null;
        try {
            ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, 0);
            ps2.setInt(2, usuario);
            int resultado = ps2.executeUpdate();
        } catch (SQLException sqlE) {
        }
    }

    public void cargarRecordar(int usaurio, boolean recordarme) {
            String sql2 = "UPDATE login SET recordar = ? WHERE Usuario = ?";
            PreparedStatement ps2 = null;

            try {
                ps2 = con.prepareStatement(sql2);
                if (recordarme){
                        ps2.setInt(1, 1);
                        }
                else if (recordarme==false){
                        ps2.setInt(1, 0); 
                        }
                ps2.setInt(2, usuario);

                int resultado = ps2.executeUpdate();

            } catch (SQLException sqlE) {
            }
        }
    
    
    public int verRecordar(int usuario){
        int resultado = 0;
        String sql = "SELECT recordar FROM logIN WHERE Usuario LIKE (?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, (Integer.toString(usuario)) + "%");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                resultado = rs.getInt("recordar");
            } 
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        return resultado;
     }
}
