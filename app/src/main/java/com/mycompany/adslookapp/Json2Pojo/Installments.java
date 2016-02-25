
package com.mycompany.adslookapp.Json2Pojo;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Installments {

    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("amount")
    @Expose
    private Float amount;
    @SerializedName("currency_id")
    @Expose
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
    public Installments(Integer quantity, Float amount, String currencyId) {
        this.quantity = quantity;
        this.amount = amount;
        this.currencyId = currencyId;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
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
     *     The amount
     */
    public Float getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Installments withAmount(Float amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 
     * @return
     *     The currencyId
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * 
     * @param currencyId
     *     The currency_id
     */
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Installments withCurrencyId(String currencyId) {
        this.currencyId = currencyId;
        return this;
    }

}
