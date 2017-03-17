package com.example.rauan.weatherapp.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rauan on 013 13.03.2017.
 */

public class SystemInfo {
    @SerializedName("type")
    private String type;
    @SerializedName("id")
    private String id;
    @SerializedName("message")
    private String message;
    @SerializedName("country")
    private String counrty;
    @SerializedName("sunrise")
    private String sunrise;
    @SerializedName("sunset")
    private String sunset;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCounrty() {
        return counrty;
    }

    public void setCounrty(String counrty) {
        this.counrty = counrty;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "SystemInfo{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", message='" + message + '\'' +
                ", counrty='" + counrty + '\'' +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                '}';
    }
}
