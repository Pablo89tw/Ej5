package Visual.visual_General;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Modificar_Clave extends javax.swing.JInternalFrame {

    Coneccion.loginData lIn = new Coneccion.loginData();
   
    private int usuario;
    private String clave_nueva;
    
    public Modificar_Clave(int usuario) {
        initComponents();
        this.usuario = usuario;
        jLabel5.setVisible(false);
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon20 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/FONDO PRINCIPAL 02.jpg"));
        Image image20 = icon20.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image20,0,0,getWidth(),getHeight(),this);
            }

        };
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jP_cV = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jP_cN1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jP_cN2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        showPass = new javax.swing.JToggleButton();
        showPass1 = new javax.swing.JToggleButton();
        showPass2 = new javax.swing.JToggleButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 6));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 350));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel4.setBackground(new java.awt.Color(255, 51, 102));
        jLabel4.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CAMBIAR CONTRASEÑA");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clave antigüa");

        jP_cV.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clave nueva");

        jP_cN1.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Repetir clave");

        jP_cN2.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        jP_cN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jP_cN2MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Las contraseñas no coinciden");
        jLabel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel5ComponentShown(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton2.setText("CERRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        showPass.setBackground(new java.awt.Color(0, 102, 0));
        showPass.setForeground(new java.awt.Color(255, 102, 0));
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/visual_General/Img/ojo2.png"))); // NOI18N
        showPass.setToolTipText("");
        showPass.setBorder(null);
        showPass.setBorderPainted(false);
        showPass.setContentAreaFilled(false);
        showPass.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/visual_General/Img/ojo2.png"))); // NOI18N
        showPass.setFocusPainted(false);
        showPass.setFocusable(false);
        showPass.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/visual_General/Img/ojo1.png"))); // NOI18N
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        showPass1.setBackground(new java.awt.Color(0, 102, 0));
        showPass1.setForeground(new java.awt.Color(255, 102, 0));
        showPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/visual_General/Img/ojo2.png"))); // NOI18N
        showPass1.setToolTipText("");
        showPass1.setBorder(null);
        showPass1.setBorderPainted(false);
        showPass1.setContentAreaFilled(false);
        showPass1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/visual_General/Img/ojo2.png"))); // NOI18N
        showPass1.setFocusPainted(false);
        showPass1.setFocusable(false);
        showPass1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/visual_General/Img/ojo1.png"))); // NOI18N
        showPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPass1ActionPerformed(evt);
            }
        });

        showPass2.setBackground(new java.awt.Color(0, 102, 0));
        showPass2.setForeground(new java.awt.Color(255, 102, 0));
        showPass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/visual_General/Img/ojo2.png"))); // NOI18N
        showPass2.setToolTipText("");
        showPass2.setBorder(null);
        showPass2.setBorderPainted(false);
        showPass2.setContentAreaFilled(false);
        showPass2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/visual_General/Img/ojo2.png"))); // NOI18N
        showPass2.setFocusPainted(false);
        showPass2.setFocusable(false);
        showPass2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/visual_General/Img/ojo1.png"))); // NOI18N
        showPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPass2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jP_cN2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jP_cN1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jP_cV, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jP_cV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jP_cN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(showPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jP_cN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(showPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String contraseniaVieja = jP_cV.getText();
        String contraseniaN1 = jP_cN1.getText();
        String contraseniaN2 = jP_cN2.getText();
        clave_nueva = lIn.modificarClave(contraseniaVieja, contraseniaN1, contraseniaN2, usuario);
        JOptionPane.showMessageDialog(null, "La clave ha sido actualizada");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel5ComponentShown

    }//GEN-LAST:event_jLabel5ComponentShown

    private void jP_cN2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_cN2MouseExited
        if (!(jP_cN1.getText().equals(jP_cN2.getText()))){
            jLabel5.setVisible(true);
        }
    }//GEN-LAST:event_jP_cN2MouseExited

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if (showPass.isSelected()) {
            // Mostrar caracteres de la contraseña
            jP_cV.setEchoChar((char) 0); // Esto quita el carácter oculto
        } else {
            // Ocultar caracteres de la contraseña
            jP_cV.setEchoChar('•');
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void showPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPass1ActionPerformed
        
        if (showPass1.isSelected()) {
            // Mostrar caracteres de la contraseña
            jP_cN1.setEchoChar((char) 0); // Esto quita el carácter oculto
        } else {
            // Ocultar caracteres de la contraseña
            jP_cN1.setEchoChar('•');
        }
        
        
        
    }//GEN-LAST:event_showPass1ActionPerformed

    private void showPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPass2ActionPerformed
        
        if (showPass2.isSelected()) {
            // Mostrar caracteres de la contraseña
            jP_cN2.setEchoChar((char) 0); // Esto quita el carácter oculto
        } else {
            // Ocultar caracteres de la contraseña
            jP_cN2.setEchoChar('•');
        }
        
        
        
    }//GEN-LAST:event_showPass2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jP_cN1;
    private javax.swing.JPasswordField jP_cN2;
    private javax.swing.JPasswordField jP_cV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton showPass;
    private javax.swing.JToggleButton showPass1;
    private javax.swing.JToggleButton showPass2;
    // End of variables declaration//GEN-END:variables
}
