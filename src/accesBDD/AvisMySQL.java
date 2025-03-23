/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesBDD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author steve.maingana
 */
public class AvisMySQL {
    private Connection laConnection;
    private Statement stmt = 	null;
    private ResultSet result = 	null;
    
    /**
     * Constructeur
     * Etablissement d'une connexion avec la base de données
     */
    public AvisMySQL() {
        laConnection = Connexion.getConnect("IP", "bdgsb", "adminGSB", "mdpGSB");
    }
    
    /**
     * Permet de rechercher les avis associés à un médcament en utilisant son nom
     * @param medicament     :  Le nom du médicament pour lequel on souhaite obtenir les avis
     * @return ArrayList<String[]> :  Une liste de tableaux de chaînes de caractères contenant les informations des avis
     */
    public ArrayList<String[]> obtenirAvis(String medicament) {
        // Liste de tableaux des avis
        ArrayList<String[]> lesAvis = new ArrayList<String[]>();
        
        try {
            // Ouverture d'une connexion SQL
            stmt = laConnection.createStatement();
            
            // Requête SQL de définition en français pour le formattage de la date
            stmt.execute("SET lc_time_names = 'fr_FR'");
            // Requête SQL de récupération des avis des médicaments
            result = stmt.executeQuery("SELECT aCode, mDepotLegal, aContenu, DATE_FORMAT(aDate, '%d %M %Y') AS date FROM AVIS WHERE mDepotLegal='"+medicament+"';");
            
            // Traitement ligne par ligne du retour de la requête
            while (result.next()) {
                
                // Tableau des informations de l'avis récupéré
                String[] informations  = new String[4];
                informations[0] = result.getString(1); // AVIS.aCode
                informations[1] = result.getString(2); // AVIS.mDepotLegal
                informations[2] = result.getString(3); // AVIS.aContenu
                informations[3] = result.getString(4); // AVIS.aDate
                
                // Ajout des informations à la liste de tableaux des avis
                lesAvis.add(informations);
            }
            
            // Fin de la requête
           result.close();
           stmt.close();
        } catch (SQLException ex) {
            // Retour des exceptions
            System.out.println("SQLException : " + ex.getMessage());
            System.out.println("SQLState : " + ex.getSQLState());
            System.out.println("Code erreur : " + ex.getErrorCode());  
        }
        
        // Retour de la liste de tableaux des avis
        return lesAvis;
    }
    
    /**
     * Permet d'insérer un avis dans la table AVIS de la base de données
     * @param depotLegal Le dépôt légal du médicament commenté
     * @param auteur L'identifiant de l'auteur du commentaire
     * @param contenu Le message contenu dans le commentaire
     * @return int : Résultat d'exécution de la requête d'insertion dans la base de données
     */
    public int envoyerAvis(String depotLegal, int auteur, String contenu) {
        // Initialisation du résultat à 0 pour une requête non aboutie
        int update = 0;
        
        try {
            // Ouverture d'une connexion SQL
            stmt = laConnection.createStatement();
            
            // Requête SQL d'insertion dans la table AVIS de la base de données
            update = stmt.executeUpdate("INSERT INTO AVIS (mDepotLegal, aAuteur, aContenu) VALUES ('"+depotLegal+"', '"+auteur+"', \""+contenu+"\")");
            
            // Fin de requête
           stmt.close();
        } catch (SQLException ex) {
            // Retour des exceptions
            System.out.println("SQLException : " + ex.getMessage());
            System.out.println("SQLState : " + ex.getSQLState());
            System.out.println("Code erreur : " + ex.getErrorCode());  
        }
        
        // Résultat de l'execution de la requête d'insertion
        return update;
    }
}