package com.dairyfarm.dto;

/**
 * Created by aniket.patil_3887 on 2/15/2017.
 */
public class DeductionMasterDto {

    private Long deductionId;
    private String accountName;
    private Double deductionAmount;
    private String deductionCycle;

    public Long getDeductionId() {
        return deductionId;
    }

    public void setDeductionId(Long deductionId) {
        this.deductionId = deductionId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(Double deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public String getDeductionCycle() {
        return deductionCycle;
    }

    public void setDeductionCycle(String deductionCycle) {
        this.deductionCycle = deductionCycle;
    }
}
