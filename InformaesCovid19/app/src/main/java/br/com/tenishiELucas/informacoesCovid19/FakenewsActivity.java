package br.com.tenishiELucas.informacoesCovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class FakenewsActivity extends AppCompatActivity {
    WebView sitefakenews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakenews);
        getSupportActionBar().hide();
        sitefakenews = findViewById(R.id.webfakenews);
        sitefakenews.getSettings().setJavaScriptEnabled(true);

        sitefakenews.loadUrl("https://www.saude.gov.br/fakenews");
    }
}
