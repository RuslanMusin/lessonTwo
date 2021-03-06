package com.itis.android.lessontwo.model.entity.creators;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by valera071998@gamil.com on 02.03.2018.
 */

public class CreatorsResponseData {

    @SerializedName("offset")
    private String offset;
    
    @SerializedName("limit")
    private String limit;
    
    @SerializedName("total")
    private String total;
    
    @SerializedName("count")
    private String count;
    
    @SerializedName("results")
    private List<Creator> results = null;

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<Creator> getResults() {
        return results;
    }

    public void setResults(List<Creator> results) {
        this.results = results;
    }
}
