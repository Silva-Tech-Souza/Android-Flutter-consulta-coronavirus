package br.com.tenishiELucas.informacoesCovid19.ui.send;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import br.com.tenishiELucas.informacoesCovid19.Fragments.PgeFragment;
import br.com.tenishiELucas.informacoesCovid19.Fragments.PgeFragment2;
import br.com.tenishiELucas.informacoesCovid19.Fragments.PgeFragment3;
import br.com.tenishiELucas.informacoesCovid19.R;
import br.com.tenishiELucas.informacoesCovid19.SlidepageSobreAdapter;
import br.com.tenishiELucas.informacoesCovid19.propaganda.Propaganda;

public class SendFragment extends Fragment {

    private SendViewModel sendViewModel;
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    private Propaganda propaganda;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sendViewModel =
                ViewModelProviders.of(this).get(SendViewModel.class);
        View root = inflater.inflate(R.layout.fragment_send, container, false);

        List<Fragment> list =new ArrayList<>();
        list.add(new PgeFragment());

        pager = root.findViewById(R.id.viewpage);
        pagerAdapter = new SlidepageSobreAdapter(getFragmentManager(), list);
        pager.setAdapter(pagerAdapter);

        sendViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });

        propaganda = new Propaganda(root.getContext());
        propaganda.carregarPropaganda();

        return root;
    }
}