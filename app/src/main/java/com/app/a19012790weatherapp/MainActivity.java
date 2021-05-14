package com.app.a19012790weatherapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.net.URL;

public class MainActivity extends AppCompatActivity {



    private static final String LOGGING_TAG = "weatherDATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        URL url = NetworkUtil.buildURLForWeather();

        ImageView ivAccuWeather = findViewById(R.id.iv_accuweather);

        ivAccuWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.accuweather.com/"));
                startActivity(intent);
            }
        });




    }
}

