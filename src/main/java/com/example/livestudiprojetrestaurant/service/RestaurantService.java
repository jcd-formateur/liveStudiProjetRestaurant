package com.example.livestudiprojetrestaurant.service;

import com.example.livestudiprojetrestaurant.business.DemandeReservation;
import com.example.livestudiprojetrestaurant.business.Reservation;
import com.example.livestudiprojetrestaurant.business.Restaurant;
import com.example.livestudiprojetrestaurant.jpa.ReservationEntity;
import com.example.livestudiprojetrestaurant.jpa.ReservationRepository;
import com.example.livestudiprojetrestaurant.jpa.RestaurantEntity;
import com.example.livestudiprojetrestaurant.jpa.RestaurantRepository;
import com.example.livestudiprojetrestaurant.mappers.ReservationMapper;
import com.example.livestudiprojetrestaurant.mappers.RestaurantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    RestaurantRepository restaurantRepository;

    public List<Reservation> getReservations(){
        List<Reservation> reservations = new ArrayList<>();

        List<ReservationEntity> entities = reservationRepository.findAll();
        for(ReservationEntity entity : entities){
                   reservations.add(ReservationMapper.fromEntityToBusiness(entity));
        }
        return reservations;
    }

    public void ajouterReservation(DemandeReservation demande){
        Optional<RestaurantEntity> optional  = restaurantRepository.findById(1);
        if(optional.isPresent()){
            RestaurantEntity entity = optional.get();
            Restaurant resto = RestaurantMapper.fromEntityToBusiness(entity);
            String reponse = resto.validerDemandeReservation(demande);
            // TODO: en fonction de la réponse,
            //  enregistrer ou non la reservation en base de données
        }

    }

}
