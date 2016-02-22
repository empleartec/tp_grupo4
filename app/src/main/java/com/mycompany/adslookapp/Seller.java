package com.mycompany.adslookapp;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;

/**
 * Created by pulpo on 22/02/16.
 */

//@Generated("org.jsonschema2pojo")
public class Seller {

    private Integer id;
    private Object powerSellerStatus;
    private Boolean carDealer;
    private Boolean realEstateAgency;
    private List<Object> tags = new ArrayList<Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Seller() {
    }

    /**
     *
     * @param tags
     * @param powerSellerStatus
     * @param id
     * @param realEstateAgency
     * @param carDealer
     */
    public Seller(Integer id, Object powerSellerStatus, Boolean carDealer, Boolean realEstateAgency, List<Object> tags) {
        this.id = id;
        this.powerSellerStatus = powerSellerStatus;
        this.carDealer = carDealer;
        this.realEstateAgency = realEstateAgency;
        this.tags = tags;
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

    public Seller withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     * The powerSellerStatus
     */
    public Object getPowerSellerStatus() {
        return powerSellerStatus;
    }

    /**
     *
     * @param powerSellerStatus
     * The power_seller_status
     */
    public void setPowerSellerStatus(Object powerSellerStatus) {
        this.powerSellerStatus = powerSellerStatus;
    }

    public Seller withPowerSellerStatus(Object powerSellerStatus) {
        this.powerSellerStatus = powerSellerStatus;
        return this;
    }

    /**
     *
     * @return
     * The carDealer
     */
    public Boolean getCarDealer() {
        return carDealer;
    }

    /**
     *
     * @param carDealer
     * The car_dealer
     */
    public void setCarDealer(Boolean carDealer) {
        this.carDealer = carDealer;
    }

    public Seller withCarDealer(Boolean carDealer) {
        this.carDealer = carDealer;
        return this;
    }

    /**
     *
     * @return
     * The realEstateAgency
     */
    public Boolean getRealEstateAgency() {
        return realEstateAgency;
    }

    /**
     *
     * @param realEstateAgency
     * The real_estate_agency
     */
    public void setRealEstateAgency(Boolean realEstateAgency) {
        this.realEstateAgency = realEstateAgency;
    }

    public Seller withRealEstateAgency(Boolean realEstateAgency) {
        this.realEstateAgency = realEstateAgency;
        return this;
    }

    /**
     *
     * @return
     * The tags
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Seller withTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

}

