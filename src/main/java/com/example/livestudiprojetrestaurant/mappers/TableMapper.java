package com.example.livestudiprojetrestaurant.mappers;

import com.example.livestudiprojetrestaurant.business.Restaurant;
import com.example.livestudiprojetrestaurant.business.Table;
import com.example.livestudiprojetrestaurant.jpa.RestaurantEntity;
import com.example.livestudiprojetrestaurant.jpa.TableEntity;

public class TableMapper {

    public static TableEntity fromBusinessToEntity(Table table){
        TableEntity entity = new TableEntity();
        entity.setNumeroTable(table.getNumeroTable());
        entity.setNombreCouverts(table.getNombreCouverts());
        return entity;
    }

    public static Table fromEntityToBusiness(TableEntity entity){
        Table table = new Table();
        table.setNumeroTable(entity.getNumeroTable());
        table.setNombreCouverts(entity.getNombreCouverts());
        return table;
    }
}
