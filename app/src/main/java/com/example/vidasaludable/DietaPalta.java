package com.example.vidasaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DietaPalta extends AppCompatActivity {
    WebView WV1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta_palta);
        WV1 = (WebView) findViewById(R.id.webview);
        String URL = getIntent().getStringExtra("SitioWeb");
        WV1.setWebViewClient(new WebViewClient());
        WV1.loadUrl("https://www.vanitatis.elconfidencial.com/estilo/ocio/2020-11-30/adelgazar-4-dias-dieta-aguacate-quema-grasa_2845808/");
    }
}