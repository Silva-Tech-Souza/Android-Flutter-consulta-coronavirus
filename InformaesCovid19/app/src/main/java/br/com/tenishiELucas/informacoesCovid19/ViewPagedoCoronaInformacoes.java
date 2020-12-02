package br.com.tenishiELucas.informacoesCovid19;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.tenishiELucas.informacoesCovid19.Fragments.Homefragment;
import br.com.tenishiELucas.informacoesCovid19.Fragments.OqueeCorona;
import br.com.tenishiELucas.informacoesCovid19.Fragments.OqueeCorona2;
import br.com.tenishiELucas.informacoesCovid19.Fragments.PgeFragment;
import br.com.tenishiELucas.informacoesCovid19.Fragments.Porestado;
import br.com.tenishiELucas.informacoesCovid19.propaganda.Propaganda;
import br.com.tenishiELucas.informacoesCovid19.ui.send.SendViewModel;

public class ViewPagedoCoronaInformacoes extends Fragment {


    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    private Propaganda propaganda;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_view_pagedo_corona_informacoes, container, false);


        List<Fragment> list =new ArrayList<>();
        list.add(new Homefragment());
        list.add(new OqueeCorona2());

        propaganda = new Propaganda(root.getContext());

        propaganda.carregarPropaganda();

        pager = root.findViewById(R.id.viewpage_corona);
        pagerAdapter = new SlidepageSobreAdapter(getFragmentManager(), list);
        pager.setAdapter(pagerAdapter);

        return root;
    }
}
