
package com.mycompany.adslookapp.Json2Pojo;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Address {

    @SerializedName("state_id")
    @Expose
    private String stateId;
    @SerializedName("state_name")
    @Expose
    private String stateName;
    @SerializedName("city_id")
    @Expose
    private String cityId;
    @SerializedName("city_name")
    @Expose
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
     *     The stateId
     */
    public String getStateId() {
        return stateId;
    }

    /**
     * 
     * @param stateId
     *     The state_id
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
     *     The stateName
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * 
     * @param stateName
     *     The state_name
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
     *     The cityId
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 
     * @param cityId
     *     The city_id
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
     *     The cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 
     * @param cityName
     *     The city_name
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Address withCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

}
