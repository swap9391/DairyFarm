package com.dairyfarm.pojo.request;

/**
 * Created by aniket.patil_3887 on 2/14/2017.
 */
public class AddAccountMasterRequest extends Request {
    private String accountName;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
