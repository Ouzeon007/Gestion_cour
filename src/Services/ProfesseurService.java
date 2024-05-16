package Services;

import java.util.ArrayList;
import java.util.List;

import entities.Professeur;

public class ProfesseurService extends Services<Professeur> {
    
    private List<Professeur> profs=new ArrayList<>();

    public List<Professeur> getProfs() {
        return profs;
    }
    public boolean save(Professeur professeur){
        for (Professeur prof : profs) {
            if (prof.getTelephone().compareTo(professeur.getTelephone())==0) {
                return false;
            }
        }
        professeur.setId(generateId());
        profs.add(professeur);
        return true;
    }
    public int generateId(){
        return Professeur.getNbrProf();
    }

    @Override
    public Professeur retrouver(String nom){
        for (Professeur professeur:profs ) {
            if (professeur!=null) {
                if (professeur.getNom().compareTo(nom)==0) {
                    return professeur;
                }
            }
        }
        return null;
    }


    

}
