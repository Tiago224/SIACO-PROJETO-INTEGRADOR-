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
public class TelaAcesso extends javax.swing.JFrame {

    /**
     * Creates new form TelaAcesso
     */
    public TelaAcesso() {
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
        bcomprador1 = new javax.swing.JButton();
        bfornecedor2 = new javax.swing.JButton();
        barraLogin = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Siaco v.1");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/Agrupar 5.png"))); // NOI18N
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 1930, 210));

        Login.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Login.setForeground(new java.awt.Color(204, 255, 204));
        Login.setText("Login");
        Login.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 720, 100, 80));

        bcadastrarnovo.setBackground(new java.awt.Color(0, 0, 0));
        bcadastrarnovo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bcadastrarnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/Cadastrar.png"))); // NOI18N
        bcadastrarnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcadastrarnovoActionPerformed(evt);
            }
        });
        getContentPane().add(bcadastrarnovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 70, 200, 50));

        bcomprador1.setBackground(new java.awt.Color(0, 0, 0));
        bcomprador1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bcomprador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/acesso/Grupo 66.png"))); // NOI18N
        bcomprador1.setAutoscrolls(true);
        bcomprador1.setBorderPainted(false);
        bcomprador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcomprador1ActionPerformed(evt);
            }
        });
        getContentPane().add(bcomprador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 742, 170, -1));

        bfornecedor2.setBackground(new java.awt.Color(0, 0, 0));
        bfornecedor2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bfornecedor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/acesso/Grupo 67.png"))); // NOI18N
        bfornecedor2.setAutoscrolls(true);
        bfornecedor2.setBorderPainted(false);
        bfornecedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfornecedor2ActionPerformed(evt);
            }
        });
        getContentPane().add(bfornecedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 740, 160, 60));

        barraLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/Retângulo 2.png"))); // NOI18N
        getContentPane().add(barraLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, -1, -1));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/background login.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        setSize(new java.awt.Dimension(1959, 1420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bcadastrarnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcadastrarnovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcadastrarnovoActionPerformed

    private void bfornecedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfornecedor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bfornecedor2ActionPerformed

    private void bcomprador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcomprador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcomprador1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAcesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Barra;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel barraLogin;
    private javax.swing.JButton bcadastrarnovo;
    private javax.swing.JButton bcomprador1;
    private javax.swing.JButton bfornecedor2;
    // End of variables declaration//GEN-END:variables
}
