package com.dairyfarm.enumeration;

/**
 * Created by aniket.patil_3887 on 2/9/2017.
 */
public enum DeductionCycle {
    PER_LITER("Per Liter"), PER_TRANSACTION("Per Transaction"), PER_BILL("Per Bill"), PER_YEAR("Per Year");
    private String value;

    public String getValue() {
        return value;
    }

    DeductionCycle(String value) {

        this.value = value;
    }
}
