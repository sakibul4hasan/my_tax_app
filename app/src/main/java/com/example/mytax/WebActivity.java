package com.example.mytax;

import static com.example.mytax.R.id.WebSection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {


    WebView WebSection;
    public static String LoadUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebSection = findViewById(R.id.WebSection);


        WebSection.getSettings().setJavaScriptEnabled(true);
        WebSection.setWebViewClient(new WebViewClient());
        WebSection.loadUrl(LoadUrl);




    }
}