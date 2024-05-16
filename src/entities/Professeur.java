
package entities;

import java.util.ArrayList;
import java.util.List;


/**
 * Professeur
 */
public class Professeur{
    private int id;
    private String nom;
    private String Telephone;
    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }
    private static int nbrProf;
    private List<Cour> cours=new ArrayList<>();

    public List<Cour> getCours() {
        return cours;
    }

    public void add(Cour cour) {
        cours.add(cour);
    }

    public static int getNbrProf() {
        return ++nbrProf;
    }
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
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Professeur [id=" + id + ", nom=" + nom + ", Telephone=" + Telephone + "]";
    }


}