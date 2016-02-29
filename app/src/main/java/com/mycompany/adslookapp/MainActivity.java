package com.mycompany.adslookapp;


import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Configuration;
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
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdate;
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

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);

            final Fragment listFragment = (Fragment) getSupportFragmentManager().findFragmentById(R.id.listFragment);
        }

        else {
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.mapPortrait);
            mapFragment.getMapAsync(this);


            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.layout1, mapFragment).commit();


            //final Fragment listFragmentPortrait = (Fragment) getSupportFragmentManager().findFragmentById(R.id.listFragmentPortrait);

        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(
                R.menu.menu_main, menu);


        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {

                if (query.length() == 0) {
                } else {

                    //Limpiamos los resultados anteriores
                    adsTitle.clear();
                    adsLat.clear();
                    adsLong.clear();
                    mGoogleMap.clear();



                    //Llamamos al servicio
                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl(MELI_BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                    MeliService service = retrofit.create(MeliService.class);

                    Call<MLjson> loadAds = service.loadAds(query);

                    loadAds.enqueue(new Callback<MLjson>() {
                        @Override
                        public void onResponse(Call<MLjson> call, Response<MLjson> response) {
                            try {

                                //No se para que es esto. Pero si lo saco el catch da un error
                                String jsonText = (String) (
                                        response.body() != null ?
                                                response.body().toString() :
                                                response.errorBody().string());


                                MLjson mLjson = response.body();

                                if (mLjson != null && mLjson.getResults() != null) {

                                    //Llenamos el array con los titulos y las coord de los resultados

                                    for (int i = 0; i < mLjson.getResults().size(); i++) {
                                        adsTitle.add(mLjson.getResults().get(i).getTitle());

                                        adsLat.add(mLjson.getResults().get(i).getSellerAddress().getLatitude());
                                        adsLong.add(mLjson.getResults().get(i).getSellerAddress().getLongitude());
                                    }

                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            if (mGoogleMap != null) {
                                showData();
                                markMe();
                                mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(11));
                            }
                        }

                        @Override
                        public void onFailure(Call<MLjson> call, Throwable t) {
                            Log.e("MELI", "Error " + t.getMessage());
                        }
                    });

                }//Cerramos el else
                return false;
            }// Cerramos onQueryTextSubmit


            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }


        }); // end setOnQueryTextListener
       // searchView.setQuery("", false);
        //searchView.setIconified(true);
        return true;
    }//cierra onCreateOptionsMenu



    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_changeView:
/*
 //              Fragment listFragment2 = (Fragment) getSupportFragmentManager().findFragmentById(R.id.listFragment);
   //             listFragment2.
                // User chose the "Settings" item, show the app settings UI...
                android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(mapF)
*/

                //http://developer.android.com/intl/es/training/basics/fragments/fragment-ui.html

                android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

              //  final Fragment listFragmentPortrait = (Fragment) getSupportFragmentManager().findFragmentById(R.id.listFragmentPortrait);



                Fragment textFragment = (Fragment) getSupportFragmentManager().findFragmentById(R.id.textFragmentPortrait);


                //No jode pero no hace nada
//                Fragment listFragmentPortrait = new Fragment();
// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack so the user can navigate back
                transaction.replace(R.id.layout1,  textFragment);
          //      transaction.addToBackStack(null);

// Commit the transaction
                transaction.commit();

                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);


        }
    }




            //Este metodo lo usa el fragment de la lista.
    public ArrayList getAllTitles(){
        return adsTitle;
    }

    /*
     * Muestra los datos en el mapa
     */
    private void showData() {
        for (int j=0; j<adsLat.size(); j++) {
            mGoogleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(adsLat.get(j), adsLong.get(j)))
                    .title(adsTitle.get(j)));
        }
    }

    public void markMe (){

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
        }
    }

    //Llamamos al mapa
    @Override
    public void onMapReady( GoogleMap googleMap) {
        Log.e("MAPA", "onMapReady");
        mGoogleMap = googleMap;
        markMe();
    }
}