package com.dairyfarm.pojo.request;

import com.dairyfarm.pojo.ConfigDtls;
import com.dairyfarm.pojo.DairyDtls;

/**
 * Created by aniket.patil_3887 on 2/13/2017.
 */
public class RegistrationRequest extends Request {

    private DairyDtls dairyDetails;
    private ConfigDtls configDetails;

    public DairyDtls getDairyDetails() {
        return dairyDetails;
    }

    public void setDairyDetails(DairyDtls dairyDetails) {
        this.dairyDetails = dairyDetails;
    }

    public ConfigDtls getConfigDetails() {
        return configDetails;
    }

    public void setConfigDetails(ConfigDtls configDetails) {
        this.configDetails = configDetails;
    }


}
