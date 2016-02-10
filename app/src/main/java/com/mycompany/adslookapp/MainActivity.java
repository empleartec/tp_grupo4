package com.mycompany.adslookapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
                            implements AdListFragment.OnAdSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void onAdSelected(int position){
        /*
        The user selected an ad from the list in AdListFragment
         Do something here to display that ad.
         Ver http://developer.android.com/intl/es/training/basics/fragments/communicating.html
        */

        MapFragment fragment = (MapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapFragment);

        fragment.setText(String.valueOf(position));


    }
}