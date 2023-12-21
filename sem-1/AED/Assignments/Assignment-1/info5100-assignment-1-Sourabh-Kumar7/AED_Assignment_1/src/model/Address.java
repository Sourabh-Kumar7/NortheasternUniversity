/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sourabhkumar
 */
/**
 * The Address class represents a physical address with various attributes.
 */
public class Address {
    private String street;          // Street address
    private String name;            // name
    private String apartment;       // Apartment or unit number
    private String city;            // City name
    private String state;           // State or province name
    private String country;         // Country name
    private String postalCode;      // Postal code
    private String phoneNumber;
    // Constructors
//    public Address(double latitude, double longitude, String street, String apartment, String city, String state, String country, String postalCode) {
//        this.street = street;
//        this.apartment = apartment;
//        this.city = city;
//        this.state = state;
//        this.country = country;
//        this.postalCode = postalCode;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
}
