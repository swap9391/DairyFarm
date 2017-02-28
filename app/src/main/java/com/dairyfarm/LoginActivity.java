package com.dairyfarm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.dairyfarm.constant.URI;
import com.dairyfarm.enumeration.Error;
import com.dairyfarm.enumeration.Shift;
import com.dairyfarm.http.HttpClient;
import com.dairyfarm.pojo.request.LoginRequest;
import com.dairyfarm.pojo.response.LoginResponse;
import com.dairyfarm.pojo.response.Response;

/**
 * Created by Swapnil on 28/02/2017.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edt_user_name, edt_password;
    Button btnLogin;
    LoginResponse loginResponse = new LoginResponse();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        edt_user_name = (EditText) findViewById(R.id.edt_user_name);
        edt_password = (EditText) findViewById(R.id.edt_password);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnLogin:
                try {
                    LoginRequest loginRequest = new LoginRequest();
                    loginRequest.setUserName("admin");
                    loginRequest.setPassword("admin");
                    loginRequest.setShift(Shift.MORNING);

                    HttpClient httpClient = new HttpClient(URI.LOGIN_URI, HttpClient.HttpMethod.POST, null, "12345");
                    httpClient.requestBody(loginRequest);
                    httpClient.language("mr");
                    httpClient.responseClass(LoginResponse.class);
                    httpClient.httpListener(new HttpClient.HttpResponseListener<Response>() {
                        @Override
                        public void onSuccess(Response response) {
                        Log.e("","");
                        }

                        @Override
                        public void onHttpError(int errorCode, String errorMessage) {
                            Log.e("","");
                        }

                        @Override
                        public void onException(Exception e) {
                            Log.e("","");
                        }

                        @Override
                        public void onBusinessError(Error error, Response response) {
                            Log.e("","");
                        }

                        @Override
                        public void onResponse(String response) {
                            Log.e("Response",response);
                        }
                    });
                    httpClient.processRequest();


                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;
        }
    }


}
