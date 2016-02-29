package com.mycompany.adslookapp;


import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.mycompany.adslookapp.Json2Pojo.MLjson;

import java.io.IOException;
import java.util.ArrayList;

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
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //toolbar.setNavigationIcon(R.drawable.ic_toolbar);
        toolbar.setTitle("");
        toolbar.setSubtitle("");
        //toolbar.setLogo(R.drawable.ic_toolbar);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


/*


        if (!adsTitle.isEmpty()) {
            showData();
        }
        ArrayList<String> adsTitle2 = this.getAllTitles();
* */










    /**
     * Muestra los datos en el mapa
     */
    private void showData() {
        for (int j=0; j<adsLat.size(); j++) {
            mGoogleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(adsLat.get(j), adsLong.get(j)))
                    .title(adsTitle.get(j)));

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(
                R.menu.menu_main, menu);

        /*
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchview = (SearchView) MenuItemCompat.getActionView(searchItem);

        @Override
        public boolean onQueryTextSubmit(String query) {
        */
        final Fragment listFragment =  (Fragment) getSupportFragmentManager().findFragmentById(R.id.listFragment);





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
                    Log.e("MAPA", "onResponse");
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
                if (mGoogleMap != null) {
                    showData();
                }
            }

            @Override
            public void onFailure(Call<MLjson> call, Throwable t) {
                Log.e("MELI", "Error " + t.getMessage());
            }
        });

        return true;
    }




    public ArrayList getAllTitles(){
        return adsTitle;
    }

    //Llamamos al mapa
    @Override
    public void onMapReady( GoogleMap googleMap) {
        Log.e("MAPA", "onMapReady");
        mGoogleMap = googleMap;


        //http://stackoverflow.com/questions/18425141/android-google-maps-api-v2-zoom-to-current-location
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        Location location = locationManager.getLastKnownLocation(locationManager.getBestProvider(criteria, false));

        if (location != null) {

            mGoogleMap.animateCamera(
                    CameraUpdateFactory
                            .newLatLngZoom(
                                    new LatLng(location.getLatitude(), location.getLongitude()), 14));

            mGoogleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(location.getLatitude(), location.getLongitude()))
                    .title("Estás acá")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.hellokitty003)));

            /*
            CameraPosition cameraPosition = new CameraPosition.Builder()
                    .target(new LatLng(location.getLatitude(), location.getLongitude()))      // Sets the center of the map to location user
                    .zoom(17)                   // Sets the zoom
                    .bearing(90)                // Sets the orientation of the camera to east
                    .tilt(40)                   // Sets the tilt of the camera to 30 degrees
                    .build();                   // Creates a CameraPosition from the builder
            mGoogleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
*/
        }










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
