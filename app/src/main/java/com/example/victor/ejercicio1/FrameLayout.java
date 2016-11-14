package com.example.victor.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
    }
    public void cambiarImage(View view) {
        ImageView mario = (ImageView)findViewById(R.id.mario);
        ImageView yoshi = (ImageView)findViewById(R.id.yoshi);
        if(mario.getVisibility()==View.INVISIBLE){
            yoshi.setVisibility(View.INVISIBLE);
            mario.setVisibility(View.VISIBLE);
        }else if(yoshi.getVisibility()==View.INVISIBLE){
            mario.setVisibility(View.INVISIBLE);
            yoshi.setVisibility(View.VISIBLE);
        }
    }

    public void cambiarLinearLayout (View view){
        Intent intent = new Intent(this, LinearLayout.class);
        startActivity(intent);
    }
}
