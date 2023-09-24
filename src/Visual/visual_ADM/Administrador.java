package Visual.visual_ADM;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

import Visual.visual_ADM.Cargar_Alumno;
import Visual.visual_ADM.Listar_Alumnos_o_Materias;
import Visual.visual_ADM.ModificarAlumno;
import Entidades.Alumno;


public class Administrador extends javax.swing.JInternalFrame {

    private int usuario;
    Coneccion.AlumnoData aD = new Coneccion.AlumnoData();
    Coneccion.MateriaData mD = new Coneccion.MateriaData();
    Coneccion.InscripcionData iD = new Coneccion.InscripcionData();

    public Administrador(int usuario) {
        initComponents();
        this.usuario = usuario;

        String text = null;
        for (Alumno a1 : aD.buscarAlumno(Integer.toString(usuario), "DNI", null)) {
            text = ("Bienvenido " + a1.getNombre() + ", " + a1.getApellido());
        }
        jLabel2.setText(text);

        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/Vista/Img/fondo base.jpg"));
        Image image2 = icon2.getImage();
        fondo_admin = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image2,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        menu_Buscar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menu_alumno = new javax.swing.JMenu();
        agregar_Alumno = new javax.swing.JMenuItem();
        modificar_Alumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_materia = new javax.swing.JMenu();
        agregar_Materia = new javax.swing.JMenuItem();
        modificar_Materia = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_Inscripciones = new javax.swing.JMenu();
        inscr_Agregar = new javax.swing.JMenuItem();
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

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jLabel1.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRADOR");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("ArianLT-Demi", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido Juan Carlos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
        Menu.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/logo-ulp22.png"))); // NOI18N

        menu_Buscar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        menu_Buscar.setText("BUSCAR");
        menu_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_BuscarActionPerformed(evt);
            }
        });
        Menu.add(menu_Buscar);

        jMenuItem1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jMenuItem1.setText("CONTRASEÑA");
        Menu.add(jMenuItem1);

        Salir.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Menu.add(Salir);

        jMenuBar1.add(Menu);
        Menu.getAccessibleContext().setAccessibleName("  MENU");

        jMenu1.setText("|");
        jMenu1.setEnabled(false);
        jMenu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        menu_alumno.setBorder(null);
        menu_alumno.setText("  ALUMNO  ");
        menu_alumno.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N

        agregar_Alumno.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        agregar_Alumno.setText("AGREGAR");
        agregar_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_AlumnoActionPerformed(evt);
            }
        });
        menu_alumno.add(agregar_Alumno);

        modificar_Alumno.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        modificar_Alumno.setText("MODIFICAR");
        modificar_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_AlumnoActionPerformed(evt);
            }
        });
        menu_alumno.add(modificar_Alumno);

        jMenuBar1.add(menu_alumno);

        jMenu2.setText("|");
        jMenu2.setEnabled(false);
        jMenu2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu2);

        menu_materia.setBorder(null);
        menu_materia.setText("  MATERIA  ");
        menu_materia.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N

        agregar_Materia.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        agregar_Materia.setText("AGREGAR");
        menu_materia.add(agregar_Materia);

        modificar_Materia.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        modificar_Materia.setText("MODIFICAR");
        menu_materia.add(modificar_Materia);

        jMenuBar1.add(menu_materia);

        jMenu3.setText("|");
        jMenu3.setEnabled(false);
        jMenu3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu3);

        menu_Inscripciones.setBorder(null);
        menu_Inscripciones.setText("  INSCRIPCIONES  ");
        menu_Inscripciones.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N

        inscr_Agregar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        inscr_Agregar.setText("AGREGAR");
        menu_Inscripciones.add(inscr_Agregar);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificar_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_AlumnoActionPerformed

        fondo_admin.removeAll();
        fondo_admin.repaint();

        ModificarAlumno elim_alum = new ModificarAlumno(usuario);
        elim_alum.setVisible(true);

        fondo_admin.add(elim_alum);
        fondo_admin.moveToFront(elim_alum);
        elim_alum.setLocation((int) fondo_admin.getLocation().getX() + 45, (int) fondo_admin.getLocation().getY() + 60);

    }//GEN-LAST:event_modificar_AlumnoActionPerformed

    private void agregar_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_AlumnoActionPerformed

        fondo_admin.removeAll();
        fondo_admin.repaint();

        Cargar_Alumno agr_alum = new Cargar_Alumno();
        agr_alum.setVisible(true);

        fondo_admin.add(agr_alum);
        fondo_admin.moveToFront(agr_alum);
        agr_alum.setLocation((int) fondo_admin.getLocation().getX() + 100, (int) fondo_admin.getLocation().getY() + 60);


    }//GEN-LAST:event_agregar_AlumnoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

    private void menu_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_BuscarActionPerformed

        fondo_admin.removeAll();
        fondo_admin.repaint();

        Listar_Alumnos_o_Materias adminBus = new Listar_Alumnos_o_Materias();
        adminBus.setVisible(true);

        fondo_admin.add(adminBus);
        fondo_admin.moveToFront(adminBus);
        adminBus.setLocation((int) fondo_admin.getLocation().getX() + 100, (int) fondo_admin.getLocation().getY() + 60);

    }//GEN-LAST:event_menu_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem agregar_Alumno;
    private javax.swing.JMenuItem agregar_Materia;
    private javax.swing.JDesktopPane fondo_admin;
    private javax.swing.JMenuItem inscr_Agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menu_Buscar;
    private javax.swing.JMenu menu_Inscripciones;
    private javax.swing.JMenu menu_alumno;
    private javax.swing.JMenu menu_materia;
    private javax.swing.JMenuItem modificar_Alumno;
    private javax.swing.JMenuItem modificar_Materia;
    // End of variables declaration//GEN-END:variables
}
