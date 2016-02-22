package com.mycompany.adslookapp;

/**
 * Created by pulpo on 22/02/16.
 */

 //import javax.annotation.Generated;

//@Generated("org.jsonschema2pojo")
public class Paging {

    private Integer total;
    private Integer offset;
    private Integer limit;

    /**
     * No args constructor for use in serialization
     *
     */
    public Paging() {
    }

    /**
     *
     * @param limit
     * @param total
     * @param offset
     */
    public Paging(Integer total, Integer offset, Integer limit) {
        this.total = total;
        this.offset = offset;
        this.limit = limit;
    }

    /**
     *
     * @return
     * The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     *
     * @param total
     * The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Paging withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     *
     * @return
     * The offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     *
     * @param offset
     * The offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Paging withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     *
     * @return
     * The limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     *
     * @param limit
     * The limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Paging withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

}
