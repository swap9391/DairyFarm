package com.dairyfarm.dto;

/**
 * Created by aniket.patil_3887 on 2/26/2017.
 */
public class MilkTransactionDto {
    private Long transactionId;
    private Double milkFat;
    private Double milkQuantity;
    private double rate;
    private Long accountNo;
    private String customerName;
    private String milkType;
    private String date;
    private String time;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Double getMilkFat() {
        return milkFat;
    }

    public void setMilkFat(Double milkFat) {
        this.milkFat = milkFat;
    }

    public Double getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(Double milkQuantity) {
        this.milkQuantity = milkQuantity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
