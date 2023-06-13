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

        return entity;
    }
}
