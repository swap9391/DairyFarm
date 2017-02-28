package com.dairyfarm.dto;


import org.apache.http.impl.cookie.DateUtils;

import java.util.Date;

/**
 * Created by aniket.patil_3887 on 2/27/2017.
 */
public class MilkFatSlabDto {

    private Long id;
    private double milkFat;
    private double milkFatRate;
    private Long milkTypeId;
    private String milkType;
    private String fromDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMilkFat() {
        return milkFat;
    }

    public void setMilkFat(double milkFat) {
        this.milkFat = milkFat;
    }

    public double getMilkFatRate() {
        return milkFatRate;
    }

    public void setMilkFatRate(double milkFatRate) {
        this.milkFatRate = milkFatRate;
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

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = DateUtils.formatDate(fromDate);
    }

}
