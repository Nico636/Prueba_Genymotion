package com.example.pruebagenymotion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView tw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tw = (TextView)findViewById(R.id.textView);
        String valor = getIntent().getStringExtra("datos");
        tw.setText(valor);
    }
}