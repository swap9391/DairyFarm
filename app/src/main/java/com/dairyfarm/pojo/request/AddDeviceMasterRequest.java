package com.dairyfarm.pojo.request;


/**
 * Created by aniket.patil_3887 on 2/16/2017.
 */
public class AddDeviceMasterRequest extends Request {

    private String deviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
