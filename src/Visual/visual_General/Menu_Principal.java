package Visual.visual_General;


import Visual.visual_ADM.Menu_ADM;
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/FONDO PRINCIPAL.jpg"));
        Image image = icon.getImage();
        pantalla_principal = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        boton_Ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro ULP");
        setIconImage(new ImageIcon(getClass().getResource("Img/logo-ulp22.png")).getImage());
        setResizable(false);

        pantalla_principal.setBackground(new java.awt.Color(102, 153, 255));
        pantalla_principal.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        pantalla_principal.setPreferredSize(new java.awt.Dimension(1024, 768));

        boton_Ingresar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        boton_Ingresar.setText("Ingresar");
        boton_Ingresar.setOpaque(false);
        boton_Ingresar.setSelected(true);
        boton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_IngresarActionPerformed(evt);
            }
        });

        pantalla_principal.setLayer(boton_Ingresar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pantalla_principalLayout = new javax.swing.GroupLayout(pantalla_principal);
        pantalla_principal.setLayout(pantalla_principalLayout);
        pantalla_principalLayout.setHorizontalGroup(
            pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_principalLayout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .addComponent(boton_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448))
        );
        pantalla_principalLayout.setVerticalGroup(
            pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_principalLayout.createSequentialGroup()
                .addContainerGap(537, Short.MAX_VALUE)
                .addComponent(boton_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantalla_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantalla_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_IngresarActionPerformed
 
        Hacer_LogIN LogIN = new Hacer_LogIN();
        LogIN.setVisible(true);
        
        pantalla_principal.add(LogIN);
        pantalla_principal.moveToFront(LogIN);
        LogIN.setLocation((int)pantalla_principal.getLocation().getX()+262, (int)pantalla_principal.getLocation().getY()+259);
        
        
    }//GEN-LAST:event_boton_IngresarActionPerformed

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
    private javax.swing.JButton boton_Ingresar;
    private javax.swing.JDesktopPane pantalla_principal;
    // End of variables declaration//GEN-END:variables
}
