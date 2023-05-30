package com.example.livestudiprojetrestaurant.business;

import java.util.ArrayList;
import java.util.List;
public class Restaurant {

    private String nom;
    private String adresse;
    private String telephone;
    private String email;


    private List<Table> tables = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public Restaurant() {
    }

    public Restaurant(String nom, String adresse, String telephone, String email) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", tables=" + tables +
                ", reservations=" + reservations +
                '}';
    }


    public static Restaurant creationDeNotreRestaurant() {

        Restaurant restaurantMaria = new Restaurant("Chez Maria",
                "1 rue de la Paix",
                "0412345678",
                "maria@restaurant.fr");

        restaurantMaria.ajouterTable(1, 6);
        restaurantMaria.ajouterTable(2, 2);
        restaurantMaria.ajouterTable(3, 2);
        restaurantMaria.ajouterTable(4, 4);

        return restaurantMaria;
    }

    private void ajouterTable(int numeroTable, int nombreCouverts) {
        tables.add(new Table(numeroTable,nombreCouverts ));
    }


    public String validerDemandeReservation(DemandeReservation demande){


            if(demande.getHoraire().getHour() < 12){
                return "Le restaurant est ouvert à partir de 12h";
            }
            if(demande.getHoraire().getHour() > 13){
                return "Vous pouvez reserver uniquement pour 12h ou 13h";
            }
            if(demande.getNombreCouverts() > 6) {
                return "Le nombre de couverts maximum pour une réservation est de 6";
            }


            return "OK: réservation enregistrée";
    }
}

