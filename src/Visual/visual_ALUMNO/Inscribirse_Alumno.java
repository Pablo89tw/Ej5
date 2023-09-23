package Visual.visual_ALUMNO;

import Entidades.Alumno;
import Entidades.Materia;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inscribirse_Alumno extends javax.swing.JInternalFrame {
    private Alumno alumno;
    private int usuario;
    private int idMateria = 0;
    private int idAlumno;

    public Inscribirse_Alumno(int usuario) {
        initComponents();
        /// this.usuario = usuario;
        armarCabecera();
        alumno = aD.buscarAlumno(Integer.toString(usuario), "DNI", null).get(0);
        jText.setEnabled(false);
        jButton.setEnabled(false);
    }

    DefaultTableModel modelo_mat = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    Coneccion.Select aD = new Coneccion.Select();
    Coneccion.Updates iA = new Coneccion.Updates();

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jCB = new javax.swing.JComboBox<>();
        jText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jButton.setText("Inscribir");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBItemStateChanged(evt);
            }
        });

        jText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextActionPerformed(evt);
            }
        });
        jText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextKeyReleased(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton)
                    .addComponent(Salir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void jCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBItemStateChanged
        jText.setEnabled(true);
    }//GEN-LAST:event_jCBItemStateChanged

    private void jTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextKeyReleased
        borrarFila();
        for (Materia m1 : aD.buscarMateria(jText.getText(), jCB.getSelectedItem().toString())) {
            if (m1.getAnio() == alumno.getAnio()){
            modelo_mat.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio(), m1.isEstado(),});
        }
        }
    }//GEN-LAST:event_jTextKeyReleased

    private void jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMousePressed
        int filaSeleccionada = jTable.getSelectedRow();
        if (filaSeleccionada >= 0) {
            idMateria = (int) jTable.getValueAt(filaSeleccionada, 0);
        }
        jButton.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMousePressed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        Materia mat = aD.buscarMateria(Integer.toString(idMateria), "ID MATERIA").get(0);
        String text_Mess = "Te deseas inscribir a " + mat.getNombre() + ". Año: " + mat.getAnio();

        switch (JOptionPane.showConfirmDialog(rootPane, text_Mess)) {
            case 0: iA.inscribirAlumno(idMateria, alumno.getIdAlumno());break;
            case 1:  jText.setText("");  jText.setText(""); break;
        }
    }//GEN-LAST:event_jButtonActionPerformed

    private void jTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton;
    private javax.swing.JComboBox<String> jCB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jText;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo_mat.setColumnCount(0);
        modelo_mat.addColumn("iD Materia");
        modelo_mat.addColumn("Nombre");
        modelo_mat.addColumn("AÑO");
        modelo_mat.addColumn("ESTADO");
        jTable.setModel(modelo_mat);

        String[] listaCMmat = {"ID MATERIA", "NOMBRE"};
        DefaultComboBoxModel<String> model_mat = new DefaultComboBoxModel<>(listaCMmat);
        jCB.setModel(model_mat);
    }

    private void borrarFila() {
        int filas = jTable.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo_mat.removeRow(f);
        }
    }
}
