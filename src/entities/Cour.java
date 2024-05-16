package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cour {
    private int id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private Professeur professeur;
    private static int nbrCour;
    public static int getNbrCour() {
        return ++nbrCour;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalTime getHeureDebut() {
        return heureDebut;
    }
    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }
    public LocalTime getHeureFin() {
        return heureFin;
    }
    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }
    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    @Override
    public String toString() {
        return "Cour [id=" + id + ", date=" + date + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + "]";
    }
    
}
