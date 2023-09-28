package Visual.visual_ADM;

import Entidades.Alumno;
import Entidades.Materia;
import Entidades.Inscripcion;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cargar_Nota extends javax.swing.JInternalFrame {

    private Coneccion.AlumnoData aD;
    private Coneccion.MateriaData mD;
    private Coneccion.InscripcionData iD;
    private int check_notas;

    public Cargar_Nota(Coneccion.AlumnoData aD, Coneccion.MateriaData mD, Coneccion.InscripcionData iD) {
        this.aD = aD;
        this.mD = mD;
        this.iD = iD;
        initComponents();
        unirUnirBotones();
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            if (jR_alumno.isSelected()) {
                return c == 4;
            } else {
                return c == 5;
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

        ImageIcon icon28 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/FONDO PRINCIPAL 02.jpg"));
        Image image28 = icon28.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image28,0,0,getWidth(),getHeight(),this);
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jR_alumno = new javax.swing.JRadioButton();
        jR_materia = new javax.swing.JRadioButton();
        jCB = new javax.swing.JComboBox<>();
        jText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 6));
        setPreferredSize(new java.awt.Dimension(530, 400));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(521, 400));

        jLabel1.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar");

        jR_alumno.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jR_alumno.setForeground(new java.awt.Color(255, 255, 255));
        jR_alumno.setText("Alumno");
        jR_alumno.setOpaque(false);
        jR_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_alumnoActionPerformed(evt);
            }
        });

        jR_materia.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jR_materia.setForeground(new java.awt.Color(255, 255, 255));
        jR_materia.setText("Materia");
        jR_materia.setOpaque(false);
        jR_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_materiaActionPerformed(evt);
            }
        });

        jCB.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jCB.setBorder(null);
        jCB.setPreferredSize(new java.awt.Dimension(36, 25));

        jText.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jText.setPreferredSize(new java.awt.Dimension(6, 25));
        jText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextKeyReleased(evt);
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

        jButton2.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton1.setText("Cargar Notas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 51, 102));
        jLabel5.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CARGA DE NOTAS");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jR_alumno)
                                .addGap(53, 53, 53)
                                .addComponent(jR_materia))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(86, 86, 86)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jR_alumno)
                    .addComponent(jR_materia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int nota = 0, idAlumno = 0, idMateria = 0;
        int cont = 0;
        try {
            if (jR_materia.isSelected()) {
                for (int i = 0; i < jTable2.getRowCount(); i++) {
                    if (jTable2.getValueAt(i, 5) != null) {
                        cont++;
                        nota = Integer.parseInt((jTable2.getValueAt(i, 5)).toString());
                        idAlumno = Integer.parseInt((jTable2.getValueAt(i, 0)).toString());
                        idMateria = Integer.parseInt((jTable.getValueAt(jTable.getSelectedRow(), 0)).toString());
                        check_notas = iD.cargarNota(nota, idAlumno, idMateria);
                    }
                }
                if (check_notas == 1) {
                    JOptionPane.showMessageDialog(null, cont + " notas editadas");
                }
            } else if (jR_alumno.isSelected()) {
                for (int i = 0; i < jTable2.getRowCount(); i++) {
                    if (jTable2.getValueAt(i, 4) != null) {
                        cont++;
                        nota = Integer.parseInt((jTable2.getValueAt(i, 4)).toString());
                        idAlumno = Integer.parseInt((jTable.getValueAt(jTable.getSelectedRow(), 0)).toString());
                        idMateria = Integer.parseInt((jTable2.getValueAt(i, 0)).toString());
                        check_notas = iD.cargarNota(nota, idAlumno, idMateria);
                    }
                }
                if (check_notas == 1) {
                    JOptionPane.showMessageDialog(null, cont + " notas editadas.");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato nota incorrecto");
        }
        actualizarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

    }//GEN-LAST:event_jTable2MouseClicked

    private void jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMousePressed
        borrarFila2();
        if (jR_materia.isSelected()) {
            int idMateria = (int) jTable.getValueAt(jTable.getSelectedRow(), 0);
            for (Alumno a1 : aD.alumnosXmateria(idMateria)) {
                Inscripcion ins = iD.buscarInscripcion(idMateria, a1.getIdAlumno());
                if (a1.getCategoria() == 1) {
                    modelo2.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), ins.getNota()});
                }
            }
        } else if (jR_alumno.isSelected()) {
            int idAlumno = (int) jTable.getValueAt(jTable.getSelectedRow(), 0);
            for (Materia m1 : mD.materiaXalumno(idAlumno)) {
                Inscripcion ins = iD.buscarInscripcion(m1.getIdMateria(), idAlumno);
                modelo2.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio(), ins.getNota()});
            }
        }
    }//GEN-LAST:event_jTableMousePressed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

    }//GEN-LAST:event_jTableMouseClicked

    private void jTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextKeyReleased
        borrarFila();
        if (jR_alumno.isSelected()) {
            for (Alumno a1 : aD.buscarAlumno(jText.getText(), jCB.getSelectedItem().toString(), null)) {
                if (a1.getCategoria() != 0) {
                    modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni()});
                }
            }
        } else if (jR_materia.isSelected()) {
            for (Materia m1 : mD.buscarMateria(jText.getText(), jCB.getSelectedItem().toString())) {
                modelo.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio()});
            }
        }
    }//GEN-LAST:event_jTextKeyReleased

    private void jR_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_materiaActionPerformed
        String[] lista1 = {"ID MATERIA", "NOMBRE", "AÑO"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista1);
        jCB.setModel(model);
        armarCabecera();
        armarCabecera2();
        // TODO add your handling code here:
    }//GEN-LAST:event_jR_materiaActionPerformed

    private void jR_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_alumnoActionPerformed
        String[] lista1 = {"ID ALUMNO", "DNI", "APELLIDO", "NOMBRE"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista1);
        jCB.setModel(model);
        armarCabecera();
        armarCabecera2();
    }//GEN-LAST:event_jR_alumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
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
        jTable.getTableHeader().setReorderingAllowed(false);
        }

    private void armarCabecera2() {
        modelo2.setColumnCount(0);
        if (jR_alumno.isSelected()) {
            modelo2.addColumn("iD Materia");
            modelo2.addColumn("Nombre");
            modelo2.addColumn("AÑO");
            modelo2.addColumn("Nota");
            modelo2.addColumn("Nueva Nota");
        } else if (jR_materia.isSelected()) {
            modelo2.addColumn("iD Alumno");
            modelo2.addColumn("Apellido");
            modelo2.addColumn("Nombre");
            modelo2.addColumn("DNI");
            modelo2.addColumn("Nota");
            modelo2.addColumn("Nueva Nota");
        }
        jTable2.setModel(modelo2);
        jTable2.getTableHeader().setReorderingAllowed(false);
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
            modelo2.removeRow(f);
        }
    }
    
    private void actualizarTabla(){
        borrarFila2();
        if (jR_materia.isSelected()) {
            int idMateria = (int) jTable.getValueAt(jTable.getSelectedRow(), 0);
            for (Alumno a1 : aD.alumnosXmateria(idMateria)) {
                Inscripcion ins = iD.buscarInscripcion(idMateria, a1.getIdAlumno());
                if (a1.getCategoria() == 1) {
                    modelo2.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), ins.getNota()});
                }
            }
        } else if (jR_alumno.isSelected()) {
            int idAlumno = (int) jTable.getValueAt(jTable.getSelectedRow(), 0);
            for (Materia m1 : mD.materiaXalumno(idAlumno)) {
                Inscripcion ins = iD.buscarInscripcion(m1.getIdMateria(), idAlumno);
                modelo2.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio(), ins.getNota()});
            }
        }
}
}
