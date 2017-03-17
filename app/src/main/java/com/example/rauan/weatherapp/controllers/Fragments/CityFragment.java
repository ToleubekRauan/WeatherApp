package com.example.rauan.weatherapp.controllers.Fragments;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rauan.weatherapp.R;
import com.example.rauan.weatherapp.models.CityWeather;
import com.example.rauan.weatherapp.network.RestClient;
import com.example.rauan.weatherapp.utils.Constants;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class CityFragment extends Fragment {
    TextView textViewCity;
    TextView textViewTemp;
    TextView textViewTempMax;
    TextView textViewTempMin;
    TextView textViewWeatherMain;
    ImageView cityImage;
    Bitmap bitmap;
    String temp;
    List<CityWeather> cityWeatherList;

    String cityId = Constants.ALMATY_ID;

    public CityFragment() {
        // Required empty public constructor
    }


    public static CityFragment newInstance(String cityId) {
        CityFragment fragment = new CityFragment();
        fragment.cityId = cityId;
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_city, container, false);
        textViewCity = (TextView) view.findViewById(R.id.textViewCity);
        textViewTemp = (TextView) view.findViewById(R.id.textViewTemp);
        textViewTempMax = (TextView) view.findViewById(R.id.textViewTempMax);
        textViewTempMin = (TextView) view.findViewById(R.id.textViewTempMin);
        textViewWeatherMain = (TextView) view.findViewById(R.id.textViewWeatherMain);

        cityImage = (ImageView) view.findViewById(R.id.cityImage);
            switch (cityId){
                        case Constants.ALMATY_ID:
                            cityImage.setBackground(getResources().getDrawable(R.drawable.esenytai));
                            break;
                        case Constants.ASTANA_ID:
                            cityImage.setBackground(getResources().getDrawable(R.drawable.astana3));
                            break;
                        case Constants.AKTOBE_ID:
                            cityImage.setBackground(getResources().getDrawable(R.drawable.aktobe1));
                            break;
                    }

        getCityWeatherById();





        return view;
    }
    private void getCityWeatherById(){
        Call<CityWeather> call = RestClient.request().getCityWeatherById(cityId, Constants.WEATHER_API_KEY);
        call.enqueue(new Callback<CityWeather>() {
            @Override
            public void onResponse(Call<CityWeather> call, Response<CityWeather> response) {
                if(response.isSuccessful()){
                    Log.d("Almaty_weather", response.body().toString());
                    textViewCity.setText(response.body().getName());
                    temp  = response.body().getMain().getTemperature();
                    double tempCel = Double.parseDouble(temp)-273;
                    textViewTemp.setText(String.format("%.2f",tempCel)+" °");
                    textViewTempMax.setText(String.format("%.2f",KelvinToCelsius(response.body().getMain().getTempMax()))+"");
                    textViewTempMin.setText(String.format("%.2f",KelvinToCelsius(response.body().getMain().getTempMin()))+"");
                    textViewWeatherMain.setText(response.body().getWeatherList().get(0).getMain());


                }
            }

            @Override
            public void onFailure(Call<CityWeather> call, Throwable t) {

            }
        });
    }
    public double KelvinToCelsius(String d){
        double newD = Double.parseDouble(d);
        newD = newD - 273.15;
        return newD;

    }

}
