package Vista;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        FondoLogin = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Sep1 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        Pass = new javax.swing.JLabel();
        Sep2 = new javax.swing.JSeparator();
        btnIniciar = new javax.swing.JButton();
        psPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Logo.PNG"))); // NOI18N

        FondoLogin.setBackground(new java.awt.Color(0, 0, 0));

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Bienvenido a Institución Educativa");

        Usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Email");

        txtUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);

        Pass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        Pass.setText("Contraseña");

        btnIniciar.setBackground(new java.awt.Color(0, 0, 204));
        btnIniciar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar sesión");
        btnIniciar.setBorder(null);

        psPass.setBackground(new java.awt.Color(0, 0, 0));
        psPass.setForeground(new java.awt.Color(102, 102, 102));
        psPass.setText("********");
        psPass.setBorder(null);
        psPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLoginLayout = new javax.swing.GroupLayout(FondoLogin);
        FondoLogin.setLayout(FondoLoginLayout);
        FondoLoginLayout.setHorizontalGroup(
            FondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLoginLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(FondoLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Usuario)
                    .addComponent(Pass)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario)
                    .addComponent(Sep1)
                    .addComponent(Sep2)
                    .addComponent(psPass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLoginLayout.setVerticalGroup(
            FondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLoginLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(39, 39, 39)
                .addComponent(Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sep1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psPass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(FondoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Logo)
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void psPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psPassActionPerformed
    }//GEN-LAST:event_psPassActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel FondoLogin;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Pass;
    private javax.swing.JSeparator Sep1;
    private javax.swing.JSeparator Sep2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Usuario;
    public javax.swing.JButton btnIniciar;
    public javax.swing.JPasswordField psPass;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}