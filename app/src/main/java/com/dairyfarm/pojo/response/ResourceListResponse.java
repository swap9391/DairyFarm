package com.dairyfarm.pojo.response;

import java.util.List;

/**
 * Created by aniket.patil_3887 on 2/23/2017.
 */
public class ResourceListResponse<T> extends Response {

    private List<T> resources;

    public List<T> getResources() {
        return resources;
    }

    public void setResources(List<T> resources) {
        this.resources = resources;
    }
}
