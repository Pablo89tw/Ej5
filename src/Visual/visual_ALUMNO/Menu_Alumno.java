package Visual.visual_ALUMNO;

import Entidades.Alumno;
import Visual.visual_General.Modificar_Clave;

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Inscripciones = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        Inscripciones1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenu1.setText("Menu");

        jMenuItem2.setText("Perfil");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setText("Cambiar Contraseña");
        jMenu1.add(jMenuItem5);

        jMenuItem1.setText("Cerrar");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        Inscripciones.setText("Inscripciones");

        jMenuItem3.setText("Inscribir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Inscripciones.add(jMenuItem3);

        jMenuItem4.setText("Consultas");
        Inscripciones.add(jMenuItem4);

        jMenuBar1.add(Inscripciones);

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 700, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 475, Short.MAX_VALUE))
        );

        jMenu2.setText("Menu");

        jMenuItem6.setText("Perfil");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Cambiar Contraseña");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Cerrar Sesión");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar2.add(jMenu2);

        Inscripciones1.setText("Inscripciones");

        jMenuItem9.setText("Inscribir");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        Inscripciones1.add(jMenuItem9);

        jMenuItem10.setText("Consultas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Inscripciones1.add(jMenuItem10);

        jMenuBar2.add(Inscripciones1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Inscribirse_Alumno iA = new Inscribirse_Alumno(usuario, aD, mD, iD);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Inscribirse_Alumno iA = new Inscribirse_Alumno(usuario, aD, mD, iD);
        jDesktopPane1.add(iA);
        iA.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Consultas_Alumno cA = new Consultas_Alumno(usuario, aD, mD, iD);
        jDesktopPane1.add(cA);
        cA.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Modificar_Clave mC = new Modificar_Clave(usuario);
        jDesktopPane1.add(mC);
        mC.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Inscripciones;
    private javax.swing.JMenu Inscripciones1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

    private void armarVista() {
        String text = null;
        for (Alumno a1 : aD.buscarAlumno(Integer.toString(usuario), "DNI", null)) {
            text = ("Bienvenido " + a1.getNombre() + ", " + a1.getApellido());
        }
        jLabel1.setText(text);
    }
}
