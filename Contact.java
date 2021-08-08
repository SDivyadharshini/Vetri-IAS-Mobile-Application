package com.example.vetri;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        WebView webView;

        webView = (WebView) findViewById(R.id.webview);

        webView.loadUrl("https://vetriias.com/");


    }

}
