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
    private ArrayList<String> titles;

    public AdListAdapter(Fragment context, ArrayList<String> titles){
        this.context = context;
        this.titles = titles;
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public String getItem(int position) {
        return titles.get(position);
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
        String title = getItem(position);

        //Insertamos los datos del objeto en la vista. Por ahora, solo la direccion del vendedor
        TextView address = (TextView) adView.findViewById(R.id.address);
        address.setText(title);

        return adView;
    }
}

