/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tests;
import accesBDD.Connexion;
import accesBDD.MedicamentMySQL;
import java.sql.Connection;

/**
 *
 * @author steve.maingana
 */
public class BDD {
    
    public static void main (String[] args) {
        // Connection connexion = Connexion.getConnect("10.121.38.66", "bdgsb","adminGSB", "mdpGSB ");
        MedicamentMySQL medicament = new MedicamentMySQL();
        
        String[] infos = medicament.rechercherMedicament("TRIMYCINE");
        
        for (int i = 0; i < infos.length; i++) {
            System.out.println(infos[i]);
        }
    }
}
