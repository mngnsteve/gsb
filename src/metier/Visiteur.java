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
    
    //*****Constructeur*****
    /**
     *
     * @param id
     * @param nom
     * @param prenom
     */
    public Visiteur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    //*****Getter et setter*****
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Nom ne peut pas être nul ou vide");
        }
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.nom);
        hash = 29 * hash + Objects.hashCode(this.prenom);
        return hash;
    }
    
    /**
     * Méthodes
     * @param obj
     * @return
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
     *
     * @return
     */
    @Override
    public String toString() {
        return "Visiteur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
}
