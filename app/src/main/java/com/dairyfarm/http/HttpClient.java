package com.dairyfarm.http;

import com.dairyfarm.pojo.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dairyfarm.enumeration.Error;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by aniket.patil_3887 on 2/17/2017.
 */
public class HttpClient {

    public enum HttpMethod {
        GET, POST, PUT, DELETE
    }


    private ObjectMapper objectMapper;

    public interface HttpResponseListener<T extends Response> {

        void onSuccess(T response);

        void onHttpError(int errorCode, String errorMessage);

        void onException(Exception e);

        void onBusinessError(Error error, T response);

        void onResponse(String response);
    }

    private HttpResponseListener httpResponseListener;
    private HttpURLConnection httpURLConnection;
    private Class<? extends Response> responseClass;
    private String url;
    private HttpMethod httpMethod;
    private String sessionToken;
    private String deviceId;
    private Object requestBody;
    private String language;

    public HttpClient(String url, HttpMethod httpMethod, String sessionToken, String deviceId) throws Exception {
        this.url = url;
        this.httpMethod = httpMethod;
        this.sessionToken = sessionToken;
        this.deviceId = deviceId;
        objectMapper = new ObjectMapper();
    }


    public HttpClient language(String languageCode) {
        this.language = languageCode;
        return this;
    }

    public HttpClient pathVariable(Object pathVariable) {
        this.url = String.format(url, pathVariable);
        return this;
    }

    public HttpClient responseClass(Class<? extends Response> responseClass) {
        this.responseClass = responseClass;
        return this;
    }

    public HttpClient httpListener(HttpResponseListener<? extends Response> httpResponseListener) {
        this.httpResponseListener = httpResponseListener;
        return this;
    }

    public HttpClient requestBody(Object requestData) {
        try {
            this.requestBody = requestData;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public void processRequest() throws IOException {
        if (httpResponseListener == null)
            throw new IOException("Listener should not be null");

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    URL httpUrl = new URL(url);
                    httpURLConnection = (HttpURLConnection) httpUrl.openConnection();
                    httpURLConnection.setConnectTimeout(2000);
                    httpURLConnection.setRequestMethod(httpMethod.toString());
                    if (language != null) {
                        httpURLConnection.setRequestProperty("Accept-Language", language);
                    }
                    if (sessionToken != null) {
                        httpURLConnection.setRequestProperty("x-api-key", sessionToken);
                    }
                    httpURLConnection.setRequestProperty("Accept", "*/*");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");


                    httpURLConnection.setRequestProperty("x-device-id", deviceId);

                    if (httpMethod == HttpMethod.POST || httpMethod == HttpMethod.PUT) {
                        httpURLConnection.setDoOutput(true);
                        if (requestBody != null) {
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            String jsonBody = objectMapper.writeValueAsString(requestBody);
                            dataOutputStream.writeBytes(jsonBody);
                            dataOutputStream.flush();
                            dataOutputStream.close();
                        }
                    }


                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        String responseBody = readStream(httpURLConnection.getInputStream());
                        httpResponseListener.onResponse(responseBody);
                        if (responseClass != null) {
                            Response response = objectMapper.readValue(responseBody, responseClass);
                            Error error = response.getError();
                            if (error == Error.NONE) {
                                httpResponseListener.onSuccess(response);
                            } else {
                                httpResponseListener.onBusinessError(response.getError(), response);

                            }
                        }

                    } else {
                        String errorMessage = readStream(httpURLConnection.getErrorStream());
                        httpResponseListener.onHttpError(responseCode, errorMessage);
                    }
                    httpURLConnection.disconnect();
                } catch (Exception e) {
                    e.printStackTrace();
                    httpResponseListener.onException(e);
                }

            }
        }).start();



    }

    private String readStream(InputStream inputStream) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(inputStream));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }


}
