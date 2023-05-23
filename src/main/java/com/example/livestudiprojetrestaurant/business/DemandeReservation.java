package com.example.livestudiprojetrestaurant.business;

import java.time.LocalDateTime;

public class DemandeReservation {

    private int nombreCouverts;
    private LocalDateTime horaire;
    private String prenom;
    private String nom;

    public DemandeReservation() {
    }
    public DemandeReservation(int nombreCouverts, LocalDateTime horaire, String prenom, String nom) {
        this.nombreCouverts = nombreCouverts;
        this.horaire = horaire;
        this.prenom = prenom;
        this.nom = nom;
    }

    public int getNombreCouverts() {
        return nombreCouverts;
    }

    public void setNombreCouverts(int nombreCouverts) {
        this.nombreCouverts = nombreCouverts;
    }

    public LocalDateTime getHoraire() {
        return horaire;
    }

    public void setHoraire(LocalDateTime horaire) {
        this.horaire = horaire;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "DemandeReservation{" +
                "nombreCouverts=" + nombreCouverts +
                ", horaire=" + horaire +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
