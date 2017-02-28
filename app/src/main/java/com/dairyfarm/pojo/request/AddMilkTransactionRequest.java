package com.dairyfarm.pojo.request;

/**
 * Created by aniket.patil_3887 on 2/26/2017.
 */
public class AddMilkTransactionRequest extends Request {
    private Long customerAccountNo;
    private Double milkFat;
    private Double milkQuantity;

    public Long getCustomerAccountNo() {
        return customerAccountNo;
    }

    public void setCustomerAccountNo(Long customerAccountNo) {
        this.customerAccountNo = customerAccountNo;
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
}
