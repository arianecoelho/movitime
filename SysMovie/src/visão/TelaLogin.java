/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author lidxa
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldUsuário = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuário = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jButtonAcessar = new javax.swing.JButton();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(120, 330, 250, 30);

        jTextFieldUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuárioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuário);
        jTextFieldUsuário.setBounds(120, 300, 250, 30);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(60, 330, 60, 20);

        jLabelUsuário.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabelUsuário.setText("Usuário:");
        getContentPane().add(jLabelUsuário);
        jLabelUsuário.setBounds(50, 300, 63, 19);

        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(310, 390, 60, 30);

        jButtonAcessar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(230, 390, 77, 30);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MOVIe_time.png"))); // NOI18N
        jLabelFundoLogin.setText("Usuário");
        jLabelFundoLogin.setFocusCycleRoot(true);
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, -10, 500, 510);

        setBounds(0, 0, 514, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuárioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuárioActionPerformed

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        if(jTextFieldUsuário.getText().equals("")&&jPasswordFieldSenha.getText().equals("")){
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
         JOptionPane.showMessageDialog(null, "Seja Bem Vindo","Inicio",JOptionPane.ERROR_MESSAGE,new ImageIcon("C:\\Users\\ariani\\Documents\\NetBeansProjects\\SysMovie\\SysMovie\\src\\imagens\\oculosd.png"));
        } else {
            JOptionPane.showMessageDialog(this,"Senha ou Usuário Invalidos!");
        }
    
        
        
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuário;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuário;
    // End of variables declaration//GEN-END:variables

    private static class JavaApplication1 {

       
    }
}
