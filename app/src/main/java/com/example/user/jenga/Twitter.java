package com.example.user.jenga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import static com.example.user.jenga.R.id.webView;

public class Twitter extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        webView = (WebView)findViewById(R.id.webtweet);

        webView.loadUrl("https://www.twitter.com");
//        enable javascript
        webView.getSettings().setJavaScriptEnabled(true);
    }
}
