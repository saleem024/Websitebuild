package com.techkshetra.tpc1.websitebuild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebsiteActivity extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        webview=(WebView) findViewById(R.id.webview);
        WebSettings webSettings= webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.loadUrl("http://kshiksha.com/kshiksha/index.php/login/landingpage/");
        webview.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
