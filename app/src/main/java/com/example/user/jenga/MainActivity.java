package com.example.user.jenga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        a thread  refers to multiple processors running concurrently
        Thread bb=new Thread(){
            //      execute thread
            public void run(){
                try {
//                    the progress bar will load for 5 seconds

                    sleep(3*1000);
//                    intent allows you to perform an activity
                    Intent jj=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(jj);
                    finish();
                }catch (Exception e){

                }
            }
        };
        bb.start();
    }
}
