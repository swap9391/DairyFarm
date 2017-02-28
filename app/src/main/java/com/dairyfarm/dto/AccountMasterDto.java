package com.dairyfarm.dto;

/**
 * Created by aniket.patil_3887 on 2/14/2017.
 */
public class AccountMasterDto {
    private Long accountId;
    private String accountName;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
