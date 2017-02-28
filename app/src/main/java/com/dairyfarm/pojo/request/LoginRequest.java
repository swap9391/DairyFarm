package com.dairyfarm.pojo.request;


import com.dairyfarm.enumeration.Shift;

/**
 * Created by aniket.patil_3887 on 2/13/2017.
 */

public class LoginRequest extends Request {

    private String userName;
    private String password;
    private Shift shift;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }
}
