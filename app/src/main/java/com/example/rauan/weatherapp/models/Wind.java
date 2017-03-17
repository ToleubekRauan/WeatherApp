package com.example.rauan.weatherapp.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rauan on 013 13.03.2017.
 */

public class Wind {
    @SerializedName("speed")
    private String speed;
    @SerializedName("deg")
    private String deg;

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed='" + speed + '\'' +
                ", deg='" + deg + '\'' +
                '}';
    }
}
