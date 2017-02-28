package com.dairyfarm.dto;

import com.dairyfarm.enumeration.PasswordStatus;
import com.dairyfarm.enumeration.UserRole;

/**
 * Created by aniket.patil_3887 on 2/16/2017.
 */
public class DairyUserDto {
    private Long userId;
    private String userName;
    private UserRole userRole;
    private PasswordStatus passwordStatus;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public PasswordStatus getPasswordStatus() {
        return passwordStatus;
    }

    public void setPasswordStatus(PasswordStatus passwordStatus) {
        this.passwordStatus = passwordStatus;
    }
}
