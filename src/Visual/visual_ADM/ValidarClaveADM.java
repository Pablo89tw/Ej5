package Visual.visual_ADM;

import Entidades.Alumno;
import javax.swing.JOptionPane;

public class ValidarClaveADM extends javax.swing.JFrame {
    
    private int usuario;
    private int id;
    private String codigo;
 
    public ValidarClaveADM(int usuario, int idAlumno, String codigo) {
        initComponents();
        this.usuario = usuario;
        this.id = idAlumno;
        this.codigo = codigo;
        armarTexto();
    }
    Coneccion.loginData col = new Coneccion.loginData();  
    Coneccion.AlumnoData aD = new Coneccion.AlumnoData();
    Coneccion.MateriaData mD = new Coneccion.MateriaData();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Clave = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        Cancelar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        Clave.setText("Clave");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Clave)
                            .addGap(18, 18, 18)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Aceptar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Cancelar)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clave)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Aceptar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
            this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
       
        String clave_ing = jPasswordField1.getText();        
        if (clave_ing.equals(col.buscarClave(usuario))){
            switch (codigo){ 
                case "clave": col.resteoClave(id); break;
                case "eliminar_alumno": aD.eliminarAlumno(id);break;
                case "eliminar_materia": mD.eliminarMateria(id);break;
            }
        } else { 
            JOptionPane.showMessageDialog(null, "Clave Invalida");
        }
        this.dispose();
    }//GEN-LAST:event_AceptarActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables

private void armarTexto(){
   Alumno alumno = (aD.buscarAlumno(Integer.toString(usuario), "DNI", null)).get(0);
   jLabel1.setText("Reingrese su clave " + alumno.getApellido() + ". " + alumno.getNombre());
}

}
