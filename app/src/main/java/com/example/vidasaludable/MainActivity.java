package com.example.vidasaludable;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton Fresa,Sandia,Naranja,Palta,Pinia, IMC;
    Button resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Fresa=findViewById(R.id.btnFresa);
        Sandia=findViewById(R.id.btnSandia);
        Naranja=findViewById(R.id.btnNaranja);
        Palta=findViewById(R.id.btnPalta);
        Pinia=findViewById(R.id.btnPinia);
        IMC=findViewById(R.id.btnImc);
    resultados=findViewById(R.id.btnResultados);


    Fresa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            resultados.setBackgroundColor(0xF9DC5B5B );
            resultados.setText("DIETA DE LA FRESA");
            resultados.setTextColor(0xffffffff);
            Toast.makeText(MainActivity.this, "Espere la FRESA.....", Toast.LENGTH_LONG).show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent iSALU = new Intent(MainActivity.this,Splash2.class);
                    startActivity(iSALU);
                }
            }, 4000);

        }
    });
        Sandia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultados.setBackgroundColor(0xF52E670A);
                resultados.setText("DIETA DE LA SANDIA");
                resultados.setTextColor(0xffffffff);
                Toast.makeText(MainActivity.this, "Espere la Sandia.....", Toast.LENGTH_LONG).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent iSALU = new Intent(MainActivity.this,Splash3.class);
                        startActivity(iSALU);
                    }
                }, 4000);

            }
        });
        Naranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultados.setBackgroundColor(0xD1F1A41E);
                resultados.setText("DIETA DE LA NARANJA");
                resultados.setTextColor(0xF9100F0F);
                Toast.makeText(MainActivity.this, "Espere la NARANJA.....", Toast.LENGTH_LONG).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent iSALU = new Intent(MainActivity.this,Splash4.class);
                        startActivity(iSALU);
                    }
                }, 4000);

            }
        });
        Palta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultados.setBackgroundColor(0xF59DEF6A);
                resultados.setText("DIETA DE LA PALTA");
                resultados.setTextColor(0xF9100F0F);
                Toast.makeText(MainActivity.this, "Espere la PALTA.....", Toast.LENGTH_LONG).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent iSALU = new Intent(MainActivity.this,Splash5.class);
                        startActivity(iSALU);
                    }
                }, 4000);

            }
        });
        Pinia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultados.setBackgroundColor(0xCEF3DB06 );
                resultados.setText("DIETA DE LA PIÑA");
                resultados.setTextColor(0xF9100F0F);
                Toast.makeText(MainActivity.this, "Espere la PIÑA.....", Toast.LENGTH_LONG).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent iSALU = new Intent(MainActivity.this,Splash6.class);
                        startActivity(iSALU);
                    }
                }, 4000);

            }
        });
        IMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultados.setBackgroundColor(0xF0F1EDE8);
                resultados.setText("INDICE DE MASA CORPORAL");
                resultados.setTextColor(0xF9100F0F);
                Toast.makeText(MainActivity.this, "Espere el IMC.....", Toast.LENGTH_LONG).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent iSALU = new Intent(MainActivity.this,Splash7.class);
                        startActivity(iSALU);
                    }
                }, 4000);

            }
        });

    }
}