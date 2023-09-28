package Visual.visual_ADM;

import Entidades.Alumno;
import java.time.ZoneId;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CargarAlumno extends javax.swing.JInternalFrame {

    private Alumno alumno;
    private Coneccion.AlumnoData aD;

    public CargarAlumno(Coneccion.AlumnoData aD) {
        this.aD = aD;
        initComponents();
        jSpinner1.setValue(1);

        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon9 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/FONDO PRINCIPAL 02.jpg"));
        Image image9 = icon9.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image9,0,0,getWidth(),getHeight(),this);
            }

        };
        TextoApellido = new javax.swing.JLabel();
        jTextoApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextoDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCalenderAlumno = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        AgregarAlumno = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 6));
        setPreferredSize(new java.awt.Dimension(500, 400));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        TextoApellido.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        TextoApellido.setForeground(new java.awt.Color(255, 255, 255));
        TextoApellido.setText("APELLIDO");

        jTextoApellido.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jTextoApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextoApellido.setBorder(null);
        jTextoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoApellidoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE");

        TextoNombre.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        TextoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoNombre.setBorder(null);

        jLabel3.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI");

        TextoDni.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        TextoDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoDni.setBorder(null);

        jLabel4.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("F. DE NACIMIENTO");

        jCalenderAlumno.setDateFormatString("yyyy  MM  dd");
        jCalenderAlumno.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jCalenderAlumno.setOpaque(false);
        jCalenderAlumno.setPreferredSize(new java.awt.Dimension(87, 27));

        jLabel1.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AÑO DE CURSADA");

        jSpinner1.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));
        jSpinner1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 20)));
        jSpinner1.setPreferredSize(new java.awt.Dimension(55, 27));

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AgregarAlumno.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        AgregarAlumno.setText("Agregar");
        AgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAlumnoActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 51, 102));
        jLabel5.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CARGAR ALUMNO");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextoApellido)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jLabel1))
                            .addComponent(TextoDni)
                            .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCalenderAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AgregarAlumno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addGap(0, 62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoApellido)
                .addGap(0, 0, 0)
                .addComponent(jTextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(TextoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, 0)
                        .addComponent(jCalenderAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarAlumno)
                    .addComponent(jButton1))
                .addContainerGap())
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

    private void jTextoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoApellidoActionPerformed

    private void AgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAlumnoActionPerformed
        armarAlumno();
    }//GEN-LAST:event_AgregarAlumnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAlumno;
    private javax.swing.JLabel TextoApellido;
    private javax.swing.JTextField TextoDni;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jCalenderAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextoApellido;
    // End of variables declaration//GEN-END:variables

    private void armarAlumno() {
        try {
            alumno = new Alumno();
            alumno.setApellido(jTextoApellido.getText());
            alumno.setNombre(TextoNombre.getText());
            alumno.setDni(Integer.parseInt(TextoDni.getText()));
            if (jCalenderAlumno.getDate() != null) {
                alumno.setFechaNacimiento((jCalenderAlumno.getDate()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            }
            alumno.setAnio((int) (jSpinner1.getValue()));
        
            
           if (!jTextoApellido.getText().trim().isEmpty()
                    && !TextoNombre.getText().trim().isEmpty()
                    && !TextoDni.getText().trim().isEmpty()
                    && jCalenderAlumno.getDate() != null) {
                alumno.setEstado(true);
                aD.cargarAlumno(alumno);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Complete todos los campos.");
            }
       } catch (NumberFormatException ex) {
            TextoDni.setText("");
            JOptionPane.showMessageDialog(null, "Formato de datos incorrecto.");
        } 
        
    }

}
