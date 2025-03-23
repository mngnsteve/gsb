/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesBDD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author steve.maingana
 */
public class PraticienMySQL {
    private Connection laConnection;
    private Statement stmt = 	null;
    private ResultSet result = 	null;
    
    /**
     * Constructeur
     * Etablissement d'une connexion avec la base de données
     */
    // 10.121.38.66
    public PraticienMySQL() {
        laConnection = Connexion.getConnect("10.121.38.72", "bdgsb", "adminGSB", "mdpGSB");
    }
    
    /**
    * Recherche un praticien dans la base de données en utilisant son identifiant et son mot de passe
    * @param utilisateur : L'identifiant du praticien
    * @param mdp :         Le mot de passe du praticien
    * @return String[] : Un tableau de chaînes de caractères contenant les informations du praticien
    */
    public String[] rechercherPraticien(String identifiant, String mdp) {
        // Tableau d'informations du praticien
        String[] informations  = new String[10];
        
        try {
            // Ouverture d'une connexion SQL
            stmt = laConnection.createStatement();
            
            // Requête SQL de récupération du praticien
            result = stmt.executeQuery("SELECT * FROM PRATICIEN WHERE pIdentifiant='"+identifiant+"' AND pMdp='"+mdp+"'");
            
            // Traitement de la ligne retournée
            if (result.next()) {
                // Informations du praticien
                informations[0] = result.getString(1); // PRATICIEN.vNUM
                informations[1] = result.getString(2); // PRATICIEN.vNom
                informations[2] = result.getString(3); // PRATICIEN.vPrenom
                informations[3] = result.getString(4); // PRATICIEN.vIdentifiant
                informations[4] = result.getString(5); // PRATICIEN.vMdp
            }
           result.close();
           stmt.close();
        } catch (SQLException ex) {
            // Fin de requête
            System.out.println("SQLException : " + ex.getMessage());
            System.out.println("SQLState : " + ex.getSQLState());
            System.out.println("Code erreur : " + ex.getErrorCode());  
        }
        
        // Retour des informations du praticien
        return informations;
    }
}