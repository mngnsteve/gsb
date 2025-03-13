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
    // 10.121.38.66
    public AvisMySQL() {
        laConnection = Connexion.getConnect("10.121.38.66", "bdgsb", "adminGSB", "mdpGSB");
    }
    
    /**
     * Permet de rechercher le medicament avec son nom
     * @param nom     :  nom du médicament
     * @return String   :  prénom et nom du client s'il existe,chaine vide sinon
     */
    public ArrayList<String[]> obtenirAvis(String medicament) {
        ArrayList<String[]> lesAvis = new ArrayList<String[]>();
        String[] informations  = new String[4];
        
        try {
            stmt = laConnection.createStatement();
            // Accès à la table medicament
            result = stmt.executeQuery("SELECT * FROM AVIS WHERE mDepotLegal='"+medicament+"'");
            
            while (result.next()) {
                informations[0] = result.getString(1);
                informations[1] = result.getString(2);
                informations[2] = result.getString(4);
                informations[3] = result.getString(5);
                
                lesAvis.add(informations);
            }
           result.close();
           stmt.close();
        } catch (SQLException ex) {
              System.out.println("SQLException : " + ex.getMessage());
              System.out.println("SQLState : " + ex.getSQLState());
              System.out.println("Code erreur : " + ex.getErrorCode());  
        }
         return lesAvis;
    }
    
    public int envoyerAvis(String depotLegal, int auteur, String contenu) {
        int update = 0;
        
        try {
            stmt = laConnection.createStatement();
            // Accès à la table medicament
            
            update = stmt.executeUpdate("INSERT INTO AVIS (mDepotLegal, aAuteur, aContenu, aDate) VALUES ('"+depotLegal+"', '"+auteur+"', '"+contenu+"', CURRENT_DATE)");
            
           result.close();
           stmt.close();
        } catch (SQLException ex) {
              System.out.println("SQLException : " + ex.getMessage());
              System.out.println("SQLState : " + ex.getSQLState());
              System.out.println("Code erreur : " + ex.getErrorCode());  
        }
        
        return update;
    }
}
