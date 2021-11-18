package com.example.vidasaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash5 extends AppCompatActivity {

    public static final long SPLASH_SCREEN_DELAY = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash5);
        TimerTask time =new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent().setClass(Splash5.this,DietaPalta.class);
                startActivity(intent);
                finish();
            }
        };
        Timer timer=new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }
}