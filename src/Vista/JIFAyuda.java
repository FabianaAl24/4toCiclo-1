package Vista;

public class JIFAyuda extends javax.swing.JInternalFrame {
    
    public JIFAyuda() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mensaje = new javax.swing.JPanel();
        pnPdf = new javax.swing.JPanel();
        btnPDF = new javax.swing.JButton();
        btnZoom = new javax.swing.JButton();
        btnVideo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fondolb = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mensaje.setBackground(new java.awt.Color(255, 255, 255));

        pnPdf.setBackground(new java.awt.Color(255, 255, 255));
        pnPdf.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/pdf.png"))); // NOI18N
        btnPDF.setBorder(null);
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        btnZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/zoom.png"))); // NOI18N
        btnZoom.setBorder(null);
        btnZoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomActionPerformed(evt);
            }
        });

        btnVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/video.png"))); // NOI18N
        btnVideo.setBorder(null);
        btnVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVideoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setText("Orientacion...................................");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel3.setText("¿Como usar el software?..................");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel4.setText("Video Tutoriales.............................");

        javax.swing.GroupLayout pnPdfLayout = new javax.swing.GroupLayout(pnPdf);
        pnPdf.setLayout(pnPdfLayout);
        pnPdfLayout.setHorizontalGroup(
            pnPdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPdfLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(pnPdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVideo)
                    .addGroup(pnPdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPdfLayout.createSequentialGroup()
                            .addComponent(btnPDF)
                            .addGap(23, 23, 23))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPdfLayout.createSequentialGroup()
                            .addComponent(btnZoom)
                            .addGap(47, 47, 47)))))
        );
        pnPdfLayout.setVerticalGroup(
            pnPdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPdfLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnPdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPDF)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(pnPdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(btnVideo))
                .addGap(64, 64, 64)
                .addGroup(pnPdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnZoom, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout MensajeLayout = new javax.swing.GroupLayout(Mensaje);
        Mensaje.setLayout(MensajeLayout);
        MensajeLayout.setHorizontalGroup(
            MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MensajeLayout.setVerticalGroup(
            MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MensajeLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(pnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 820, 430));

        Fondolb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Fondo.png"))); // NOI18N
        getContentPane().add(Fondolb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVideoActionPerformed
        
    }//GEN-LAST:event_btnVideoActionPerformed

    private void btnZoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomActionPerformed
        
    }//GEN-LAST:event_btnZoomActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondolb;
    private javax.swing.JPanel Mensaje;
    public javax.swing.JButton btnPDF;
    public javax.swing.JButton btnVideo;
    public javax.swing.JButton btnZoom;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnPdf;
    // End of variables declaration//GEN-END:variables
}