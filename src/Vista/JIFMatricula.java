package Vista;

import java.awt.Dimension;

public class JIFMatricula extends javax.swing.JInternalFrame {

    public JIFMatricula() {
        initComponents();
        initComponents();
        this.setSize(new Dimension(848, 533));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mensaje = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAlumno = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        cbxSeccion = new javax.swing.JComboBox<>();
        cbxGrado = new javax.swing.JComboBox<>();
        dcFecha = new com.toedter.calendar.JDateChooser();
        txtCodAlumno = new javax.swing.JTextField();
        cbxGenero = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        Fondolb = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mensaje.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("REGISTRO DE MATRICULA");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Alumno:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("DNI:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Genero:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Seccion:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Grado:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Codigo Estudiante:");

        txtAlumno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0)));

        txtDNI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0)));

        cbxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxSeccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white, java.awt.Color.white));

        cbxGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxGrado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white, java.awt.Color.white));

        txtCodAlumno.setBackground(new java.awt.Color(204, 204, 204));
        txtCodAlumno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.black, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0)));

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxGenero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white, java.awt.Color.white));

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbDatos);

        btnRegistrar.setBackground(new java.awt.Color(153, 102, 255));
        btnRegistrar.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnRegistrar.setText("Registro de Pago");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        btnImprimir.setBackground(new java.awt.Color(0, 0, 204));
        btnImprimir.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("IMPRIMIR");

        javax.swing.GroupLayout MensajeLayout = new javax.swing.GroupLayout(Mensaje);
        Mensaje.setLayout(MensajeLayout);
        MensajeLayout.setHorizontalGroup(
            MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeLayout.createSequentialGroup()
                .addGroup(MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MensajeLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel7))
                    .addGroup(MensajeLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MensajeLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MensajeLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(cbxSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(txtCodAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MensajeLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6)
                        .addGap(13, 13, 13)
                        .addComponent(cbxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MensajeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MensajeLayout.createSequentialGroup()
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
        MensajeLayout.setVerticalGroup(
            MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addGroup(MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbxSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MensajeLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MensajeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir)
                .addContainerGap())
        );

        getContentPane().add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 800, 480));

        Fondolb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Fondo.png"))); // NOI18N
        getContentPane().add(Fondolb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondolb;
    private javax.swing.JPanel Mensaje;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JComboBox<String> cbxGrado;
    private javax.swing.JComboBox<String> cbxSeccion;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtCodAlumno;
    private javax.swing.JTextField txtDNI;
    // End of variables declaration//GEN-END:variables
}
