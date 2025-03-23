/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import accesBDD.AvisMySQL;
import accesBDD.MedicamentMySQL;
import accesBDD.PraticienMySQL;
import accesBDD.VisiteurMySQL;
import java.awt.Desktop;
import java.awt.Image;
import static java.awt.Image.SCALE_DEFAULT;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
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
    
    private Catalogue catalogue = new Catalogue();
    private Medicament medicament;
    private String type = null;
    private String[] connexion = null;
    private AvisMySQL avis = new AvisMySQL();
    
    /**
     * Constructeur sans paramètre de la classe JffMedicament, qui est une JFrame
     */
    public JffMedicament() {
        // fond blanc
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        initComponents();
        // Initialisation du tableau de médicaments
        initialiserTableauMedicaments();
        
        // Initialisation de la liste déroulante
        MedicamentMySQL medicamentMySQL = new MedicamentMySQL();
        ArrayList<String> familles = medicamentMySQL.obtenirFamilles();
        for (String famille : familles) {
            jCBType.addItem(famille);
        }
    }
    
    /**
     * Constructeur paramétrable de la classe JffMedicament
     * @param connexion Données de connexion
     * @param typeUtilisateur Type d'utilisateur. 0 = Aucun profil | 1 = Praticien | 2 = Visiteur
     */
    public JffMedicament(String[] connexion, int typeUtilisateur) {
        // fond blanc
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        initComponents();
        // Initialisation du tableau de médicaments
        initialiserTableauMedicaments();
        // Données de connexion
        this.connexion = connexion;
        
        this.setTitle("Galaxy Swiss Bourdin - Catalogue ("+this.connexion[2]+" "+this.connexion[1]+")");
        
        // Initialisation de la liste déroulante
        MedicamentMySQL medicamentMySQL = new MedicamentMySQL();
        ArrayList<String> familles = medicamentMySQL.obtenirFamilles();
        for (String famille : familles) {
            jCBType.addItem(famille);
        }
        
        
        
        if(typeUtilisateur == 2) { // L'utilisateur est un visiteur
            // Saisie d'avis désactivée
            jBAvis.setVisible(false);
        }
    }
    
    /**
     * Initialise le tableau des médicaments
     */
    private void initialiserTableauMedicaments() {
        // Récupére la liste des médicaments à partir du catalogue
        ArrayList<Medicament> medicaments = catalogue.getLesMedicaments();

        // Modèle de tableau pour y ajouter les lignes
        DefaultTableModel model = (DefaultTableModel) jTableMedicament.getModel();

        model.setRowCount(0);

        // Parcourt la liste des médicaments et ajouter chaque médicament dans le tableau
        for (Medicament medicament : medicaments) {
            model.addRow(new Object[] {
                medicament.getType(),
                medicament.getNom(),
                medicament.getPrix()
            });
        }
    }
    
    /**
     * Redimensionne une image quand nécessaire par rapport à un panneau
     * @param image Image dont on vérifie le dimensionnement
     * @param largeurPanneau Largeur du panneau
     * @param longueurPanneau Longueur du panneau
     * @return ImageIcon : Image après vérification
     */
    private ImageIcon verifierDimensionnementImage(ImageIcon image, int largeurPanneau, int longueurPanneau) {
        int largeurImage = image.getIconWidth();
        int longueurImage = image.getIconHeight();
        ImageIcon imageValide = image;
        
        if (largeurImage > largeurPanneau && longueurImage > longueurPanneau) {
            float ratioLargeur = (float) largeurPanneau / largeurImage;
            float ratioLongueur = (float) longueurPanneau / longueurImage;
            float redimension = Math.min(ratioLargeur, ratioLongueur);
            int largeurImg = (int) (largeurPanneau * redimension);
            int longueurImg = (int) (longueurPanneau * redimension);
            Image img = image.getImage().getScaledInstance(largeurImg, longueurImg, SCALE_DEFAULT);
            imageValide = new ImageIcon(img);
        }
        
        return imageValide;
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
        jTAMedicament = new javax.swing.JTextArea();
        jTFBarreRecherche = new javax.swing.JTextField();
        jLRecherche = new javax.swing.JLabel();
        jPMedicament = new javax.swing.JPanel();
        jLMedicament = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAide = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CATALOGUE");
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
        jTableMedicament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicamentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicament);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 450, 360));

        jBAvis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/commentaire.png"))); // NOI18N
        jBAvis.setText("Envoyer un avis");
        jBAvis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAvisActionPerformed(evt);
            }
        });
        getContentPane().add(jBAvis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        jBVoirAvis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/commentaire.png"))); // NOI18N
        jBVoirAvis.setText("Voir les avis");
        jBVoirAvis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoirAvisActionPerformed(evt);
            }
        });
        getContentPane().add(jBVoirAvis, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, -1));

        jCBType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toutes les familles" }));
        jCBType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTypeActionPerformed(evt);
            }
        });
        getContentPane().add(jCBType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 320, 30));

        jTAMedicament.setEditable(false);
        jTAMedicament.setColumns(20);
        jTAMedicament.setRows(5);
        jTAMedicament.setFocusable(false);
        jScrollPane2.setViewportView(jTAMedicament);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 280, 150));

        jTFBarreRecherche.setToolTipText("");
        jTFBarreRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBarreRechercheKeyReleased(evt);
            }
        });
        getContentPane().add(jTFBarreRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 200, 30));
        jTFBarreRecherche.getAccessibleContext().setAccessibleName("");

        jLRecherche.setText("Recherche :");
        getContentPane().add(jLRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 200, -1));

        jPMedicament.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLMedicament.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPMedicament.add(jLMedicament, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 260, 200));

        getContentPane().add(jPMedicament, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 280, 180));

        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMAide.setText("Guide utilisateur");
        jMAide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMAideMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMAide);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Action effectuée lorsque le l'utilisateur clique sur le bouton "Voir les avis"
     * @param evt L'événement d'action déclenché par le clic sur le bouton
     */
    private void jBAvisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAvisActionPerformed
        // Booléen d'activité de la fenêtre de saisie du commentaire
        if (medicament != null) { // Il y a un médicament sélectionné
            boolean actif = true;
            String reponse;

            do {
                // Affichage de la fenêtre de saisie du commentaire et récupération de la valeur de fin de saisie
                reponse = (String) JOptionPane.showInputDialog(null, "Donnez un avis", "Avis", QUESTION_MESSAGE, null, null, null);
                if (reponse == null && JOptionPane.getRootFrame().isDisplayable()) { // La fenêtre de saisie est fermé pendant la saisie
                    actif = false; // Fin d'activité
                } else if (reponse != null && reponse.trim().isEmpty()) { // La saisie est validée sans texte
                    // Affichage d'un message indiquant l'obligation de saisir du texte
                    JOptionPane.showMessageDialog(null, "Vous ne pouvez pas envoyer un commentaire vide !", "Erreur", JOptionPane.ERROR_MESSAGE);
                } else { // Il y a une saisie
                    actif = false; // Fin d'activité
                }
            } while (actif); // Répète le processus tant que actif est vrai

            // Les données de connexion ne sont pas nulles
            if (connexion != null && reponse != null) { // Les données de connexion et la réponse ne sont pas nulles
                // Numéro d'identification de l'auteur
                int auteur = Integer.parseInt(this.connexion[0]);
                // Envoi de l'avis
                avis.envoyerAvis(medicament.getId(), auteur, reponse);
            }
        } else {
            Icon icone = new javax.swing.ImageIcon(getClass().getResource("/images/quitter.png"));
            JOptionPane.showMessageDialog(null, "Vous devez selectionner un médicament !", "Erreur", ERROR_MESSAGE, icone);
        }
    }//GEN-LAST:event_jBAvisActionPerformed

    /**
     * Action effectuée lorsque le l'utilisateur clique une option de la liste déroulante
     * @param evt L'événement d'action déclenché par le clic sur l'option
     */
    private void jCBTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTypeActionPerformed
        // Position de la selection
        int indice = jCBType.getSelectedIndex();
        
        // Réintilisation de la définition du catalogue de médicaments
        catalogue.setLesMedicaments();
        
        if (indice > 0) { // L'indice est différent de 0 = "Toutes les familles" dans la liste déroulante
            // Redéfinition du catalogue limité à la famille spécifiée dans la liste déroulante
            String typeSelectionne = (String) jCBType.getSelectedItem();
            this.type = typeSelectionne;
            ArrayList<Medicament> medicamentsFiltres = new ArrayList<Medicament>();
            for (Medicament medicament : catalogue.getLesMedicaments()) {
                if (medicament.getType().equals(this.type)) {
                    medicamentsFiltres.add(medicament);
                }
            }
            catalogue.setLesMedicaments(medicamentsFiltres);
        } else {
            this.type = null;
        }
        
        // Reconstruction du tableau de médicaments
        initialiserTableauMedicaments();
    }//GEN-LAST:event_jCBTypeActionPerformed

    /**
     * Action effectuée lorsque le l'utilisateur clique sur le bouton "Envoyer un avis"
     * @param evt L'événement d'action déclenché par le clic sur le bouton
     */
    private void jBVoirAvisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoirAvisActionPerformed
        // Lien avec la table AVIS de la base de données
        AvisMySQL avisMySQL = new AvisMySQL();

        if (medicament != null) { // Un médicament est seletionné
            // Liste des avis sur le médicament
            ArrayList<String[]> tousLesAvis = avisMySQL.obtenirAvis(medicament.getId());
            // Chaîne de caractères des commentaires
            String commentaires = "";

            if (tousLesAvis.size() < 1) { // Il n'y a aucun avis
                commentaires += "Il n'y a aucun commentaire sur ce médicament.";
            } else { // Il y a des avis
                
                // Ajout des avis à la chaîne de caractères des commentaires
                for (String[] avis : tousLesAvis) {
                    commentaires += "- Date: "+avis[3]+"\n";
                    commentaires += avis[2]+"\n";
                    commentaires += "\n";
                }
            }
            
            // Préparation de la JDialog d'affichage des avis
            JdAvis Avis = new JdAvis(JffMedicament.this, true, medicament, commentaires);
            // Ouverture de la JDialog
            Avis.setVisible(true);
        } else {
            Icon icone = new javax.swing.ImageIcon(getClass().getResource("/images/quitter.png"));
            JOptionPane.showMessageDialog(null, "Vous devez selectionner un médicament !", "Erreur", ERROR_MESSAGE, icone);
        }
    }//GEN-LAST:event_jBVoirAvisActionPerformed

    /**
     * Action effectuée lorsque le l'utilisateur clique sur un élément du tableau de médicaments
     * @param evt L'événement d'action déclenché par le clic sur un élément
     */
    private void jTableMedicamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicamentMouseClicked
        // Position de la sélection
        int indice = jTableMedicament.getSelectedRow();
        // Selection du médicament
        medicament = catalogue.getLesMedicaments().get(indice);
        // Affichage des informations du médicament selectionné
        jTAMedicament.setText(medicament.getInformation());
        ImageIcon image = new javax.swing.ImageIcon(getClass().getResource("/images/"+medicament.getId()+".jpg"));
        jTAMedicament.setCaretPosition(0);
        // Redimensionnement de l'image du medicament par rapport au panneau d'affichage     
        ImageIcon redimensionnement = verifierDimensionnementImage(image, jPMedicament.getWidth(), jPMedicament.getHeight());
        jLMedicament.setIcon(redimensionnement);
    }//GEN-LAST:event_jTableMedicamentMouseClicked

    private void jTFBarreRechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBarreRechercheKeyReleased
        // Selection de la liste déroulante
        int indiceTable = jCBType.getSelectedIndex();
        
        // Récupérer le texte saisi dans la barre de recherche
        String recherche = jTFBarreRecherche.getText().trim().toLowerCase();
        
        // Réintilisation de la définition du catalogue de médicaments selon le type selectionné
        catalogue.setLesMedicaments();
        ArrayList<Medicament> medicamentsFiltres = new ArrayList<Medicament>();
        if (indiceTable != 0) { // Aucun type n'est selectionné

            for (Medicament medicament : catalogue.getLesMedicaments()) {
                if (medicament.getType().equals(this.type)) {
                    medicamentsFiltres.add(medicament);
                }
            }

            catalogue.setLesMedicaments(medicamentsFiltres);
        }

        // Instance de MedicamentMySQL et obtenir la liste des médicaments
        ArrayList<Medicament> recherchesMedicament = new ArrayList<Medicament>();
        ArrayList<Medicament> medicaments = catalogue.getLesMedicaments();
        DefaultTableModel model = (DefaultTableModel) jTableMedicament.getModel();
        model.setRowCount(0);

        // Filtre selon l'entrée dans la barre de recherches
        for (Medicament medicament : medicaments) {
            if (medicament.getType().toLowerCase().contains(recherche) ||
                medicament.getNom().toLowerCase().contains(recherche) ||
                String.valueOf(medicament.getPrix()).contains(recherche)) {
                recherchesMedicament.add(medicament);
            }
        }

        catalogue.setLesMedicaments(recherchesMedicament);


        // Actualisation de table de médicaments
        initialiserTableauMedicaments();
    }//GEN-LAST:event_jTFBarreRechercheKeyReleased

    private void jMAideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMAideMouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI("LIEN GUIDE UTILISATEUR"));
        } catch (IOException | URISyntaxException e) 
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMAideMouseClicked

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
    private javax.swing.JLabel jLMedicament;
    private javax.swing.JLabel jLRecherche;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JMenu jMAide;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPMedicament;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAMedicament;
    private javax.swing.JTextField jTFBarreRecherche;
    private javax.swing.JTable jTableMedicament;
    // End of variables declaration//GEN-END:variables
}
