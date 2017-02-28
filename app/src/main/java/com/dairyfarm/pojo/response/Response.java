package com.dairyfarm.pojo.response;


import com.dairyfarm.enumeration.ResponseCode;
import com.dairyfarm.enumeration.Error;
/**
 * Created by aniket.patil_3887 on 2/13/2017.
 */
public class Response {
    private ResponseCode responseCode;
    private Error error;
    private String message;

    public Response() {
        this.responseCode = ResponseCode.OK;
        this.error = Error.NONE;
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
