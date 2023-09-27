package Visual.visual_ADM;

import Entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ModificarAlumno extends javax.swing.JInternalFrame {

    private final Coneccion.loginData logD;
    private final Coneccion.AlumnoData aD;
    private final Coneccion.MateriaData mD;
    private final Coneccion.InscripcionData iD;
    private int idAlumno_Mod;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int anio;
    private boolean estado;
    private int usuario;
    private Alumno alumno;
    private int filtroBusqueda;
    private int filaSeleccionada;

    public ModificarAlumno(int usuario, Coneccion.AlumnoData aD, Coneccion.loginData logD, Coneccion.MateriaData mD,Coneccion.InscripcionData iD) {
        this.usuario = usuario;
        this.aD = aD;
        this.logD = logD;
        this.mD = mD;
        this.iD = iD;
        initComponents();
        armarCabecera();
        armadoVista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jS_nA = new javax.swing.JSpinner();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCB_Eliminar = new javax.swing.JCheckBox();
        jDC_nF = new com.toedter.calendar.JDateChooser();
        jCheckBox3 = new javax.swing.JCheckBox();
        Activo = new javax.swing.JRadioButton();
        LogIN = new javax.swing.JCheckBox();
        jC_N = new javax.swing.JCheckBox();
        logIN_activo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        LogIN_inactivo = new javax.swing.JRadioButton();
        Inactivo = new javax.swing.JRadioButton();
        jC_A = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jText_nDNI = new javax.swing.JTextField();
        jCheckBox5 = new javax.swing.JCheckBox();
        jText_nN = new javax.swing.JTextField();
        jText_nA = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });

        jCheckBox4.setText("Agregar Administradores");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
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
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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

        Activo.setText("Activo");
        Activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivoActionPerformed(evt);
            }
        });

        LogIN.setText("LogIN");
        LogIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogINActionPerformed(evt);
            }
        });

        jC_N.setText("Nombre");
        jC_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_NActionPerformed(evt);
            }
        });

        logIN_activo.setText("Activo");

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LogIN_inactivo.setText("Inactivo");

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

        jDesktopPane1.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckBox4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jS_nA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckBox6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCB_Eliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDC_nF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckBox3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Activo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LogIN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jC_N, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(logIN_activo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LogIN_inactivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Inactivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jC_A, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jText_nDNI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckBox5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jText_nN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jText_nA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4)
                                .addGap(80, 80, 80)
                                .addComponent(jCheckBox4)
                                .addGap(34, 34, 34))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(56, 56, 56)
                                .addComponent(Activo)
                                .addGap(18, 18, 18)
                                .addComponent(Inactivo)
                                .addGap(205, 205, 205))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jC_N)
                                    .addComponent(jC_A)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox6)
                                    .addComponent(jCheckBox3)
                                    .addComponent(LogIN)
                                    .addComponent(jCB_Eliminar))
                                .addGap(16, 16, 16)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jDC_nF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jText_nDNI)
                                            .addComponent(jText_nN)
                                            .addComponent(jText_nA)
                                            .addComponent(jS_nA))
                                        .addGap(21, 21, 21)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(logIN_activo)
                                        .addGap(18, 18, 18)
                                        .addComponent(LogIN_inactivo)))))))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(Activo)
                    .addComponent(Inactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jText_nDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jC_N)
                    .addComponent(jText_nN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jC_A)
                    .addComponent(jText_nA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jS_nA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox6)
                    .addComponent(jDC_nF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logIN_activo)
                            .addComponent(LogIN_inactivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(1, 1, 1)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(LogIN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCB_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            Activo.setEnabled(true);
            Inactivo.setEnabled(true);
        } else if (!jCheckBox1.isSelected()) {
            Activo.setEnabled(false);
            Inactivo.setEnabled(false);
            if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("true")) {
                Activo.setSelected(true);
                Inactivo.setSelected(false);
            } else if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("false")) {
                Inactivo.setSelected(true);
                Activo.setSelected(false);
            }
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if (jCheckBox5.isSelected())
        jS_nA.setEnabled(true);
        else
        jS_nA.setValue(anio);
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jC_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_AActionPerformed
        if (jC_A.isSelected())
        jText_nA.setEditable(true);
        else {
            jText_nA.setText(apellido);
            jText_nA.setEditable(false);
        }
    }//GEN-LAST:event_jC_AActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dni = Integer.parseInt(jText_nDNI.getText());
        nombre = jText_nN.getText();
        apellido = jText_nA.getText();
        estado = ((Activo.isSelected()) ? true : false);
        fechaNacimiento = jDC_nF.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        anio = (int) jS_nA.getValue();

        alumno = new Alumno(idAlumno_Mod, dni, apellido, nombre, fechaNacimiento, estado, anio, 1);
        aD.modificarDataAlumno(alumno);

        int data = 0;
        if (LogIN_inactivo.isSelected()) {
            data = 1;
        }
        logD.activarUsuarioLogIN(data, dni);

        borrarFila();
        llenarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jC_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_NActionPerformed
        if (jC_N.isSelected())
        jText_nN.setEditable(true);
        else {
            jText_nN.setText(nombre);
            jText_nN.setEditable(false);
        }
    }//GEN-LAST:event_jC_NActionPerformed

    private void LogINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogINActionPerformed
        if (LogIN.isSelected()) {
            LogIN_inactivo.setEnabled(true);
            logIN_activo.setEnabled(true);
        } else if (!LogIN.isSelected()) {
            LogIN_inactivo.setEnabled(false);
            logIN_activo.setEnabled(false);
            if (logD.reactivarLogINusuario(aD.buscarAlumno(Integer.toString(idAlumno_Mod), "ID ALUMNO", null).get(0).getDni()) == 1) {
                logIN_activo.setSelected(false);
                LogIN_inactivo.setSelected(true);
            } else if (logD.reactivarLogINusuario(aD.buscarAlumno(Integer.toString(idAlumno_Mod), "ID ALUMNO", null).get(0).getDni()) == 0) {
                logIN_activo.setSelected(true);
                LogIN_inactivo.setSelected(false);
            }
        }
    }//GEN-LAST:event_LogINActionPerformed

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

    private void jCB_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_EliminarActionPerformed
        if (jCB_Eliminar.isSelected()){
            jButton4.setEnabled(true);
        } else
        jButton4.setEnabled(false);
    }//GEN-LAST:event_jCB_EliminarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ValidarClaveADM vcADM = new ValidarClaveADM(usuario, idAlumno_Mod, "eliminar_alumno",logD,aD,mD,iD);
        vcADM.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ValidarClaveADM vcADM = new ValidarClaveADM(usuario, idAlumno_Mod, "clave",logD,aD,mD,iD);
        vcADM.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected()) {
            jDC_nF.setEnabled(true);
        } else {

        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected())
        jText_nDNI.setEditable(true);
        else {
            jText_nDNI.setText(Integer.toString(dni));
            jText_nDNI.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jCheckBox1.setEnabled(true); jCheckBox2.setEnabled(true);
        jC_A.setEnabled(true); jC_N.setEnabled(true); jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true); jCB_Eliminar.setEnabled(true); jCheckBox3.setEnabled(true);
        LogIN.setEnabled(true);

        filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            idAlumno_Mod = (int) jTable1.getValueAt(filaSeleccionada, 0);
        }
        // Cargo en los cuadros los datos la tabla en los campos

        if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("true")) {
            Activo.setSelected(true);
            Inactivo.setSelected(false);
        } else if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("false")) {
            Inactivo.setSelected(true);
            Activo.setSelected(false);
        }

        if (logD.reactivarLogINusuario(aD.buscarAlumno(Integer.toString(idAlumno_Mod), "ID ALUMNO", null).get(0).getDni()) == 1) {
            logIN_activo.setSelected(false);
            LogIN_inactivo.setSelected(true);
        } else if (logD.reactivarLogINusuario(aD.buscarAlumno(Integer.toString(idAlumno_Mod), "ID ALUMNO", null).get(0).getDni()) == 0) {
            logIN_activo.setSelected(true);
            LogIN_inactivo.setSelected(false);
        }

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

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        borrarFila();
        llenarTabla();
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (jCheckBox4.isSelected()) {
            filtroBusqueda = 1;
        } else if (!jCheckBox4.isSelected()) {
            filtroBusqueda = 0;
        }
        borrarFila();
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Activo;
    private javax.swing.JRadioButton Inactivo;
    private javax.swing.JCheckBox LogIN;
    private javax.swing.JRadioButton LogIN_inactivo;
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
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDC_nF;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JSpinner jS_nA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jText_nA;
    private javax.swing.JTextField jText_nDNI;
    private javax.swing.JTextField jText_nN;
    private javax.swing.JRadioButton logIN_activo;
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
        String[] lista = {"ID ALUMNO", "APELLIDO", "NOMBRE", "DNI"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista);
        jComboBox1.setModel(model);
        jCB_Eliminar.setEnabled(false);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(Activo);
        buttonGroup.add(Inactivo);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(LogIN_inactivo);
        buttonGroup2.add(logIN_activo);

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
        LogIN.setEnabled(false);
        LogIN_inactivo.setEnabled(false);
        logIN_activo.setEnabled(false);
    }
    
    private void llenarTabla(){
        for (Alumno a1 : aD.buscarAlumno(jTextField4.getText(), jComboBox1.getSelectedItem().toString(), null)) {
            if (filtroBusqueda == 0) {
                if (a1.getCategoria() == 1) {
                    modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.getAnio(), a1.isEstado()});
                }
            } else if (filtroBusqueda == 1) {
                modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.getAnio(), a1.isEstado()});
            }
        }
    }
}
