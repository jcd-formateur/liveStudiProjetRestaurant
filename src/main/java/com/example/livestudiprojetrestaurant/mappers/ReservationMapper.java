package com.example.livestudiprojetrestaurant.mappers;

import com.example.livestudiprojetrestaurant.business.Reservation;
import com.example.livestudiprojetrestaurant.jpa.ReservationEntity;

import java.time.LocalDateTime;

public class ReservationMapper {

    public static ReservationEntity fromBusinessToEntity(Reservation reservation){
        ReservationEntity entity = new ReservationEntity(
                reservation.getNombreCouverts()
                , reservation.getHoraire()
                , reservation.getPrenom()
                , reservation.getNom()
        );

        entity.setTable(TableMapper.fromBusinessToEntity(reservation.getTable()));

        // non terminé : rajouter dans Reservation un attribut Restaurant
        //entity.setRestaurant(RestaurantMapper.fromBusinessToEntity(reservation.get));

        return entity;
    }
}
