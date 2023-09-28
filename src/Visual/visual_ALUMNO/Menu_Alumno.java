package Visual.visual_ALUMNO;

import Entidades.Alumno;
import Visual.visual_General.Modificar_Clave;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu_Alumno extends javax.swing.JInternalFrame {

    private int usuario;
    private Coneccion.AlumnoData aD;
    private Coneccion.MateriaData mD;
    private Coneccion.InscripcionData iD;
    private Alumno alumno;

    public Menu_Alumno(int usuario, Coneccion.AlumnoData aD, Coneccion.MateriaData mD, Coneccion.InscripcionData iD) {
        this.aD = aD;
        this.mD = mD;
        this.iD = iD;
        this.usuario = usuario;
        initComponents();
        armarVista();

        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon60 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/fondo base.jpg"));
        Image image60 = icon60.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image60,0,0,getWidth(),getHeight(),this);
            }

        };
        panel_Inferior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Inscripciones1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0), 8));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        panel_Inferior.setBackground(new java.awt.Color(102, 204, 0));
        panel_Inferior.setAlignmentX(0.0F);
        panel_Inferior.setAlignmentY(0.0F);
        panel_Inferior.setPreferredSize(new java.awt.Dimension(352, 27));

        jLabel2.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ALUMNO");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido Juan Carlos");

        javax.swing.GroupLayout panel_InferiorLayout = new javax.swing.GroupLayout(panel_Inferior);
        panel_Inferior.setLayout(panel_InferiorLayout);
        panel_InferiorLayout.setHorizontalGroup(
            panel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_InferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_InferiorLayout.setVerticalGroup(
            panel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InferiorLayout.createSequentialGroup()
                .addGroup(panel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar2.setPreferredSize(new java.awt.Dimension(116, 31));

        jMenu2.setText("  MENU  ");
        jMenu2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jMenuItem7.setText("CAMBIAR CONTRASEÑA");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jMenuItem8.setText("CERRAR SESIÓN");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("|");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar2.add(jMenu3);

        Inscripciones1.setText("  INSCRIPCIONES  ");
        Inscripciones1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jMenuItem9.setText("INSCRIBIR");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        Inscripciones1.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jMenuItem10.setText("CONSULTAS");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Inscripciones1.add(jMenuItem10);

        jMenuBar2.add(Inscripciones1);

        jMenu1.setText("|");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addComponent(panel_Inferior, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panel_Inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
  
        Inscribirse_Alumno iA = new Inscribirse_Alumno(usuario, aD, mD, iD);
        jDesktopPane1.add(iA);
        iA.setVisible(true);
        
        jDesktopPane1.moveToFront(iA);
        iA.setLocation((int) jDesktopPane1.getLocation().getX() + 150, (int) jDesktopPane1.getLocation().getY() + 80);
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        
        Consultas_Alumno cA = new Consultas_Alumno(usuario, aD, mD, iD);
        jDesktopPane1.add(cA);
        cA.setVisible(true);
        
        jDesktopPane1.moveToFront(cA);
        cA.setLocation((int) jDesktopPane1.getLocation().getX() + 150, (int) jDesktopPane1.getLocation().getY() + 80);
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();

        Modificar_Clave mC = new Modificar_Clave(usuario);
        jDesktopPane1.add(mC);
        mC.setVisible(true);
        
        jDesktopPane1.moveToFront(mC);
        mC.setLocation((int) jDesktopPane1.getLocation().getX() + 150, (int) jDesktopPane1.getLocation().getY() + 80);


    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Inscripciones1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel panel_Inferior;
    // End of variables declaration//GEN-END:variables

    private void armarVista() {
        String text = null;
        for (Alumno a1 : aD.buscarAlumno(Integer.toString(usuario), "DNI", null)) {
            text = ("Bienvenido/a " + a1.getNombre() + ", " + a1.getApellido());
        }
        jLabel1.setText(text);
    }
}
