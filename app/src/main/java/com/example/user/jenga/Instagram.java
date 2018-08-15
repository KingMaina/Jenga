package com.example.user.jenga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Instagram extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        webView = (WebView)findViewById(R.id.webig);

        webView.loadUrl("https://www.instagram.com");
//        enable javascript
        webView.getSettings().setJavaScriptEnabled(true);

    }
}
