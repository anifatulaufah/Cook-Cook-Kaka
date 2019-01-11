package anifatulannisa.app.cooka;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import anifatulannisa.app.cooka.adapter.ViewPageAdapter;
import anifatulannisa.app.cooka.fragment.FragmentBahan;
import anifatulannisa.app.cooka.fragment.FragmentPembuatan;
import anifatulannisa.app.cooka.fragment.FragmentPendahuluan;

/**
 * Created by nina on 1/9/19.
 */

public class DetailResepActivity extends AppCompatActivity {

    private TabLayout tabLayout ;
    private ViewPager viewPager ;
    private ViewPageAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_detail);

        tabLayout = (TabLayout) findViewById(R.id.detail_tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id2);
        adapter = new ViewPageAdapter(getSupportFragmentManager());

        //tambah fragment
        adapter.AddFragment(new FragmentPendahuluan(), "Pendahuluan");
        adapter.AddFragment(new FragmentBahan(), "Bahan");
        adapter.AddFragment(new FragmentPembuatan(), "Pembuatan");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#634c40"));
        tabLayout.setSelectedTabIndicatorHeight((int) (5 * getResources().getDisplayMetrics().density));
        tabLayout.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#003407"));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}
