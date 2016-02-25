
package com.mycompany.adslookapp.Json2Pojo;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Shipping {

    @SerializedName("free_shipping")
    @Expose
    private Boolean freeShipping;
    @SerializedName("mode")
    @Expose
    private String mode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Shipping() {
    }

    /**
     * 
     * @param freeShipping
     * @param mode
     */
    public Shipping(Boolean freeShipping, String mode) {
        this.freeShipping = freeShipping;
        this.mode = mode;
    }

    /**
     * 
     * @return
     *     The freeShipping
     */
    public Boolean getFreeShipping() {
        return freeShipping;
    }

    /**
     * 
     * @param freeShipping
     *     The free_shipping
     */
    public void setFreeShipping(Boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public Shipping withFreeShipping(Boolean freeShipping) {
        this.freeShipping = freeShipping;
        return this;
    }

    /**
     * 
     * @return
     *     The mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * 
     * @param mode
     *     The mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    public Shipping withMode(String mode) {
        this.mode = mode;
        return this;
    }

}
