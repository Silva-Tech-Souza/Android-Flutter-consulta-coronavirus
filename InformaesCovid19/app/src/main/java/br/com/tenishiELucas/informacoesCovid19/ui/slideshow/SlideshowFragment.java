package br.com.tenishiELucas.informacoesCovid19.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import br.com.tenishiELucas.informacoesCovid19.FakenewsActivity;
import br.com.tenishiELucas.informacoesCovid19.R;
import br.com.tenishiELucas.informacoesCovid19.propaganda.Propaganda;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    CardView btncarsd;
    private Propaganda propaganda;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

       btncarsd = root.findViewById(R.id.fakenews);

       btncarsd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getContext(), FakenewsActivity.class);
               startActivity(intent);
           }
       });



        slideshowViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });

        propaganda = new Propaganda(root.getContext());
        propaganda.carregarPropaganda();

        return root;
    }
}