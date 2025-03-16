/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import accesBDD.MedicamentMySQL;
import java.util.ArrayList;

/**
 *
 * @author steve.maingana
 */
public class Catalogue {
    // Classe d'interaction avec la table Medicament de la base de données
    private MedicamentMySQL lesMedicamentsBDD = new MedicamentMySQL();
    // Liste des médicaments du catalogue
    private ArrayList<Medicament> lesMedicaments = new ArrayList<Medicament>();
    
    /**
     * Constructeur de la classe Catalogue, il initialise la liste des médicaments par défaut
     */
    public Catalogue() {
        this.setLesMedicaments();
    }

    /**
     * Obtenir la liste des médicaments
     * @return 
     */
    public ArrayList<Medicament> getLesMedicaments() {
        return lesMedicaments;
    }
    
    /**
     * Définir une liste manuelle de médicaments
     * @param medicaments 
     */
    public void setLesMedicaments(ArrayList<Medicament> medicaments) {
        this.lesMedicaments = medicaments;
    }
    
    /**
     * Définir la liste de base des médicaments de la base de données
     */
    public void setLesMedicaments() {
        this.lesMedicaments = lesMedicamentsBDD.obtenirMedicaments();
    }
}
