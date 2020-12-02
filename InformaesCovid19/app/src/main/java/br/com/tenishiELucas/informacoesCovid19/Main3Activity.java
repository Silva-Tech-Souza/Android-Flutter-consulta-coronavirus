package br.com.tenishiELucas.informacoesCovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button btn_sint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn_sint = findViewById(R.id.btn_sint2);

        btn_sint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tela2 = new Intent(Main3Activity.this, Main2Activity.class);

                startActivity(tela2);

            }
        });
    }
}
