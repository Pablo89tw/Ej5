package Visual.visual_ADM;

import Entidades.Materia;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModificarMateria extends javax.swing.JInternalFrame {
    
    private Coneccion.loginData logD;
    private Coneccion.AlumnoData aD;
    private Coneccion.MateriaData mD;
    private Coneccion.InscripcionData iD;
    private int idMateria;
    private int anio;
    private String nombre;
    private boolean estado;
    private int cupo;
    private int usuario;
    private int filaSeleccionada;

    public ModificarMateria(int usuario, Coneccion.AlumnoData aD, Coneccion.MateriaData mD, Coneccion.InscripcionData iD, Coneccion.loginData logD) {
        this.aD = aD;
        this.usuario = usuario;
        this.mD = mD;
        this.iD = iD;
        this.logD = logD;
        initComponents();
        armarCabecera();
        armadoVista();
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon14 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/FONDO PRINCIPAL 02.jpg"));
        Image image14 = icon14.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image14,0,0,getWidth(),getHeight(),this);
            }

        };
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        Activo = new javax.swing.JRadioButton();
        Inactivo = new javax.swing.JRadioButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jText_Nombre = new javax.swing.JTextField();
        jCheckBox5 = new javax.swing.JCheckBox();
        jS_anio = new javax.swing.JSpinner();
        jCheckBox6 = new javax.swing.JCheckBox();
        jS_cupo = new javax.swing.JSpinner();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 6));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jComboBox1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jComboBox1.setMinimumSize(new java.awt.Dimension(36, 25));
        jComboBox1.setPreferredSize(new java.awt.Dimension(36, 25));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });

        jTextField4.setPreferredSize(new java.awt.Dimension(6, 25));
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

        jCheckBox1.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Condicion");
        jCheckBox1.setBorder(null);
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        Activo.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        Activo.setForeground(new java.awt.Color(255, 255, 255));
        Activo.setText("Activo");
        Activo.setBorder(null);
        Activo.setOpaque(false);

        Inactivo.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        Inactivo.setForeground(new java.awt.Color(255, 255, 255));
        Inactivo.setText("Inactivo");
        Inactivo.setBorder(null);
        Inactivo.setOpaque(false);

        jCheckBox2.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Nombre");
        jCheckBox2.setBorder(null);
        jCheckBox2.setOpaque(false);
        jCheckBox2.setPreferredSize(new java.awt.Dimension(83, 25));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jText_Nombre.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jText_Nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 6, 0, 0));
        jText_Nombre.setPreferredSize(new java.awt.Dimension(6, 25));

        jCheckBox5.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Año");
        jCheckBox5.setBorder(null);
        jCheckBox5.setOpaque(false);
        jCheckBox5.setPreferredSize(new java.awt.Dimension(53, 25));
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jS_anio.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jS_anio.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));
        jS_anio.setPreferredSize(new java.awt.Dimension(36, 25));

        jCheckBox6.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Cupo");
        jCheckBox6.setBorder(null);
        jCheckBox6.setOpaque(false);
        jCheckBox6.setPreferredSize(new java.awt.Dimension(63, 25));
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jS_cupo.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jS_cupo.setPreferredSize(new java.awt.Dimension(29, 25));

        jCheckBox3.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Eliminar");
        jCheckBox3.setBorder(null);
        jCheckBox3.setOpaque(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jButton3.setText("Eliminar Materia");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 51, 102));
        jLabel5.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MODIFICAR MATERIA");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jCheckBox1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Activo)
                                            .addGap(9, 9, 9)
                                            .addComponent(Inactivo)
                                            .addGap(57, 57, 57))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jText_Nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(47, 47, 47)
                                            .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jS_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(jS_cupo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2))))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jS_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jS_cupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Activo)
                            .addComponent(Inactivo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jCheckBox3)
                    .addComponent(jButton2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        borrarFila();
        llenarTabla();
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox3.setEnabled(true);

        filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            idMateria = (int) jTable1.getValueAt(filaSeleccionada, 0);
        }

        if ((jTable1.getValueAt(filaSeleccionada, 4)).equals(true)) {
            Activo.setSelected(true);
        } else if ((jTable1.getValueAt(filaSeleccionada, 3)).toString().equals("false")) {
            Inactivo.setSelected(true);
        }

        // Cargo en los cuadros los datos la tabla en los campos
        jText_Nombre.setText((jTable1.getValueAt(filaSeleccionada, 1)).toString());
        jS_anio.setValue(jTable1.getValueAt(filaSeleccionada, 2));
        jS_cupo.setValue(jTable1.getValueAt(filaSeleccionada, 3));

        // Los datos que estan en los textos los guardo en las nuevos
        nombre = jTable1.getValueAt(filaSeleccionada, 1).toString();
        System.out.println(nombre);
        anio = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 2).toString());
        cupo = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 3).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected()) {
            jS_cupo.setEnabled(true);
        } else {
            jS_cupo.setEnabled(false);
            jS_cupo.setValue(cupo);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            Activo.setEnabled(true);
            Inactivo.setEnabled(true);
        } else {
            Activo.setEnabled(false);
            Inactivo.setEnabled(false);
            if ((jTable1.getValueAt(filaSeleccionada, 4)).equals(true)) {
                Activo.setSelected(true);
            } else if ((jTable1.getValueAt(filaSeleccionada, 3)).toString().equals("false")) {
                Inactivo.setSelected(true);
            }
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nombre = jText_Nombre.getText();
        estado = ((Activo.isSelected()) ? true : false);
        anio = (int) jS_anio.getValue();
        cupo = (int) jS_cupo.getValue();
        
        if (nombre != null){
        Materia materia = new Materia(nombre, anio, estado, cupo);
        materia.setIdMateria(idMateria);
        mD.modificarMateria(materia);
        borrarFila();
        llenarTabla();
        } else {
          JOptionPane.showMessageDialog(null, "Nombre incorrecto");
    }
        
        
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
        if (jCheckBox5.isSelected())
            jS_anio.setEnabled(true);
        else {
            jS_anio.setValue(anio);
            jS_anio.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ValidarClaveADM vcADM = new ValidarClaveADM(usuario, idMateria, "eliminar_materia",logD, aD, mD, iD);
        vcADM.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()) {
            jButton3.setEnabled(true);
        } else {
            jButton3.setEnabled(false);
        }

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jS_anio;
    private javax.swing.JSpinner jS_cupo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jText_Nombre;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private void armarCabecera() {
        modelo.setColumnCount(0);
        modelo.addColumn("id Materia");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Cupo");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);
        jTable1.getTableHeader().setReorderingAllowed(false);
    }

    private void borrarFila() {
        int filas = jTable1.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void armadoVista() {
        String[] lista = {"ID MATERIA", "NOMBRE", "AÑO"};
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
    
    private void llenarTabla(){
        for (Materia m1 : mD.buscarMateria(jTextField4.getText(), jComboBox1.getSelectedItem().toString())) {
            modelo.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio(), m1.getCupo(), m1.isEstado()});
        }
    }
}
