package com.dairyfarm.dto;

/**
 * Created by aniket.patil_3887 on 2/19/2017.
 */
public class BankAccountDto {
    private String bankName;
    private String branchName;
    private String accountNo;
    private String ifscNo;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getIfscNo() {
        return ifscNo;
    }

    public void setIfscNo(String ifscNo) {
        this.ifscNo = ifscNo;
    }
}
