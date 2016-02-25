
package com.mycompany.adslookapp.Json2Pojo;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class MLjson {

    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("paging")
    @Expose
    private Paging paging;
    @SerializedName("results")
    @Expose
    private List<Result> results = new ArrayList<Result>();
    @SerializedName("secondary_results")
    @Expose
    private List<Object> secondaryResults = new ArrayList<Object>();
    @SerializedName("related_results")
    @Expose
    private List<Object> relatedResults = new ArrayList<Object>();
    @SerializedName("sort")
    @Expose
    private Sort sort;
    @SerializedName("available_sorts")
    @Expose
    private List<AvailableSort> availableSorts = new ArrayList<AvailableSort>();
    @SerializedName("filters")
    @Expose
    private List<Filter> filters = new ArrayList<Filter>();
    @SerializedName("available_filters")
    @Expose
    private List<AvailableFilter> availableFilters = new ArrayList<AvailableFilter>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MLjson() {
    }

    /**
     * 
     * @param sort
     * @param results
     * @param siteId
     * @param query
     * @param availableFilters
     * @param availableSorts
     * @param secondaryResults
     * @param relatedResults
     * @param filters
     * @param paging
     */
    public MLjson(String siteId, String query, Paging paging, List<Result> results, List<Object> secondaryResults, List<Object> relatedResults, Sort sort, List<AvailableSort> availableSorts, List<Filter> filters, List<AvailableFilter> availableFilters) {
        this.siteId = siteId;
        this.query = query;
        this.paging = paging;
        this.results = results;
        this.secondaryResults = secondaryResults;
        this.relatedResults = relatedResults;
        this.sort = sort;
        this.availableSorts = availableSorts;
        this.filters = filters;
        this.availableFilters = availableFilters;
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

    public MLjson withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 
     * @return
     *     The query
     */
    public String getQuery() {
        return query;
    }

    /**
     * 
     * @param query
     *     The query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    public MLjson withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 
     * @return
     *     The paging
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * 
     * @param paging
     *     The paging
     */
    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public MLjson withPaging(Paging paging) {
        this.paging = paging;
        return this;
    }

    /**
     * 
     * @return
     *     The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public MLjson withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    /**
     * 
     * @return
     *     The secondaryResults
     */
    public List<Object> getSecondaryResults() {
        return secondaryResults;
    }

    /**
     * 
     * @param secondaryResults
     *     The secondary_results
     */
    public void setSecondaryResults(List<Object> secondaryResults) {
        this.secondaryResults = secondaryResults;
    }

    public MLjson withSecondaryResults(List<Object> secondaryResults) {
        this.secondaryResults = secondaryResults;
        return this;
    }

    /**
     * 
     * @return
     *     The relatedResults
     */
    public List<Object> getRelatedResults() {
        return relatedResults;
    }

    /**
     * 
     * @param relatedResults
     *     The related_results
     */
    public void setRelatedResults(List<Object> relatedResults) {
        this.relatedResults = relatedResults;
    }

    public MLjson withRelatedResults(List<Object> relatedResults) {
        this.relatedResults = relatedResults;
        return this;
    }

    /**
     * 
     * @return
     *     The sort
     */
    public Sort getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public MLjson withSort(Sort sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 
     * @return
     *     The availableSorts
     */
    public List<AvailableSort> getAvailableSorts() {
        return availableSorts;
    }

    /**
     * 
     * @param availableSorts
     *     The available_sorts
     */
    public void setAvailableSorts(List<AvailableSort> availableSorts) {
        this.availableSorts = availableSorts;
    }

    public MLjson withAvailableSorts(List<AvailableSort> availableSorts) {
        this.availableSorts = availableSorts;
        return this;
    }

    /**
     * 
     * @return
     *     The filters
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * 
     * @param filters
     *     The filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public MLjson withFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * 
     * @return
     *     The availableFilters
     */
    public List<AvailableFilter> getAvailableFilters() {
        return availableFilters;
    }

    /**
     * 
     * @param availableFilters
     *     The available_filters
     */
    public void setAvailableFilters(List<AvailableFilter> availableFilters) {
        this.availableFilters = availableFilters;
    }

    public MLjson withAvailableFilters(List<AvailableFilter> availableFilters) {
        this.availableFilters = availableFilters;
        return this;
    }

}
