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
import com.google.gson.Gson;
import com.mycompany.adslookapp.Json2Pojo.MLjson;
import com.mycompany.adslookapp.Json2Pojo.Result;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    public static final String MELI_BASE_URL = "https://api.mercadolibre.com/sites/MLA/";

    private GoogleMap mGoogleMap;


    //Creamos un array con los titulos de cada articulo
    private ArrayList<String> adsTitle = new ArrayList<>();

    private ArrayList<Double> adsLat = new ArrayList<>();
    private ArrayList<Double> adsLong = new ArrayList<>();

//    LatLng mylat = new LatLng() SE CONSTRUYE CON doubles


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.d("FUNKA", "Debugger funcionando");

        final Fragment listFragment =  (Fragment) getSupportFragmentManager().findFragmentById(R.id.listFragment);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //Creamos un extView en el XML para ver el json del servicio
        final TextView jsonText = (TextView) findViewById(R.id.json);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MELI_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MeliService service = retrofit.create(MeliService.class);

        Call <MLjson> loadAds = service.loadAds("ipod");

        loadAds.enqueue(new Callback<MLjson>() {
            @Override
            public void onResponse(Call<MLjson> call, Response<MLjson> response) {
                try {
                    jsonText.setText(
                            response.body() != null ?
                                    response.body().toString() :
                                    response.errorBody().string());


                    MLjson mLjson = response.body();

                    if (mLjson != null && mLjson.getResults() != null) {

                        //Llenamos el array con los titulos y las coord de los resultados

                        for (int i=0; i<mLjson.getResults().size(); i++) {
                            adsTitle.add(mLjson.getResults().get(i).getTitle());

                            adsLat.add(mLjson.getResults().get(i).getSellerAddress().getLatitude());
                            adsLong.add(mLjson.getResults().get(i).getSellerAddress().getLongitude());
                    }

                        //FUNCIONAN
                        Log.d("myTitle", adsTitle.get(2));
                        Log.d("myLocation", adsLat.get(2).toString());

                    }
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<MLjson> call, Throwable t) {
                Log.e("MELI", "Error " + t.getMessage());
            }
        });
    }

public ArrayList getAllTitles(){
    return adsTitle;
}

    //Llamamos al mapa
    @Override
    public void onMapReady( GoogleMap googleMap) {

        mGoogleMap = googleMap;

        /*
        * Gabriel, esto no funciona.
        * No encontré la forma de acceder a las coordenadas de los artículos desde este método.
        *El for de aca abajo no da errores pero tiene size cero, por eso no se marca nada..,
        *creo que estoy accediendo a los arrays adsLat y adsLong antes de llenarlos con los
        * valores que trae el servicio.
        *
        * */


        for (int j=0; j<adsLat.size(); j++) {
            mGoogleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(adsLat.get(j), adsLong.get(j)))
                    .title(adsTitle.get(j)));

        }

        ArrayList<String> adsTitle2 = this.getAllTitles();




        //CODIGO ANTERIOR
        /*
        List<Ad> ads = AdsStore.getAll();

        for (Ad ad: ads){
            mGoogleMap.addMarker(new MarkerOptions()
                    .position(ad.getCoord())
                    .title(ad.getAddress()));
        }
*/

       // Ad lastAd = ads.get(ads.size() - 1);
       // LatLng lastAdLoc = lastAd.getCoord();

/*
        int adQ = adsLat.size() - 1;
        LatLng lastAdLoc = new LatLng(adsLat.get(adQ), adsLong.get(adQ));

        mGoogleMap.animateCamera(
                CameraUpdateFactory
                        .newLatLngZoom(lastAdLoc, 14));
*/
        //Esta linea no es util
        //mGoogleMap.setMyLocationEnabled(true);

    }
}
