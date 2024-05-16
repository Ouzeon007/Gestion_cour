import java.util.Scanner;

import Services.CourService;
import Services.ProfesseurService;
import entities.Professeur;
import views.CourVue;
import views.ProfVue;
import views.Vue;

public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Vue.setScanner(scanner);
        int choix;
        ProfesseurService professeurService=new ProfesseurService();
        CourService courService=new CourService();
        ProfVue profVue=new ProfVue(); 
        CourVue courVue=new CourVue(professeurService);

        do {
            choix=menu();
            switch (choix) {
                case 1->{
                    if (professeurService.save(profVue.saisie())==false) {
                        System.out.println("le prof existe deja");
                    }
                }
                case 2->{
                    profVue.affiche(professeurService.getProfs());
                }
                case 3->{
                    courService.save(courVue.saisie());
                }
                case 4->{
                    courVue.affiche(courService.getCours());
                }
                case 5->{
                    String nom;
                    Professeur professeur;
                    do {
                        System.out.println("Entrer le non du professeur qui enseigne ce cour");
                        nom=scanner.nextLine();
                        professeur= professeurService.retrouver(nom);
                    } while (professeur==null);

                    courVue.affiche(professeur.getCours());
                }
               
            }
        } while (choix!=6);
    }

    public static int menu(){
        System.out.println("-------------------------------------------");
        System.out.println("1- Ajouter un professeur");
        System.out.println("2- lister les professeur");
        System.out.println("3- Creer un cour");
        System.out.println("4- lister les cours");
        System.out.println("5- lister les cours d'un professeur");
        System.out.println("6- Quitter");
        System.out.println("Veuiller faire votre choix");
        return scanner.nextInt();
    }
}
