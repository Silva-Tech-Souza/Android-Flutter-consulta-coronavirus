package br.com.tenishiELucas.informacoesCovid19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import br.com.tenishiELucas.informacoesCovid19.Fragments.PgeFragment;
import br.com.tenishiELucas.informacoesCovid19.propaganda.Propaganda;
import br.com.tenishiELucas.informacoesCovid19.ui.send.SendViewModel;

public class CoronaActivity extends AppCompatActivity {
    private SendViewModel sendViewModel;
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    private Propaganda propaganda;
    Button btnSint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona);

        btnSint = findViewById(R.id.btn_sint);

        btnSint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tela2 = new Intent(CoronaActivity.this, SintomasPrevencaoActivity.class);

                startActivity(tela2);

            }
        });

    }
}
