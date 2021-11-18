package com.example.vidasaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DietaNaranja extends AppCompatActivity {

    WebView WV1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta_naranja);
        WV1 = (WebView) findViewById(R.id.webView);
        String URL = getIntent().getStringExtra("SitioWeb");
        WV1.setWebViewClient(new WebViewClient());
        WV1.loadUrl("https://www.cocinafacil.com.mx/salud-y-nutricion/dieta-de-la-naranja/");
    }

}