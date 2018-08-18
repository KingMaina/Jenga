package com.example.user.jenga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class mix extends AppCompatActivity {
    CardView pic,pic2,pic3,pic4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mix);
        pic = findViewById(R.id.simiti);
        pic2 = findViewById(R.id.simiti3);
        pic3 = findViewById(R.id.simiti4);
        pic4 = findViewById(R.id.simiti2);

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy = new Intent(getApplicationContext(),bamburibuy.class);
                startActivity(buy);
            }
        });
        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy2 = new Intent(getApplicationContext(),trianglebuy.class);
                startActivity(buy2);
            }
        });
        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy3 = new Intent(getApplicationContext(),dangotebuy.class);
                startActivity(buy3);
            }
        });
        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy4 = new Intent(getApplicationContext(),simbabuy.class);
                startActivity(buy4);
            }
        });
    }
}
