package ej5.visual.Visual_ADM;

import ej5_Entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;



public class Modificar_Materia extends javax.swing.JInternalFrame {
        
    private int idAlumno_Mod;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int anio;
    private boolean estado;
        
    ej5_Coneccion.Select aD = new ej5_Coneccion.Select();
    ej5_Coneccion.Updates mA = new  ej5_Coneccion.Updates();
    
    DefaultTableModel modelo = new DefaultTableModel() {  
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    public Modificar_Materia() {
        initComponents();
        armarCabecera();
        armadoVista();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jC_N = new javax.swing.JCheckBox();
        jC_A = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        Activo = new javax.swing.JRadioButton();
        Inactivo = new javax.swing.JRadioButton();
        jText_nDNI = new javax.swing.JTextField();
        jText_nN = new javax.swing.JTextField();
        jText_nA = new javax.swing.JTextField();
        jS_nA = new javax.swing.JSpinner();
        jDC_nF = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jCheckBox1.setText("Condicion");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("DNI");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jC_N.setText("Nombre");
        jC_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_NActionPerformed(evt);
            }
        });

        jC_A.setText("Apellido");
        jC_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_AActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Año");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("Fecha Nacimiento");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        Activo.setText("Activo");

        Inactivo.setText("Inactivo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
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

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jTextField4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(116, 116, 116)
                                .addComponent(Activo)
                                .addGap(46, 46, 46)
                                .addComponent(Inactivo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jC_N)
                                    .addComponent(jC_A)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox6))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDC_nF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jText_nDNI)
                                    .addComponent(jText_nN)
                                    .addComponent(jText_nA)
                                    .addComponent(jS_nA))))))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(9, 9, 9))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(Activo)
                            .addComponent(Inactivo))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jText_nDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jC_N)
                            .addComponent(jText_nN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jC_A)
                            .addComponent(jText_nA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jCheckBox5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jS_nA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox6)
                            .addComponent(jDC_nF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
      
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        borrarFila();
           for (Alumno a1 : aD.buscarAlumno(jTextField4.getText(), jComboBox1.getSelectedItem().toString(), null)) {
                modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(),a1.getAnio(),a1.isEstado()});
            }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jCheckBox1.setEnabled(true);jCheckBox2.setEnabled(true); jC_A.setEnabled(true);jC_N.setEnabled(true); jCheckBox5.setEnabled(true);jCheckBox6.setEnabled(true);
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {      
            idAlumno_Mod = (int) jTable1.getValueAt(filaSeleccionada, 0);
        }   
        
       
        if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("true")){
            Activo.setSelected(true);
            Inactivo.setSelected(false);
        }   else if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("false")){
                    Inactivo.setSelected(true);
                    Activo.setSelected(false);
                    }
        
        // Cargo en los cuadros los datos la tabla en los campos
        jText_nA.setText((jTable1.getValueAt(filaSeleccionada, 1)).toString());
        jText_nN.setText((jTable1.getValueAt(filaSeleccionada, 2)).toString());
        jText_nDNI.setText((jTable1.getValueAt(filaSeleccionada, 3)).toString());
        jS_nA.setValue(jTable1.getValueAt(filaSeleccionada,5));
        jDC_nF.setDate(java.sql.Date.valueOf((LocalDate) jTable1.getValueAt(filaSeleccionada,4)));
        
        
        // Los datos que estan en los textos los guardo en las nuevos 
        apellido = jTable1.getValueAt(filaSeleccionada, 2).toString();
        nombre = jTable1.getValueAt(filaSeleccionada, 3).toString();
        anio = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 5).toString());
        dni = Integer.parseInt((jTable1.getValueAt(filaSeleccionada, 3)).toString());
        fechaNacimiento = (LocalDate)(jTable1.getValueAt(filaSeleccionada,4)); 
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        jText_nDNI.setEditable(true);
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jC_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_NActionPerformed
       jText_nN.setEditable(true);
               
    }//GEN-LAST:event_jC_NActionPerformed

    private void jC_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_AActionPerformed
        jText_nA.setEditable(true);
    }//GEN-LAST:event_jC_AActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dni = Integer.parseInt(jText_nDNI.getText());
        nombre = jText_nN.getText();
        apellido = jText_nA.getText();
        estado = ((Activo.isSelected())? true:false);
        fechaNacimiento = jDC_nF.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        anio = (int) jS_nA.getValue();
        
        Alumno alumno = new Alumno (dni, apellido, nombre, fechaNacimiento, estado, anio);
        alumno.setIdAlumno(idAlumno_Mod);
        mA.modificarDataAlumno(alumno);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        Activo.setEnabled(true); Inactivo.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
            jS_nA.setEnabled(true);
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        jDC_nF.setEnabled(true);
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 this.dispose();        
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Activo;
    private javax.swing.JRadioButton Inactivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jC_A;
    private javax.swing.JCheckBox jC_N;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
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
    
    private void armadoVista(){
        String[] lista = {"idAlumno", "APELLIDO", "NOMBRE", "DNI", "fechaNacimiento", "AÑO"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista);
        jComboBox1.setModel(model);
       
        ButtonGroup buttonGroup = new ButtonGroup();      
        buttonGroup.add(Activo);
        buttonGroup.add(Inactivo);
        
        Activo.setEnabled(false); Inactivo.setEnabled(false); 
        jText_nA.setEditable(false);jText_nN.setEditable(false);
        jText_nDNI.setEditable(false); jS_nA.setEnabled(false);
        jDC_nF.setEnabled(false); jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false); jC_A.setEnabled(false);
        jC_N.setEnabled(false); jCheckBox5.setEnabled(false);jCheckBox6.setEnabled(false);
    }
}



