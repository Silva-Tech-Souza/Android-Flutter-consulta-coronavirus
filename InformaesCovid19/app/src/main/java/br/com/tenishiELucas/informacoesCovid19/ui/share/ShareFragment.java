package br.com.tenishiELucas.informacoesCovid19.ui.share;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import br.com.tenishiELucas.informacoesCovid19.SlidesGraficos.SlideGraficoActivity;

import br.com.tenishiELucas.informacoesCovid19.R;
import br.com.tenishiELucas.informacoesCovid19.propaganda.Propaganda;

public class ShareFragment extends Fragment {

    private ShareViewModel shareViewModel;
    private Propaganda propaganda;
    static final String urlApp = "drive.google.com/open?id=1h5m6lMh-i9sF-SgGVF3APUDY-1i2aJ62";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shareViewModel =
                ViewModelProviders.of(this).get(ShareViewModel.class);
        View root = inflater.inflate(R.layout.fragment_share, container, false);


        Intent share = new Intent(android.content.Intent.ACTION_SEND);
        share.setType("text/plain");
        share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

        share.putExtra(Intent.EXTRA_SUBJECT,
                "Aqui vai sua mensagem");
        share.putExtra(Intent.EXTRA_TEXT,
                "Veja esse app que informa a população sobre o CoronaVírus !!\n" +
                        urlApp);

        startActivity(Intent.createChooser(share, "Compartilhar"));

        shareViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });

        propaganda = new Propaganda(root.getContext());

        propaganda.carregarPropaganda();

        return root;
    }
}