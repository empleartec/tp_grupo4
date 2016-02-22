package com.mycompany.adslookapp;

/**
 * Created by pulpo on 22/02/16.
 */

//import javax.annotation.Generated;

//@Generated("org.jsonschema2pojo")
public class PathFromRoot {

    private String id;
    private String name;

    /**
     * No args constructor for use in serialization
     *
     */
    public PathFromRoot() {
    }

    /**
     *
     * @param id
     * @param name
     */
    public PathFromRoot(String id, String name) {
        this.id = id;
        this.name = name;
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

    public PathFromRoot withId(String id) {
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

    public PathFromRoot withName(String name) {
        this.name = name;
        return this;
    }

}

