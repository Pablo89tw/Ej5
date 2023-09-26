package Visual.visual_General;

import Visual.visual_ADM.Administrador;
import Visual.visual_ALUMNO.Menu_Alumno;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu_Principal extends javax.swing.JFrame {
    
    private Coneccion.AlumnoData aD = new Coneccion.AlumnoData();
    private Coneccion.MateriaData mD = new Coneccion.MateriaData();
    private Coneccion.InscripcionData iD = new Coneccion.InscripcionData();
    private Coneccion.loginData iN = new Coneccion.loginData();
    private int recordarme;
    private int usuario;
    private String clave;

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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jText_usuLIN = new javax.swing.JTextField();
        jPas_logIN = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        showPass = new javax.swing.JToggleButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro ULP");
        setIconImage(new ImageIcon(getClass().getResource("/Visual/visual_General/Img/logo-ulp22.png")).getImage());
        setResizable(false);

        pantalla_principal.setBackground(new java.awt.Color(102, 153, 255));
        pantalla_principal.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        pantalla_principal.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBackground(new java.awt.Color(0, 51, 130));

        jLabel3.setBackground(new java.awt.Color(51, 153, 255));
        jLabel3.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(377, 20));

        jLabel1.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        jLabel1.setMaximumSize(new java.awt.Dimension(60, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel2.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jLabel2.setPreferredSize(new java.awt.Dimension(109, 20));

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

        jCheckBox1.setText("Recordarme");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_usuLIN)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jPas_logIN, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showPass)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jText_usuLIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPas_logIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPass))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)))
                .addContainerGap())
        );

        pantalla_principal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pantalla_principalLayout = new javax.swing.GroupLayout(pantalla_principal);
        pantalla_principal.setLayout(pantalla_principalLayout);
        pantalla_principalLayout.setHorizontalGroup(
            pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_principalLayout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
        );
        pantalla_principalLayout.setVerticalGroup(
            pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_principalLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(468, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPas_logIN;
    private javax.swing.JTextField jText_usuLIN;
    private javax.swing.JDesktopPane pantalla_principal;
    private javax.swing.JToggleButton showPass;
    // End of variables declaration//GEN-END:variables

    private void inicioSesion() {
        usuario = Integer.parseInt(jText_usuLIN.getText());
        clave = String.valueOf(jPas_logIN.getPassword());
        if (jCheckBox1.isSelected()) {
            recordarme = 1;
        } else if (!jCheckBox1.isSelected()) {
            recordarme = 0;
        }

        switch (iN.logIN(usuario, clave)) {
            case 0:
                jPas_logIN.setText("");
                jText_usuLIN.setText("");
                iN.cargarRecordar(usuario, recordarme);
                Administrador admin = new Administrador(usuario, aD, mD, iD, iN);
                pantalla_principal.add(admin);
                admin.setVisible(true);

                pantalla_principal.moveToFront(admin);
                admin.setLocation((int) pantalla_principal.getLocation().getX() + 112, (int) pantalla_principal.getLocation().getY() + 50);
                break;
            case 1:
                jPas_logIN.setText("");
                jText_usuLIN.setText("");
                iN.cargarRecordar(usuario, recordarme);
                Menu_Alumno MenuALM = new Menu_Alumno(usuario, aD, mD, iD);
                pantalla_principal.add(MenuALM);
                MenuALM.setVisible(true);
                break;
        }
    }

    public void cargaDatosCS(int usuario) {
        if (iN.verRecordar(usuario) == 1) {
            System.out.println(iN.buscarClave(usuario));
            jPas_logIN.setText(iN.buscarClave(usuario));
            jText_usuLIN.setText(iN.buscarClave(usuario));
        }
    }
}
