package net.smallacademy.tabs.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        webView.loadUrl("https://www1.fips.ru/about/deyatelnost/konferentsii-seminary/mezhdunarodnaya-konferentsiya-libcom.php");
        WebSettings webSettings = webView.getSettings();
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
