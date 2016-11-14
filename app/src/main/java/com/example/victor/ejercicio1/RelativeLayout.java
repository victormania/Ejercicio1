package com.example.victor.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }
    public void cambiarTableLayout (View view){
        Intent intent = new Intent(this, TableLayout.class);
        startActivity(intent);
    }

    public void mostrar(View view){
       String mensaje="";
        switch (view.getId()){
            case R.id.button_centro:
                mensaje="Centro";
                break;
            case R.id.button_norte:
                mensaje="Norte";
                break;
            case R.id.button_sur:
                mensaje="Sur";
                break;
            case R.id.button_noroeste:
                mensaje="Noroeste";
                break;
            case R.id.button_noreste:
                mensaje="Noreste";
                break;
            case R.id.button_suroeste:
                mensaje="Suroreste";
                break;
            case R.id.button_suereste:
                mensaje="Sureste";
                break;
            case R.id.button_este:
                mensaje="Este";
                break;
            case R.id.button_oeste:
                mensaje="Oeste";
                break;
        }
        Toast toast = Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT);
        toast.show();

    }
}
