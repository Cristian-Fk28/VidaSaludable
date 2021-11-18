package com.example.vidasaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash6 extends AppCompatActivity {

    public static final long SPLASH_SCREEN_DELAY = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash6);
        TimerTask time =new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent().setClass(Splash6.this,DietaPinia.class);
                startActivity(intent);
                finish();
            }
        };
        Timer timer=new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }
}