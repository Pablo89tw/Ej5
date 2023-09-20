package ej5.visualADM;

import ej5_Entidades.Alumno;
import ej5_Entidades.Materia;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Cargar_Nota extends javax.swing.JFrame {

    public Cargar_Nota() {
        initComponents();
        unirUnirBotones();
    }

    ej5_Coneccion.Select aD = new ej5_Coneccion.Select();
    ej5_Coneccion.Updates uD = new ej5_Coneccion.Updates();

    DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            if (jR_alumno.isSelected()) {
                return c == 3;
            } else {
                return c == 4;
            }
        }
    };

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jR_alumno = new javax.swing.JRadioButton();
        jR_materia = new javax.swing.JRadioButton();
        jCB = new javax.swing.JComboBox<>();
        jText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar");

        jR_alumno.setText("Alumno");
        jR_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_alumnoActionPerformed(evt);
            }
        });

        jR_materia.setText("Materia");
        jR_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_materiaActionPerformed(evt);
            }
        });

        jCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextKeyReleased(evt);
            }
        });

        jButton1.setText("Cargar Notas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(41, 41, 41)
                            .addComponent(jR_alumno)
                            .addGap(53, 53, 53)
                            .addComponent(jR_materia))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jR_alumno)
                    .addComponent(jR_materia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jR_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_alumnoActionPerformed
        String[] lista1 = {"ID ALUMNO", "DNI", "APELLIDO", "NOMBRE"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista1);
        jCB.setModel(model);
        armarCabecera();
        armarCabecera2();
    }//GEN-LAST:event_jR_alumnoActionPerformed

    private void jR_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_materiaActionPerformed
        String[] lista1 = {"ID MATERIA", "NOMBRE", "AÑO"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista1);
        jCB.setModel(model);
        armarCabecera();
        armarCabecera2();
        // TODO add your handling code here:
    }//GEN-LAST:event_jR_materiaActionPerformed

    private void jTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextKeyReleased
        borrarFila();
        if (jR_alumno.isSelected()) {
            for (Alumno a1 : aD.buscarAlumno(jText.getText(), jCB.getSelectedItem().toString(), null)) {
                modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni()});
            }
        } else if (jR_materia.isSelected()) {
            for (Materia m1 : aD.buscarMateria(jText.getText(), jCB.getSelectedItem().toString())) {
                modelo.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio()});
            }
        }
    }//GEN-LAST:event_jTextKeyReleased

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

    }//GEN-LAST:event_jTableMouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

    }//GEN-LAST:event_jTable2MouseClicked

    private void jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMousePressed
        borrarFila2();
        if (jR_materia.isSelected()) {
            int idMateria = (int) jTable.getValueAt(jTable.getSelectedRow(), 0);
            for (Alumno a1 : aD.alumnosXmateria(idMateria)) {
                modelo2.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni()});
            }
        } else if (jR_alumno.isSelected()) {
            int idAlumno = (int) jTable.getValueAt(jTable.getSelectedRow(), 0);
            for (Materia m1 : aD.materiaXalumno(idAlumno)) {
                modelo2.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio()});
            }
        }
    }//GEN-LAST:event_jTableMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int nota = 0, idAlumno = 0, idMateria = 0;

        if (jR_materia.isSelected()) {
            for (int i = 0; i < jTable2.getRowCount(); i++) {
                if (jTable2.getValueAt(i, 4) != null) {
                    nota = Integer.parseInt((jTable2.getValueAt(i, 4)).toString());
                    idAlumno = Integer.parseInt((jTable2.getValueAt(i, 0)).toString());
                    idMateria = Integer.parseInt((jTable.getValueAt(jTable.getSelectedRow(), 0)).toString());
                    uD.cargarNota(nota, idAlumno, idMateria);
                }
            }
        } else if (jR_alumno.isSelected()) {
            for (int i = 0; i < jTable2.getRowCount(); i++) {
                if (jTable2.getValueAt(i, 3) != null) {
                    nota = Integer.parseInt((jTable2.getValueAt(i, 3)).toString());
                    idAlumno = Integer.parseInt((jTable.getValueAt(jTable.getSelectedRow(), 0)).toString());
                    idMateria = Integer.parseInt((jTable2.getValueAt(i, 0)).toString());
                    uD.cargarNota(nota, idAlumno, idMateria);
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cargar_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cargar_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cargar_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cargar_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargar_Nota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jR_alumno;
    private javax.swing.JRadioButton jR_materia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jText;
    // End of variables declaration//GEN-END:variables

    public void unirUnirBotones() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jR_alumno);
        buttonGroup.add(jR_materia);
    }

    private void armarCabecera() {
        modelo.setColumnCount(0);
        if (jR_materia.isSelected()) {
            modelo.addColumn("iD Materia");
            modelo.addColumn("Nombre");
            modelo.addColumn("AÑO");
        } else if (jR_alumno.isSelected()) {
            modelo.addColumn("iD Alumno");
            modelo.addColumn("Apellido");
            modelo.addColumn("Nombre");
            modelo.addColumn("DNI");
        }
        jTable.setModel(modelo);
    }

    private void armarCabecera2() {
        modelo2.setColumnCount(0);
        if (jR_alumno.isSelected()) {
            modelo2.addColumn("iD Materia");
            modelo2.addColumn("Nombre");
            modelo2.addColumn("AÑO");
            modelo2.addColumn("Nota");
        } else if (jR_materia.isSelected()) {
            modelo2.addColumn("iD Alumno");
            modelo2.addColumn("Apellido");
            modelo2.addColumn("Nombre");
            modelo2.addColumn("DNI");
            modelo2.addColumn("Nota");
        }
        jTable2.setModel(modelo2);
    }

    private void borrarFila() {
        int filas = jTable.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void borrarFila2() {
        int filas = jTable2.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
