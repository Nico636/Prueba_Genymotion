package com.example.pruebagenymotion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declarar variables
    TextView tw ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Identificar objetos
        tw = (TextView)findViewById(R.id.editTextTextPersonName);
    }
    public void enviarDatos(View view){
        //Crear intent
        Intent act = new Intent(this, SegundaActivity.class);
        //Agregar datos al intent
        act.putExtra("datos", tw.getText().toString());
        //Lanzar segunda activity
        startActivity(act);
    }
}