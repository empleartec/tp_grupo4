package com.mycompany.adslookapp;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mGoogleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Fragment listFragment =  (Fragment) getSupportFragmentManager().findFragmentById(R.id.listFragment);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

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