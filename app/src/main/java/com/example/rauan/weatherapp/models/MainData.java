package com.example.rauan.weatherapp.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rauan on 013 13.03.2017.
 */

public class MainData {
    @SerializedName("temp")
    private String temperature;
    @SerializedName("pressure")
    private String pressure;
    @SerializedName("humidity")
    private String humidity;
    @SerializedName("temp_min")
    private String tempMin;
    @SerializedName("temp_max")
    private String tempMax;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTempMin() {
        return tempMin;
    }

    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public String getTempMax() {
        return tempMax;
    }

    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

    @Override
    public String toString() {
        return "MainData{" +
                "temperature='" + temperature + '\'' +
                ", pressure='" + pressure + '\'' +
                ", humidity='" + humidity + '\'' +
                ", tempMin='" + tempMin + '\'' +
                ", tempMax='" + tempMax + '\'' +
                '}';
    }
}

