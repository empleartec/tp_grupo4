package com.mycompany.adslookapp;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;

/**
 * Created by pulpo on 22/02/16.
 */

//@Generated("org.jsonschema2pojo")
public class AvailableFilter {

    private String id;
    private String name;
    private String type;
    private List<Value_> values = new ArrayList<Value_>();

    /**
     * No args constructor for use in serialization
     *
     */
    public AvailableFilter() {
    }

    /**
     *
     * @param id
     * @param values
     * @param name
     * @param type
     */
    public AvailableFilter(String id, String name, String type, List<Value_> values) {
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

    public AvailableFilter withId(String id) {
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

    public AvailableFilter withName(String name) {
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

    public AvailableFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     * The values
     */
    public List<Value_> getValues() {
        return values;
    }

    /**
     *
     * @param values
     * The values
     */
    public void setValues(List<Value_> values) {
        this.values = values;
    }

    public AvailableFilter withValues(List<Value_> values) {
        this.values = values;
        return this;
    }

}

