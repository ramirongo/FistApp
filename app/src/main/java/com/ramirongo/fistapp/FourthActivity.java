package com.ramirongo.fistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        creatingWebView();
    }

    public void creatingWebView(){
        WebView webView = (WebView)findViewById(R.id.webView);

        webView.loadUrl("http://www.google.cl");
        //webView.loadUrl("file:///android_assets/index.html");

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        /*
        and this on manifests/AndroidManifest.xml
        <uses-permission android:name="android.permission.INTERNET"/>
         */
    }
}
