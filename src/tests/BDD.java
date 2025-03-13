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
        AvisMySQL tousLesAvis = new AvisMySQL();
        
        ArrayList<String[]> lesAvis = tousLesAvis.obtenirAvis("TRIMYCINE");
        
        // for (int i = 0; i < lesAvis.size(); i++) {
        //    String[] avis = lesAvis.get(i);
        //    for (int j = 0; j < avis.length; j++) {
        //        System.out.println(avis[j]);
        //    }
        //}
        
        tousLesAvis.envoyerAvis("ADIMOL9", 1, "Mouais pas mal");
    }
}
