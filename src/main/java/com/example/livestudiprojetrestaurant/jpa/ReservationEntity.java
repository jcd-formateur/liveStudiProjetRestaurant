package com.example.livestudiprojetrestaurant.jpa;

import com.example.livestudiprojetrestaurant.business.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@jakarta.persistence.Table(name="reservations")
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int nombreCouverts;
    private LocalDateTime horaire;
    private String prenom;
    private String nom;

    //private Table table;

    public ReservationEntity() {
    }

    public ReservationEntity(int nombreCouverts, LocalDateTime horaire, String prenom, String nom) {
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
/*
    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }*/

    @Override
    public String toString() {
        return "ReservationEntity{" +
                "nombreCouverts=" + nombreCouverts +
                ", horaire=" + horaire +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
             //   ", table=" + table +
                '}';
    }
}
