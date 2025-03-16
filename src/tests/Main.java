/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

/**
 *
 * @author bcore
 */
public class Main {
    public static void main(String[] args) {
        Avis.envoyerAvis();
        Avis.obtenirAvis();
        Medicaments.initialisationCatalogueBDD();
        Medicaments.ajouterMedicament();
        Medicaments.recupererMedicament();
        Utilisateurs.initialiserPraticien();
        Utilisateurs.equalsPraticien();
        Utilisateurs.initialiserVisiteur();
        Utilisateurs.equalsVisiteur();
    }
}
