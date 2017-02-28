package com.dairyfarm.pojo.request;


import com.dairyfarm.enumeration.DeductionCycle;

/**
 * Created by aniket.patil_3887 on 2/15/2017.
 */

public class AddDeductionMasterRequest extends Request {

    private Long accountId;
    private Double deductionAmount;
    private DeductionCycle deductionCycle;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Double getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(Double deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public DeductionCycle getDeductionCycle() {
        return deductionCycle;
    }

    public void setDeductionCycle(DeductionCycle deductionCycle) {
        this.deductionCycle = deductionCycle;
    }
}
