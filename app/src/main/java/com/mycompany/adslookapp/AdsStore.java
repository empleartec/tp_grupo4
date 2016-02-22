package com.mycompany.adslookapp;

import com.google.android.gms.maps.model.LatLng;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pulpo on 20/02/16.
 */
public class AdsStore {

    public static List<Ad> getAll(){

        // Generamos una lista de ads
        List<Ad> ads  = new ArrayList<>();

        // Definimos la fuente de datos. Por ahora intanciamos objetos Ad manualmente.

        Ad ad1 = new Ad("Florida y Santa Fe", new LatLng(-34.5961794, -58.3778024));
        Ad ad2 = new Ad("Florida y Suipacha", new LatLng(-34.5967636,-58.3821853));
        Ad ad3 = new Ad("Esmeralda y Arenales", new LatLng(-34.594114, -58.378516));
        Ad ad4 = new Ad("Santa Fe al 1000", new LatLng(-34.595411, -58.381404));
        Ad ad5 = new Ad("cordoba y San Martin", new LatLng(-34.59859, -58.3765227));

        ads.add(ad1);
        ads.add(ad2);
        ads.add(ad3);
        ads.add(ad4);
        ads.add(ad5);

        return ads;
    }

}
