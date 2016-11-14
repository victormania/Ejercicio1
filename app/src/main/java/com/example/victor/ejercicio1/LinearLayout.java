package com.example.victor.ejercicio1;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class LinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
    }
    public void cambiarRelativeLayout (View view){
        Intent intent = new Intent(this, RelativeLayout.class);
        startActivity(intent);
    }
    public void subirNivel(View view){
        ImageView imagen = (ImageView) findViewById(R.id.imageView);
        switch (view.getId()){
            case R.id.radioButton1:
                imagen.setImageResource(R.drawable.mario2);
                break;
            case R.id.radioButton2:
                imagen.setImageResource(R.drawable.mario3);
                break;
            case R.id.radioButton3:
                imagen.setImageResource(R.drawable.mario4);
                break;

        }

    }
}
