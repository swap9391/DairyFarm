package com.dairyfarm.pojo.response;

/**
 * Created by aniket.patil_3887 on 2/24/2017.
 */
public class ResourceDetailsResponse<T> extends Response {

    private T resourceDetails;

    public T getResourceDetails() {
        return resourceDetails;
    }

    public void setResourceDetails(T resourceDetails) {
        this.resourceDetails = resourceDetails;
    }
}
