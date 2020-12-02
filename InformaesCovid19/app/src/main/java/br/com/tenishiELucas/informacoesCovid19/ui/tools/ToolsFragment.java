package br.com.tenishiELucas.informacoesCovid19.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.com.tenishiELucas.informacoesCovid19.Bibliogradia;
import br.com.tenishiELucas.informacoesCovid19.Bibliografia;
import br.com.tenishiELucas.informacoesCovid19.CoronaActivity;
import br.com.tenishiELucas.informacoesCovid19.Fragments.SintomasPrevencao1;
import br.com.tenishiELucas.informacoesCovid19.Fragments.SintomasPrevencao2;
import br.com.tenishiELucas.informacoesCovid19.Main2Activity;
import br.com.tenishiELucas.informacoesCovid19.Main3Activity;
import br.com.tenishiELucas.informacoesCovid19.OqueECoronavirusScrow;
import br.com.tenishiELucas.informacoesCovid19.R;
import br.com.tenishiELucas.informacoesCovid19.SIntomasePrevencao;
import br.com.tenishiELucas.informacoesCovid19.SintomasPrevencaoActivity;
import br.com.tenishiELucas.informacoesCovid19.ViewPagedoCoronaInformacoes;
import br.com.tenishiELucas.informacoesCovid19.propaganda.Propaganda;

public class ToolsFragment extends Fragment {

    private ToolsViewModel toolsViewModel;
    private Propaganda propaganda;

    ImageView imagem1, imagem2, imagem3;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel =
                ViewModelProviders.of(this).get(ToolsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tools, container, false);

        toolsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });

        propaganda = new Propaganda(root.getContext());
        propaganda.carregarPropaganda();

        imagem1 = root.findViewById(R.id.btn_imageview);

        imagem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Main3Activity.class);
                startActivity(intent);

            }
        });

        imagem2 = root.findViewById(R.id.btn_imageview2);

        imagem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Main2Activity.class);
                startActivity(intent);

            }
        });

        imagem3 = root.findViewById(R.id.btn_imageview3);

        imagem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Bibliografia.class);

                startActivity(intent);

            }
        });

        return root;
    }

}