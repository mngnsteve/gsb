/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tests;
import accesBDD.Connexion;
import accesBDD.MedicamentMySQL;
import accesBDD.PraticienMySQL;
import java.sql.Connection;

/**
 *
 * @author steve.maingana
 */
public class BDD {
    
    public static void main (String[] args) {
        // Connection connexion = Connexion.getConnect("10.121.38.66", "bdgsb","adminGSB", "mdpGSB ");
        PraticienMySQL praticiens = new PraticienMySQL();
        
        String[] infos = praticiens.rechercherPraticien("c.morel", "mdp1");
        
        for (int i = 0; i < infos.length; i++) {
            System.out.println("["+i+"] "+infos[i]);
        }
    }
}
