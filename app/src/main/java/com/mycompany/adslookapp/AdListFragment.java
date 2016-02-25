package com.mycompany.adslookapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by pulpo on 09/02/16.
 */
public class AdListFragment  extends Fragment {

  //  ArrayList<String> adsTitle = new ArrayList<>();

    /*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

       adsTitle  = this.getArguments().getStringArrayList("adsTitle");

    }
*/



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        // Llamamos a nuestra listView y al adapter
        ListView listView = (ListView) view.findViewById(R.id.ad_listview);

/*
        ArrayList<String> adsTitle = new ArrayList<>();
        adsTitle.add("anuncio1");
        adsTitle.add("anuncio2");
        adsTitle.add("anuncio3");
        adsTitle.add("anuncio4");
        adsTitle.add("anuncio5");
*/
      //  ArrayList<String> adsTitle = getArguments().getStringArrayList("adsTitle");

        //ArrayList<String> adsTitle = this.getArguments().getStringArrayList("adsTitle");

        //String titulo2 = this.getArguments().getString("titulo2");
        //Log.d("pasa", titulo2);

        MainActivity activity = (MainActivity) getActivity();

        ArrayList<String> adsTitle = activity.getAllTitles();

                AdListAdapter myAdapter = new AdListAdapter(this, adsTitle);

        // Conectamos el adapter a la listView.
        listView.setAdapter(myAdapter);

        return view;
    }


}
