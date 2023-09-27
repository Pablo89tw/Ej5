package Visual.visual_ADM;

import Entidades.Alumno;
import Entidades.Materia;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Inscribir_Alumno extends javax.swing.JInternalFrame {

    private int idMateria = 0;
    private int idAlumno = 0;
    private Alumno alumno;
    private Coneccion.AlumnoData aD;
    private Coneccion.MateriaData mD;
    private Coneccion.InscripcionData iD;

    public Inscribir_Alumno(Coneccion.AlumnoData aD, Coneccion.MateriaData mD, Coneccion.InscripcionData iD) {
        this.aD = aD;
        this.mD = mD;
        this.iD = iD;
        initComponents();
        armarCabecera();
        armarComboBox();
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
       
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

        ImageIcon icon32 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/FONDO PRINCIPAL 02.jpg"));
        Image image32 = icon32.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image32,0,0,getWidth(),getHeight(),this);
            }

        };
        jButton1 = new javax.swing.JButton();
        jButton_inscribir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_insMat = new javax.swing.JTable();
        jText_insMat = new javax.swing.JTextField();
        jComboBox_insMat = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_insAlum = new javax.swing.JTable();
        jComboBox_insAlum1 = new javax.swing.JComboBox<>();
        jComboBox_insAlum = new javax.swing.JComboBox<>();
        jText_insAlum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 6));
        setPreferredSize(new java.awt.Dimension(675, 488));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.setPreferredSize(new java.awt.Dimension(81, 27));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_inscribir.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
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

        jText_insMat.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jText_insMat.setPreferredSize(new java.awt.Dimension(6, 25));
        jText_insMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_insMatKeyReleased(evt);
            }
        });

        jComboBox_insMat.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jComboBox_insMat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_insMat.setPreferredSize(new java.awt.Dimension(56, 25));
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

        jLabel4.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Materia");

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

        jComboBox_insAlum1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jComboBox_insAlum1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        jComboBox_insAlum1.setPreferredSize(new java.awt.Dimension(38, 25));
        jComboBox_insAlum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_insAlum1ActionPerformed(evt);
            }
        });

        jComboBox_insAlum.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jComboBox_insAlum.setPreferredSize(new java.awt.Dimension(28, 25));
        jComboBox_insAlum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_insAlumItemStateChanged(evt);
            }
        });

        jText_insAlum.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jText_insAlum.setPreferredSize(new java.awt.Dimension(6, 25));
        jText_insAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_insAlumKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alumno");

        jLabel5.setBackground(new java.awt.Color(255, 51, 102));
        jLabel5.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INSCRIPCIONES");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox_insAlum1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jText_insAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jComboBox_insAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_inscribir)
                                .addGap(30, 30, 30)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jComboBox_insMat, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jText_insMat, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator2))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_insAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_insAlum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_insAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_insMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_insMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_inscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jText_insAlumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_insAlumKeyReleased
        borrarFilaAl();
        for (Alumno a1 : aD.buscarAlumno(jText_insAlum.getText(), jComboBox_insAlum1.getSelectedItem().toString(), null)) {
            if (a1.isEstado() && a1.getCategoria() == 1){
                modelo_al.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.isEstado()});
            }
        }
        alumno = aD.buscarAlumno(jText_insAlum.getText(), jComboBox_insAlum1.getSelectedItem().toString(), null).get(0);

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
        llenarTablaMaterias();
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
        borrarFilaMat();
        for (Materia materia : mD.buscarMateria(jText_insMat.getText(), jComboBox_insMat.getSelectedItem().toString())) {
            if (materia.isEstado()) {
                modelo_mat.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio(), materia.isEstado()});
            }
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
        jTable_insAlum.getTableHeader().setReorderingAllowed(false);
        
        modelo_mat.setColumnCount(0);
        modelo_mat.addColumn("iD Materia");
        modelo_mat.addColumn("Nombre");
        modelo_mat.addColumn("AÑO");
        modelo_mat.addColumn("ESTADO");
        jTable_insMat.setModel(modelo_mat);
        jTable_insMat.getTableHeader().setReorderingAllowed(false);
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

    private void llenarTablaMaterias() {
        for (Materia materia : mD.buscarMateria(Integer.toString(alumno.getIdAlumno()),"NO_INSCRIPTO")) {
            if (materia.isEstado()){
            modelo_mat.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio(), materia.isEstado()});
        }
        }
    }
    
    private void armarComboBox(){
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
}
