package br.com.tenishiELucas.informacoesCovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PorEstadoActivity extends AppCompatActivity {
    WebView porestado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_por_estado);
        getSupportActionBar().hide();
        porestado = findViewById(R.id.web_porestado);
        porestado.getSettings().setJavaScriptEnabled(true);

        porestado.loadUrl("https://www.sigageomarketing.com.br/coronavirus");
    }
}
