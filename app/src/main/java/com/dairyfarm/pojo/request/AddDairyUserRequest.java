package com.dairyfarm.pojo.request;


import com.dairyfarm.enumeration.UserRole;

/**
 * Created by aniket.patil_3887 on 2/16/2017.
 */
public class AddDairyUserRequest extends Request {

    private String userName;
    private String password;
    private UserRole userRole;

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

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
