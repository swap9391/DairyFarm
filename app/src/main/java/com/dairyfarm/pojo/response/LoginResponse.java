package com.dairyfarm.pojo.response;

/**
 * Created by aniket.patil_3887 on 2/13/2017.
 */
public class LoginResponse extends Response {
    private String sessionToken;
    private String dairyName;
    private String district;

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getDairyName() {
        return dairyName;
    }

    public void setDairyName(String dairyName) {
        this.dairyName = dairyName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
