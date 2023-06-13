package com.example.livestudiprojetrestaurant.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository
        extends JpaRepository<RestaurantEntity, Integer> {
}
