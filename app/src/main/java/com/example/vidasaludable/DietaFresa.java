package com.example.vidasaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class DietaFresa extends AppCompatActivity {

    VideoView VD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta_fresa);
        VD = (VideoView) findViewById(R.id.videoView1);
     String path="android.resource://"+getPackageName()+"/" + R.raw.fresa;
     VD.setVideoURI(Uri.parse(path));
     VD.start();
    }
}