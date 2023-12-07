package Vista;
import Controlador.*;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setSize(new Dimension(1070, 680));
        this.setLocationRelativeTo(null);
    }
    
    void MostrarEnEscritorio(JInternalFrame internal){
       this.escritorio.removeAll();
       this.escritorio.repaint();
       this.escritorio.add(internal);
       internal.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAyuda = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnMatricula = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnMensajeria = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Mini_Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 170));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        btnAyuda.setBackground(new java.awt.Color(102, 102, 255));
        btnAyuda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAyuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/3rayas.png"))); // NOI18N
        btnAyuda.setText("Ayuda");
        btnAyuda.setBorder(null);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("2023");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Perfil.png"))); // NOI18N
        jLabel2.setText("@Usuario");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 860, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnInicio.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Inicio.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(255, 255, 255)));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setIconTextGap(10);
        btnInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Home36.png"))); // NOI18N
        btnInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Home36.png"))); // NOI18N
        btnInicio.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Home36.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnMatricula.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        btnMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/documento.png"))); // NOI18N
        btnMatricula.setText("Documentos");
        btnMatricula.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(255, 255, 255)));
        btnMatricula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMatricula.setIconTextGap(10);
        btnMatricula.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/documento32.png"))); // NOI18N
        btnMatricula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/documento32.png"))); // NOI18N
        btnMatricula.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/documento32.png"))); // NOI18N
        btnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculaActionPerformed(evt);
            }
        });

        btnPagos.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        btnPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Moneda.png"))); // NOI18N
        btnPagos.setText("Pagos");
        btnPagos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(255, 255, 255)));
        btnPagos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPagos.setIconTextGap(10);
        btnPagos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moneda32.png"))); // NOI18N
        btnPagos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moneda32.png"))); // NOI18N
        btnPagos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moneda32.png"))); // NOI18N
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });

        btnMensajeria.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        btnMensajeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Mensaje.png"))); // NOI18N
        btnMensajeria.setText("Mensajería");
        btnMensajeria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(255, 255, 255)));
        btnMensajeria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMensajeria.setIconTextGap(10);
        btnMensajeria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/mensajes32.png"))); // NOI18N
        btnMensajeria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/mensajes32.png"))); // NOI18N
        btnMensajeria.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/mensajes32.png"))); // NOI18N
        btnMensajeria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/mensajes32.png"))); // NOI18N
        btnMensajeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensajeriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .addComponent(btnPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMensajeria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMensajeria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 520));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Colegio Hipanoamericano Trini");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel4)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 860, 60));

        escritorio.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 860, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        JIFInicio fi =  new JIFInicio();
        this.MostrarEnEscritorio(fi);
        ControladorInicio ini = new ControladorInicio(fi);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaActionPerformed
        JIFMatricula fm =  new JIFMatricula();
        this.MostrarEnEscritorio(fm);
        ControladorMatricula ma = new ControladorMatricula(fm);
    }//GEN-LAST:event_btnMatriculaActionPerformed

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
        JIFPago fp =  new JIFPago();
        this.MostrarEnEscritorio(fp);
        ControladorPagos p = new ControladorPagos(fp); 
    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnMensajeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensajeriaActionPerformed
        JIFMensajeria fm =  new JIFMensajeria();
        this.MostrarEnEscritorio(fm);
        ControladorMensajeria me = new ControladorMensajeria(fm);
    }//GEN-LAST:event_btnMensajeriaActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JIFAyuda fa =  new JIFAyuda();
        this.MostrarEnEscritorio(fa);
        ControladorAyuda a = new ControladorAyuda(fa);
    }//GEN-LAST:event_btnAyudaActionPerformed
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAyuda;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnMatricula;
    public javax.swing.JButton btnMensajeria;
    public javax.swing.JButton btnPagos;
    public javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}