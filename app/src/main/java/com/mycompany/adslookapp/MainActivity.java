package com.mycompany.adslookapp;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mGoogleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.d("FUNKA", "Debugger funcionando");

        Fragment listFragment =  (Fragment) getSupportFragmentManager().findFragmentById(R.id.listFragment);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //Creamos un extView en el XML para ver el json del servicio
        final TextView jsonText = (TextView) findViewById(R.id.json);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.mercadolibre.com/sites/MLA/")
                .build();
        MeliService service = retrofit.create(MeliService.class);

        Call <ResponseBody> loadAds = service.loadAds();

        loadAds.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    jsonText.setText(
                            response.body()!=null?
                                    response.body().string():
                                    response.errorBody().string());
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }


    // Retrofit turns your HTTP API into a Java interface
    public interface MeliService {
        @GET("search?q=ipod&limit=5")
        Call<ResponseBody> loadAds();
        //El string de la busqueda debe ir a futuro como parametro de loadAds    
    //ver http://inthecheesefactory.com/blog/retrofit-2.0/en
    }

    //Llamamos al mapa
    @Override
    public void onMapReady( GoogleMap googleMap) {

        mGoogleMap = googleMap;

        List<Ad> ads = AdsStore.getAll();

        for (Ad ad: ads){
            mGoogleMap.addMarker(new MarkerOptions()
                    .position(ad.getCoord())
                    .title(ad.getAddress()));
        }

        Ad lastAd = ads.get(ads.size() - 1);
        LatLng lastAdLoc = lastAd.getCoord();

        mGoogleMap.animateCamera(
                CameraUpdateFactory
                        .newLatLngZoom(lastAdLoc, 14));

        //Esta linea no es util
        //mGoogleMap.setMyLocationEnabled(true);

    }
}
