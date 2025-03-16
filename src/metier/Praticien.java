/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package metier;

import java.util.Objects;

/**
 *
 * @author mohamed.boussemaha
 */
public class Praticien {
    private int id;
    private String nom;
    private String prenom;
    
    /**
     * Constructeur de la classe Praticien
     * @param id Numero du praticien
     * @param nom Nom du praticien
     * @param prenom Prenom du praticien
     */
    public Praticien(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    /**
     * Obtenir le numéro du praticien
     * @return String : Numéro du praticien
     */
    public int getId() {
        return id;
    }
    
    /**
     * Obtenir le nom du praticien
     * @return String : Nom du praticien
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Obtenir le prénom du praticien
     * @return String : Prénom du praticien
     */
    public String getPrenom() {
        return prenom;
    }
    
    /**
     * Méthodes de comparaison entre deux Praticien
     * @param obj Objet à comparer avec le Praticien
     * @return boolean : true si les deux Praticien sont égaux, sinon false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Praticien other = (Praticien) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return Objects.equals(this.prenom, other.prenom);
    }
    
    /**
     * Retourne une représentation textuelle de l'objet Praticien
     * @return String : Une chaîne de caractères représentant le praticien
     */
    @Override
    public String toString() {
        return "Praticien{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
}