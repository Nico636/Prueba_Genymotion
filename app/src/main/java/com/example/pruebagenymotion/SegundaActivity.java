package com.example.pruebagenymotion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    //Declara variables
    TextView tw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        //Asociar componentes
        tw = (TextView)findViewById(R.id.textView);
        //Recuperar datos del intent
        String valor = getIntent().getStringExtra("datos");
        //Mostrar datos en pantalla
        tw.setText(valor);
    }
}