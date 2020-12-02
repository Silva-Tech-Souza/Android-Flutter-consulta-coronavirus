package br.com.tenishiELucas.informacoesCovid19.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import br.com.tenishiELucas.informacoesCovid19.R;

public class Porestado extends Fragment {
    WebView porestado;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.activity_por_estado, container,false);


        porestado = rootview.findViewById(R.id.web_porestado);
        porestado.getSettings().setJavaScriptEnabled(true);

        porestado.loadUrl("https://covid.saude.gov.br");



        return rootview;
    }
}
