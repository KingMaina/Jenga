package com.example.user.jenga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mix extends AppCompatActivity {
    ImageView pic,pic2,pic3,pic4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mix);
        pic = (ImageView) findViewById(R.id.imageView4);
        pic2 = (ImageView) findViewById(R.id.imageView5);
        pic3 = (ImageView) findViewById(R.id.imageView6);
        pic4 = (ImageView) findViewById(R.id.imageView7);

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
