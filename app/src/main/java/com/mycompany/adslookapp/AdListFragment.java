package com.mycompany.adslookapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by pulpo on 09/02/16.
 */
public class AdListFragment  extends Fragment {

    // Generamos una lista de ads
    ArrayList<Ad> ads  = new ArrayList<Ad>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        // Definimos la fuente de datos. Por ahora intanciamos objetos Ad manualmente.

        Ad ad1 = new Ad("Florida y Santa Fe", new double[]{-34.5961794, -58.3778024});
        Ad ad2 = new Ad("Florida y Suipacha", new double[]{-34.5967636,-58.3821853});
        Ad ad3 = new Ad("Esmeralda y Arenales", new double[]{-34.594114, -58.378516});
        Ad ad4 = new Ad("Santa Fe al 1000", new double[]{-34.595411, -58.381404});
        Ad ad5 = new Ad("cordoba y San Martin", new double[]{-34.59859, -58.3765227});

        ads.add(ad1);
        ads.add(ad2);
        ads.add(ad3);
        ads.add(ad4);
        ads.add(ad5);

        // Llamamos a nuestra listView y al adapter
        ListView listView = (ListView) view.findViewById(R.id.ad_listview);
        AdListAdapter myAdapter = new AdListAdapter(this, ads);

        // Conectamos el adapter a la listView.
        listView.setAdapter(myAdapter);

        return view;
    }
}
