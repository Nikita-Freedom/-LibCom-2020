package net.smallacademy.tabs;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;


import com.example.LibForumNew.R;

import net.smallacademy.tabs.API.APIConfig;


public class RecipeActivity extends AppCompatActivity {

    public final static String RECIPE_URL = "recipe_url";

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        webView = findViewById(R.id.web_view);

        String recipeUrl = APIConfig.API_HOST_HTML + getIntent().getStringExtra(RECIPE_URL);

        webView.loadUrl(recipeUrl);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

    }

}