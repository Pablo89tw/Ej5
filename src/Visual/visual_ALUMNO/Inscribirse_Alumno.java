package Visual.visual_ALUMNO;

import Entidades.Alumno;
import Entidades.Materia;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inscribirse_Alumno extends javax.swing.JInternalFrame {

    private Coneccion.AlumnoData aD;
    private Coneccion.MateriaData mD;
    private Coneccion.InscripcionData iD;

    private Alumno alumno;
    private int idMateria = 0;

    public Inscribirse_Alumno(int usuario, Coneccion.AlumnoData aD, Coneccion.MateriaData mD, Coneccion.InscripcionData iD) {
        this.aD = aD;
        this.mD = mD;
        this.iD = iD;
        initComponents();
        armarCabecera();
        alumno = aD.buscarAlumno(Integer.toString(usuario), "DNI", null).get(0);
        jText.setEnabled(false);
        jButton.setEnabled(false);
        llenarTablaMaterias();

        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    DefaultTableModel modelo_mat = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon94 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/FONDO PRINCIPAL 02.jpg"));
        Image image94 = icon94.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image94,0,0,getWidth(),getHeight(),this);
            }

        };
        Salir = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jText = new javax.swing.JTextField();
        jCB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 6));
        setPreferredSize(new java.awt.Dimension(463, 290));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        Salir.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jButton.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton.setText("Inscribir");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jText.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jText.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 6, 0, 0));
        jText.setMinimumSize(new java.awt.Dimension(6, 25));
        jText.setPreferredSize(new java.awt.Dimension(0, 25));
        jText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextActionPerformed(evt);
            }
        });
        jText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextKeyReleased(evt);
            }
        });

        jCB.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jCB.setPreferredSize(new java.awt.Dimension(28, 25));
        jCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBItemStateChanged(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(51, 204, 0));
        jLabel5.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INSCRIPCION");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton)
                        .addGap(85, 85, 85)
                        .addComponent(Salir))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton)
                    .addComponent(Salir))
                .addGap(25, 25, 25))
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

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void jCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBItemStateChanged
        jText.setEnabled(true);
    }//GEN-LAST:event_jCBItemStateChanged

    private void jTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextKeyReleased
        borrarFila();
        String activo;
        ArrayList<Materia> materiaNoInscripto = new ArrayList<>(mD.buscarMateria(Integer.toString(alumno.getIdAlumno()), "NO_INSCRIPTO"));
        for (Materia m1 : mD.buscarMateria(jText.getText(), jCB.getSelectedItem().toString())) {
            if (m1.getAnio() == alumno.getAnio()) {
                activo = ((m1.isEstado()) ? "Activo" : "Inactivo");
                modelo_mat.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio(), activo});
            }
        }
    }//GEN-LAST:event_jTextKeyReleased

    private void jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMousePressed
        int filaSeleccionada = jTable.getSelectedRow();
        if (filaSeleccionada >= 0) {
            idMateria = (int) jTable.getValueAt(filaSeleccionada, 0);
        }
        jButton.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMousePressed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        Materia mat = mD.buscarMateria(Integer.toString(idMateria), "ID MATERIA").get(0);
        String text_Mess = "Te deseas inscribir a " + mat.getNombre() + ". Año: " + mat.getAnio();

        switch (JOptionPane.showConfirmDialog(rootPane, text_Mess)) {
            case 0:
                iD.inscribirAlumno(idMateria, alumno.getIdAlumno());
                llenarTablaMaterias();
                break;
            case 1:
                jText.setText("");
                jText.setText("");
                break;
        }
    }//GEN-LAST:event_jButtonActionPerformed

    private void jTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton;
    private javax.swing.JComboBox<String> jCB;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jText;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo_mat.setColumnCount(0);
        modelo_mat.addColumn("iD Materia");
        modelo_mat.addColumn("Nombre");
        modelo_mat.addColumn("AÑO");
        modelo_mat.addColumn("ESTADO");
        jTable.setModel(modelo_mat);
        jTable.getTableHeader().setReorderingAllowed(false);

        String[] listaCMmat = {"ID MATERIA", "NOMBRE"};
        DefaultComboBoxModel<String> model_mat = new DefaultComboBoxModel<>(listaCMmat);
        jCB.setModel(model_mat);
    }

    private void borrarFila() {
        int filas = jTable.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo_mat.removeRow(f);
        }
    }

    private void llenarTablaMaterias() {
        borrarFila();
        String activo;
        for (Materia m1 : mD.buscarMateria(Integer.toString(alumno.getIdAlumno()), "NO_INSCRIPTO")) {
            if (m1.getAnio() == alumno.getAnio() && m1.isEstado()) {
                activo = ((m1.isEstado()) ? "Activo" : "Inactivo");
                modelo_mat.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio(), activo});
            }
        }
    }
}
