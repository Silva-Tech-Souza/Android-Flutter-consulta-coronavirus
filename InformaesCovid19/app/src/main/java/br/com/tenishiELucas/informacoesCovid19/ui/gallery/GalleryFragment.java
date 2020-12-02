package br.com.tenishiELucas.informacoesCovid19.ui.gallery;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import br.com.tenishiELucas.informacoesCovid19.JSON.ConexaoComHTTP;
import br.com.tenishiELucas.informacoesCovid19.JSON.Pais;
import br.com.tenishiELucas.informacoesCovid19.R;
import br.com.tenishiELucas.informacoesCovid19.propaganda.Propaganda;

public class GalleryFragment extends Fragment {

    private final static String SERVIDOR_DADOS = "https://pomber.github.io/covid19/timeseries.json";
    private String resposta;
    private JSONObject obj;
    private Propaganda propaganda;
    private EditText edtPesquisa;
    private Button btnPesquisar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        edtPesquisa = root.findViewById(R.id.edtPesquisa);
        btnPesquisar = root.findViewById(R.id.btnPesquisar);

        propaganda = new Propaganda(root.getContext());

        propaganda.carregarPropaganda();

        final ListView listView = root.findViewById(R.id.listViewPaises);

        final ArrayList<Pais> arrayListPais = new ArrayList<>();

        resposta = ConexaoComHTTP.get(SERVIDOR_DADOS);

        try {

            if(resposta != null) {

                obj = new JSONObject(resposta);

            }

        } catch (JSONException e) {

            e.printStackTrace();

        }

        JSONArray nomesDosPaises = obj.names();
        JSONObject dadosMaisRecenteDoPais = null;

        try {

            for (int x = 0; x < nomesDosPaises.length(); x++) {

                Pais pais = new Pais(root.getContext());

                pais.setNomePais(nomesDosPaises.getString(x));

                JSONArray dadosPais = obj.getJSONArray( nomesDosPaises.getString( x ) );

                dadosMaisRecenteDoPais = dadosPais.getJSONObject(dadosPais.length() - 1);

                if(!dadosMaisRecenteDoPais.isNull("deaths")) {
                    pais.setMortes(dadosMaisRecenteDoPais.getInt("deaths"));
                }else{
                    pais.setMortes(0);
                }

                if(!dadosMaisRecenteDoPais.isNull("recovered")) {
                    pais.setNumConfirmados(dadosMaisRecenteDoPais.getInt("confirmed"));
                }else{
                    pais.setNumConfirmados(0);
                }

                if(!dadosMaisRecenteDoPais.isNull("recovered")) {
                    pais.setRecuperacao(dadosMaisRecenteDoPais.getInt("recovered"));
                }else{
                    pais.setRecuperacao(0);
                }

                if(!dadosMaisRecenteDoPais.isNull("date")){
                    pais.setDataUltimaAtualizacao(dadosMaisRecenteDoPais.getString("date"));
                }else{
                    pais.setDataUltimaAtualizacao("Sem registro");
                }

                arrayListPais.add(pais);

            }

        }catch (Exception e){

            e.printStackTrace();
            Log.w("Pais", dadosMaisRecenteDoPais.toString() );

        }

        final ArrayAdapter<Pais> paisArrayAdapter = new ArrayAdapter<Pais>(root.getContext(), android.R.layout.simple_list_item_1, arrayListPais);
        listView.setAdapter(paisArrayAdapter);


        btnPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( edtPesquisa.getText().toString().isEmpty() ) {

                    final ArrayAdapter<Pais> paisArrayAdapter = new ArrayAdapter<Pais>(root.getContext(), android.R.layout.simple_list_item_1, arrayListPais);
                    listView.setAdapter(paisArrayAdapter);

                }else {

                    ArrayList<Pais> newArrayListPais = new ArrayList<>();

                    for (int x = arrayListPais.size(); x > 0; x--) {

                        Pais pais = arrayListPais.get(x - 1);

                        if (pais.getNomePais().toLowerCase().equals(edtPesquisa.getText().toString().toLowerCase())) {

                            newArrayListPais.add(pais);

                        }

                    }

                    final ArrayAdapter<Pais> paisArrayAdapter = new ArrayAdapter<Pais>(root.getContext(), android.R.layout.simple_list_item_1, newArrayListPais);
                    listView.setAdapter(paisArrayAdapter);
                }

            }
        });

        return root;
    }
}