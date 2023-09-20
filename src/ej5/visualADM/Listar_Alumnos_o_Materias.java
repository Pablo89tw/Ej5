package ej5.visualADM;

import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import ej5_Entidades.Alumno;
import ej5_Entidades.Materia;

public class Listar_Alumnos_o_Materias extends javax.swing.JFrame {
    ej5_Coneccion.Select aD = new ej5_Coneccion.Select();
    
    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public Listar_Alumnos_o_Materias() {
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jTexto_Buscar1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_busqueda = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser_buscar = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jComboBox_objeto = new javax.swing.JComboBox<>();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Buscar:");

        jTexto_Buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexto_Buscar1ActionPerformed(evt);
            }
        });
        jTexto_Buscar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTexto_Buscar1KeyReleased(evt);
            }
        });

        jLabel7.setText("Criterio Búsqueda");

        jComboBox_busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_busquedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox_busquedaMouseEntered(evt);
            }
        });
        jComboBox_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_busquedaActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor");

        jDateChooser_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateChooser_buscarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDateChooser_buscarMousePressed(evt);
            }
        });
        jDateChooser_buscar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_buscarPropertyChange(evt);
            }
        });
        jDateChooser_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDateChooser_buscarKeyReleased(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox_objeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox_objeto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_objetoItemStateChanged(evt);
            }
        });
        jComboBox_objeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_objetoMouseClicked(evt);
            }
        });
        jComboBox_objeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_objetoActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jComboBox_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTexto_Buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3))
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTexto_Buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_busquedaActionPerformed
        String combox = jComboBox_busqueda.getSelectedItem().toString();
        switch (combox) {
            case "FECHA NACIMIENTO":
                jDateChooser_buscar.setEnabled(true);
                jTexto_Buscar1.setEnabled(false);
                jTexto_Buscar1.setText("");
                break;
            default:
                jDateChooser_buscar.setEnabled(false);
                jTexto_Buscar1.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_jComboBox_busquedaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String[] lista = {"Materia", "Alumno"};
        DefaultComboBoxModel<String> model0 = new DefaultComboBoxModel<>(lista);
        jComboBox_objeto.setModel(model0);
        jDateChooser_buscar.setEnabled(false);
        ;


    }//GEN-LAST:event_formWindowOpened

    private void jTexto_Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexto_Buscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexto_Buscar1ActionPerformed

    private void jTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableComponentShown

    }//GEN-LAST:event_jTableComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTexto_Buscar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexto_Buscar1KeyReleased
        jDateChooser_buscar.setEnabled(false);
        
        borrarFila();

        if (jComboBox_objeto.getSelectedItem().toString().equalsIgnoreCase("Alumno")) {
            for (Alumno a1 : aD.buscarAlumno(jTexto_Buscar1.getText(), jComboBox_busqueda.getSelectedItem().toString(), null)) {
                modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.isEstado()});
            }
        } else if (jComboBox_objeto.getSelectedItem().toString().equalsIgnoreCase("Materia")) {
            for (Materia m1 : aD.buscarMateria(jTexto_Buscar1.getText(), jComboBox_busqueda.getSelectedItem().toString())) {
                modelo.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio(), m1.isEstado()});
            }
        }
    }//GEN-LAST:event_jTexto_Buscar1KeyReleased

    private void jComboBox_objetoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_objetoItemStateChanged
        String[] lista1 = (jComboBox_objeto.getSelectedItem().toString().equalsIgnoreCase("Materia")
                ? new String[]{"ID MATERIA", "NOMBRE", "ESTADO", "AÑO"}
                : new String[]{"ID ALUMNO", "DNI", "APELLIDO", "NOMBRE", "FECHA NACIMIENTO", "ESTADO"});
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista1);
        jComboBox_busqueda.setModel(model);
        armarCabecera();
    }//GEN-LAST:event_jComboBox_objetoItemStateChanged

    private void jComboBox_objetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_objetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_objetoActionPerformed

    private void jComboBox_objetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_objetoMouseClicked
        jTexto_Buscar1.setText("");
    }//GEN-LAST:event_jComboBox_objetoMouseClicked

    private void jComboBox_busquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_busquedaMouseClicked
        jTexto_Buscar1.setText("");
    }//GEN-LAST:event_jComboBox_busquedaMouseClicked

    private void jComboBox_busquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_busquedaMouseEntered
        jTexto_Buscar1.setText("");
    }//GEN-LAST:event_jComboBox_busquedaMouseEntered

    private void jDateChooser_buscarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_buscarPropertyChange
        if (jDateChooser_buscar.getDate() != null) {
        borrarFila();
        LocalDate fechaLD = jDateChooser_buscar.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            for (Alumno a1 : aD.buscarAlumno(null, "FECHA NACIMIENTO", fechaLD)) {
                modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.isEstado()});
            }
        }
        
    }//GEN-LAST:event_jDateChooser_buscarPropertyChange

    private void jDateChooser_buscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_buscarMousePressed

    }//GEN-LAST:event_jDateChooser_buscarMousePressed

    private void jDateChooser_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_buscarMouseEntered

    }//GEN-LAST:event_jDateChooser_buscarMouseEntered

    private void jDateChooser_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser_buscarKeyReleased

    }//GEN-LAST:event_jDateChooser_buscarKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar_Alumnos_o_Materias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox_busqueda;
    private javax.swing.JComboBox<String> jComboBox_objeto;
    private com.toedter.calendar.JDateChooser jDateChooser_buscar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTexto_Buscar1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.setColumnCount(0);
        if (jComboBox_objeto.getSelectedItem().toString().equalsIgnoreCase("Materia")) {
            modelo.addColumn("iD Materia");
            modelo.addColumn("Nombre");
            modelo.addColumn("AÑO");
            modelo.addColumn("ESTADO");
        } else if (jComboBox_objeto.getSelectedItem().toString().equalsIgnoreCase("Alumno")) {
            modelo.addColumn("iD Alumno");
            modelo.addColumn("Apellido");
            modelo.addColumn("Nombre");
            modelo.addColumn("DNI");
            modelo.addColumn("F.Nac");
            modelo.addColumn("Estado");
        }
        jTable.setModel(modelo);
    }

    private void borrarFila() {
        int filas = jTable.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
