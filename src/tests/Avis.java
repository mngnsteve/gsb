/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import accesBDD.AvisMySQL;
import java.util.ArrayList;

/**
 *
 * @author bcore
 */
class Avis {
    public static void main(String[] args) {
        envoyerAvis();
        obtenirAvis();
    }
    
    public static void envoyerAvis() {
        String sortie = "[envoyerAvis] ";
        AvisMySQL avisBDD = new AvisMySQL();
        int envoi = avisBDD.envoyerAvis("3MYC7", 74, "Test");
        
        if (envoi == 1) {
            sortie += "RÉUSSITE: L'avis du médicament '3MYC7' a pu être envoyé avec succès !";
        } else {
            sortie += "ERREUR: Il semble que l'avis du médicament '3MYC7' n'ait pas pu être correctement envoyé.";
        }
        
        System.out.println(sortie);
    }
    
    public static void obtenirAvis() {
        String sortie = "[obtenirAvis] ";
        AvisMySQL avisBDD = new AvisMySQL();
        ArrayList<String[]> tousLesAvis = avisBDD.obtenirAvis("3MYC7");
        
        if (tousLesAvis != null) {
            sortie += "RÉUSSITE: Récupération réalise de tous les avis du médicament '3MYC7'";
        } else {
            sortie += "ERREUR: Les avis du médicament '3MYC7' n'ont pas pu être correctement récupérés.";
        }
        
        System.out.println(sortie);
    }
}
