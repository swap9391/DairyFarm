package com.dairyfarm.pojo.request;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;
import java.util.Date;

/**
 * Created by aniket.patil_3887 on 2/27/2017.
 */
public class AddFatSlabRequest extends Request {

    private double milkFat;
    private double milkFatRate;
    private String fromDate;
    private Long milkTypeId;

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

    public Date getFromDate() throws DateParseException {
        return DateUtils.parseDate(fromDate);
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public Long getMilkTypeId() {
        return milkTypeId;
    }

    public void setMilkTypeId(Long milkTypeId) {
        this.milkTypeId = milkTypeId;
    }
}
