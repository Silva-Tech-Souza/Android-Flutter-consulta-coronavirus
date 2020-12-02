package br.com.tenishiELucas.informacoesCovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class CarregandoActivity extends AppCompatActivity {
    public static int controle= 1;
    public static int site;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carregando);

        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                controle = 0;
                site++;
                Intent intent = new Intent(CarregandoActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}
