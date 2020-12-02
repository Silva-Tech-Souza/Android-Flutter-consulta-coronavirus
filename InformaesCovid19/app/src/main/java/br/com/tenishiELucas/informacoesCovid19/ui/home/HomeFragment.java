package br.com.tenishiELucas.informacoesCovid19.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import androidx.navigation.ui.AppBarConfiguration;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import br.com.tenishiELucas.informacoesCovid19.Fragments.Homefragment;
import br.com.tenishiELucas.informacoesCovid19.Fragments.PgeFragment;
import br.com.tenishiELucas.informacoesCovid19.Fragments.PgeFragment2;
import br.com.tenishiELucas.informacoesCovid19.Fragments.PgeFragment3;
import br.com.tenishiELucas.informacoesCovid19.Fragments.Porestado;
import br.com.tenishiELucas.informacoesCovid19.JSON.ConexaoComHTTP;
import br.com.tenishiELucas.informacoesCovid19.MainActivity;
import br.com.tenishiELucas.informacoesCovid19.R;
import br.com.tenishiELucas.informacoesCovid19.PorEstadoActivity;
import br.com.tenishiELucas.informacoesCovid19.SlidepageSobreAdapter;
import br.com.tenishiELucas.informacoesCovid19.propaganda.Propaganda;
import br.com.tenishiELucas.informacoesCovid19.ui.send.SendViewModel;

public class HomeFragment extends Fragment {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    private Propaganda propaganda;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        List<Fragment> list =new ArrayList<>();
        list.add(new Porestado());

        propaganda = new Propaganda(root.getContext());

        propaganda.carregarPropaganda();

        pager = root.findViewById(R.id.viewpage_home);
        pagerAdapter = new SlidepageSobreAdapter(getFragmentManager(), list);
        pager.setAdapter(pagerAdapter);

        return root;
    }
}