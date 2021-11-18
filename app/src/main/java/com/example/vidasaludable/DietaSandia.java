package com.example.vidasaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DietaSandia extends AppCompatActivity {
    WebView WV1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta_sandia);
        WV1 = (WebView) findViewById(R.id.wbsandia);
        String URL = getIntent().getStringExtra("SitioWeb");
        WV1.setWebViewClient(new WebViewClient());
        WV1.loadUrl("https://www.eluniverso.com/larevista/salud/dieta-de-la-sandia-y-como-perder-peso-saludablemente-nota/");
    }
}