package Visual.visual_ADM;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

import Visual.visual_ADM.CargarAlumno;
import Visual.visual_ADM.Cargar_Materia;
import Visual.visual_ADM.Inscribir_Alumno;
import Visual.visual_ADM.Listar_Alumnos_o_Materias;
import Visual.visual_ADM.ModificarAlumno;
import Entidades.Alumno;
import Visual.visual_General.Modificar_Clave;

public class Administrador extends javax.swing.JInternalFrame {

    private int usuario;
    private Coneccion.AlumnoData aD;
    private Coneccion.MateriaData mD;
    private Coneccion.InscripcionData iD;

    public Administrador(int usuario, Coneccion.AlumnoData aD,Coneccion.MateriaData mD,Coneccion.InscripcionData iD) {
        this.usuario = usuario;
        this.aD = aD;
        this.mD = mD;
        this.iD = iD;
        initComponents();
        WindowsOpenedBienvenido();
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Inferior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ImageIcon icon8 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/fondo base.jpg"));
        Image image8 = icon8.getImage();
        fondo_admin = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image8,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        menu_Buscar = new javax.swing.JMenuItem();
        menu_CambiarContrasena = new javax.swing.JMenuItem();
        menu_CerrarSesion = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menu_alumno = new javax.swing.JMenu();
        alumno_agregarAlumno = new javax.swing.JMenuItem();
        alumno_ModificarAlumno = new javax.swing.JMenuItem();
        alumno_DarLogin = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_materia = new javax.swing.JMenu();
        materia_AgregarMateria = new javax.swing.JMenuItem();
        materia_ModificarMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_Inscripciones = new javax.swing.JMenu();
        inscripciones_AgregarInscripcion = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setBackground(new java.awt.Color(204, 0, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102), 8));
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(new java.awt.Color(51, 255, 51));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVerifyInputWhenFocusTarget(false);

        panel_Inferior.setBackground(new java.awt.Color(255, 0, 102));
        panel_Inferior.setAlignmentX(0.0F);
        panel_Inferior.setAlignmentY(0.0F);

