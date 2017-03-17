package com.example.rauan.weatherapp.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rauan on 013 13.03.2017.
 */

public class Coordinates {
    @SerializedName("lon")
    private String longitude;
    @SerializedName("lat")
    private String latitude;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                '}';
    }
}
