package views;

import java.util.List;

import entities.Professeur;

public class ProfVue extends Vue {
    
    public Professeur saisie(){
        Professeur prof=new Professeur();
        do {
            System.out.println("Entrer le nom du professeur");
            scanner.nextLine();
            prof.setNom(scanner.nextLine());
        } while (prof.getNom().length()==0);
        do {
            System.out.println("Entrer le telephone du professeur");
            prof.setTelephone(scanner.nextLine());
        } while (prof.getTelephone().length()==0);

        return prof;
        
    }

    public void affiche(List<Professeur> Profs){
        for (Professeur data : Profs) {
            System.out.println(data);
        }
    }
}
