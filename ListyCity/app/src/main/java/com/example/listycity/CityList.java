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

    /**
     * Checks if a City object is in the list
     * @param c: the City object to be checked
     * @return boolean: true if the City object is in the list
     */
    public boolean hasCity(City c) {
        for (City city : cities) {
            if (city.getCity() == c.getCity() && city.getProvince() == c.getProvince()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Deletes a City object from the list, raises an exception if it doesn't exist
     * @param c: the City object to be deleted
     */
    public void delete(City c) {
        for (City city : cities) {
            if (city.getCity() == c.getCity() && city.getProvince() == c.getProvince()) {
                cities.remove(city);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /**
     * Gets the number of cities in the CityList class
     * @return int: number of cities
     */
    public int countCities() {
        return cities.size();
    }
}
