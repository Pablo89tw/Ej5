package Visual.visual_ADM;

import Entidades.Alumno;
import Entidades.Materia;
import Entidades.Inscripcion;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Modificar_Inscripciones extends javax.swing.JInternalFrame {

    private Coneccion.AlumnoData aD;
    private Coneccion.MateriaData mD;
    private Coneccion.InscripcionData iD;
    private Coneccion.loginData logD;
    private int idMateria;
    private int idAlumno;
    private Inscripcion ins;
    private int usuario;
    private Materia materia;
    private Alumno alumno;

    public Modificar_Inscripciones(int usuario, Coneccion.AlumnoData aD, Coneccion.MateriaData mD, Coneccion.InscripcionData iD, Coneccion.loginData logD) {
        this.usuario = usuario;
        this.iD = iD;
        this.aD = aD;
        this.mD = mD;
        this.logD = logD;
        initComponents();
        armarCabecera();
        armarBotones();
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        ImageIcon icon54 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/FONDO PRINCIPAL 02.jpg"));
        Image image54 = icon54.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image54,0,0,getWidth(),getHeight(),this);
            }

        };
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 6));
        setPreferredSize(new java.awt.Dimension(565, 500));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton4.setText("Cerrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jButton2.setText("Eliminar Inscripcion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Inactiva");
        jRadioButton4.setOpaque(false);

        jRadioButton3.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Activo");
        jRadioButton3.setOpaque(false);

        jCheckBox1.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Estado");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Eliminar");
        jCheckBox2.setOpaque(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

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
        jScrollPane2.setViewportView(jTable2);

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(6, 25));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(79, 25));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Alumno");
        jRadioButton2.setOpaque(false);
        jRadioButton2.setPreferredSize(new java.awt.Dimension(79, 25));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Materia");
        jRadioButton1.setOpaque(false);
        jRadioButton1.setPreferredSize(new java.awt.Dimension(81, 25));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Por");
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel5.setBackground(new java.awt.Color(255, 51, 102));
        jLabel5.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MODIFICAR INSCRIPCIONES");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addGap(45, 45, 45)
                                        .addComponent(jRadioButton3)
                                        .addGap(39, 39, 39)
                                        .addComponent(jRadioButton4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2)
                                        .addGap(22, 22, 22)
                                        .addComponent(jButton1)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        armarComboBox();
        jComboBox1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        armarComboBox();
        jComboBox1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        borrarFila();
        if (jRadioButton2.isSelected()) {
            for (Alumno a1 : aD.buscarAlumno(jTextField1.getText(), jComboBox1.getSelectedItem().toString(), null)) {
                if (a1.getCategoria() == 1) {
                    modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.isEstado()});
                }
            }
        } else if (jRadioButton1.isSelected()) {
            for (Materia m1 : mD.buscarMateria(jTextField1.getText(), jComboBox1.getSelectedItem().toString())) {
                modelo.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio(), m1.isEstado()});
            }
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        borrarFila2();
        int filaSeleccionada = jTable1.getSelectedRow();
        if (jRadioButton1.isSelected()) {
            if (filaSeleccionada >= 0) {
                materia = mD.buscarMateria(Integer.toString((int)jTable1.getValueAt(filaSeleccionada, 0)),"ID MATERIA").get(0);
                for (Alumno a1 : aD.alumnosXmateria(materia.getIdMateria())) {
                    if (a1.getCategoria() == 1) {
                        modelo2.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.isEstado()});
                    }
                }
            }
        } else if (jRadioButton2.isSelected()) {
            if (filaSeleccionada >= 0) {
                alumno = aD.buscarAlumno(Integer.toString((int) jTable1.getValueAt(filaSeleccionada, 0)),"ID ALUMNO", null).get(0);
                System.out.println(alumno);
                for (Materia m1 : mD.materiaXalumno(alumno.getIdAlumno())) {
                    modelo2.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio(), m1.isEstado()});
                }
            }
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jTextField1.setEnabled(true);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        int filaSeleccionada = jTable2.getSelectedRow();
        if (jRadioButton1.isSelected()) {
            if (filaSeleccionada >= 0) {
                alumno = aD.buscarAlumno(Integer.toString((int) jTable2.getValueAt(filaSeleccionada, 0)),"ID ALUMNO", null).get(0);
            }
        } else if (jRadioButton2.isSelected()) {
            if (filaSeleccionada >= 0) {
                materia = mD.buscarMateria(Integer.toString((int)jTable1.getValueAt(filaSeleccionada, 0)),"ID MATERIA").get(0);
            }
        }

        ins = iD.buscarInscripcion(materia.getIdMateria(), alumno.getIdAlumno());
        completarTabla3();
        
        
        
        
        if (ins.isEstado() == 0) {
            jRadioButton3.setSelected(true);
            jRadioButton4.setSelected(false);
        } else if (ins.isEstado() == 1) {
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(true);
        }

        jCheckBox2.setEnabled(true);
        jCheckBox1.setEnabled(true);

    }//GEN-LAST:event_jTable2MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jRadioButton3.setEnabled(true);
            jRadioButton4.setEnabled(true);
        } else {
            jRadioButton3.setEnabled(false);
            jRadioButton4.setEnabled(false);
            if (ins.isEstado() == 0) {
                jRadioButton3.setSelected(true);
                jRadioButton4.setSelected(false);
            } else if (ins.isEstado() == 1) {
                jRadioButton3.setSelected(false);
                jRadioButton4.setSelected(true);
            }
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            jButton2.setEnabled(true);
        } else {
            jButton2.setEnabled(false);
        }

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         ValidarClaveADM vcADM = new ValidarClaveADM(usuario, ins.getIdInscripcion(), "eliminar_inscripcion", logD, aD, mD, iD);
         vcADM.setVisible(true);  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int estado = 0;
        if (jRadioButton4.isSelected()){
            estado = 1;
        }
        iD.actualizarEstadoInscripcion(estado, ins.getIdInscripcion());
        completarTabla3();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            this.dispose();        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

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
    
       DefaultTableModel modelo3 = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private void armarCabecera() {
        modelo.setColumnCount(0);
        if (jRadioButton1.isSelected()) {
            modelo.addColumn("iD Materia");
            modelo.addColumn("Nombre");
            modelo.addColumn("AÑO");
            modelo.addColumn("ESTADO");
        } else if (jRadioButton2.isSelected()) {
            modelo.addColumn("iD Alumno");
            modelo.addColumn("Apellido");
            modelo.addColumn("Nombre");
            modelo.addColumn("DNI");
            modelo.addColumn("F.Nac");
            modelo.addColumn("Estado");
        }
        jTable1.setModel(modelo);
        jTable1.getTableHeader().setReorderingAllowed(false);

        modelo2.setColumnCount(0);
        if (jRadioButton2.isSelected()) {
            modelo2.addColumn("iD Materia");
            modelo2.addColumn("Nombre");
            modelo2.addColumn("AÑO");
            modelo2.addColumn("ESTADO");
        } else if (jRadioButton1.isSelected()) {
            modelo2.addColumn("iD Alumno");
            modelo2.addColumn("Apellido");
            modelo2.addColumn("Nombre");
            modelo2.addColumn("DNI");
            modelo2.addColumn("F.Nac");
            modelo2.addColumn("Estado");
        }
        jTable2.setModel(modelo2);
        jTable2.getTableHeader().setReorderingAllowed(false);
            
        modelo3.setColumnCount(0);
        modelo3.addColumn("id Inscripcion");
        modelo3.addColumn("Apellido");
        modelo3.addColumn("Nombre");
        modelo3.addColumn("Materia");
        modelo3.addColumn("Estado");
        jTable3.setModel(modelo3);
        jTable3.getTableHeader().setReorderingAllowed(false);
    }

    private void borrarFila() {
        int filas = jTable1.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void borrarFila2() {
        int filas = jTable2.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo2.removeRow(f);
        }
    }
    
    private void borrarFila3() {
        int filas = jTable3.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo3.removeRow(f);
        }
    }
    

    private void armarBotones() {
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton1);
        jComboBox1.setEnabled(false);
        jTextField1.setEnabled(false);
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(jRadioButton3);
        buttonGroup2.add(jRadioButton4);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jButton2.setEnabled(false);

    }

    private void armarComboBox() {
        String[] lista1 = ((jRadioButton1.isSelected())
                ? new String[]{"ID MATERIA", "NOMBRE", "AÑO"}
                : new String[]{"ID ALUMNO", "DNI", "APELLIDO", "NOMBRE"});
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista1);
        jComboBox1.setModel(model);
        armarCabecera();
    }

    private void completarTabla3(){
        borrarFila3();
        modelo3.addRow(new Object[]{ins.getIdInscripcion(),alumno.getApellido(), alumno.getNombre(), materia.getNombre(),ins.isEstado()});
    }
}
