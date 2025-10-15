package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class holds City type objects in a List
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a City object to the list if it doesn't exist
     * @param c: the City object to be added
     */
    public void add(City c) {
        if (cities.contains(c)) {
            throw new IllegalArgumentException();
        }
        cities.add(c);
    }

    /**
     * Gets the list of cities sorted alphabetically
     * @return list: the list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
