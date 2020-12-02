package br.com.tenishiELucas.informacoesCovid19;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.tenishiELucas.informacoesCovid19.Fragments.OqueeCorona;
import br.com.tenishiELucas.informacoesCovid19.Fragments.OqueeCorona2;
import br.com.tenishiELucas.informacoesCovid19.Fragments.SintomasPrevencao1;
import br.com.tenishiELucas.informacoesCovid19.Fragments.SintomasPrevencao2;
import br.com.tenishiELucas.informacoesCovid19.propaganda.Propaganda;
import br.com.tenishiELucas.informacoesCovid19.ui.send.SendViewModel;


public class SIntomasePrevencao extends Fragment {



    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    private Propaganda propaganda;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_sintomase_prevencao, container, false);



        List<Fragment> list =new ArrayList<>();
        list.add(new SintomasPrevencao1());
        list.add(new SintomasPrevencao2());

        pager = root.findViewById(R.id.viewpage_sintomasprevencao);
        pagerAdapter = new SlidepageSobreAdapter(getFragmentManager(), list);
        pager.setAdapter(pagerAdapter);



        propaganda = new Propaganda(root.getContext());
        propaganda.carregarPropaganda();

        return root;
    }

}
