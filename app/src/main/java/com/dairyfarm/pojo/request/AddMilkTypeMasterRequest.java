package com.dairyfarm.pojo.request;

/**
 * Created by aniket.patil_3887 on 2/17/2017.
 */
public class AddMilkTypeMasterRequest extends Request {
    private String milkType;

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }
}
