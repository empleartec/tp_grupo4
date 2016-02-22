package com.mycompany.adslookapp;

/**
 * Created by pulpo on 22/02/16.
 */

//import javax.annotation.Generated;

//@Generated("org.jsonschema2pojo")
public class Value_ {

    private String id;
    private String name;
    private Integer results;

    /**
     * No args constructor for use in serialization
     *
     */
    public Value_() {
    }

    /**
     *
     * @param id
     * @param results
     * @param name
     */
    public Value_(String id, String name, Integer results) {
        this.id = id;
        this.name = name;
        this.results = results;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Value_ withId(String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Value_ withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     * The results
     */
    public Integer getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(Integer results) {
        this.results = results;
    }

    public Value_ withResults(Integer results) {
        this.results = results;
        return this;
    }

}
