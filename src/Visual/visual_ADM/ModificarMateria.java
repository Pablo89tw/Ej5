
package Visual.visual_ADM;

import Entidades.Materia;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ModificarMateria extends javax.swing.JInternalFrame {

    Coneccion.AlumnoData aD = new Coneccion.AlumnoData();
    Coneccion.MateriaData mD = new Coneccion.MateriaData();
    Coneccion.InscripcionData iD = new Coneccion.InscripcionData();
    
    private int idMateria;
    private int anio;
    private String nombre;
    private boolean estado;
    private int cupo;
    private int usuario; 
    
    DefaultTableModel modelo = new DefaultTableModel() {  
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    public ModificarMateria(int usuario) {
        initComponents();
        armarCabecera();
        armadoVista();
        this.usuario = usuario;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inactivo = new javax.swing.JRadioButton();
        jText_Nombre = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jS_anio = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jS_cupo = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jCheckBox5 = new javax.swing.JCheckBox();
        Activo = new javax.swing.JRadioButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        Inactivo.setText("Inactivo");

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

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });

        jCheckBox6.setText("Cupo");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Condicion");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Nombre");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
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

        Activo.setText("Activo");

        jCheckBox3.setText("Eliminar");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jButton3.setText("ELIMINAR ALUMNO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jTextField4)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Activo)
                                .addGap(23, 23, 23)
                                .addComponent(Inactivo)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jS_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jS_cupo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox3)
                                .addGap(63, 63, 63)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox6)
                                            .addComponent(jCheckBox5))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(Activo)
                    .addComponent(Inactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jS_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jS_cupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jCheckBox3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        borrarFila();
        for (Materia m1 : mD.buscarMateria(jTextField4.getText(), jComboBox1.getSelectedItem().toString())) {
            modelo.addRow(new Object[]{m1.getIdMateria(),m1.getNombre(),m1.getAnio(),m1.getCupo(),m1.isEstado()});
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox3.setEnabled(true);
        
        
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            idMateria = (int) jTable1.getValueAt(filaSeleccionada, 0);
        }

        if ((jTable1.getValueAt(filaSeleccionada, 4)).equals(true)){
            Activo.setSelected(true);
            }   else if ((jTable1.getValueAt(filaSeleccionada, 3)).toString().equals("false")){
            Inactivo.setSelected(true);
        }

        // Cargo en los cuadros los datos la tabla en los campos
        jText_Nombre.setText((jTable1.getValueAt(filaSeleccionada, 1)).toString());
        jS_anio.setValue(jTable1.getValueAt(filaSeleccionada,2));
        jS_cupo.setValue(jTable1.getValueAt(filaSeleccionada,3));

        // Los datos que estan en los textos los guardo en las nuevos
        nombre = jTable1.getValueAt(filaSeleccionada, 1).toString();
        System.out.println(nombre);
        anio = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 2).toString());
        cupo = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 3).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected()){
        jS_cupo.setEnabled(true);
        } else {
            jS_cupo.setEnabled(false);
            jS_cupo.setValue(anio);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()){
        Activo.setEnabled(true); 
        Inactivo.setEnabled(true);
        } else{
        Activo.setEnabled(false); 
        Inactivo.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nombre = jText_Nombre.getText();
        estado = ((Activo.isSelected())? true:false);
        anio = (int) jS_anio.getValue();
        cupo = (int) jS_cupo.getValue();

        Materia materia = new Materia (nombre, anio, estado, cupo);
        materia.setIdMateria(idMateria);
        mD.modificarMateria(materia);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected())
        jText_Nombre.setEnabled(true);
        else {
            jText_Nombre.setText(nombre);
            jText_Nombre.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if(jCheckBox5.isSelected())
        jS_anio.setEnabled(true);
        else
        {
            jS_anio.setValue(anio);
            jS_anio.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         ValidarClaveADM vcADM = new ValidarClaveADM(usuario, idMateria, "eliminar_materia");
            vcADM.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected())
                jButton3.setEnabled(true);
        else
            jButton3.setEnabled(false);
                   
    }//GEN-LAST:event_jCheckBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Activo;
    private javax.swing.JRadioButton Inactivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JSpinner jS_anio;
    private javax.swing.JSpinner jS_cupo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jText_Nombre;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.setColumnCount(0);
            modelo.addColumn("id Materia");
            modelo.addColumn("Nombre");
            modelo.addColumn("Año");
            modelo.addColumn("Cupo");
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
        String[] lista = {"idMateria", "NOMBRE","AÑO"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista);
        jComboBox1.setModel(model);
       
        ButtonGroup buttonGroup = new ButtonGroup();      
        buttonGroup.add(Activo);
        buttonGroup.add(Inactivo);
        
        Activo.setEnabled(false); 
        Inactivo.setEnabled(false); 
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false); 
        jCheckBox5.setEnabled(false);
        jText_Nombre.setEnabled(false);
        jS_anio.setEnabled(false);
        jS_cupo.setEnabled(false);
        jCheckBox6.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jButton3.setEnabled(false);
    }
}





