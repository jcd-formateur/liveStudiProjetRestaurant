package com.example.livestudiprojetrestaurant;

import com.example.livestudiprojetrestaurant.business.Restaurant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LiveStudiProjetRestaurantUnitTests {

    @Test
    void testCreationRestaurantMaria() {

        Restaurant restaurant = Restaurant.creationDeNotreRestaurant();
        System.out.println(restaurant);
        assertEquals(4, restaurant.getTables().size());
    }

}
