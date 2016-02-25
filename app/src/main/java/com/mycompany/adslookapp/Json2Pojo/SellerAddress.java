
package com.mycompany.adslookapp.Json2Pojo;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class SellerAddress {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("address_line")
    @Expose
    private String addressLine;
    @SerializedName("zip_code")
    @Expose
    private String zipCode;
    @SerializedName("country")
    @Expose
    private Country country;
    @SerializedName("state")
    @Expose
    private State state;
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("latitude")
    @Expose
    private Float latitude;
    @SerializedName("longitude")
    @Expose
    private Float longitude;

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
    public SellerAddress(Integer id, String comment, String addressLine, String zipCode, Country country, State state, City city, Float latitude, Float longitude) {
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
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
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
     *     The comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * 
     * @param comment
     *     The comment
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
     *     The addressLine
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * 
     * @param addressLine
     *     The address_line
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
     *     The zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 
     * @param zipCode
     *     The zip_code
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
     *     The country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
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
     *     The state
     */
    public State getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
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
     *     The city
     */
    public City getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
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
     *     The latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public SellerAddress withLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public SellerAddress withLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

}
