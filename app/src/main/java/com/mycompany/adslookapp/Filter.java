package com.mycompany.adslookapp;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;

/**
 * Created by pulpo on 22/02/16.
 */

//@Generated("org.jsonschema2pojo")
public class Filter {

    private String id;
    private String name;
    private String type;
    private List<Value> values = new ArrayList<Value>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Filter() {
    }

    /**
     *
     * @param id
     * @param values
     * @param name
     * @param type
     */
    public Filter(String id, String name, String type, List<Value> values) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.values = values;
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

    public Filter withId(String id) {
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

    public Filter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Filter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     * The values
     */
    public List<Value> getValues() {
        return values;
    }

    /**
     *
     * @param values
     * The values
     */
    public void setValues(List<Value> values) {
        this.values = values;
    }

    public Filter withValues(List<Value> values) {
        this.values = values;
        return this;
    }

}

