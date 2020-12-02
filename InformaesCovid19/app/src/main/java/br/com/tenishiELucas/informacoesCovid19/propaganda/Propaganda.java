package br.com.tenishiELucas.informacoesCovid19.propaganda;

import android.content.Context;
import android.util.Log;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Propaganda {

    private Context context;
    private InterstitialAd mInterstitialAd;

    public Propaganda(Context context){

        this.context = context;

        MobileAds.initialize(context, "ca-app-pub-2696210255709484~7220088005");
        mInterstitialAd = new InterstitialAd(context);
        mInterstitialAd.setAdUnitId("ca-app-pub-2696210255709484/5600363505");

    }

    public void carregarPropaganda(){

        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.

                mInterstitialAd.show();

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.

                Log.w("AD Falied: ", String.valueOf(errorCode) );

            }
        });

    }

}
