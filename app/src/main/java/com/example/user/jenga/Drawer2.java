package com.example.user.jenga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Drawer2 extends AppCompatActivity {
    ImageView cement,wood,stone,sand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer2);

        cement = findViewById(R.id.simiti);
        wood = findViewById(R.id.mbao);
        stone = findViewById(R.id.mawe);
        sand = findViewById(R.id.mchanga);

        cement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(getApplicationContext(),mix.class);
                startActivity(c);
                finish();
            }
        });
        sand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ce = new Intent(getApplicationContext(),chimba.class);
                startActivity(ce);
                finish();
            }
        });
        stone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cem = new Intent(getApplicationContext(),chonga.class);
                startActivity(cem);
                finish();
            }
        });
        wood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ceme = new Intent(getApplicationContext(),kata.class);
                startActivity(ceme);
                finish();
            }
        });
    }
}
