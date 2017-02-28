package com.dairyfarm.pojo.request;

/**
 * Created by aniket.patil_3887 on 2/27/2017.
 */
public class MilkFatSlabListRequest extends ResourceListRequest {
    private String fromDate;
    private Double startFatRange;
    private Double endFatRange;
    private Long milkTypeId;

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public Double getStartFatRange() {
        return startFatRange;
    }

    public void setStartFatRange(Double startFatRange) {
        this.startFatRange = startFatRange;
    }

    public Double getEndFatRange() {
        return endFatRange;
    }

    public void setEndFatRange(Double endFatRange) {
        this.endFatRange = endFatRange;
    }

    public Long getMilkTypeId() {
        return milkTypeId;
    }

    public void setMilkTypeId(Long milkTypeId) {
        this.milkTypeId = milkTypeId;
    }
}
