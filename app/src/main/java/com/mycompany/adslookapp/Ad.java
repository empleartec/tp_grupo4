package com.mycompany.adslookapp;

/**
 * Created by pulpo on 09/02/16.
 */
public class Ad {

    private String address;
    private double[] coord;

    public Ad(String address, double[] coord){
        this.address = address;
        this.coord = coord;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double[] getCoord() {
        return coord;
    }

    public void setCoord(double[] coord) {
        this.coord = coord;
    }

}
