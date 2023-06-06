package com.example.livestudiprojetrestaurant;

import com.example.livestudiprojetrestaurant.business.DemandeReservation;
import com.example.livestudiprojetrestaurant.business.Restaurant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class LiveStudiProjetRestaurantUnitTests {

    static Restaurant restaurant;


    @BeforeEach
    void setUp(){
        restaurant = Restaurant.creationDeNotreRestaurant();
    }

    /*@Test
    void testCreationRestaurantMaria() {

        System.out.println(restaurant);
        assertEquals(4, restaurant.getTables().size());
    }*/

    @Test
    void testHoraireMin(){
        DemandeReservation demande = new DemandeReservation(4
                                                            , LocalDateTime.of(2023, 6, 21, 10, 0)
                                                            , "Michel"
                                                            , "Dupont"
        );
        assertEquals("Le restaurant est ouvert à partir de 12h",
                restaurant.validerDemandeReservation(demande));
    }
    @Test
    void testHoraireMax(){
        DemandeReservation demande = new DemandeReservation(4
                , LocalDateTime.of(2023, 6, 21, 14, 0)
                , "Michel"
                , "Dupont"
        );
        assertEquals("Vous pouvez reserver uniquement pour 12h ou 13h",
                restaurant.validerDemandeReservation(demande));
    }
    @Test
    void testHoraireMidi(){
        DemandeReservation demande = new DemandeReservation(4
                , LocalDateTime.of(2023, 6, 21, 12, 0)
                , "Michel"
                , "Dupont"
        );
        assertEquals("OK: réservation enregistrée",
                restaurant.validerDemandeReservation(demande));
    }
    @Test
    void testHoraireTreizeHeure(){
        DemandeReservation demande = new DemandeReservation(4
                , LocalDateTime.of(2023, 6, 21, 13, 5)
                , "Michel"
                , "Dupont"
        );
        assertEquals("Vous pouvez reserver uniquement pour 12h ou 13h",
                restaurant.validerDemandeReservation(demande));
    }

    @Test
    void testOrdreTables() {
        System.out.println(restaurant.getTables());
        assertEquals(2, restaurant.getTables().get(0).getNombreCouverts());
        assertEquals(6, restaurant.getTables().get(3).getNombreCouverts());
    }

    @Test
    void testReservation() {
        DemandeReservation demande = new DemandeReservation(6
                , LocalDateTime.of(2023, 6, 21, 13, 0)
                , "Michel"
                , "Dupont"
        );
        String reponse = restaurant.validerDemandeReservation(demande);
        assertEquals("OK: réservation enregistrée", reponse);

        String reponse2 = restaurant.validerDemandeReservation(demande);
        assertNotEquals("OK: réservation enregistrée", reponse2);
    }

}
