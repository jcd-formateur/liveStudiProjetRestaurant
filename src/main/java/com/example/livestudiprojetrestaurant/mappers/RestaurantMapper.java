package com.example.livestudiprojetrestaurant.mappers;

import com.example.livestudiprojetrestaurant.business.Restaurant;
import com.example.livestudiprojetrestaurant.jpa.RestaurantEntity;

public class RestaurantMapper {

    public static RestaurantEntity fromBusinessToEntity(Restaurant restaurant){
        RestaurantEntity entity = new RestaurantEntity();
        entity.setAdresse(restaurant.getAdresse());
        entity.setNom(restaurant.getNom());
        entity.setEmail(restaurant.getEmail());
        entity.setTelephone(restaurant.getTelephone());
        return entity;
    }
}
