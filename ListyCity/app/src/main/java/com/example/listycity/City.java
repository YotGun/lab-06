package com.example.listycity;

/**
 * This is the class for the City object
 */
public class City implements Comparable<Object> {
    private String city;
    private String province;

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the city
     * @return city: the String for the city name
     */
    public String getCity() {
        return city;
    }

    /**
     * Gets the name of the province
     * @return province: the String for the province name
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the city name
     * @param city: the String which will set the city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets the province name
     * @param province: the Stringw which will set the province name
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Compares cities based on the city name alphabetically
     * @return -1 if the caller's city name is greater than the field
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCity());
    }
}
