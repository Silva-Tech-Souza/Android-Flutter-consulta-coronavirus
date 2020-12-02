package br.com.tenishiELucas.informacoesCovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.tenishiELucas.informacoesCovid19.Fragments.SintomasPrevencao2;

public class SintomasPrevencaoActivity extends AppCompatActivity {

    Button btn_prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas_prevencao);

        btn_prev = findViewById(R.id.btnPrev);

    }
}
