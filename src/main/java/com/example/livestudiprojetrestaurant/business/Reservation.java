package com.example.livestudiprojetrestaurant.business;

import java.time.LocalDateTime;

public class Reservation {

    private int nombreCouverts;
    private LocalDateTime horaire;
    private String prenom;
    private String nom;

    private Table table;

    public Reservation(int nombreCouverts, LocalDateTime horaire, String prenom, String nom) {
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

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "nombreCouverts=" + nombreCouverts +
                ", horaire=" + horaire +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", table=" + table +
                '}';
    }
}
