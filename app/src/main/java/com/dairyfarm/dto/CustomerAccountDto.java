package com.dairyfarm.dto;

/**
 * Created by aniket.patil_3887 on 2/19/2017.
 */
public class CustomerAccountDto {

    private Long accountId;
    private Long accountNo;
    private Long milkTypeId;
    private String milkType;
    private String customerName;
    private BankAccountDto bankAccountDetails;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public Long getMilkTypeId() {
        return milkTypeId;
    }

    public void setMilkTypeId(Long milkTypeId) {
        this.milkTypeId = milkTypeId;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BankAccountDto getBankAccountDetails() {
        return bankAccountDetails;
    }

    public void setBankAccountDetails(BankAccountDto bankAccountDetails) {
        this.bankAccountDetails = bankAccountDetails;
    }
}
