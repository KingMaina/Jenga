package com.example.user.jenga;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Help extends AppCompatActivity {
    Button helpMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        helpMe = (Button) findViewById(R.id.help);
        helpMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(
                        Intent.ACTION_SENDTO, Uri.fromParts
                        ("mailto", "support.jenga@info.com", null)
                );
                email.putExtra(Intent.EXTRA_SUBJECT, "Help");
                email.putExtra(Intent.EXTRA_TEXT, "Thanks for choosing Jenga");
                startActivity(Intent.createChooser(email, "Share mail via"));
            }
        });
    }
}
