package Visual.visual_General;

import Entidades.LogIN;
import Visual.visual_ADM.Administrador;
import Visual.visual_ALUMNO.Menu_Alumno;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu_Principal extends javax.swing.JFrame {

    private Coneccion.AlumnoData aD = new Coneccion.AlumnoData();
    private Coneccion.MateriaData mD = new Coneccion.MateriaData();
    private Coneccion.InscripcionData iD = new Coneccion.InscripcionData();
    private Coneccion.loginData iN = new Coneccion.loginData();
    private int recordarme;
    private int usuario;
    private String clave;
    private ArrayList<LogIN> logIN = new ArrayList();
    
    public Menu_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon1 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/FONDO PRINCIPAL.jpg"));
        Image image1 = icon1.getImage();
        pantalla_principal = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image1,0,0,getWidth(),getHeight(),this);
            }

        };
        jText_usuLIN = new javax.swing.JTextField();
        jPas_logIN = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        showPass = new javax.swing.JToggleButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro ULP");
        setIconImage(new ImageIcon(getClass().getResource("/Visual/visual_General/Img/logo-ulp22.png")).getImage());
        setResizable(false);

        pantalla_principal.setBackground(new java.awt.Color(102, 153, 255));
        pantalla_principal.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        pantalla_principal.setPreferredSize(new java.awt.Dimension(1024, 768));

        jText_usuLIN.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jText_usuLIN.setForeground(new java.awt.Color(255, 255, 255));
        jText_usuLIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_usuLIN.setBorder(null);
        jText_usuLIN.setOpaque(false);
        jText_usuLIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jText_usuLINFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_usuLINFocusLost(evt);
            }
        });
        jText_usuLIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_usuLINKeyReleased(evt);
            }
        });

        jPas_logIN.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jPas_logIN.setForeground(new java.awt.Color(255, 255, 255));
        jPas_logIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPas_logIN.setBorder(null);
        jPas_logIN.setOpaque(false);
        jPas_logIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPas_logINFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        jLabel1.setMaximumSize(new java.awt.Dimension(60, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel2.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jLabel2.setPreferredSize(new java.awt.Dimension(109, 20));

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

        jCheckBox1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Recordarme");
        jCheckBox1.setFocusPainted(false);
        jCheckBox1.setFocusable(false);
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pantalla_principal.setLayer(jText_usuLIN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pantalla_principal.setLayer(jPas_logIN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pantalla_principal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pantalla_principal.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pantalla_principal.setLayer(showPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pantalla_principal.setLayer(jCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pantalla_principal.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pantalla_principalLayout = new javax.swing.GroupLayout(pantalla_principal);
        pantalla_principal.setLayout(pantalla_principalLayout);
        pantalla_principalLayout.setHorizontalGroup(
            pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_principalLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addGroup(pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_usuLIN)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pantalla_principalLayout.createSequentialGroup()
                        .addGroup(pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pantalla_principalLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jCheckBox1))))
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addComponent(jPas_logIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
        );
        pantalla_principalLayout.setVerticalGroup(
            pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_principalLayout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_usuLIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPas_logIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(258, 258, 258))
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
        inicioSesion();
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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jText_usuLINKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_usuLINKeyReleased
       
    }//GEN-LAST:event_jText_usuLINKeyReleased

    private void jPas_logINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPas_logINFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPas_logINFocusGained

    private void jText_usuLINFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_usuLINFocusLost
        for (int i = 0; i < logIN.size(); i++) {
            if (Integer.toString(logIN.get(i).getUsuario()).equals(jText_usuLIN.getText())){
                jPas_logIN.setText(logIN.get(i).getClave());
                jCheckBox1.setSelected(true);
            } 
                } 
    }//GEN-LAST:event_jText_usuLINFocusLost

    private void jText_usuLINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_usuLINFocusGained
         logIN = iN.cuentasA_Recordar();
    }//GEN-LAST:event_jText_usuLINFocusGained

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPas_logIN;
    private javax.swing.JTextField jText_usuLIN;
    private javax.swing.JDesktopPane pantalla_principal;
    private javax.swing.JToggleButton showPass;
    // End of variables declaration//GEN-END:variables

    private void inicioSesion() {
        try {
            int usuario = Integer.parseInt(jText_usuLIN.getText());
            String clave = String.valueOf(jPas_logIN.getPassword());
          
            switch (iN.logIN(usuario, clave)) {
                case 0:
                    if (!jCheckBox1.isSelected()) {
                        iN.actualizarRecordar(0, usuario);
                        logIN = iN.cuentasA_Recordar();
                    } else if (jCheckBox1.isSelected()){
                        iN.actualizarRecordar(1, usuario);
                        logIN = iN.cuentasA_Recordar();    
                    }
                    jPas_logIN.setText("");
                    jText_usuLIN.setText("");
                    Administrador admin = new Administrador(usuario, aD, mD, iD, iN);
                    pantalla_principal.add(admin);
                    admin.setVisible(true);

                    pantalla_principal.moveToFront(admin);
                    admin.setLocation((int) pantalla_principal.getLocation().getX() + 112, (int) pantalla_principal.getLocation().getY() + 50);
                    break;

                case 1:
                    if (!jCheckBox1.isSelected()) {
                        jPas_logIN.setText("");
                        jText_usuLIN.setText("");
                    }
                    Menu_Alumno MenuALM = new Menu_Alumno(usuario, aD, mD, iD);
                    pantalla_principal.add(MenuALM);
                    MenuALM.setVisible(true);
                    break;
            }
        }
         catch (NumberFormatException ex) {
            jText_usuLIN.setText("");
            jPas_logIN.setText("");
            JOptionPane.showMessageDialog(null, "Usurio Incorrecto");
        } 
        }
    
    }



