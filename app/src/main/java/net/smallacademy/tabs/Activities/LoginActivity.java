package net.smallacademy.tabs.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import net.smallacademy.tabs.R;

public class LoginActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        webView = (WebView) findViewById(R.id.web_view1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://lib39.ru/events/projects/biblioforum2020/reg.php");
        webView.setPadding(0, 0, 0, 0);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        WebSettings webSettings = webView.getSettings();
        webSettings.getBuiltInZoomControls();
        webSettings.setJavaScriptEnabled(true);

    }


    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else
        super.onBackPressed();
    }
}
