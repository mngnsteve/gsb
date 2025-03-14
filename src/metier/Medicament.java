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
public class Medicament {
    private String id;
    private String nom;
    private String type;
    private String composition;
    private float prix;
    
    //*****Constructeurs*****
    /**
     *
     * @param id
     * @param type
     * @param nom
     * @param composition
     * @param prix
     */
    public Medicament(String id, String type, String nom, String composition, float prix) {
        this.id = id;
        this.type = type;
        this.nom = nom;
        this.composition = composition;
        this.prix = prix;
    }
    
    //*****Getter et setter*****
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getComposition() {
        return composition;
    }
    
    public void setComposition(String composition) {
        this.composition = composition;
    }
    
    public float getPrix() {
        return prix;
    }
    
    public void setPrix(float prix) {
        this.prix = prix;
    }
    
    //*****Méthodes*****
    
    public String getInformation() {
        String str = "";
        str += "Id : ";
        str += this.id;
        str += "\nNom : ";
        str += this.nom;
        str += "\nType : ";
        str += this.type;
        str += "\nComposition : ";
        str += this.composition;
        str += "\nPrix : ";
        str += this.prix;
        return str;
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
        final Medicament other = (Medicament) obj;
        if (this.id.equals(other.id)) {
            return false;
        }
        if (Float.floatToIntBits(this.prix) != Float.floatToIntBits(other.prix)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return Objects.equals(this.composition, other.composition);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Medicament{" + "id=" + id + ", nom=" + nom + ", type=" + type + ", composition=" + composition + ", prix=" + prix + '}';
    }
    
}
