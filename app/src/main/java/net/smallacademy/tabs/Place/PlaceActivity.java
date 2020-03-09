package net.smallacademy.tabs.Place;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import net.smallacademy.tabs.R;
import net.smallacademy.tabs.ThirdFragmentPlace;


public class PlaceActivity extends AppCompatActivity{

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FirstPlace(), "Отели");
        adapter.AddFragment(new SecondPlace(), "Достопримечательности");
        adapter.AddFragment(new ThirdFragmentPlace(), "Кафе");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_hotel);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_plece);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_cafe);

    }
}
