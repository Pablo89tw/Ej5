package Visual.visual_ADM;

import Entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class ModificarAlumno extends javax.swing.JInternalFrame {

    private final Coneccion.loginData logD;
    private final Coneccion.AlumnoData aD;
    private final Coneccion.MateriaData mD;
    private final Coneccion.InscripcionData iD;
    private int idAlumno_Mod;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int anio;
    private boolean estado;
    private int usuario;
    private Alumno alumno;
    private int filtroBusqueda;
    private int filaSeleccionada;

    public ModificarAlumno(int usuario, Coneccion.AlumnoData aD, Coneccion.loginData logD, Coneccion.MateriaData mD, Coneccion.InscripcionData iD) {
        this.usuario = usuario;
        this.aD = aD;
        this.logD = logD;
        this.mD = mD;
        this.iD = iD;
        initComponents();
        armarCabecera();
        armadoVista();

        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon12 = new ImageIcon(getClass().getResource("/Visual/visual_General/Img/FONDO PRINCIPAL 02.jpg"));
        Image image12 = icon12.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image12,0,0,getWidth(),getHeight(),this);
            }

        };
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        CheckBox_ELIMINAR = new javax.swing.JCheckBox();
        LogIN_inactivo = new javax.swing.JRadioButton();
        logIN_activo = new javax.swing.JRadioButton();
        CheckBox_LOGIN = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        CheckBox_CLAVE = new javax.swing.JCheckBox();
        jDC_nF = new com.toedter.calendar.JDateChooser();
        CheckBox_FECHA_NAC = new javax.swing.JCheckBox();
        jS_nA = new javax.swing.JSpinner();
        CheckBox_ANIO = new javax.swing.JCheckBox();
        Text_APELLIDO = new javax.swing.JTextField();
        CheckBox_APELLIDO = new javax.swing.JCheckBox();
        Text_NOMBRE = new javax.swing.JTextField();
        CheckBox_NOMBRE = new javax.swing.JCheckBox();
        Text_DNI = new javax.swing.JTextField();
        CheckBox_DNI = new javax.swing.JCheckBox();
        Inactivo = new javax.swing.JRadioButton();
        Activo = new javax.swing.JRadioButton();
        CheckBox_CONDICION = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CheckBox_Agr_ADMIN = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 6));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jButton4.setText("Eliminar Alumno");
        jButton4.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        CheckBox_ELIMINAR.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        CheckBox_ELIMINAR.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox_ELIMINAR.setText("Eliminar");
        CheckBox_ELIMINAR.setOpaque(false);
        CheckBox_ELIMINAR.setPreferredSize(new java.awt.Dimension(81, 20));
        CheckBox_ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_ELIMINARActionPerformed(evt);
            }
        });

        LogIN_inactivo.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        LogIN_inactivo.setForeground(new java.awt.Color(255, 255, 255));
        LogIN_inactivo.setText("Inactivo");
        LogIN_inactivo.setOpaque(false);
        LogIN_inactivo.setPreferredSize(new java.awt.Dimension(81, 20));

        logIN_activo.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        logIN_activo.setForeground(new java.awt.Color(255, 255, 255));
        logIN_activo.setText("Activo");
        logIN_activo.setOpaque(false);
        logIN_activo.setPreferredSize(new java.awt.Dimension(71, 20));

        CheckBox_LOGIN.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        CheckBox_LOGIN.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox_LOGIN.setText("LogIN");
        CheckBox_LOGIN.setOpaque(false);
        CheckBox_LOGIN.setPreferredSize(new java.awt.Dimension(67, 20));
        CheckBox_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_LOGINActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jButton3.setText("Restablecer Contraseña");
        jButton3.setPreferredSize(new java.awt.Dimension(205, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        CheckBox_CLAVE.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        CheckBox_CLAVE.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox_CLAVE.setText("Clave");
        CheckBox_CLAVE.setOpaque(false);
        CheckBox_CLAVE.setPreferredSize(new java.awt.Dimension(63, 20));
        CheckBox_CLAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_CLAVEActionPerformed(evt);
            }
        });

        jDC_nF.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jDC_nF.setOpaque(false);
        jDC_nF.setPreferredSize(new java.awt.Dimension(87, 25));

        CheckBox_FECHA_NAC.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        CheckBox_FECHA_NAC.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox_FECHA_NAC.setText("Fecha Nacimiento");
        CheckBox_FECHA_NAC.setOpaque(false);
        CheckBox_FECHA_NAC.setPreferredSize(new java.awt.Dimension(151, 20));
        CheckBox_FECHA_NAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_FECHA_NACActionPerformed(evt);
            }
        });

        jS_nA.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jS_nA.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));
        jS_nA.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 6));
        jS_nA.setPreferredSize(new java.awt.Dimension(33, 25));

        CheckBox_ANIO.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        CheckBox_ANIO.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox_ANIO.setText("Año");
        CheckBox_ANIO.setOpaque(false);
        CheckBox_ANIO.setPreferredSize(new java.awt.Dimension(53, 20));
        CheckBox_ANIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_ANIOActionPerformed(evt);
            }
        });

        Text_APELLIDO.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        Text_APELLIDO.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 6, 0, 0));
        Text_APELLIDO.setPreferredSize(new java.awt.Dimension(77, 25));

        CheckBox_APELLIDO.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        CheckBox_APELLIDO.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox_APELLIDO.setText("Apellido");
        CheckBox_APELLIDO.setOpaque(false);
        CheckBox_APELLIDO.setPreferredSize(new java.awt.Dimension(79, 20));
        CheckBox_APELLIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_APELLIDOActionPerformed(evt);
            }
        });

        Text_NOMBRE.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        Text_NOMBRE.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 6, 0, 0));
        Text_NOMBRE.setPreferredSize(new java.awt.Dimension(74, 25));

        CheckBox_NOMBRE.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        CheckBox_NOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox_NOMBRE.setText("Nombre");
        CheckBox_NOMBRE.setOpaque(false);
        CheckBox_NOMBRE.setPreferredSize(new java.awt.Dimension(83, 20));
        CheckBox_NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_NOMBREActionPerformed(evt);
            }
        });

        Text_DNI.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        Text_DNI.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 6, 0, 0));
        Text_DNI.setPreferredSize(new java.awt.Dimension(32, 25));

        CheckBox_DNI.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        CheckBox_DNI.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox_DNI.setText("DNI");
        CheckBox_DNI.setOpaque(false);
        CheckBox_DNI.setPreferredSize(new java.awt.Dimension(51, 20));
        CheckBox_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_DNIActionPerformed(evt);
            }
        });

        Inactivo.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        Inactivo.setForeground(new java.awt.Color(255, 255, 255));
        Inactivo.setText("Inactivo");
        Inactivo.setOpaque(false);
        Inactivo.setPreferredSize(new java.awt.Dimension(81, 20));

        Activo.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        Activo.setForeground(new java.awt.Color(255, 255, 255));
        Activo.setText("Activo");
        Activo.setOpaque(false);
        Activo.setPreferredSize(new java.awt.Dimension(71, 20));
        Activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivoActionPerformed(evt);
            }
        });

        CheckBox_CONDICION.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        CheckBox_CONDICION.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox_CONDICION.setText("Condicion");
        CheckBox_CONDICION.setOpaque(false);
        CheckBox_CONDICION.setPreferredSize(new java.awt.Dimension(95, 20));
        CheckBox_CONDICION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_CONDICIONActionPerformed(evt);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        CheckBox_Agr_ADMIN.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        CheckBox_Agr_ADMIN.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox_Agr_ADMIN.setText("Agregar Administradores");
        CheckBox_Agr_ADMIN.setOpaque(false);
        CheckBox_Agr_ADMIN.setPreferredSize(new java.awt.Dimension(205, 25));
        CheckBox_Agr_ADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_Agr_ADMINActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 6, 0, 0));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(79, 25));

        jLabel5.setBackground(new java.awt.Color(255, 51, 102));
        jLabel5.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MODIFICAR ALUMNO");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CheckBox_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Text_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)
                                    .addComponent(Inactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jTextField4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CheckBox_Agr_ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CheckBox_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Text_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(logIN_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(LogIN_inactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(CheckBox_ANIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Text_APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDC_nF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CheckBox_FECHA_NAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CheckBox_APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(144, 144, 144))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jS_nA, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(114, 114, 114)
                                        .addComponent(jButton2))
                                    .addComponent(CheckBox_CONDICION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckBox_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CheckBox_ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CheckBox_CLAVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckBox_Agr_ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBox_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(CheckBox_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckBox_CONDICION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Inactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Text_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(CheckBox_APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBox_CLAVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(CheckBox_FECHA_NAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDC_nF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CheckBox_ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logIN_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LogIN_inactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckBox_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(CheckBox_ANIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jS_nA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void CheckBox_CONDICIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_CONDICIONActionPerformed
        if (CheckBox_CONDICION.isSelected()) {
            Activo.setEnabled(true);
            Inactivo.setEnabled(true);
        } else if (!CheckBox_CONDICION.isSelected()) {
            Activo.setEnabled(false);
            Inactivo.setEnabled(false);
            if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("true")) {
                Activo.setSelected(true);
                Inactivo.setSelected(false);
            } else if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("false")) {
                Inactivo.setSelected(true);
                Activo.setSelected(false);
            }
        }
    }//GEN-LAST:event_CheckBox_CONDICIONActionPerformed

    private void CheckBox_ANIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_ANIOActionPerformed
        if (CheckBox_ANIO.isSelected()) {
            jS_nA.setEnabled(true);
        } else if (!CheckBox_ANIO.isSelected()) {
            jS_nA.setEnabled(false);
        }
        jS_nA.setValue(anio);

    }//GEN-LAST:event_CheckBox_ANIOActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CheckBox_APELLIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_APELLIDOActionPerformed
        if (CheckBox_APELLIDO.isSelected()) {
            Text_APELLIDO.setEnabled(true);
        } else {
            Text_APELLIDO.setText(apellido);
            Text_APELLIDO.setEnabled(false);
        }
    }//GEN-LAST:event_CheckBox_APELLIDOActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        dni = Integer.parseInt(Text_DNI.getText());
        nombre = Text_NOMBRE.getText();
        apellido = Text_APELLIDO.getText();
        estado = ((Activo.isSelected()) ? true : false);
        fechaNacimiento = jDC_nF.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        anio = (int) jS_nA.getValue();

        alumno = new Alumno(idAlumno_Mod, dni, apellido, nombre, fechaNacimiento, estado, anio, 1);
        aD.modificarDataAlumno(alumno);

        int data = 0;
        if (LogIN_inactivo.isSelected()) {
            data = 1;
        }
        logD.activarUsuarioLogIN(data, dni);

        borrarFila();
        llenarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CheckBox_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_NOMBREActionPerformed
        if (CheckBox_NOMBRE.isSelected())
            Text_NOMBRE.setEnabled(true);
        else {
            Text_NOMBRE.setText(nombre);
            Text_NOMBRE.setEnabled(false);
        }
    }//GEN-LAST:event_CheckBox_NOMBREActionPerformed

    private void CheckBox_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_LOGINActionPerformed
        if (CheckBox_LOGIN.isSelected()) {
            LogIN_inactivo.setEnabled(true);
            logIN_activo.setEnabled(true);
        } else if (!CheckBox_LOGIN.isSelected()) {
            LogIN_inactivo.setEnabled(false);
            logIN_activo.setEnabled(false);
            if (logD.reactivarLogINusuario(aD.buscarAlumno(Integer.toString(idAlumno_Mod), "ID ALUMNO", null).get(0).getDni()) == 1) {
                logIN_activo.setSelected(false);
                LogIN_inactivo.setSelected(true);
            } else if (logD.reactivarLogINusuario(aD.buscarAlumno(Integer.toString(idAlumno_Mod), "ID ALUMNO", null).get(0).getDni()) == 0) {
                logIN_activo.setSelected(true);
                LogIN_inactivo.setSelected(false);
            }
        }
    }//GEN-LAST:event_CheckBox_LOGINActionPerformed

    private void ActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActivoActionPerformed

    private void CheckBox_CLAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_CLAVEActionPerformed
        if (CheckBox_CLAVE.isSelected()) {
            jButton3.setEnabled(true);
        } else {
            jButton3.setEnabled(false);
        }


    }//GEN-LAST:event_CheckBox_CLAVEActionPerformed

    private void CheckBox_ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_ELIMINARActionPerformed
        if (CheckBox_ELIMINAR.isSelected()) {
            jButton4.setEnabled(true);
        } else
            jButton4.setEnabled(false);
    }//GEN-LAST:event_CheckBox_ELIMINARActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ValidarClaveADM vcADM = new ValidarClaveADM(usuario, idAlumno_Mod, "clave", logD, aD, mD, iD);
        vcADM.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CheckBox_FECHA_NACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_FECHA_NACActionPerformed
        if (CheckBox_FECHA_NAC.isSelected()) {
            jDC_nF.setEnabled(true);
        } else if (!CheckBox_FECHA_NAC.isSelected()) {
            jDC_nF.setEnabled(false);
        }
    }//GEN-LAST:event_CheckBox_FECHA_NACActionPerformed


    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        CheckBox_CONDICION.setEnabled(true);
        CheckBox_DNI.setEnabled(true);
        CheckBox_APELLIDO.setEnabled(true);
        CheckBox_NOMBRE.setEnabled(true);
        CheckBox_ANIO.setEnabled(true);
        CheckBox_FECHA_NAC.setEnabled(true);
        CheckBox_ELIMINAR.setEnabled(true);
        CheckBox_CLAVE.setEnabled(true);
        CheckBox_LOGIN.setEnabled(true);

        filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada >= 0) {
            idAlumno_Mod = (int) jTable1.getValueAt(filaSeleccionada, 0);
        }
        // Cargo en los cuadros los datos la tabla en los campos

        if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("true")) {
            Activo.setSelected(true);
            Inactivo.setSelected(false);
        } else if ((jTable1.getValueAt(filaSeleccionada, 6)).toString().equals("false")) {
            Inactivo.setSelected(true);
            Activo.setSelected(false);
        }

        if (logD.reactivarLogINusuario(aD.buscarAlumno(Integer.toString(idAlumno_Mod), "ID ALUMNO", null).get(0).getDni()) == 1) {
            logIN_activo.setSelected(false);
            LogIN_inactivo.setSelected(true);
        } else if (logD.reactivarLogINusuario(aD.buscarAlumno(Integer.toString(idAlumno_Mod), "ID ALUMNO", null).get(0).getDni()) == 0) {
            logIN_activo.setSelected(true);
            LogIN_inactivo.setSelected(false);
        }

        Text_APELLIDO.setText((jTable1.getValueAt(filaSeleccionada, 1)).toString());
        Text_NOMBRE.setText((jTable1.getValueAt(filaSeleccionada, 2)).toString());
        Text_DNI.setText((jTable1.getValueAt(filaSeleccionada, 3)).toString());
        jS_nA.setValue(jTable1.getValueAt(filaSeleccionada, 5));
        jDC_nF.setDate(java.sql.Date.valueOf((LocalDate) jTable1.getValueAt(filaSeleccionada, 4)));

        
        apellido = jTable1.getValueAt(filaSeleccionada, 1).toString();
        nombre = jTable1.getValueAt(filaSeleccionada, 2).toString();
        anio = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 5).toString());
        dni = Integer.parseInt((jTable1.getValueAt(filaSeleccionada, 3)).toString());
        fechaNacimiento = (LocalDate) (jTable1.getValueAt(filaSeleccionada, 4));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        borrarFila();
        llenarTabla();
    }//GEN-LAST:event_jTextField4KeyReleased

    private void CheckBox_Agr_ADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_Agr_ADMINActionPerformed
        if (CheckBox_Agr_ADMIN.isSelected()) {
            filtroBusqueda = 1;
        } else if (!CheckBox_Agr_ADMIN.isSelected()) {
            filtroBusqueda = 0;
        }
        borrarFila();
    }//GEN-LAST:event_CheckBox_Agr_ADMINActionPerformed

    private void CheckBox_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_DNIActionPerformed
        if (CheckBox_DNI.isSelected()) {
            Text_DNI.setEnabled(true);
        } else {
            Text_DNI.setText(Integer.toString(dni));
            Text_DNI.setEnabled(false);
        }
    }//GEN-LAST:event_CheckBox_DNIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Activo;
    private javax.swing.JCheckBox CheckBox_ANIO;
    private javax.swing.JCheckBox CheckBox_APELLIDO;
    private javax.swing.JCheckBox CheckBox_Agr_ADMIN;
    private javax.swing.JCheckBox CheckBox_CLAVE;
    private javax.swing.JCheckBox CheckBox_CONDICION;
    private javax.swing.JCheckBox CheckBox_DNI;
    private javax.swing.JCheckBox CheckBox_ELIMINAR;
    private javax.swing.JCheckBox CheckBox_FECHA_NAC;
    private javax.swing.JCheckBox CheckBox_LOGIN;
    private javax.swing.JCheckBox CheckBox_NOMBRE;
    private javax.swing.JRadioButton Inactivo;
    private javax.swing.JRadioButton LogIN_inactivo;
    private javax.swing.JTextField Text_APELLIDO;
    private javax.swing.JTextField Text_DNI;
    private javax.swing.JTextField Text_NOMBRE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDC_nF;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jS_nA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton logIN_activo;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private void armarCabecera() {
        modelo.setColumnCount(0);
        modelo.addColumn("iD Alumno");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("F.Nac");
        modelo.addColumn("Año");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);
        jTable1.getTableHeader().setReorderingAllowed(false);
    }

    private void borrarFila() {
        int filas = jTable1.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void armadoVista() {
        String[] lista = {"ID ALUMNO", "APELLIDO", "NOMBRE", "DNI"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(lista);
        jComboBox1.setModel(model);
        CheckBox_ELIMINAR.setEnabled(false);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(Activo);
        buttonGroup.add(Inactivo);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(LogIN_inactivo);
        buttonGroup2.add(logIN_activo);

        Activo.setEnabled(false);
        Inactivo.setEnabled(false);

        Text_APELLIDO.setEnabled(false);
        Text_APELLIDO.setEnabled(false);

        Text_NOMBRE.setEnabled(false);
        Text_NOMBRE.setEnabled(false);

        Text_DNI.setEnabled(false);
        Text_DNI.setEnabled(false);

        jS_nA.setEnabled(false);
        jDC_nF.setEnabled(false);

        CheckBox_CONDICION.setEnabled(false);
        CheckBox_DNI.setEnabled(false);
        CheckBox_APELLIDO.setEnabled(false);
        CheckBox_NOMBRE.setEnabled(false);
        CheckBox_ANIO.setEnabled(false);
        CheckBox_FECHA_NAC.setEnabled(false);
        jButton3.setEnabled(false);
        CheckBox_CLAVE.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton3.setEnabled(false);
        CheckBox_LOGIN.setEnabled(false);
        LogIN_inactivo.setEnabled(false);
        logIN_activo.setEnabled(false);
    }

    private void llenarTabla() {
        for (Alumno a1 : aD.buscarAlumno(jTextField4.getText(), jComboBox1.getSelectedItem().toString(), null)) {
            if (filtroBusqueda == 0) {
                if (a1.getCategoria() == 1) {
                    modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.getAnio(), a1.isEstado()});
                }
            } else if (filtroBusqueda == 1) {
                modelo.addRow(new Object[]{a1.getIdAlumno(), a1.getApellido(), a1.getNombre(), a1.getDni(), a1.getFechaNacimiento(), a1.getAnio(), a1.isEstado()});
            }
        }
    }
}
