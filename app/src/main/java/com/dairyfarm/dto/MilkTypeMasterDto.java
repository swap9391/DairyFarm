package com.dairyfarm.dto;

/**
 * Created by aniket.patil_3887 on 2/17/2017.
 */
public class MilkTypeMasterDto {
    private Long milkTypeId;
    private String milkType;

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
}
