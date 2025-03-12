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
        laConnection = Connexion.getConnect("10.121.38.66", "bdgsb", "adminGSB", "mdpGSB");
    }
    
    /**
     * Permet de rechercher le medicament avec son nom
     * @param nom     :  nom du médicament
     * @return String   :  prénom et nom du client s'il existe,chaine vide sinon
     */
    public String[] rechercherVisiteur(String utilisateur, String mdp) {
        // ArrayList<String> informations = new ArrayList<String>();
        String[] informations  = new String[4];
        
        try {
            stmt = laConnection.createStatement();
            // Accès à la table medicament
            result = stmt.executeQuery("SELECT * FROM PRATICIEN WHERE vIdentifiant='"+utilisateur+"' AND vMdp='"+mdp+"'");
            if (result.next()) {   // Le medicament a été touvé
                
                informations[0] = result.getString(1);
                informations[1] = result.getString(2);
                informations[2] = result.getString(3);
                informations[3] = result.getString(4);
            }
           result.close();
           stmt.close();
        } catch (SQLException ex) {
              System.out.println("SQLException : " + ex.getMessage());
              System.out.println("SQLState : " + ex.getSQLState());
              System.out.println("Code erreur : " + ex.getErrorCode());  
        }
         return informations;
    }
}
