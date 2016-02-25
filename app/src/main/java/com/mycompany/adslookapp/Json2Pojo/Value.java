
package com.mycompany.adslookapp.Json2Pojo;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Value {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("path_from_root")
    @Expose
    private List<PathFromRoot> pathFromRoot = new ArrayList<PathFromRoot>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Value() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param pathFromRoot
     */
    public Value(String id, String name, List<PathFromRoot> pathFromRoot) {
        this.id = id;
        this.name = name;
        this.pathFromRoot = pathFromRoot;
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

    public Value withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Value withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The pathFromRoot
     */
    public List<PathFromRoot> getPathFromRoot() {
        return pathFromRoot;
    }

    /**
     * 
     * @param pathFromRoot
     *     The path_from_root
     */
    public void setPathFromRoot(List<PathFromRoot> pathFromRoot) {
        this.pathFromRoot = pathFromRoot;
    }

    public Value withPathFromRoot(List<PathFromRoot> pathFromRoot) {
        this.pathFromRoot = pathFromRoot;
        return this;
    }

}
