package com.example.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }


    //- When given a city, return whether or not it belongs in the list
    //- Test to see whether your method is correct
    // (Read https://www.infoworld.com/article/3305792/comparing-java-objects-with-equals-and-hashcode.html)
    /**
     * This checks if a city is in the list or not
     * @param city
     * This is the city which presence we are checking
     * @return
     * Return true or false
     */
    public boolean hasCity(City city){
        if (cities.contains(city)){
            return true;
        } else {
            return false;
        }
    }

    //- Check if a city is present in the list. If it does then remove it from the list, if not then **throw an exception**
    //- Test to see if your method actually removes it from the list
    //- Test to see if the exception is actually thrown
    // (Read more here https://howtodoinjava.com/junit5/expected-exception-example/)
    /**
     * This deletes a city from the list if the list has the city
     * Otherwise, it throws an exception
     * @param city
     * This is the city to delete from the list
     */
    public void delete(City city) {
        if (hasCity(city)){ //.this?
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    //- Return how many cities are in the list
    //- Test to see whether your method is correct
    /**
     * This returns the number of cities in the list
     * @return
     * We return the number of cities in the list
     */
    public int countCities(){
        return cities.size();
    }
}

