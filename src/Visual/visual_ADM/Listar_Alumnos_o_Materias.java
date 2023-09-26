package Visual.visual_ADM;

import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import Entidades.Alumno;
import Entidades.Materia;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;


public class Listar_Alumnos_o_Materias extends javax.swing.JInternalFrame {

    private Coneccion.AlumnoData aD;
    private Coneccion.MateriaData mD;
      
    public Listar_Alumnos_o_Materias(Coneccion.AlumnoData aD, Coneccion.MateriaData mD) {
        this.aD = aD;
        this.mD = mD;
        
        initComponents();
        armarCabecera();
        armarBotones();
        
         jTexto_Buscar1.setEnabled(false);
        jDateChooser_buscar.setEnabled(false);
        jComboBox_busqueda.setEnabled(false);
          
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }
    
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon16 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/FONDO PRINCIPAL 02.jpg"));
        Image image16 = icon16.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image16,0,0,600,400,this);
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox_busqueda = new javax.swing.JComboBox<>();
        jTexto_Buscar1 = new javax.swing.JTextField();
        jDateChooser_buscar = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        Cerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 8));
        setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(0, 50, 100));

        jLabel1.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar por");

        jRadioButton1.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Alumno");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Materia");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jComboBox_busqueda.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        jComboBox_busqueda.setBorder(null);
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

        jTexto_Buscar1.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        jTexto_Buscar1.setBorder(null);
        jTexto_Buscar1.setPreferredSize(new java.awt.Dimension(0, 20));
        jTexto_Buscar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTexto_Buscar1KeyReleased(evt);
            }
        });

        jDateChooser_buscar.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        jDateChooser_buscar.setOpaque(false);
        jDateChooser_buscar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_buscarPropertyChange(evt);
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
        jScrollPane1.setViewportView(jTable);

        Cerrar.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        Cerrar.setText("CERRAR");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 51, 102));
        jLabel3.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUSCAR");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cerrar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRadioButton1)
                                    .addGap(35, 35, 35)
                                    .addComponent(jRadioButton2))
                                .addComponent(jTexto_Buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jDateChooser_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox_busqueda)
                    .addComponent(jTexto_Buscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Cerrar)
                .addGap(22, 22, 22))
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

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void jTexto_Buscar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexto_Buscar1KeyReleased
        jDateChooser_buscar.setEnabled(false);

        borrarFila();

        if (jRadioButton1.isSelected()) {
            for (Alumno a1 : aD.buscarAlumno(jTexto_Buscar1.getText(), jComboBox_busqueda.getSelectedItem().toString(), null)) {
                if (a1.getCategoria()==1){
                modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.isEstado()});
            }
            }
        } else if (jRadioButton2.isSelected()) {
            for (Materia m1 : mD.buscarMateria(jTexto_Buscar1.getText(), jComboBox_busqueda.getSelectedItem().toString())) {             
                modelo.addRow(new Object[]{m1.getIdMateria(), m1.getNombre(), m1.getAnio(), m1.isEstado()});
            }
        }
    }//GEN-LAST:event_jTexto_Buscar1KeyReleased

    private void jComboBox_busquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_busquedaMouseClicked
        jTexto_Buscar1.setText("");
    }//GEN-LAST:event_jComboBox_busquedaMouseClicked

    private void jComboBox_busquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_busquedaMouseEntered
        jTexto_Buscar1.setText("");
    }//GEN-LAST:event_jComboBox_busquedaMouseEntered

    private void jComboBox_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_busquedaActionPerformed
        jTexto_Buscar1.setEnabled(true);
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

    private void jDateChooser_buscarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_buscarPropertyChange
        if (jDateChooser_buscar.getDate() != null) {
            borrarFila();
            LocalDate fechaLD = jDateChooser_buscar.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            for (Alumno a1 : aD.buscarAlumno(null, "FECHA NACIMIENTO", fechaLD)) {
                if (a1.getCategoria() == 1){
                modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.isEstado()});
            }
            }
        }

    }//GEN-LAST:event_jDateChooser_buscarPropertyChange

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jComboBox_busqueda.setEditable(false);
        jComboBox_busqueda.setEnabled(true);
        jTexto_Buscar1.setText("");
        armarComboBox();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jComboBox_busqueda.setEditable(false);
        jComboBox_busqueda.setEnabled(true);
        jTexto_Buscar1.setText("");
        armarComboBox();
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JComboBox<String> jComboBox_busqueda;
    private com.toedter.calendar.JDateChooser jDateChooser_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTexto_Buscar1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.setColumnCount(0);
        if (jRadioButton2.isSelected()) {
            modelo.addColumn("iD Materia");
            modelo.addColumn("Nombre");
            modelo.addColumn("AÑO");
            modelo.addColumn("ESTADO");
        } else if (jRadioButton1.isSelected()) {
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
    
    private void armarBotones(){
        ButtonGroup buttonGroup = new ButtonGroup();      
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton1);
        
    }
    
    private void armarComboBox(){
     String[] lista1 = ((jRadioButton2.isSelected())?
              new String[]{"ID MATERIA", "NOMBRE", "ESTADO", "AÑO"}
            : new String[]{"ID ALUMNO", "DNI", "APELLIDO", "NOMBRE", "FECHA NACIMIENTO", "ESTADO"});
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista1);
        jComboBox_busqueda.setModel(model);
        armarCabecera();
    }
}
