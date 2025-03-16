/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import metier.Praticien;
import metier.Visiteur;

/**
 *
 * @author bcore
 */
public class Utilisateurs {
    public static void main(String[] args) {
        initialiserPraticien();
        equalsPraticien();
        initialiserVisiteur();
        equalsVisiteur();
    }
    
    public static void initialiserPraticien() {
        String sortie = "[initialiserPraticien] ";

        Praticien praticien = new Praticien(1, "Maingana", "Steve");

        if (praticien.getId() == 1 && praticien.getNom().equals("Maingana") && praticien.getPrenom().equals("Steve")) {
            sortie += "RÉUSSITE: le Praticien Steve Maingana a bien été initialisé";
        } else {
            sortie += "ERREUR: le Praticien Steve Maingana aurait dû être initialisé";
        }
        
        System.out.println(sortie);
    }
    
    public static void equalsPraticien() {
        String sortie = "[equalsPraticien] ";
        Praticien praticien1 = new Praticien(1, "Maingana", "Steve");
        Praticien praticien2 = new Praticien(1, "Mohamed", "Boussemaha");
        Praticien praticien3 = new Praticien(1, "Maingana", "Steve");
        
        if (praticien1.equals(praticien3) && !praticien2.equals(praticien1)) {
            sortie += "RÉUSSITE: praticien1 et praticien3 sont équivalents / praticien2 et praticien1 sont différents";
        } else {
            sortie += "ERREUR: praticien1 et praticien3 devraient être équivalents / praticien2 et praticien1 devraient être différents";
        }
        
        System.out.println(sortie);
    }
    
    public static void initialiserVisiteur() {
        String sortie = "[initialiserVisiteur] ";

        Visiteur visiteur = new Visiteur(1, "Boussemaha", "Mohamed");

        if (visiteur.getId() == 1 && visiteur.getNom().equals("Boussemaha") && visiteur.getPrenom().equals("Mohamed")) {
            sortie += "RÉUSSITE: le Visiteur Mohamed Boussemaha a bien été initialisé";
        } else {
            sortie += "ERREUR: le Visiteur Mohamed Boussemaha aurait dû être initialisé";
        }
        
        System.out.println(sortie);
    }
    
    
    
    public static void equalsVisiteur() {
        String sortie = "[equalsVisiteur] ";
        Visiteur visiteur1 = new Visiteur(1, "Maingana", "Steve");
        Visiteur visiteur2 = new Visiteur(1, "Mohamed", "Boussemaha");
        Visiteur visiteur3 = new Visiteur(1, "Maingana", "Steve");
        
        if (visiteur1.equals(visiteur3) && !visiteur2.equals(visiteur1)) {
            sortie += "RÉUSSITE: visiteur1 et visiteur3 sont équivalents / visiteur2 et visiteur1 sont différents";
        } else {
            sortie += "ERREUR: visiteur1 et visiteur3 devraient être équivalents / visiteur2 et visiteur1 devraient être différents";
        }
        
        System.out.println(sortie);
    }
}