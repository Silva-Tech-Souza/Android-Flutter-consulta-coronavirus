package br.com.tenishiELucas.informacoesCovid19;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class SlidepageSobreAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> Fragmentlist;

    public  SlidepageSobreAdapter(FragmentManager fm,List<Fragment> Fragmentlist){
        super(fm);
        this.Fragmentlist = Fragmentlist;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return Fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return Fragmentlist.size();
    }
}
