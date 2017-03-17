package com.example.rauan.weatherapp.controllers.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.rauan.weatherapp.R;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;
    VideoView videoView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        videoView = (VideoView) findViewById(R.id.videoViewSplash);
        textView = (TextView) findViewById(R.id.tvWeatherApp);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/pacifico.ttf");
        textView.setTypeface(typeface);
        textView.setText("Weather\n    App");
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.spacetimelapse);
        videoView.setVideoURI(uri);
        videoView.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
