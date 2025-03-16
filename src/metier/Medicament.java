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
    private String effets;
    private String contreIndications;
    private float prix;
    
    /**
     * Constructeur de la classe Medicament
     * @param id Dépôt légal du médicament
     * @param type Famille du médicament
     * @param nom Nom commercial du médicament
     * @param composition Composition du médicament
     * @param prix Prix du médicament
     */
    public Medicament(String id, String type, String nom, String composition, String effets, String contreIndications, float prix) {
        this.id = id;
        this.type = type;
        this.nom = nom;
        this.composition = composition;
        this.effets = effets;
        this.contreIndications = contreIndications;
        this.prix = prix;
    }
    
    /**
     * Obtenir le dépôt légal du médicament
     * @return String : Dépôt légal du médicament
     */
    public String getId() {
        return this.id;
    }
    
    /**
     * Obtenir le nom commercial du médicament
     * @return String : Nom commercial du médicament
     */
    public String getNom() {
        return this.nom;
    }
    
    /**
     * Obtenir la famille du médicament
     * @return String : Famille du médicament
     */
    public String getType() {
        return this.type;
    }
    
    /**
     * Obtenir la composition du médicament
     * @return String : Composition du médicament
     */
    public String getComposition() {
        return this.composition;
    }
    
    /**
     * Obtenir les effets du médicament
     * @return String : Effets du médicament
     */
    public String getEffets() {
        return this.effets;
    }
    
    /**
     * Obtenir les contre indications du médicament
     * @return String : Contre indications du médicament
     */
    public String getContreIndications() {
        return this.contreIndications;
    }
    
    /**
     * Obtenir le prix du médicament
     * @return String : Prix du médicament
     */
    public float getPrix() {
        return this.prix;
    }
    
    /**
     * Obtenir les informations du médicament
     * @return String : Informations du médicament
     */
    public String getInformation() {
        String str = "";
        str += "Nom commercial : "+this.nom;
        str += "\nDépôt légal : "+this.id;
        str += "\nFamille : "+this.type;
        str += "\nPrix : "+this.prix+" €";
        str += "\n\nComposition : "+this.composition;
        str += "\n\nEffets : "+this.effets;
        str += "\n\nContre-indications: "+this.contreIndications;
        
        return str;
    }
    
    /**
     * Méthode de comparaison entre deux Medicament
     * @param obj Objet à comparer avec le Medicament
     * @return boolean : true si les médicaments sont égaux, sinon false
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
     * Retourne une représentation textuelle de l'objet Medicament
     * @return String : Une chaîne de caractères représentant le médicament
     */
    @Override
    public String toString() {
        return "Medicament{" + "id=" + id + ", nom=" + nom + ", type=" + type + ", composition=" + composition + ", prix=" + prix + '}';
    }
}
