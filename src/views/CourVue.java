package views;


import java.util.List;

import core.iService;
import entities.Cour;
import entities.Professeur;

public class CourVue extends Vue {
    public CourVue(iService<Professeur> profServices) {
        this.profServices = profServices;
    }

    private iService<Professeur> profServices;
    
    public Cour saisie(){
        Cour cour=new Cour();
        String nom;
            System.out.println("entrer la date du cour");
        scanner.nextLine();
        cour.setDate(formatDate(scanner.nextLine()));

        do {
            System.out.println("Entrer l'heure de debut du cour");
            cour.setHeureDebut(fomatHeure(scanner.nextLine()));
            System.out.println("Entrer l'heure de fin du cour");
            cour.setHeureFin(fomatHeure(scanner.nextLine()));
        } while (cour.getHeureDebut().compareTo(cour.getHeureFin())>=0);
        
        Professeur professeur=null;
        do {
            System.out.println("Entrer le non du professeur qui enseigne ce cour");
            nom=scanner.nextLine();
            professeur= profServices.retrouver(nom);
        } while (professeur==null);
        
        cour.setProfesseur(professeur);
        professeur.add(cour);
        return cour;

    }

     public void affiche(List<Cour> cours){
        for (Cour data : cours) {
            System.out.println(data);
        }
    }
}
