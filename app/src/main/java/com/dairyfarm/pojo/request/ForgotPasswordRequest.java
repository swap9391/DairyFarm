package com.dairyfarm.pojo.request;

/**
 * Created by aniket.patil_3887 on 2/16/2017.
 */
public class ForgotPasswordRequest extends Request {

    private String userName;
    private String newPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
