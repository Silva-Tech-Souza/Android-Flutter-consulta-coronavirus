package br.com.tenishiELucas.informacoesCovid19.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.ui.AppBarConfiguration;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import br.com.tenishiELucas.informacoesCovid19.JSON.ConexaoComHTTP;
import br.com.tenishiELucas.informacoesCovid19.PorEstadoActivity;
import br.com.tenishiELucas.informacoesCovid19.R;

public class Homefragment extends Fragment {

    private AppBarConfiguration mAppBarConfiguration;
    private final static String SERVIDOR_DADOS = "https://pomber.github.io/covid19/timeseries.json";
    private final static String SERVIDOR_PAIS = "https://pomber.github.io/covid19/countries.json";
    private String resposta, resposta_paises;
    private JSONObject obj, paisesJson;
    public Button btnestado;
    private TextView txtCasosSuspeitos, txtCasosConfirmados, txtMortes;

    private InterstitialAd mInterstitialAd;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.page_home, container,false);


        txtCasosConfirmados = rootview.findViewById(R.id.txtCasosConfirmados2);
        txtCasosSuspeitos = rootview.findViewById(R.id.txtCasosSupeitos2);
        txtMortes = rootview.findViewById(R.id.txtMortes2);

        resposta = ConexaoComHTTP.get(SERVIDOR_DADOS);
        resposta_paises = ConexaoComHTTP.get(SERVIDOR_PAIS);




        try {

            if(resposta != null) {

                obj = new JSONObject(resposta);

                JSONArray objBrasilArray = obj.getJSONArray("Brazil");

                Log.w("Brasil", objBrasilArray.getString(objBrasilArray.length() - 1).toString());

                JSONObject objBrasilMaisRecente = objBrasilArray.getJSONObject(objBrasilArray.length() - 1);

                Log.w("Brasil", objBrasilMaisRecente.toString());

                txtMortes.setText( "Mortes: " + objBrasilMaisRecente.getInt("deaths"));

                txtCasosSuspeitos.setText("Recuperaçoes: " + objBrasilMaisRecente.getInt( "recovered"));

                txtCasosConfirmados.setText("Casos Confirmados: " + objBrasilMaisRecente.getInt("confirmed"));

            }

        } catch (JSONException e) {

            e.printStackTrace();

        }
        try{

            if(resposta_paises != null) {
                paisesJson = new JSONObject(resposta_paises);
            }

        }catch (Exception e){

            e.printStackTrace();

        }
        mInterstitialAd = new InterstitialAd(rootview.getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-2696210255709484/5600363505");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.

                mInterstitialAd.show();

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.

                Log.w("ERROR:", String.valueOf(errorCode));

            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
            }
        });


        return rootview;
    }
}
