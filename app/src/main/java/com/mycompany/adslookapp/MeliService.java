package com.mycompany.adslookapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

// Retrofit turns your HTTP API into a Java interface
public interface MeliService {
    @GET("search?limit=5")
    Call<MLjson> loadAds(@Query("q") String query);
    //El string de la busqueda debe ir a futuro como parametro de loadAds
    //ver http://inthecheesefactory.com/blog/retrofit-2.0/en
}
