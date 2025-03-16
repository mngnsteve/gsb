/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import java.util.ArrayList;
import metier.Catalogue;
import metier.Medicament;

/**
 *
 * @author bcore
 */
public class Medicaments {
    public static void main(String[] args) {
        initialisationCatalogueBDD();
        ajouterMedicament();
        recupererMedicament();
    }
    
    public static void initialisationCatalogueBDD() {
        String sortie = "[initialisationCatalogueBDD] ";
        Catalogue catalogue = new Catalogue();
        ArrayList<Medicament> medicaments = catalogue.getLesMedicaments();
        
        if (medicaments != null && medicaments.size() > 0) {
            
            sortie += "RÉUSSITE: "+medicaments.size()+" médicaments répertoriés";
        } else {
            sortie += "ERREUR: la liste des médicaments n'a pas pu être récupérée";
        }
        
        System.out.println(sortie);
    }
    
    public static void ajouterMedicament() {
        String sortie = "[ajouterCatalogue] ";
        Catalogue catalogue = new Catalogue();
        ArrayList<Medicament> medicaments = new ArrayList<Medicament>();
        Medicament medicament1 = new Medicament("MED1", "Famille1", "MEDOC1", "COMPO1", "EFFETS1", "CONTREINDIC1", 0f);
        Medicament medicament2 = new Medicament("MED2", "Famille2", "MEDOC2", "COMPO2", "EFFETS2", "CONTREINDIC2", 0f);
        medicaments.add(medicament1);
        medicaments.add(medicament2);
        catalogue.setLesMedicaments(medicaments);
        
        if (catalogue.getLesMedicaments().contains(medicament1) && catalogue.getLesMedicaments().contains(medicament2)) {
            
            sortie += "RÉUSSITE: Ajout de médicament à un catalogue";
        } else {
            sortie += "ERREUR: Les médicaments n'ont pas pu être ajoutés au catalogue";
        }
        
        System.out.println(sortie);
    }
    
    public static void recupererMedicament() {
        String sortie = "[recupererMedicament] ";
        Catalogue catalogue = new Catalogue();
        ArrayList<Medicament> medicaments = new ArrayList<Medicament>();
        Medicament medicament1 = new Medicament("MED1", "Famille1", "MEDOC1", "COMPO1", "EFFETS1", "CONTREINDIC1", 0f);
        Medicament medicament2 = new Medicament("MED2", "Famille2", "MEDOC2", "COMPO2", "EFFETS2", "CONTREINDIC2", 0f);
        medicaments.add(medicament1);
        medicaments.add(medicament2);
        catalogue.setLesMedicaments(medicaments);
        
        Medicament medoc1 = catalogue.getLesMedicaments().get(0);
        
        if (medoc1.equals(medicament1)) {
            sortie += "RÉUSSITE: Médicament MEDOC1 récupéré avec succès";
        } else {
            sortie += "ERREUR: Le médicament MEDOC1 n'a pu être récupéré";
        }
        
        System.out.println(sortie);
    }
}
