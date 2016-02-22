package com.mycompany.adslookapp;

//package com.mycompany.adslookapp;

/**
 * Created by pulpo on 22/02/16.
 */

//@Generated("org.jsonschema2pojo")
public class Installments {

    private Integer quantity;
    private Double amount;
    private String currencyId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Installments() {
    }

    /**
     *
     * @param amount
     * @param currencyId
     * @param quantity
     */
    public Installments(Integer quantity, Double amount, String currencyId) {
        this.quantity = quantity;
        this.amount = amount;
        this.currencyId = currencyId;
    }

    /**
     *
     * @return
     * The quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     * The quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Installments withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *
     * @return
     * The amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     *
     * @param amount
     * The amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Installments withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     *
     * @return
     * The currencyId
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     *
     * @param currencyId
     * The currency_id
     */
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Installments withCurrencyId(String currencyId) {
        this.currencyId = currencyId;
        return this;
    }

}

