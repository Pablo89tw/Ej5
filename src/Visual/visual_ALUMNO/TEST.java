package Visual.visual_ALUMNO;

import Visual.visual_ADM.Listar_Alumno_x_Materia;
import Visual.visual_ADM.Listar_Alumnos_o_Materias;
import Visual.visual_General.Hacer_LogIN;

public class TEST extends javax.swing.JFrame {
  
    public TEST() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Vamos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Vamos.setText("Vamos");
        Vamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VamosActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(Vamos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(Vamos)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(Vamos)
                .addGap(0, 477, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VamosActionPerformed
    Inscribirse_Alumno iA = new Inscribirse_Alumno(80000028);
       jDesktopPane1.add(iA);
       iA.setVisible(true);
    }//GEN-LAST:event_VamosActionPerformed

    
    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Vamos;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
