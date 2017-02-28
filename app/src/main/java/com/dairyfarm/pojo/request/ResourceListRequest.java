package com.dairyfarm.pojo.request;

/**
 * Created by aniket.patil_3887 on 2/14/2017.
 */
public class ResourceListRequest extends Request {

    private Integer offset;
    private Integer limit;
    private String searchString;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
