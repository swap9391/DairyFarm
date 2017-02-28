package com.dairyfarm.pojo.request;

/**
 * Created by aniket.patil_3887 on 2/19/2017.
 */
public class AddCustomerRequest {
    private String customerName;
    private String mobileNo;
    private String adharNo;
    private String photoBase64Encoded;

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

    public String getPhotoBase64Encoded() {
        return photoBase64Encoded;
    }

    public void setPhotoBase64Encoded(String photoBase64Encoded) {
        this.photoBase64Encoded = photoBase64Encoded;
    }
}
