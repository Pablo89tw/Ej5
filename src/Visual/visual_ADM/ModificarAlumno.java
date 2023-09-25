package Visual.visual_ADM;

import Entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ModificarAlumno extends javax.swing.JInternalFrame {

    private Coneccion.AlumnoData aD;
    private int idAlumno_Mod;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int anio;
    private boolean estado;
    private int usuario;
    
    public ModificarAlumno(int usuario, Coneccion.AlumnoData aD) {
        this.usuario = usuario;
        this.aD = aD;
        initComponents();
        armarCabecera();
        armadoVista();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDC_nF = new com.toedter.calendar.JDateChooser();
        Activo = new javax.swing.JRadioButton();
        jC_N = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Inactivo = new javax.swing.JRadioButton();
        jC_A = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jText_nDNI = new javax.swing.JTextField();
        jCheckBox5 = new javax.swing.JCheckBox();
        jText_nN = new javax.swing.JTextField();
        jText_nA = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jS_nA = new javax.swing.JSpinner();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCB_Eliminar = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();

        Activo.setText("Activo");
        Activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivoActionPerformed(evt);
            }
        });

        jC_N.setText("Nombre");
        jC_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_NActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });

        Inactivo.setText("Inactivo");

        jC_A.setText("Apellido");
        jC_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_AActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jCheckBox5.setText("Año");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Condicion");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jCheckBox2.setText("DNI");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("Fecha Nacimiento");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jButton3.setText("Restablecer Contraseña");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ELIMINAR ALUMNO");

        jCB_Eliminar.setText("Eliminar");
        jCB_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_EliminarActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Clave");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jTextField4)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(56, 56, 56)
                                .addComponent(Activo)
                                .addGap(18, 18, 18)
                                .addComponent(Inactivo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(170, 170, 170))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jC_N)
                            .addComponent(jC_A)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)
                            .addComponent(jCB_Eliminar)
                            .addComponent(jCheckBox3))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDC_nF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jText_nDNI)
                            .addComponent(jText_nN)
                            .addComponent(jText_nA)
                            .addComponent(jS_nA))
                        .addGap(174, 174, 174))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(Activo)
                    .addComponent(Inactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jText_nDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jC_N)
                    .addComponent(jText_nN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jC_A)
                    .addComponent(jText_nA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jS_nA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox6)
                    .addComponent(jDC_nF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jCheckBox3))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jCB_Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jC_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_NActionPerformed
        if (jC_N.isSelected())
        jText_nN.setEditable(true);
        else {
            jText_nN.setText(nombre);
            jText_nN.setEditable(false);
        }
    }//GEN-LAST:event_jC_NActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dni = Integer.parseInt(jText_nDNI.getText());
        nombre = jText_nN.getText();
        apellido = jText_nA.getText();
        estado = ((Activo.isSelected()) ? true : false);
        fechaNacimiento = jDC_nF.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        anio = (int) jS_nA.getValue();

        Alumno alumno = new Alumno(idAlumno_Mod, dni, apellido, nombre, fechaNacimiento, estado, anio, 1);
        aD.modificarDataAlumno(alumno);
        
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jC_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_AActionPerformed
        if (jC_A.isSelected())
        jText_nA.setEditable(true);
        else{
            jText_nA.setText(apellido);
            jText_nA.setEditable(false);
        }
    }//GEN-LAST:event_jC_AActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        borrarFila();
        for (Alumno a1 : aD.buscarAlumno(jTextField4.getText(), jComboBox1.getSelectedItem().toString(), null)) {
            modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.getAnio(), a1.isEstado()});
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if(jCheckBox5.isSelected())
        jS_nA.setEnabled(true);
        else
         jS_nA.setValue(anio);
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        Activo.setEnabled(true);
        Inactivo.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jC_A.setEnabled(true);
        jC_N.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCB_Eliminar.setEnabled(true);
        jCheckBox3.setEnabled(true);

        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            idAlumno_Mod = (int) jTable1.getValueAt(filaSeleccionada, 0);
        }

        if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("true")) {
            Activo.setSelected(true);
            Inactivo.setSelected(false);
        } else if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("false")) {
            Inactivo.setSelected(true);
            Activo.setSelected(false);
        }

        // Cargo en los cuadros los datos la tabla en los campos
        jText_nA.setText((jTable1.getValueAt(filaSeleccionada, 1)).toString());
        jText_nN.setText((jTable1.getValueAt(filaSeleccionada, 2)).toString());
        jText_nDNI.setText((jTable1.getValueAt(filaSeleccionada, 3)).toString());
        jS_nA.setValue(jTable1.getValueAt(filaSeleccionada, 5));
        jDC_nF.setDate(java.sql.Date.valueOf((LocalDate) jTable1.getValueAt(filaSeleccionada, 4)));

        // Los datos que estan en los textos los guardo en las nuevos
        apellido = jTable1.getValueAt(filaSeleccionada, 1).toString();
        nombre = jTable1.getValueAt(filaSeleccionada, 2).toString();
        anio = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 5).toString());
        dni = Integer.parseInt((jTable1.getValueAt(filaSeleccionada, 3)).toString());
        fechaNacimiento = (LocalDate) (jTable1.getValueAt(filaSeleccionada, 4));
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected())
        jText_nDNI.setEditable(true);
        else  {
            jText_nDNI.setText(Integer.toString(dni));
            jText_nDNI.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected())
        jDC_nF.setEnabled(true);
        else{
            
        }
          
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ValidarClaveADM vcADM = new ValidarClaveADM(usuario, idAlumno_Mod, "clave");
        vcADM.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCB_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_EliminarActionPerformed
        ValidarClaveADM vcADM = new ValidarClaveADM(usuario, idAlumno_Mod, "eliminar_alumno");
        vcADM.setVisible(true);
    }//GEN-LAST:event_jCB_EliminarActionPerformed

    private void ActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActivoActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed

        if (jCheckBox3.isSelected()) {
            jButton3.setEnabled(true);
        } else {
            jButton3.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Activo;
    private javax.swing.JRadioButton Inactivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCB_Eliminar;
    private javax.swing.JCheckBox jC_A;
    private javax.swing.JCheckBox jC_N;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDC_nF;
    private javax.swing.JSpinner jS_nA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jText_nA;
    private javax.swing.JTextField jText_nDNI;
    private javax.swing.JTextField jText_nN;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    private void armarCabecera() {
        modelo.setColumnCount(0);
        modelo.addColumn("iD Alumno");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("F.Nac");
        modelo.addColumn("Año");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);
    }

    private void borrarFila() {
        int filas = jTable1.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void armadoVista() {
        String[] lista = {"idAlumno", "APELLIDO", "NOMBRE", "DNI"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista);
        jComboBox1.setModel(model);
        jCB_Eliminar.setEnabled(false);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(Activo);
        buttonGroup.add(Inactivo);

        Activo.setEnabled(false);
        Inactivo.setEnabled(false);
        jText_nA.setEditable(false);
        jText_nN.setEditable(false);
        jText_nDNI.setEditable(false);
        jS_nA.setEnabled(false);
        jDC_nF.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jC_A.setEnabled(false);
        jC_N.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        jButton3.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton3.setEnabled(false);
    }
}