        jLabel1.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRADOR");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("ArianLT-Demi", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido Juan Carlos");

        javax.swing.GroupLayout panel_InferiorLayout = new javax.swing.GroupLayout(panel_Inferior);
        panel_Inferior.setLayout(panel_InferiorLayout);
        panel_InferiorLayout.setHorizontalGroup(
            panel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_InferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_InferiorLayout.setVerticalGroup(
            panel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        fondo_admin.setBackground(new java.awt.Color(0, 102, 204));
        fondo_admin.setAlignmentX(0.0F);
        fondo_admin.setAlignmentY(0.0F);
        fondo_admin.setPreferredSize(new java.awt.Dimension(800, 600));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6), null));
        jMenuBar1.setToolTipText("ADMINISTRADOR");

        Menu.setBorder(null);
        Menu.setText("  MENU  ");
        Menu.setToolTipText("");
        Menu.setActionCommand("  MENU");
        Menu.setAutoscrolls(true);
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Menu.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        Menu.setHideActionText(true);

        menu_Buscar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        menu_Buscar.setText("BUSCAR");
        menu_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_BuscarActionPerformed(evt);
            }
        });
        Menu.add(menu_Buscar);

        menu_CambiarContrasena.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        menu_CambiarContrasena.setText("CAMBIAR CONTRASEÑA");
        menu_CambiarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CambiarContrasenaActionPerformed(evt);
            }
        });
        Menu.add(menu_CambiarContrasena);

        menu_CerrarSesion.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        menu_CerrarSesion.setText("CERRAR SESION");
        menu_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CerrarSesionActionPerformed(evt);
            }
        });
        Menu.add(menu_CerrarSesion);

        jMenuBar1.add(Menu);
        Menu.getAccessibleContext().setAccessibleName("  MENU");

        jMenu1.setText("|");
        jMenu1.setEnabled(false);
        jMenu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        menu_alumno.setBorder(null);
        menu_alumno.setText("  ALUMNO  ");
        menu_alumno.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N

        alumno_agregarAlumno.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        alumno_agregarAlumno.setText("AGREGAR");
        alumno_agregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumno_agregarAlumnoActionPerformed(evt);
            }
        });
        menu_alumno.add(alumno_agregarAlumno);

        alumno_ModificarAlumno.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        alumno_ModificarAlumno.setText("MODIFICAR");
        alumno_ModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumno_ModificarAlumnoActionPerformed(evt);
            }
        });
        menu_alumno.add(alumno_ModificarAlumno);

        alumno_DarLogin.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        alumno_DarLogin.setText("DAR LOGIN");
        alumno_DarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumno_DarLoginActionPerformed(evt);
            }
        });
        menu_alumno.add(alumno_DarLogin);

        jMenuBar1.add(menu_alumno);

        jMenu2.setText("|");
        jMenu2.setEnabled(false);
        jMenu2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu2);

        menu_materia.setBorder(null);
        menu_materia.setText("  MATERIA  ");
        menu_materia.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N

        materia_AgregarMateria.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        materia_AgregarMateria.setText("AGREGAR");
        materia_AgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materia_AgregarMateriaActionPerformed(evt);
            }
        });
        menu_materia.add(materia_AgregarMateria);

        materia_ModificarMateria.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        materia_ModificarMateria.setText("MODIFICAR");
        materia_ModificarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materia_ModificarMateriaActionPerformed(evt);
            }
        });
        menu_materia.add(materia_ModificarMateria);

        jMenuBar1.add(menu_materia);

        jMenu3.setText("|");
        jMenu3.setEnabled(false);
        jMenu3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu3);

        menu_Inscripciones.setBorder(null);
        menu_Inscripciones.setText("  INSCRIPCIONES  ");
        menu_Inscripciones.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        menu_Inscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_InscripcionesActionPerformed(evt);
            }
        });

        inscripciones_AgregarInscripcion.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        inscripciones_AgregarInscripcion.setText("AGREGAR");
        inscripciones_AgregarInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscripciones_AgregarInscripcionActionPerformed(evt);
            }
        });
        menu_Inscripciones.add(inscripciones_AgregarInscripcion);

        jMenuItem1.setText("CARGAR NOTA");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_Inscripciones.add(jMenuItem1);

        jMenuItem2.setText("Ver");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu_Inscripciones.add(jMenuItem2);

        jMenuBar1.add(menu_Inscripciones);

        jMenu4.setText("|");
        jMenu4.setEnabled(false);
        jMenu4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleName("ADMINISTRADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addComponent(panel_Inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panel_Inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_BuscarActionPerformed
        
        fondo_admin.removeAll();
        fondo_admin.repaint();
        
        Listar_Alumnos_o_Materias buscar = new Listar_Alumnos_o_Materias(aD, mD);
        buscar.setVisible(true);
        
        fondo_admin.add(buscar);
        fondo_admin.moveToFront(buscar);
        buscar.setLocation((int) fondo_admin.getLocation().getX() + 95, (int) fondo_admin.getLocation().getY() + 60);
        
        
    }//GEN-LAST:event_menu_BuscarActionPerformed

    private void menu_CambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CambiarContrasenaActionPerformed
        
        fondo_admin.removeAll();
        fondo_admin.repaint();
        
        Modificar_Clave mC = new Modificar_Clave(usuario);
        mC.setVisible(true);
        
        fondo_admin.add(mC);
        fondo_admin.moveToFront(mC);
        mC.setLocation((int) fondo_admin.getLocation().getX() + 150, (int) fondo_admin.getLocation().getY() + 80);
        
        
        
    }//GEN-LAST:event_menu_CambiarContrasenaActionPerformed

    private void alumno_agregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumno_agregarAlumnoActionPerformed
        
        fondo_admin.removeAll();
        fondo_admin.repaint();
        
        
        CargarAlumno cA = new CargarAlumno(aD);
        cA.setVisible(true);
        
        fondo_admin.add(cA);
        fondo_admin.moveToFront(cA);
        cA.setLocation((int) fondo_admin.getLocation().getX() + 45, (int) fondo_admin.getLocation().getY() + 60);
        
        
        
    }//GEN-LAST:event_alumno_agregarAlumnoActionPerformed

    private void alumno_ModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumno_ModificarAlumnoActionPerformed
        
        fondo_admin.removeAll();
        fondo_admin.repaint();
        
        ModificarAlumno mA = new ModificarAlumno(usuario, aD);
        mA.setVisible(true);
        
        fondo_admin.add(mA);
        fondo_admin.moveToFront(mA);
        mA.setLocation((int) fondo_admin.getLocation().getX() + 45, (int) fondo_admin.getLocation().getY() + 60);
        
        
    }//GEN-LAST:event_alumno_ModificarAlumnoActionPerformed

    private void alumno_DarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumno_DarLoginActionPerformed
        
        fondo_admin.removeAll();
        fondo_admin.repaint();
        
        Coneccion.loginData ln = new Coneccion.loginData();
        ln.darAccesoNuevos();     
        
        
    }//GEN-LAST:event_alumno_DarLoginActionPerformed

    private void materia_AgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materia_AgregarMateriaActionPerformed
        
        fondo_admin.removeAll();
        fondo_admin.repaint();
        
        Cargar_Materia cM = new Cargar_Materia(mD);
        cM.setVisible(true);
        
        fondo_admin.add(cM);
        fondo_admin.moveToFront(cM);
        cM.setLocation((int) fondo_admin.getLocation().getX() + 45, (int) fondo_admin.getLocation().getY() + 60);
        
        
    }//GEN-LAST:event_materia_AgregarMateriaActionPerformed

    private void materia_ModificarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materia_ModificarMateriaActionPerformed
        
        fondo_admin.removeAll();
        fondo_admin.repaint();
        
        ModificarMateria mmF = new ModificarMateria(usuario, mD);
        mmF.setVisible(true);
        
        fondo_admin.add(mmF);
        fondo_admin.moveToFront(mmF);
        mmF.setLocation((int) fondo_admin.getLocation().getX() + 45, (int) fondo_admin.getLocation().getY() + 60);
        
        
    }//GEN-LAST:event_materia_ModificarMateriaActionPerformed

    private void inscripciones_AgregarInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscripciones_AgregarInscripcionActionPerformed
        
        fondo_admin.removeAll();
        fondo_admin.repaint();
        
        Inscribir_Alumno ia = new Inscribir_Alumno(aD, mD, iD);
        ia.setVisible(true);
        
        fondo_admin.add(ia);
        fondo_admin.moveToFront(ia);
        ia.setLocation((int) fondo_admin.getLocation().getX() + 45, (int) fondo_admin.getLocation().getY() + 60);
        
    }//GEN-LAST:event_inscripciones_AgregarInscripcionActionPerformed

    private void menu_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CerrarSesionActionPerformed
        
        this.setVisible(false);
        
        
    }//GEN-LAST:event_menu_CerrarSesionActionPerformed

    private void menu_InscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_InscripcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_InscripcionesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Cargar_Nota cN = new Cargar_Nota(aD,mD,iD);
       fondo_admin.add(cN);
        cN.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Listar_Alumno_x_Materia laxm = new Listar_Alumno_x_Materia(aD, mD);
        fondo_admin.add(laxm);
        laxm.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem alumno_DarLogin;
    private javax.swing.JMenuItem alumno_ModificarAlumno;
    private javax.swing.JMenuItem alumno_agregarAlumno;
    private javax.swing.JDesktopPane fondo_admin;
    private javax.swing.JMenuItem inscripciones_AgregarInscripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem materia_AgregarMateria;
    private javax.swing.JMenuItem materia_ModificarMateria;
    private javax.swing.JMenuItem menu_Buscar;
    private javax.swing.JMenuItem menu_CambiarContrasena;
    private javax.swing.JMenuItem menu_CerrarSesion;
    private javax.swing.JMenu menu_Inscripciones;
    private javax.swing.JMenu menu_alumno;
    private javax.swing.JMenu menu_materia;
    private javax.swing.JPanel panel_Inferior;
    // End of variables declaration//GEN-END:variables

    private void WindowsOpenedBienvenido() {

        String text = null;
        for (Alumno a1 : aD.buscarAlumno(Integer.toString(usuario), "DNI", null)) {
            text = ("Bienvenido " + a1.getNombre() + ", " + a1.getApellido());
        }
        jLabel2.setText(text);

    }

}
