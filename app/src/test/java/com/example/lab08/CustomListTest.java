package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because deleteCity() doesn't exist
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        City vancouver = new City("Vancouver", "BC");
        list.addCity(calgary);
        list.addCity(edmonton);
        list.addCity(vancouver);
        // This will fail initially because countCities() doesn't exist
        assertTrue(list.countCities() == 3);
        list.deleteCity(calgary);
        assertTrue(list.countCities() == 2);
    }
}
