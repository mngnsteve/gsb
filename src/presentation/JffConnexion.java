/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import accesBDD.PraticienMySQL;
import accesBDD.VisiteurMySQL;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import metier.Praticien;
import metier.Visiteur;

/**
 *
 * @author mohamed.boussemaha
 */
public class JffConnexion extends javax.swing.JFrame {
    
    private Praticien lePraticien;
    private Visiteur leVisiteur;
    private int typeUtilisateur = 0;
    private PraticienMySQL praticiens = new PraticienMySQL();
    private VisiteurMySQL visiteurs = new VisiteurMySQL();
    /**
     * Creates new form JffConnexion
     */
    public JffConnexion() {
        initComponents();
        // MISE EN PLACE D'UN FOND BLANC
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        // Ajout des groupes bouton praticien et visiteur
        ButtonGroup g = new ButtonGroup();
        g.add(jRBPraticien);
        g.add(jRBVisiteur);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtValider = new javax.swing.JButton();
        jBtQuitter = new javax.swing.JButton();
        jLAuthentification = new javax.swing.JLabel();
        jLMail = new javax.swing.JLabel();
        jLMdp = new javax.swing.JLabel();
        jTFMail = new javax.swing.JTextField();
        jPFMdp = new javax.swing.JPasswordField();
        jRBPraticien = new javax.swing.JRadioButton();
        jRBVisiteur = new javax.swing.JRadioButton();
        jLlogo = new javax.swing.JLabel();
        jLFond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connexion");
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(530, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(570, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/valider.png"))); // NOI18N
        jBtValider.setText("Valider");
        jBtValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtValiderActionPerformed(evt);
            }
        });
        getContentPane().add(jBtValider, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jBtQuitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quitter.png"))); // NOI18N
        jBtQuitter.setText("Quitter");
        jBtQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtQuitterActionPerformed(evt);
            }
        });
        getContentPane().add(jBtQuitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jLAuthentification.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLAuthentification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ecran.png"))); // NOI18N
        jLAuthentification.setText("Authentification");
        getContentPane().add(jLAuthentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/utilisateur.png"))); // NOI18N
        jLMail.setText("Identifiant :");
        getContentPane().add(jLMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLMdp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key.png"))); // NOI18N
        jLMdp.setText("Mot de passe :");
        getContentPane().add(jLMdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jTFMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFMailKeyPressed(evt);
            }
        });
        getContentPane().add(jTFMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 200, -1));

        jPFMdp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPFMdpKeyPressed(evt);
            }
        });
        getContentPane().add(jPFMdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 200, -1));

        jRBPraticien.setText("Praticien");
        jRBPraticien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPraticienActionPerformed(evt);
            }
        });
        getContentPane().add(jRBPraticien, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jRBVisiteur.setText("Visiteur");
        jRBVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBVisiteurActionPerformed(evt);
            }
        });
        getContentPane().add(jRBVisiteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoGSB.jpg"))); // NOI18N
        getContentPane().add(jLlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 120, 78));

        jLFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondClair.png"))); // NOI18N
        getContentPane().add(jLFond, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 435, 222));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtValiderActionPerformed
        String identifiant = jTFMail.getText();
        String mdp = String.valueOf(jPFMdp.getPassword());
        Icon icone;
        
        String[] connexion;
        
        switch (this.typeUtilisateur) {
            case 1:
                connexion = praticiens.rechercherPraticien(identifiant, mdp);
                System.out.println("1");
                System.out.println(this.typeUtilisateur);
                break;
            case 2:
                connexion = visiteurs.rechercherVisiteur(identifiant, mdp);
                System.out.println("2");
                System.out.println(this.typeUtilisateur);
                break;
            default:
                connexion = null;
                System.out.println("0");
                System.out.println(this.typeUtilisateur);
                break;
        }
        
        if (connexion[0] != null) {
            System.out.println("Valide");
            icone = new javax.swing.ImageIcon(getClass().getResource("/images/valider.png"));
            JOptionPane.showMessageDialog(null, "Authentification réussie !", "Résultat d'authentification", JOptionPane.OK_OPTION, icone);
            JffMedicament catalogue = new JffMedicament(connexion, this.typeUtilisateur);
            catalogue.setVisible(true);
            dispose();
        } else {
            System.out.println("Invalide");
            icone = new javax.swing.ImageIcon(getClass().getResource("/images/quitter.png"));
            JOptionPane.showMessageDialog(null, "Erreur d'authentification, vérifiez vos identifiants !", "Résultat d'authentification", ERROR_MESSAGE, icone);
        }
    }//GEN-LAST:event_jBtValiderActionPerformed

    private void jBtQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtQuitterActionPerformed

    private void jRBPraticienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPraticienActionPerformed
        jRBPraticien.setSelected(true);
        this.typeUtilisateur = 1;
    }//GEN-LAST:event_jRBPraticienActionPerformed

    private void jRBVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBVisiteurActionPerformed
        jRBVisiteur.setSelected(true);
        this.typeUtilisateur = 2;
    }//GEN-LAST:event_jRBVisiteurActionPerformed

    private void jPFMdpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFMdpKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            
            jBtValider.doClick();
        }
    }//GEN-LAST:event_jPFMdpKeyPressed

    private void jTFMailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMailKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            
            jPFMdp.requestFocus();
        }
    }//GEN-LAST:event_jTFMailKeyPressed

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
    private javax.swing.JRadioButton jRBPraticien;
    private javax.swing.JRadioButton jRBVisiteur;
    private javax.swing.JTextField jTFMail;
    // End of variables declaration//GEN-END:variables
}
