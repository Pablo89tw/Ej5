package Visual.visual_ALUMNO;

import Entidades.Inscripcion;
import Entidades.Materia;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;


public class Consultas_Alumno extends javax.swing.JInternalFrame {

    private Coneccion.AlumnoData aD;
    private Coneccion.MateriaData mD;
    private Coneccion.InscripcionData iD;
    private int usuario;
    
    
    public Consultas_Alumno(int usuario, Coneccion.AlumnoData aD, Coneccion.MateriaData mD, Coneccion.InscripcionData iD) {
        this.aD = aD;
        this.mD = mD;
        this.iD = iD;
        this.usuario = usuario;
        initComponents();
        armar();
    }

    DefaultTableModel modelo = new DefaultTableModel() {  
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Salir = new javax.swing.JButton();

        jRadioButton1.setText("Inscripciones");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Historial Académico");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Salir)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        armarCabecera();
        borrarFila();
        completarTabla1();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       armarCabecera();
       borrarFila();
       completarTabla2();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void armar(){     
        ButtonGroup buttonGroup = new ButtonGroup();      
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
    }    
    
    public void borrarFila(){
        int filas = jTable1.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    
    public void armarCabecera(){
         modelo.setColumnCount(0);
        if (jRadioButton1.isSelected()){
            modelo.addColumn("Materia");
            modelo.addColumn("Año");
        } else if (jRadioButton2.isSelected()){
            modelo.addColumn("Materia");
            modelo.addColumn("Nota"); 
    }
        jTable1.setModel(modelo);
    }
    
    public void completarTabla1(){
        for (Inscripcion insc : iD.Inscripciones_x_Alumno(usuario)){
        Materia materia = mD.buscarMateria(Integer.toString(insc.getMateria().getIdMateria()),"ID MATERIA").get(0);
        modelo.addRow(new Object[] {materia.getNombre(), materia.getAnio()});
        }
    }
    
    public void completarTabla2(){
        for (Inscripcion insc : iD.Inscripciones_x_Alumno(usuario)){
        Materia materia = mD.buscarMateria(Integer.toString(insc.getMateria().getIdMateria()),"ID MATERIA").get(0);
        modelo.addRow(new Object[] {materia.getNombre(),insc.getNota()});
        }
    }
}
