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

        cement = (ImageView) findViewById(R.id.simiti);
        wood = (ImageView) findViewById(R.id.mbao);
        stone = (ImageView) findViewById(R.id.mawe);
        sand = (ImageView) findViewById(R.id.mchanga);

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
    }
}
