/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Tiago
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barra = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        bcadastrarnovo = new javax.swing.JButton();
        bentrar1 = new javax.swing.JButton();
        EntraLogin = new javax.swing.JTextField();
        brecuperarsenha = new javax.swing.JButton();
        barraLogin = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/Agrupar 5.png"))); // NOI18N

        Login.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Login.setForeground(new java.awt.Color(204, 255, 204));
        Login.setText("Login");
        Login.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        bcadastrarnovo.setBackground(new java.awt.Color(0, 0, 0));
        bcadastrarnovo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bcadastrarnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/Cadastrar.png"))); // NOI18N
        bcadastrarnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcadastrarnovoActionPerformed(evt);
            }
        });

        bentrar1.setBackground(new java.awt.Color(0, 0, 0));
        bentrar1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bentrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/Agrupar 1.png"))); // NOI18N
        bentrar1.setAutoscrolls(true);
        bentrar1.setBorderPainted(false);
        bentrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bentrar1ActionPerformed(evt);
            }
        });

        EntraLogin.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        EntraLogin.setForeground(new java.awt.Color(255, 204, 204));
        EntraLogin.setText("CNPJ/CPF");
        EntraLogin.setToolTipText("");
        EntraLogin.setSelectedTextColor(new java.awt.Color(255, 204, 204));
        EntraLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntraLoginActionPerformed(evt);
            }
        });

        brecuperarsenha.setBackground(new java.awt.Color(0, 0, 0));
        brecuperarsenha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        brecuperarsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/Recuperar senha.png"))); // NOI18N
        brecuperarsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brecuperarsenhaActionPerformed(evt);
            }
        });

        barraLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/Retângulo 2.png"))); // NOI18N

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/background login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 1930, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(830, 830, 830)
                .addComponent(brecuperarsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(barraLogin))
            .addGroup(layout.createSequentialGroup()
                .addGap(770, 770, 770)
                .addComponent(EntraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(660, 660, 660)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1650, 1650, 1650)
                .addComponent(bcadastrarnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1180, 1180, 1180)
                .addComponent(bentrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Fundo))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(790, 790, 790)
                .addComponent(brecuperarsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(barraLogin))
            .addGroup(layout.createSequentialGroup()
                .addGap(730, 730, 730)
                .addComponent(EntraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(bcadastrarnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(730, 730, 730)
                .addComponent(bentrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Fundo)
        );

        setBounds(0, 0, 1968, 1440);
    }// </editor-fold>//GEN-END:initComponents

    private void EntraLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntraLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntraLoginActionPerformed

    private void brecuperarsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brecuperarsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brecuperarsenhaActionPerformed

    private void bentrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bentrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bentrar1ActionPerformed

    private void bcadastrarnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcadastrarnovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcadastrarnovoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Barra;
    private javax.swing.JTextField EntraLogin;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel barraLogin;
    private javax.swing.JButton bcadastrarnovo;
    private javax.swing.JButton bentrar1;
    private javax.swing.JButton brecuperarsenha;
    // End of variables declaration//GEN-END:variables
}