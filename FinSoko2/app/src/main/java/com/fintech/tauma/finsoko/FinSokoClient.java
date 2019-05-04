package com.fintech.tauma.finsoko;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FinSokoClient {
    private static final String BaseUrl = "http://ccb95b13.ngrok.io/api/";
    private static Retrofit retrofit;

    //this returns an instance of retrofit
    public static Retrofit getApiClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BaseUrl).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
