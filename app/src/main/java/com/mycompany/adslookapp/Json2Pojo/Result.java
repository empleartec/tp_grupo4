
package com.mycompany.adslookapp.Json2Pojo;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Result {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private Object subtitle;
    @SerializedName("seller")
    @Expose
    private Seller seller;
    @SerializedName("price")
    @Expose
    private BigDecimal price;
    @SerializedName("currency_id")
    @Expose
    private String currencyId;
    @SerializedName("available_quantity")
    @Expose
    private Integer availableQuantity;
    @SerializedName("sold_quantity")
    @Expose
    private Integer soldQuantity;
    @SerializedName("buying_mode")
    @Expose
    private String buyingMode;
    @SerializedName("listing_type_id")
    @Expose
    private String listingTypeId;
    @SerializedName("stop_time")
    @Expose
    private String stopTime;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("accepts_mercadopago")
    @Expose
    private Boolean acceptsMercadopago;
    @SerializedName("installments")
    @Expose
    private Installments installments;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("shipping")
    @Expose
    private Shipping shipping;
    @SerializedName("seller_address")
    @Expose
    private SellerAddress sellerAddress;
    @SerializedName("attributes")
    @Expose
    private List<Object> attributes = new ArrayList<Object>();
    @SerializedName("original_price")
    @Expose
    private BigDecimal originalPrice;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("official_store_id")
    @Expose
    private Integer officialStoreId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param condition
     * @param currencyId
     * @param categoryId
     * @param seller
     * @param sellerAddress
     * @param installments
     * @param availableQuantity
     * @param buyingMode
     * @param stopTime
     * @param id
     * @param officialStoreId
     * @param shipping
     * @param title
     * @param thumbnail
     * @param price
     * @param soldQuantity
     * @param listingTypeId
     * @param originalPrice
     * @param permalink
     * @param siteId
     * @param address
     * @param subtitle
     * @param attributes
     * @param acceptsMercadopago
     */
    public Result(String id, String siteId, String title, Object subtitle, Seller seller, BigDecimal price, String currencyId, Integer availableQuantity, Integer soldQuantity, String buyingMode, String listingTypeId, String stopTime, String condition, String permalink, String thumbnail, Boolean acceptsMercadopago, Installments installments, Address address, Shipping shipping, SellerAddress sellerAddress, List<Object> attributes, BigDecimal originalPrice, String categoryId, Integer officialStoreId) {
        this.id = id;
        this.siteId = siteId;
        this.title = title;
        this.subtitle = subtitle;
        this.seller = seller;
        this.price = price;
        this.currencyId = currencyId;
        this.availableQuantity = availableQuantity;
        this.soldQuantity = soldQuantity;
        this.buyingMode = buyingMode;
        this.listingTypeId = listingTypeId;
        this.stopTime = stopTime;
        this.condition = condition;
        this.permalink = permalink;
        this.thumbnail = thumbnail;
        this.acceptsMercadopago = acceptsMercadopago;
        this.installments = installments;
        this.address = address;
        this.shipping = shipping;
        this.sellerAddress = sellerAddress;
        this.attributes = attributes;
        this.originalPrice = originalPrice;
        this.categoryId = categoryId;
        this.officialStoreId = officialStoreId;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Result withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The siteId
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * 
     * @param siteId
     *     The site_id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public Result withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Result withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The subtitle
     */
    public Object getSubtitle() {
        return subtitle;
    }

    /**
     * 
     * @param subtitle
     *     The subtitle
     */
    public void setSubtitle(Object subtitle) {
        this.subtitle = subtitle;
    }

    public Result withSubtitle(Object subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    /**
     * 
     * @return
     *     The seller
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     * 
     * @param seller
     *     The seller
     */
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Result withSeller(Seller seller) {
        this.seller = seller;
        return this;
    }

    /**
     * 
     * @return
     *     The price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Result withPrice(BigDecimal price) {
        this.price = price;
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

    public Result withCurrencyId(String currencyId) {
        this.currencyId = currencyId;
        return this;
    }

    /**
     * 
     * @return
     *     The availableQuantity
     */
    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * 
     * @param availableQuantity
     *     The available_quantity
     */
    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Result withAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    /**
     * 
     * @return
     *     The soldQuantity
     */
    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    /**
     * 
     * @param soldQuantity
     *     The sold_quantity
     */
    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public Result withSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
        return this;
    }

    /**
     * 
     * @return
     *     The buyingMode
     */
    public String getBuyingMode() {
        return buyingMode;
    }

    /**
     * 
     * @param buyingMode
     *     The buying_mode
     */
    public void setBuyingMode(String buyingMode) {
        this.buyingMode = buyingMode;
    }

    public Result withBuyingMode(String buyingMode) {
        this.buyingMode = buyingMode;
        return this;
    }

    /**
     * 
     * @return
     *     The listingTypeId
     */
    public String getListingTypeId() {
        return listingTypeId;
    }

    /**
     * 
     * @param listingTypeId
     *     The listing_type_id
     */
    public void setListingTypeId(String listingTypeId) {
        this.listingTypeId = listingTypeId;
    }

    public Result withListingTypeId(String listingTypeId) {
        this.listingTypeId = listingTypeId;
        return this;
    }

    /**
     * 
     * @return
     *     The stopTime
     */
    public String getStopTime() {
        return stopTime;
    }

    /**
     * 
     * @param stopTime
     *     The stop_time
     */
    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public Result withStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * 
     * @return
     *     The condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * 
     * @param condition
     *     The condition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Result withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 
     * @return
     *     The permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * 
     * @param permalink
     *     The permalink
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Result withPermalink(String permalink) {
        this.permalink = permalink;
        return this;
    }

    /**
     * 
     * @return
     *     The thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 
     * @param thumbnail
     *     The thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Result withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * 
     * @return
     *     The acceptsMercadopago
     */
    public Boolean getAcceptsMercadopago() {
        return acceptsMercadopago;
    }

    /**
     * 
     * @param acceptsMercadopago
     *     The accepts_mercadopago
     */
    public void setAcceptsMercadopago(Boolean acceptsMercadopago) {
        this.acceptsMercadopago = acceptsMercadopago;
    }

    public Result withAcceptsMercadopago(Boolean acceptsMercadopago) {
        this.acceptsMercadopago = acceptsMercadopago;
        return this;
    }

    /**
     * 
     * @return
     *     The installments
     */
    public Installments getInstallments() {
        return installments;
    }

    /**
     * 
     * @param installments
     *     The installments
     */
    public void setInstallments(Installments installments) {
        this.installments = installments;
    }

    public Result withInstallments(Installments installments) {
        this.installments = installments;
        return this;
    }

    /**
     * 
     * @return
     *     The address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    public Result withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * @return
     *     The shipping
     */
    public Shipping getShipping() {
        return shipping;
    }

    /**
     * 
     * @param shipping
     *     The shipping
     */
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Result withShipping(Shipping shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     * 
     * @return
     *     The sellerAddress
     */
    public SellerAddress getSellerAddress() {
        return sellerAddress;
    }

    /**
     * 
     * @param sellerAddress
     *     The seller_address
     */
    public void setSellerAddress(SellerAddress sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public Result withSellerAddress(SellerAddress sellerAddress) {
        this.sellerAddress = sellerAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    public List<Object> getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    public Result withAttributes(List<Object> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * 
     * @return
     *     The originalPrice
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 
     * @param originalPrice
     *     The original_price
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Result withOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    /**
     * 
     * @return
     *     The categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 
     * @param categoryId
     *     The category_id
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Result withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 
     * @return
     *     The officialStoreId
     */
    public Integer getOfficialStoreId() {
        return officialStoreId;
    }

    /**
     * 
     * @param officialStoreId
     *     The official_store_id
     */
    public void setOfficialStoreId(Integer officialStoreId) {
        this.officialStoreId = officialStoreId;
    }

    public Result withOfficialStoreId(Integer officialStoreId) {
        this.officialStoreId = officialStoreId;
        return this;
    }

}
