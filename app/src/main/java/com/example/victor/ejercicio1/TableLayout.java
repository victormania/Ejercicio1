package com.example.victor.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
    }

    public void escribirNumero(View view){
        TextView numeros = (TextView) findViewById(R.id.textView_numeros);
        Button numero = (Button) findViewById(view.getId());
        String texto="";
        texto = ((String) numeros.getText() + numero.getText());
        numeros.setText(texto);
    }
    public void limpiar(View view){
        TextView numeros = (TextView) findViewById(R.id.textView_numeros);
        numeros.setText("");
    }
}
