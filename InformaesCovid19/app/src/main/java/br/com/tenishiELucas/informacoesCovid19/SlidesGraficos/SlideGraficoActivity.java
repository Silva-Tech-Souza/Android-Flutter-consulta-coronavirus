package br.com.tenishiELucas.informacoesCovid19.SlidesGraficos;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

import br.com.tenishiELucas.informacoesCovid19.CarregandoActivity;
import br.com.tenishiELucas.informacoesCovid19.MainActivity;
import br.com.tenishiELucas.informacoesCovid19.R;
import br.com.tenishiELucas.informacoesCovid19.ui.share.ShareViewModel;

public class SlideGraficoActivity extends Fragment {

    WebView wv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.activity_slide_grafico, container, false);

        ImageView avancar = root.findViewById(R.id.btn_avancar);
        ImageView voltar = root.findViewById(R.id.btn_voltar);

        wv = root.findViewById(R.id.webview);
        wv.getSettings().setJavaScriptEnabled(true);
        if ( CarregandoActivity.site==1){
            wv.loadUrl("https://www.covidvisualizer.com/");
        }

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregandoActivity.site++;
                if(CarregandoActivity.site>4){
                    CarregandoActivity.site=0;
                }
                if ( CarregandoActivity.site==0){
                    wv.loadUrl("https://www.covidvisualizer.com/");
                }else if ( CarregandoActivity.site==1){
                    wv.loadUrl("https://who.maps.arcgis.com/apps/opsdashboard/index.html#/c88e37cfc43b4ed3baf977d77e4a0667");
                }else if (CarregandoActivity.site==2){
                    wv.loadUrl("https://nextstrain.org/ncov?dmax=2020-01-03&dmin=2019-12-27&l=clock");
                }else if ( CarregandoActivity.site==3){
                    wv.loadUrl("https://gisanddata.maps.arcgis.com/apps/opsdashboard/index.html#/bda7594740fd40299423467b48e9ecf6");
                }else if ( CarregandoActivity.site==4){
                    wv.loadUrl("https://nextstrain.org/ncov?dmax=2020-01-03&dmin=2019-12-27");
                }
            }
        });
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregandoActivity.site--;
                if( CarregandoActivity.site<0){
                    CarregandoActivity.site=4;
                }
                if (CarregandoActivity.site==0){
                    wv.loadUrl("https://www.covidvisualizer.com/");
                }else if ( CarregandoActivity.site==1){
                    wv.loadUrl("https://who.maps.arcgis.com/apps/opsdashboard/index.html#/c88e37cfc43b4ed3baf977d77e4a0667");
                }else if ( CarregandoActivity.site==2){
                    wv.loadUrl("https://nextstrain.org/ncov?dmax=2020-01-03&dmin=2019-12-27&l=clock");
                }else if ( CarregandoActivity.site==3){
                    wv.loadUrl("https://gisanddata.maps.arcgis.com/apps/opsdashboard/index.html#/bda7594740fd40299423467b48e9ecf6");
                }else if ( CarregandoActivity.site==4){
                    wv.loadUrl("https://nextstrain.org/ncov?dmax=2020-01-03&dmin=2019-12-27");
                }
            }
        });

        return root;
    }
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_slide_grafico);
        ImageView avancar = findViewById(R.id.btn_avancar);
        ImageView voltar = findViewById(R.id.btn_voltar);

        wv = findViewById(R.id.webview);
        wv.getSettings().setJavaScriptEnabled(true);
        if ( CarregandoActivity.site==1){
            wv.loadUrl("https://www.covidvisualizer.com/");
        }

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregandoActivity.site++;
                if(CarregandoActivity.site>4){
                    CarregandoActivity.site=0;
                }
                if ( CarregandoActivity.site==0){
                    wv.loadUrl("https://www.covidvisualizer.com/");
                }else if ( CarregandoActivity.site==1){
                    wv.loadUrl("https://who.maps.arcgis.com/apps/opsdashboard/index.html#/c88e37cfc43b4ed3baf977d77e4a0667");
                }else if (CarregandoActivity.site==2){
                    wv.loadUrl("https://nextstrain.org/ncov?dmax=2020-01-03&dmin=2019-12-27&l=clock");
                }else if ( CarregandoActivity.site==3){
                    wv.loadUrl("https://gisanddata.maps.arcgis.com/apps/opsdashboard/index.html#/bda7594740fd40299423467b48e9ecf6");
                }else if ( CarregandoActivity.site==4){
                    wv.loadUrl("https://nextstrain.org/ncov?dmax=2020-01-03&dmin=2019-12-27");
                }
            }
        });
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregandoActivity.site--;
                if( CarregandoActivity.site<0){
                    CarregandoActivity.site=4;
                }
                if (CarregandoActivity.site==0){
                    wv.loadUrl("https://www.covidvisualizer.com/");
                }else if ( CarregandoActivity.site==1){
                    wv.loadUrl("https://who.maps.arcgis.com/apps/opsdashboard/index.html#/c88e37cfc43b4ed3baf977d77e4a0667");
                }else if ( CarregandoActivity.site==2){
                    wv.loadUrl("https://nextstrain.org/ncov?dmax=2020-01-03&dmin=2019-12-27&l=clock");
                }else if ( CarregandoActivity.site==3){
                    wv.loadUrl("https://gisanddata.maps.arcgis.com/apps/opsdashboard/index.html#/bda7594740fd40299423467b48e9ecf6");
                }else if ( CarregandoActivity.site==4){
                    wv.loadUrl("https://nextstrain.org/ncov?dmax=2020-01-03&dmin=2019-12-27");
                }
            }
        });


    }
*/

}
