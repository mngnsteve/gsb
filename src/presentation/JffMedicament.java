/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import accesBDD.AvisMySQL;
import accesBDD.MedicamentMySQL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import metier.Catalogue;
import metier.Medicament;

/**
 *
 * @author mohamed.boussemaha
 */
public class JffMedicament extends javax.swing.JFrame {        
    
    private Catalogue catalogue;
    /**
     * Creates new form JffMedicament
     */
    public JffMedicament() {
        // fond blanc
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        initComponents();
        catalogue = new Catalogue();
        initialiserTableauMedicaments();
    }
    
    private void initialiserTableauMedicaments() {
    // Récupérer la liste des médicaments à partir du catalogue
    ArrayList<Medicament> medicaments = catalogue.getLesMedicaments();
    
    // Obtenir le modèle de tableau pour y ajouter les lignes
    DefaultTableModel model = (DefaultTableModel) jTableMedicament.getModel();
    
    // Vider le tableau avant de le remplir avec les nouveaux médicaments
    model.setRowCount(0);
    
    // Parcourir la liste des médicaments et ajouter chaque médicament dans le tableau
    for (Medicament medicament : medicaments) {
        model.addRow(new Object[] {
            medicament.getType(),    // Type
            medicament.getNom(),     // Nom
            medicament.getPrix()     // Prix
        });
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLlogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicament = new javax.swing.JTable();
        jBAvis = new javax.swing.JButton();
        jBVoirAvis = new javax.swing.JButton();
        jCBType = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTFBarreRecherche = new javax.swing.JTextField();
        jTBRechercher = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Médicament");
        setPreferredSize(new java.awt.Dimension(800, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N
        getContentPane().add(jLlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 290, 90));

        jTableMedicament.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Type", "Nom", "Prix"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMedicament);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 450, 320));

        jBAvis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/commentaire.png"))); // NOI18N
        jBAvis.setText("Envoyer un avis");
        jBAvis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAvisActionPerformed(evt);
            }
        });
        getContentPane().add(jBAvis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        jBVoirAvis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/commentaire.png"))); // NOI18N
        jBVoirAvis.setText("Voir avis");
        jBVoirAvis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoirAvisActionPerformed(evt);
            }
        });
        getContentPane().add(jBVoirAvis, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        jCBType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTypeActionPerformed(evt);
            }
        });
        getContentPane().add(jCBType, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 200, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, 320));

        jTFBarreRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBarreRechercheKeyReleased(evt);
            }
        });
        getContentPane().add(jTFBarreRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 200, 30));

        jTBRechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rechercher.png"))); // NOI18N
        jTBRechercher.setText("Rechercher");
        jTBRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBRechercherActionPerformed(evt);
            }
        });
        getContentPane().add(jTBRechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, 30));

        jLabel1.setText("Type :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAvisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAvisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAvisActionPerformed

    private void jCBTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTypeActionPerformed

    private void jTBRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBRechercherActionPerformed
        // Recherche du médicament saisi dans la barre de recherche
        DefaultTableModel ob=(DefaultTableModel) jTableMedicament.getModel();
        TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
        jTableMedicament.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(jTFBarreRecherche.getText()));
    }//GEN-LAST:event_jTBRechercherActionPerformed

    private void jTFBarreRechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBarreRechercheKeyReleased
 // Récupérer le texte saisi dans la barre de recherche
    String recherche = jTFBarreRecherche.getText().trim().toLowerCase();
    
    // Vérifie si la recherche n'est pas vide
    if (!recherche.isEmpty()) {
        // Créer une instance de MedicamentMySQL et obtenir la liste des médicaments
        ArrayList<Medicament> medicaments = catalogue.getLesMedicaments();
        
        // Créer un modèle de tableau
        DefaultTableModel model = (DefaultTableModel) jTableMedicament.getModel();
        
        // Vider le tableau avant de le remplir avec les résultats de la recherche
        model.setRowCount(0);

        // Filtrer les médicaments en fonction de la recherche
        for (Medicament medicament : medicaments) {
            // Vérifie si le type, le nom ou le prix correspond au texte de la recherche
            if (medicament.getType().toLowerCase().contains(recherche) ||
                medicament.getNom().toLowerCase().contains(recherche) ||
                String.valueOf(medicament.getPrix()).contains(recherche)) {
                // Ajouter la ligne correspondante au modèle de tableau
                model.addRow(new Object[]{
                    medicament.getType(),
                    medicament.getNom(),
                    medicament.getPrix()
                });
            }
        }
        
        // Si aucun médicament ne correspond à la recherche, afficher un message
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Aucun médicament trouvé.", "Recherche", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        // Si la barre de recherche est vide, réinitialiser le tableau avec tous les médicaments
        initialiserTableauMedicaments(); // Cette méthode est déjà définie pour afficher tous les médicaments
    }
    }//GEN-LAST:event_jTFBarreRechercheKeyReleased

    private void jBVoirAvisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoirAvisActionPerformed
    int selectedRow = jTableMedicament.getSelectedRow();
    if (selectedRow != -1) {
        // Récupére le nom du médicament sélectionner
        String nomMedicament = (String) jTableMedicament.getValueAt(selectedRow, 2);
        
        // Crée une instance de AvisMySQL pour récuperer les avis
        AvisMySQL avisMySQL = new AvisMySQL();
        
        // Appele la méthode pour obtenir les avis du médicament sélectionné
        ArrayList<String[]> avisList = avisMySQL.obtenirAvis(nomMedicament);
        
        // Affiche les avis dans une popup
        if (avisList.size() > 0) {
            StringBuilder commentaires = new StringBuilder();
            
            // Parcoure la liste des avis et ajoute chaque commentaire au texte
            for (String[] avis : avisList) {
                commentaires.append("Auteur: ").append(avis[1]).append("\n");
                commentaires.append("Date: ").append(avis[3]).append("\n");
                commentaires.append("Commentaire: ").append(avis[2]).append("\n\n");
            }
            
            // Afficher les commentaires dans une boîte de dialogue
            JOptionPane.showMessageDialog(this, commentaires.toString(), 
                                          "Commentaires pour " + nomMedicament, 
                                          JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Aucun commentaire disponible pour ce médicament.", 
                                          "Commentaires", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner un médicament.", 
                                      "Erreur", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jBVoirAvisActionPerformed

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
            java.util.logging.Logger.getLogger(JffMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JffMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JffMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JffMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JffMedicament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAvis;
    private javax.swing.JButton jBVoirAvis;
    private javax.swing.JComboBox<String> jCBType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jTBRechercher;
    private javax.swing.JTextField jTFBarreRecherche;
    private javax.swing.JTable jTableMedicament;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
