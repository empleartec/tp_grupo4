package com.mycompany.adslookapp;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pulpo on 09/02/16.
 */
public class AdListAdapter extends BaseAdapter {

    private Fragment context;
    private List<Ad> ads;

    public AdListAdapter(Fragment context, List<Ad> ads){
        this.context = context;
        this.ads = ads;
    }

    @Override
    public int getCount() {
        return ads.size();
    }

    @Override
    public Ad getItem(int position) {
        return ads.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Inflamos el xml
        View adView = LayoutInflater.from(context.getActivity()).inflate(R.layout.item_ad, parent, false);

        //Obtenemos la posicion de un objeto en el ArrayList
        Ad ad = getItem(position);

        //Insertamos los datos del objeto en la vista. Por ahora, solo la direccion del vendedor
        TextView address = (TextView) adView.findViewById(R.id.address);
        address.setText(ad.getAddress());

        return adView;
    }
}

