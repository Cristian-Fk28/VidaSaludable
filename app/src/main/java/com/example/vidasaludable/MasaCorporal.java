package com.example.vidasaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MasaCorporal extends AppCompatActivity {

    EditText txtPeso, txtAltura;
    TextView lblResultado,lblResultado2, lblResultado3;
    ImageView imageView,imag;

    RadioButton radioButton1;
    CheckBox Ceck,cc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masa_corporal);
    }

    public void btnCalcularOnClick(View view){

        lblResultado = (TextView)findViewById(R.id.lblResultado);
        lblResultado2 = (TextView)findViewById(R.id.lblResultado2);
        lblResultado3 = (TextView)findViewById(R.id.lblResultado3);
        txtPeso = (EditText) findViewById(R.id.txtPeso);
        txtAltura = (EditText) findViewById(R.id.txtAltura);
        cc=(CheckBox)findViewById(R.id.checkBox5);
        Ceck=(CheckBox)findViewById(R.id.checkBox);
        imageView=(ImageView) findViewById(R.id.imageView);
        imag=(ImageView) findViewById(R.id.imageView2);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);
        lblResultado2.setText("Tu IMC Es: "+resultado);

        if(Ceck.isChecked()==true)
            lblResultado3.setText("Eres Hombre");
        else if(cc.isChecked()==true)
            lblResultado3.setText("Eres Mujer");

        else
            lblResultado3.setText("No tienes genero");


        if(resultado < 19){
            if(Ceck.isChecked()==true)
                imageView.setBackgroundResource(R.drawable.flaco);
            else if(cc.isChecked()==true)
                imageView.setBackgroundResource(R.drawable.chica);
            else
                imageView.setBackgroundResource(R.drawable._0473);
            lblResultado.setTextColor(0xF9DC5B5B);
            imag.setBackgroundResource(R.drawable.firmar);
            lblResultado.setText("Tu Peso es Extremadamente Bajo Comer con más frecuencia.\n" +
                    "Escoger comidas ricas en nutrientes.\n" +
                    "Tomar batidos y licuados de frutas.\n" +
                    "Elegir productos lácteos enteros.\n" +
                    "Cocinar salsas y sopas con leche en lugar de agua.");
        }
        else if(resultado > 32){
            //obeso
            if(Ceck.isChecked()==true)
                imageView.setBackgroundResource(R.drawable.gordo);
            else if(cc.isChecked()==true)
                imageView.setBackgroundResource(R.drawable.gorda);
            else
                imageView.setBackgroundResource(R.drawable._0473);
            lblResultado.setTextColor(0xF9DC5B5B);
            imag.setBackgroundResource(R.drawable.c);
            lblResultado.setText("Tu Peso es Extremadamente Alto Coma un desayuno alto en proteínas\n" +
                    "Evite las bebidas azucaradas y los jugos de frutas\n" +
                    "Beba agua media hora antes de las comidas\n" +
                    "Elija alimentos saludables que lo ayuden con la pérdida de peso\n" +
                    "Coma fibra soluble\n");
        }
        else{
            //ok
            if(Ceck.isChecked()==true)
                imageView.setBackgroundResource(R.drawable.normal);
            else if(cc.isChecked()==true)
                imageView.setBackgroundResource(R.drawable.flaca);
            else
                imageView.setBackgroundResource(R.drawable._0473);
            lblResultado.setTextColor(0xF52E670A);
            imag.setBackgroundResource(R.drawable.dieta);
            lblResultado.setText("Tu Peso es Normal Ejercicio físico. La actividad física regular " +
                    "quema calorías y genera tejido muscular. \n" +
                    "Reduce el tiempo ante la pantalla. \n" +
                    "Ten cuidado con las porciones distorsionadas. \n" +
                    "Come 5 porciones de frutas y verduras por día. \n");
        }

    }


    public void btnLimpiar(View view) {
        imageView.setBackgroundResource(R.drawable._0473);
        imag.setBackgroundResource(R.drawable.frutas__1);
        txtPeso.setText("");
        txtAltura.setText("");
        lblResultado.setText("");
        lblResultado2.setText("");
        cc.setChecked(false);
        Ceck.setChecked(false);
        lblResultado3.setText("");
    }

}