package Visual.visual_General;


import Visual.visual_ADM.Menu_ADM;
import Visual.visual_ALUMNO.Menu_Alumno;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;




public class Menu_Principal extends javax.swing.JFrame {


    public Menu_Principal() {
        initComponents();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla_principal = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jText_usuLIN = new javax.swing.JTextField();
        jPas_logIN = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        showPass = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro ULP");
        setIconImage(new ImageIcon(getClass().getResource("Img/logo-ulp22.png")).getImage());
        setResizable(false);

        pantalla_principal.setBackground(new java.awt.Color(102, 153, 255));
        pantalla_principal.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        pantalla_principal.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBackground(new java.awt.Color(0, 51, 130));

        jLabel3.setBackground(new java.awt.Color(51, 153, 255));
        jLabel3.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INGRESE SU USUARIO Y CONTRASEÑA");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(377, 20));

        jLabel1.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usario");

        jLabel2.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");

        jText_usuLIN.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N

        jPas_logIN.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        showPass.setText("VER");
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPas_logIN, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showPass))
                    .addComponent(jText_usuLIN))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_usuLIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPas_logIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pantalla_principal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pantalla_principalLayout = new javax.swing.GroupLayout(pantalla_principal);
        pantalla_principal.setLayout(pantalla_principalLayout);
        pantalla_principalLayout.setHorizontalGroup(
            pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_principalLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(270, 270, 270))
        );
        pantalla_principalLayout.setVerticalGroup(
            pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_principalLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(300, 300, 300))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantalla_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantalla_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Coneccion.loginData iN = new Coneccion.loginData();
        int usuario = Integer.parseInt(jText_usuLIN.getText());

        String clave = String.valueOf(jPas_logIN.getPassword());

        Entidades.LogIN log1 = new Entidades.LogIN(usuario, clave);

        if (iN.logIN(usuario, clave) == 0) {

            //            Visual.visual_ADM.Administrador admin = new Visual.visual_ADM.Administrador();
            //            admin.setVisible(true);

            Menu_ADM MenuADM = new Menu_ADM(usuario);
            MenuADM.setVisible(true);

        } else if (iN.logIN(usuario, clave) == 1) {

            Menu_Alumno MenuALM = new Menu_Alumno(usuario);
            MenuALM.setVisible(true);

        } else if (iN.logIN(usuario, clave) == 2) {
            // ingrsa docente
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed

        if (showPass.isSelected()) {
            // Mostrar caracteres de la contraseña
            jPas_logIN.setEchoChar((char) 0); // Esto quita el carácter oculto
        } else {
            // Ocultar caracteres de la contraseña
            jPas_logIN.setEchoChar('•');
        }

    }//GEN-LAST:event_showPassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPas_logIN;
    private javax.swing.JTextField jText_usuLIN;
    private javax.swing.JDesktopPane pantalla_principal;
    private javax.swing.JToggleButton showPass;
    // End of variables declaration//GEN-END:variables
}
