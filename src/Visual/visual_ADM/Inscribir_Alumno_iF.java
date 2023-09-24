package Visual.visual_ADM;


import Entidades.Alumno;
import Entidades.Materia;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inscribir_Alumno_iF extends javax.swing.JInternalFrame {

   Coneccion.AlumnoData aD = new Coneccion.AlumnoData();
    Coneccion.MateriaData mD = new Coneccion.MateriaData();
    Coneccion.InscripcionData iD = new Coneccion.InscripcionData();

    private int idMateria = 0;
    private int idAlumno = 0;
    
    public Inscribir_Alumno_iF() {
        initComponents();
        armarCabecera();
        String[] listaCMAlum = {"ID ALUMNO", "APELLIDO", "NOMBRE", "DNI"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(listaCMAlum);
        jComboBox_insAlum1.setModel(model);
        String[] listaCMmat = {"ID MATERIA", "NOMBRE", "AÑO"};
        DefaultComboBoxModel<String> model_mat = new DefaultComboBoxModel<>(listaCMmat);
        jComboBox_insMat.setModel(model_mat);
        armarCabecera();
        jComboBox_insMat.setEnabled(false);
        jText_insAlum.setEnabled(false);
        jText_insMat.setEnabled(false);
        jButton_inscribir.setEnabled(false);
    }

    DefaultTableModel modelo_al = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    DefaultTableModel modelo_mat = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jText_insAlum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_insAlum = new javax.swing.JTable();
        jButton_inscribir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_insMat = new javax.swing.JTable();
        jComboBox_insAlum = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_insMat = new javax.swing.JComboBox<>();
        jText_insMat = new javax.swing.JTextField();
        jComboBox_insAlum1 = new javax.swing.JComboBox<>();

        jLabel2.setText("Alumno");

        jText_insAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_insAlumKeyReleased(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Inscripcion");

        jTable_insAlum.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_insAlum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_insAlumMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_insAlum);

        jButton_inscribir.setText("Inscribir");
        jButton_inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_inscribirActionPerformed(evt);
            }
        });

        jTable_insMat.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_insMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_insMatMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_insMat);

        jComboBox_insAlum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_insAlumItemStateChanged(evt);
            }
        });

        jLabel4.setText("Materia");

        jComboBox_insMat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_insMat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_insMatItemStateChanged(evt);
            }
        });
        jComboBox_insMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox_insMatMouseEntered(evt);
            }
        });

        jText_insMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_insMatKeyReleased(evt);
            }
        });

        jComboBox_insAlum1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_insAlum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_insAlum1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox_insAlum1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox_insAlum, 0, 1, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jText_insAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_inscribir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_insMat, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_insMat)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_insAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_insAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_insAlum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_insMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_insMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_inscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText_insAlumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_insAlumKeyReleased
        borrarFilaAl();
        for (Alumno a1 : aD.buscarAlumno(jText_insAlum.getText(), jComboBox_insAlum1.getSelectedItem().toString(), null)) {
            modelo_al.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.isEstado()});
        }
    }//GEN-LAST:event_jText_insAlumKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable_insAlumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_insAlumMouseClicked
        jComboBox_insMat.setEnabled(true);
        int filaSeleccionada = jTable_insAlum.getSelectedRow();
        if (filaSeleccionada >= 0) {
            idAlumno = (int) jTable_insAlum.getValueAt(filaSeleccionada, 0);
        }
    }//GEN-LAST:event_jTable_insAlumMouseClicked

    private void jButton_inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_inscribirActionPerformed
        Alumno alumno = aD.buscarAlumno(Integer.toString(idAlumno), "ID ALUMNO", null).get(0);
        Materia mat = mD.buscarMateria(Integer.toString(idMateria), "ID MATERIA").get(0);

        String text_Mess = "Desea inscribir a " + alumno.getApellido() + ", " + alumno.getNombre() + ". DNI: " + alumno.getDni()
        + " en " + mat.getNombre() + ". Año: " + mat.getAnio();

        switch (JOptionPane.showConfirmDialog(rootPane, text_Mess)) {
            case 0:
            iD.inscribirAlumno(idMateria, idAlumno);
            break;
            case 1:
            jText_insAlum.setText("");
            jText_insMat.setText("");
            break;
        }
    }//GEN-LAST:event_jButton_inscribirActionPerformed

    private void jTable_insMatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_insMatMousePressed
        int filaSeleccionada = jTable_insMat.getSelectedRow();
        if (filaSeleccionada >= 0) {
            idMateria = (int) jTable_insMat.getValueAt(filaSeleccionada, 0);
        }
        jButton_inscribir.setEnabled(true);
    }//GEN-LAST:event_jTable_insMatMousePressed

    private void jComboBox_insAlumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_insAlumItemStateChanged
        jText_insAlum.setEnabled(true);
    }//GEN-LAST:event_jComboBox_insAlumItemStateChanged

    private void jComboBox_insMatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_insMatItemStateChanged
        jText_insMat.setEnabled(true);
    }//GEN-LAST:event_jComboBox_insMatItemStateChanged

    private void jComboBox_insMatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_insMatMouseEntered

    }//GEN-LAST:event_jComboBox_insMatMouseEntered

    private void jText_insMatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_insMatKeyReleased
        for (Materia m1 : mD.buscarMateria(jText_insMat.getText(), jComboBox_insMat.getSelectedItem().toString())) {
            modelo_mat.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio(), m1.isEstado()});
        }
    }//GEN-LAST:event_jText_insMatKeyReleased

    private void jComboBox_insAlum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_insAlum1ActionPerformed
        jText_insAlum.setEnabled(true);
    }//GEN-LAST:event_jComboBox_insAlum1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_inscribir;
    private javax.swing.JComboBox<String> jComboBox_insAlum;
    private javax.swing.JComboBox<String> jComboBox_insAlum1;
    private javax.swing.JComboBox<String> jComboBox_insMat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_insAlum;
    private javax.swing.JTable jTable_insMat;
    private javax.swing.JTextField jText_insAlum;
    private javax.swing.JTextField jText_insMat;
    // End of variables declaration//GEN-END:variables

private void armarCabecera() {
        modelo_al.setColumnCount(0);
        modelo_al.addColumn("iD Alumno");
        modelo_al.addColumn("Apellido");
        modelo_al.addColumn("Nombre");
        modelo_al.addColumn("DNI");
        modelo_al.addColumn("F.Nac");
        modelo_al.addColumn("Estado");
        jTable_insAlum.setModel(modelo_al);

        modelo_mat.setColumnCount(0);
        modelo_mat.addColumn("iD Materia");
        modelo_mat.addColumn("Nombre");
        modelo_mat.addColumn("AÑO");
        modelo_mat.addColumn("ESTADO");
        jTable_insMat.setModel(modelo_mat);
    }

    private void borrarFilaAl() {
        int filas = jTable_insAlum.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo_al.removeRow(f);
        }
    }

    private void borrarFilaMat() {
        int filas = jTable_insMat.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo_mat.removeRow(f);
        }
    }
}


