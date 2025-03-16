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
import metier.Medicament;

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
    public MedicamentMySQL() {
        laConnection = Connexion.getConnect("127.0.0.1", "bdgsb", "adminGSB", "mdpGSB");
    }
    
    /**
    * Récupère la liste de tous les médicaments disponibles dans la base de données
    * en joignant les informations de la table MEDICAMENT avec celles de la table FAMILLE
    * @return ArrayList<Medicament> : Une liste d'objets Medicament contenant les informations des médicaments
    */
    public ArrayList<Medicament> obtenirMedicaments() {
        // Liste des Medicament
        ArrayList<Medicament> lesMedicaments = new ArrayList<Medicament>();
        
        try {
            // Ouverture d'une connexion SQL
            stmt = laConnection.createStatement();
            
            // Requête SQL de récupération des médicaments
            result = stmt.executeQuery("SELECT * FROM MEDICAMENT INNER JOIN FAMILLE ON FAMILLE.fCode = MEDICAMENT.fCode");
            
            while (result.next()) {
                // Conservion en float du String de MEDICAMENT.mPrix
                float prix = result.getString(6) == null ? 0f : Float.parseFloat(result.getString(6));
                
                Medicament medicament = new Medicament(
                        result.getString(1), // MEDICAMENT.mDepotLegal
                        result.getString(9), // FAMILLE.fLibelle
                        result.getString(2), // MEDICAMENT.mNomCommercial
                        result.getString(3), // MEDICAMENT.mComposition
                        result.getString(4), // MEDICAMENT.mEffets
                        result.getString(5), // MEDICAMENT.mContreIndications
                        prix                 // MEDICAMENT.mPrix
                );
                
                // Ajout du Medicament à la liste des Medicament
                lesMedicaments.add(medicament);
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
        
        // Retour de la liste des Medicament
        return lesMedicaments;
    }
    
    /**
    * Récupère la liste des noms des familles de médicaments disponibles dans la base de données
    * @return ArrayList<String> : Une liste de chaînes de caractères contenant les noms des familles de médicaments
    */
    public ArrayList<String> obtenirFamilles() {
        // Liste des noms des familles de médicaments
        ArrayList<String> familles = new ArrayList<String>();
        
        try {
            // Ouverture d'une connexion SQL
            stmt = laConnection.createStatement();
            
            // Requête SQL de récupération des familles
            result = stmt.executeQuery("SELECT * FROM FAMILLE");
            
            // Traitement ligne par ligne du retour de la requête
            while (result.next()) {
                // Ajout du nom de la famille (FAMILLE.fLibelle) de médicaments à la liste des noms
                familles.add(result.getString(2));
            }
        } catch (SQLException ex) {
            // Retour des exceptions
            System.out.println("SQLException : " + ex.getMessage());
            System.out.println("SQLState : " + ex.getSQLState());
            System.out.println("Code erreur: " + ex.getErrorCode());
        }
        
        // Retour de la liste des noms des familles de médicaments
        return familles;
    }
}