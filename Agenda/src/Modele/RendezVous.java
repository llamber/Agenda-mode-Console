/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;

/**
 *
 * @author Ludo & Pierre
 */
public class RendezVous implements Serializable{
    String libelle;
    LocalDate date;
    LocalTime heureDebut, heureFin;
    boolean rappel;
   
    public RendezVous(LocalDate date, LocalTime heureDebut, LocalTime heureFin, boolean rappel, String libelle) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.rappel = rappel;
        this.libelle = libelle;
 
    }
  

    // Accesseur libelle
    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    // Accesseur date
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    // Accesseur heureDebut
    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }
   
    // Accesseur heureFin
    public LocalTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

    // Accesseur rappel
    public boolean isRappel() {
        return rappel;
    }

    public void setRappel(boolean rappel) {
        this.rappel = rappel;
    }

     @Override
    //cette méthode affiche les informations de l'employé
    public String toString() {
        return "[Date=" + this.date + ", hDebut=" + this.heureDebut + ", hFin=" + this.heureFin + ", rappel=" +
                this.rappel + ", libelle=" + this.libelle + "]";
    }
    
    public static Comparator<RendezVous> Comparator = new Comparator<RendezVous>() {
      
        @Override
        public int compare(RendezVous e1, RendezVous e2) {
            if(e1.getDate().compareTo(e2.getDate())==0){
                return e1.getHeureDebut().compareTo(e2.getHeureDebut());
            }else{
                return e1.getDate().compareTo(e2.getDate());
            }
        }
    };
}
