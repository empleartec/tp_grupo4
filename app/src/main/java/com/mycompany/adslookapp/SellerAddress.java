package com.mycompany.adslookapp;

/**
 * Created by pulpo on 22/02/16.
 */

//import javax.annotation.Generated;

//@Generated("org.jsonschema2pojo")
public class SellerAddress {

    private Integer id;
    private String comment;
    private String addressLine;
    private String zipCode;
    private Country country;
    private State state;
    private City city;
    private Double latitude;
    private Double longitude;

    /**
     * No args constructor for use in serialization
     *
     */
    public SellerAddress() {
    }

    /**
     *
     * @param addressLine
     * @param id
     * @param zipCode
     * @param state
     * @param longitude
     * @param latitude
     * @param comment
     * @param city
     * @param country
     */
    public SellerAddress(Integer id, String comment, String addressLine, String zipCode, Country country, State state, City city, Double latitude, Double longitude) {
        this.id = id;
        this.comment = comment;
        this.addressLine = addressLine;
        this.zipCode = zipCode;
        this.country = country;
        this.state = state;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public SellerAddress withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     * The comment
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     * The comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    public SellerAddress withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *
     * @return
     * The addressLine
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     *
     * @param addressLine
     * The address_line
     */
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public SellerAddress withAddressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    /**
     *
     * @return
     * The zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     *
     * @param zipCode
     * The zip_code
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public SellerAddress withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     *
     * @return
     * The country
     */
    public Country getCountry() {
        return country;
    }

    /**
     *
     * @param country
     * The country
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    public SellerAddress withCountry(Country country) {
        this.country = country;
        return this;
    }

    /**
     *
     * @return
     * The state
     */
    public State getState() {
        return state;
    }

    /**
     *
     * @param state
     * The state
     */
    public void setState(State state) {
        this.state = state;
    }

    public SellerAddress withState(State state) {
        this.state = state;
        return this;
    }

    /**
     *
     * @return
     * The city
     */
    public City getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(City city) {
        this.city = city;
    }

    public SellerAddress withCity(City city) {
        this.city = city;
        return this;
    }

    /**
     *
     * @return
     * The latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public SellerAddress withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     *
     * @return
     * The longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public SellerAddress withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

}
