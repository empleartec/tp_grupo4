package com.mycompany.adslookapp;

//import javax.annotation.Generated;

/**
 * Created by pulpo on 22/02/16.
 */

//@Generated("org.jsonschema2pojo")
public class Address {

    private String stateId;
    private String stateName;
    private String cityId;
    private String cityName;

    /**
     * No args constructor for use in serialization
     *
     */
    public Address() {
    }

    /**
     *
     * @param cityId
     * @param stateId
     * @param cityName
     * @param stateName
     */
    public Address(String stateId, String stateName, String cityId, String cityName) {
        this.stateId = stateId;
        this.stateName = stateName;
        this.cityId = cityId;
        this.cityName = cityName;
    }

    /**
     *
     * @return
     * The stateId
     */
    public String getStateId() {
        return stateId;
    }

    /**
     *
     * @param stateId
     * The state_id
     */
    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public Address withStateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    /**
     *
     * @return
     * The stateName
     */
    public String getStateName() {
        return stateName;
    }

    /**
     *
     * @param stateName
     * The state_name
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Address withStateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    /**
     *
     * @return
     * The cityId
     */
    public String getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Address withCityId(String cityId) {
        this.cityId = cityId;
        return this;
    }

    /**
     *
     * @return
     * The cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     *
     * @param cityName
     * The city_name
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Address withCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

}

