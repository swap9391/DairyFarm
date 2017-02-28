package com.dairyfarm.dto;

import java.util.List;

/**
 * Created by aniket.patil_3887 on 2/19/2017.
 */
public class CustomerDto {
    private Long customerId;
    private String customerName;
    private String mobileNo;
    private String adharNo;
    private String addedOn;
    private List<CustomerAccountDto> customerAccounts;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(String adharNo) {
        this.adharNo = adharNo;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(String addedOn) {
        this.addedOn = addedOn;
    }

    public List<CustomerAccountDto> getCustomerAccounts() {
        return customerAccounts;
    }

    public void setCustomerAccounts(List<CustomerAccountDto> customerAccounts) {
        this.customerAccounts = customerAccounts;
    }
}
