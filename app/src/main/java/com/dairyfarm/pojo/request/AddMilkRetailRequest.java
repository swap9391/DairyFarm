package com.dairyfarm.pojo.request;


import com.dairyfarm.enumeration.TransactionMode;

/**
 * Created by aniket.patil_3887 on 2/27/2017.
 */
public class AddMilkRetailRequest extends AddMilkTransactionRequest {
    private Long milkType;
    private TransactionMode transactionMode;

    public Long getMilkType() {
        return milkType;
    }

    public void setMilkType(Long milkType) {
        this.milkType = milkType;
    }

    public TransactionMode getTransactionMode() {
        return transactionMode;
    }

    public void setTransactionMode(TransactionMode transactionMode) {
        this.transactionMode = transactionMode;
    }
}
