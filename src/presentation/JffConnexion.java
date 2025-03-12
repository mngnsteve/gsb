/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

/**
 *
 * @author mohamed.boussemaha
 */
public class JffConnexion extends javax.swing.JFrame {

    /**
     * Creates new form JffConnexion
     */
    public JffConnexion() {
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

        jPFMdp = new javax.swing.JPasswordField();
        jBtValider = new javax.swing.JButton();
        jBtQuitter = new javax.swing.JButton();
        jLAuthentification = new javax.swing.JLabel();
        jLMail = new javax.swing.JLabel();
        jLMdp = new javax.swing.JLabel();
        jTMail = new javax.swing.JTextField();
        jLFond = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLlogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPFMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFMdpActionPerformed(evt);
            }
        });
        getContentPane().add(jPFMdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 200, -1));

        jBtValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/valider.png"))); // NOI18N
        jBtValider.setText("Valider");
        jBtValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtValiderActionPerformed(evt);
            }
        });
        getContentPane().add(jBtValider, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        jBtQuitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quitter.png"))); // NOI18N
        jBtQuitter.setText("Quitter");
        jBtQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtQuitterActionPerformed(evt);
            }
        });
        getContentPane().add(jBtQuitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        jLAuthentification.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLAuthentification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ecran.png"))); // NOI18N
        jLAuthentification.setText("Authentification");
        getContentPane().add(jLAuthentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/utilisateur.png"))); // NOI18N
        jLMail.setText("Adresse mail");
        getContentPane().add(jLMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLMdp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key.png"))); // NOI18N
        jLMdp.setText("Mot de passe");
        getContentPane().add(jLMdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));
        getContentPane().add(jTMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 200, -1));

        jLFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondClair.png"))); // NOI18N
        getContentPane().add(jLFond, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 435, 220));

        jRadioButton1.setText("Praticien");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jRadioButton2.setText("Laborantin");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));
        getContentPane().add(jLlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 130, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPFMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFMdpActionPerformed

    }//GEN-LAST:event_jPFMdpActionPerformed

    private void jBtValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtValiderActionPerformed
       
    }//GEN-LAST:event_jBtValiderActionPerformed

    private void jBtQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtQuitterActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JffConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JffConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JffConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JffConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JffConnexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtQuitter;
    private javax.swing.JButton jBtValider;
    private javax.swing.JLabel jLAuthentification;
    private javax.swing.JLabel jLFond;
    private javax.swing.JLabel jLMail;
    private javax.swing.JLabel jLMdp;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JPasswordField jPFMdp;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTMail;
    // End of variables declaration//GEN-END:variables
}
