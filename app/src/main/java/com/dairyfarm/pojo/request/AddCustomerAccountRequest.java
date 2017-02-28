package com.dairyfarm.pojo.request;


import com.dairyfarm.dto.BankAccountDto;

/**
 * Created by aniket.patil_3887 on 2/19/2017.
 */
public class AddCustomerAccountRequest {
    private Long accountNo;
    private Long customerId;
    private Long milkTypeId;
    private BankAccountDto bankAccountDetails;

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getMilkTypeId() {
        return milkTypeId;
    }

    public void setMilkTypeId(Long milkTypeId) {
        this.milkTypeId = milkTypeId;
    }

    public BankAccountDto getBankAccountDetails() {
        return bankAccountDetails;
    }

    public void setBankAccountDetails(BankAccountDto bankAccountDetails) {
        this.bankAccountDetails = bankAccountDetails;
    }
}
