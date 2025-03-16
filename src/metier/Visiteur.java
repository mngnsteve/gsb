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
public class Visiteur {
    private int id;
    private String nom;
    private String prenom;
    
    /**
     * Constructeur de la classe Visiteur
     * @param id Numero du visiteur
     * @param nom Nom du visiteur
     * @param prenom Prenom du visiteur
     */
    public Visiteur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    /**
     * Obtenir le numéro du visiteur
     * @return String : Numéro du visiteur
     */
    public int getId() {
        return id;
    }
    
    /**
     * Obtenir le nom du visiteur
     * @return String : Nom du visiteur
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Obtenir le prénom du visiteur
     * @return String : Prénom du visiteur
     */
    public String getPrenom() {
        return prenom;
    }
    
    /**
     * Méthodes de comparaison entre deux Visiteur
     * @param obj Objet à comparer avec le Visiteur
     * @return boolean : true si les deux Visiteur sont égaux, sinon false
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
        final Visiteur other = (Visiteur) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return Objects.equals(this.prenom, other.prenom);
    }
    
    /**
     * Retourne une représentation textuelle de l'objet Visiteur
     * @return String : Une chaîne de caractères représentant le visiteur
     */
    @Override
    public String toString() {
        return "Visiteur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
}
