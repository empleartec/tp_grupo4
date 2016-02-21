package com.mycompany.adslookapp;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by pulpo on 09/02/16.
 */
public class Ad {

    private String address;
    private LatLng coord;

    public Ad(String address, LatLng coord){
        this.address = address;
        this.coord = coord;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LatLng getCoord() {
        return coord;
    }

    public void setCoord(LatLng coord) {
        this.coord = coord;
    }

}
