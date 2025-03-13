/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesBDD;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Steve Maingana
 */
public class MedicamentMySQL {
    private Connection laConnection;
    private Statement stmt = 	null;
    private ResultSet result = 	null;
    
    /**
     * Constructeur
     * Etablissement d'une connexion avec la base de données
     */
    // 10.121.38.66
    public MedicamentMySQL() {
        laConnection = Connexion.getConnect("127.0.0.1", "bdgsb", "adminGSB", "mdpGSB");
    }
    
    /**
     * Permet de rechercher le medicament avec son nom
     * @param nom     :  nom du médicament
     * @return String   :  prénom et nom du client s'il existe,chaine vide sinon
     */
    public String[] rechercherMedicament(String nom) {
        // ArrayList<String> informations = new ArrayList<String>();
        String[] informations  = new String[7];
        
        try {
            stmt = laConnection.createStatement();
            // Accès à la table medicament
            result = stmt.executeQuery("SELECT * FROM MEDICAMENT WHERE mNomCommercial='"+nom+"'");
            if (result.next()) {   // Le medicament a été touvé
                
                informations[0] = result.getString(1);
                informations[1] = result.getString(2);
                informations[2] = result.getString(3);
                informations[3] = result.getString(4);
                informations[4] = result.getString(5);
                informations[5] = result.getString(6);
                informations[6] = result.getString(7);
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