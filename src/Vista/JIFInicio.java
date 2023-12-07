package Vista;

public class JIFInicio extends javax.swing.JInternalFrame {

    public JIFInicio() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mensaje = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPendientes = new javax.swing.JButton();
        btnRealizados = new javax.swing.JButton();
        Fondolb = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mensaje.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Le brindamos un cordial saludo a la nueva");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("¡Bienvenid@ Usuario!");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel3.setText("Aqui encontraras multiples opciones para");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel4.setText("era de matriculacion en linea.");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel5.setText("poder facilitar tus matriculas y otros en");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel6.setText("el \"Colegio Hispanoamericano Trini\" :D");

        javax.swing.GroupLayout MensajeLayout = new javax.swing.GroupLayout(Mensaje);
        Mensaje.setLayout(MensajeLayout);
        MensajeLayout.setHorizontalGroup(
            MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        MensajeLayout.setVerticalGroup(
            MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        getContentPane().add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 530, 470));

        btnPendientes.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnPendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/cheque.png"))); // NOI18N
        btnPendientes.setText("Realizados");
        btnPendientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(255, 255, 255)));
        btnPendientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(btnPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 140, 50));

        btnRealizados.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnRealizados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/reloj.png"))); // NOI18N
        btnRealizados.setText("Pendientes");
        btnRealizados.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(255, 255, 255)));
        btnRealizados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(btnRealizados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 140, 50));

        Fondolb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Fondo.png"))); // NOI18N
        getContentPane().add(Fondolb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondolb;
    private javax.swing.JPanel Mensaje;
    private javax.swing.JButton btnPendientes;
    private javax.swing.JButton btnRealizados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}