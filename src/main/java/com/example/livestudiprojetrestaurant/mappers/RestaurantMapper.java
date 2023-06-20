package com.example.livestudiprojetrestaurant.mappers;

import com.example.livestudiprojetrestaurant.business.Restaurant;
import com.example.livestudiprojetrestaurant.business.Table;
import com.example.livestudiprojetrestaurant.jpa.RestaurantEntity;
import com.example.livestudiprojetrestaurant.jpa.TableEntity;

public class RestaurantMapper {

    public static RestaurantEntity fromBusinessToEntity(Restaurant restaurant){
        RestaurantEntity entity = new RestaurantEntity();
        entity.setAdresse(restaurant.getAdresse());
        entity.setNom(restaurant.getNom());
        entity.setEmail(restaurant.getEmail());
        entity.setTelephone(restaurant.getTelephone());

        for(Table table : restaurant.getTables()){
            TableEntity tableEntity = TableMapper.fromBusinessToEntity(table);
            entity.addTable(tableEntity);
        }

        return entity;
    }
}
