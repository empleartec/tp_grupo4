package com.mycompany.adslookapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        // Llamamos a nuestra listView y al adapter
        ListView listView = (ListView) view.findViewById(R.id.ad_listview);
        AdListAdapter myAdapter = new AdListAdapter(this, AdsStore.getAll());

        // Conectamos el adapter a la listView.
        listView.setAdapter(myAdapter);

        return view;
    }

}
