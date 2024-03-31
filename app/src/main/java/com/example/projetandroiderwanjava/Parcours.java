package com.example.projetandroiderwanjava;

import com.google.android.gms.maps.model.LatLng;

public class Parcours {
    private LatLng latLng;
    private String title;

    public Parcours(LatLng latLng, String title) {
        this.latLng = latLng;
        this.title = title;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public String getTitle() {
        return title;
    }
}
