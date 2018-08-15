package com.example.user.jenga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Drawer4 extends AppCompatActivity {
    ImageView designer,recruit,engineer,architect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer4);
        //        find by id's
        designer = findViewById(R.id.image1);
        recruit = findViewById(R.id.image2);
        engineer = findViewById(R.id.image3);
        architect = findViewById(R.id.image4);
        //set onclick listeners
        designer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent design = new Intent(getApplicationContext(),contact.class);
                startActivity(design);
                finish();
            }
        });

        recruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hire = new Intent(getApplicationContext(),contact.class);
                startActivity(hire);
                finish();
            }
        });

        engineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent scout = new Intent(getApplicationContext(),contact.class);
                startActivity(scout);
                finish();
            }
        });

        architect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent draw = new Intent(getApplicationContext(),contact.class);
                startActivity(draw);
                finish();
            }
        });
    }
}
