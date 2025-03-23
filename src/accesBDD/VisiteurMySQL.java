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
public class VisiteurMySQL {
    private Connection laConnection;
    private Statement stmt = 	null;
    private ResultSet result = 	null;
    
    /**
     * Constructeur
     * Etablissement d'une connexion avec la base de données
     */
    // 10.121.38.66
    public VisiteurMySQL() {
        laConnection = Connexion.getConnect("10.121.38.72", "bdgsb", "adminGSB", "mdpGSB");
    }
    
    /**
    * Recherche un visiteur dans la base de données en utilisant son identifiant et son mot de passe
    * @param utilisateur : L'identifiant du visiteur
    * @param mdp :         Le mot de passe du visiteur
    * @return String[] : Un tableau de chaînes de caractères contenant les informations du visiteur
    */
    public String[] rechercherVisiteur(String utilisateur, String mdp) {
        // Tableau d'informations du visiteur
        String[] informations  = new String[5];
        
        try {
            // Ouverture d'une connexion SQL
            stmt = laConnection.createStatement();
            
            // Requête SQL de récupération du visiteur
            result = stmt.executeQuery("SELECT * FROM VISITEUR WHERE vIdentifiant='"+utilisateur+"' AND vMdp='"+mdp+"'");
            
            // Traitement de la ligne retournée
            if (result.next()) {
                // Informations du visiteur
                informations[0] = result.getString(1); // VISITEUR.vNUM
                informations[1] = result.getString(2); // VISITEUR.vNom
                informations[2] = result.getString(3); // VISITEUR.vPrenom
                informations[3] = result.getString(4); // VISITEUR.vIdentifiant
                informations[4] = result.getString(5); // VISITEUR.vMdp
            }
            
            // Fin de requête
           result.close();
           stmt.close();
        } catch (SQLException ex) {
            // Retour des exceptions
              System.out.println("SQLException : " + ex.getMessage());
              System.out.println("SQLState : " + ex.getSQLState());
              System.out.println("Code erreur : " + ex.getErrorCode());  
        }
        
        // Retour des informations du visiteur
         return informations;
    }
}
