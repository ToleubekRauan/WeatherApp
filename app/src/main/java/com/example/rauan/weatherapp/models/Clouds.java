package com.example.rauan.weatherapp.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rauan on 013 13.03.2017.
 */

public class Clouds {
    @SerializedName("all")
    private String all;

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all='" + all + '\'' +
                '}';
    }
}
