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
    private MedicamentMySQL lesMedicamentsBDD = new MedicamentMySQL();
    private ArrayList<Medicament> lesMedicaments = new ArrayList<Medicament>();
    
    public Catalogue() {
        this.lesMedicaments = lesMedicamentsBDD.obtenirMedicaments();
    }

    public ArrayList<Medicament> getLesMedicaments() {
        return lesMedicaments;
    }
}
