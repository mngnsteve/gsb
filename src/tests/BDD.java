/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tests;
import accesBDD.AvisMySQL;
import accesBDD.Connexion;
import accesBDD.MedicamentMySQL;
import accesBDD.PraticienMySQL;
import accesBDD.VisiteurMySQL;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author steve.maingana
 */
public class BDD {
    
    public static void main (String[] args) {
        // Connection connexion = Connexion.getConnect("10.121.38.66", "bdgsb","adminGSB", "mdpGSB ");
        MedicamentMySQL medicaments = new MedicamentMySQL();
        
        ArrayList<String> familles = medicaments.obtenirFamilles();
        
        for (String famille : familles) {
            System.out.println(famille);
        }
    }
}
