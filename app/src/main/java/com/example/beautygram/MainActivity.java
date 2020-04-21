package com.example.beautygram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.beautygram.adapters.MainViewPagerAdapter;
import com.example.beautygram.fragments.main.ProfileFragment;
import com.example.beautygram.fragments.main.ReservesFragment;
import com.example.beautygram.views.CurvedBottomNavigationView;
import com.example.beautygram.views.UI;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class MainActivity extends AppCompatActivity {

    private CurvedBottomNavigationView curvedBottomNavigationView;
    private ViewPager viewPager;
    private FloatingActionButton fab;

    //ViewPager
    MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new UI(getWindow()).setFullScreen().setStatusBarTransparent().setStatusBarIconsDark();

        initViews();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

    private void initViews() {
        curvedBottomNavigationView = findViewById(R.id.main_bottomBar);
        viewPager = findViewById(R.id.main_viewPager);
        fab = findViewById(R.id.main_fab);

        //curvedBottomNavigationView.inflateMenu(R.menu.main_bottom_bar_menu);
        //viewPager.setCurrentItem(4);

        setupViewPager();
    }

    private void setupViewPager() {
        curvedBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.menu_home:
                        viewPager.setCurrentItem(0);
                        fab.setImageResource(R.drawable.ic_add);
                        break;
                    case R.id.menu_search:
                        viewPager.setCurrentItem(1);
                        fab.setImageResource(R.drawable.ic_calendar);
                        break;
                    case R.id.menu_fav:
                        startActivity(new Intent(MainActivity.this,SearchActivity.class));
                        fab.setImageResource(R.drawable.ic_filter_list_black_24dp);
                }
                return false;
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null)
                    prevMenuItem.setChecked(false);
                else
                    curvedBottomNavigationView.getMenu().getItem(0).setChecked(false);

                prevMenuItem = curvedBottomNavigationView.getMenu().getItem(position);
                prevMenuItem.setChecked(true);//todo

                switch (prevMenuItem.getItemId()){
                    case R.id.menu_home:
                        viewPager.setCurrentItem(0);
                        fab.setImageResource(R.drawable.ic_add);
                        break;
                    case R.id.menu_search:
                        viewPager.setCurrentItem(1);
                        fab.setImageResource(R.drawable.ic_calendar);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        //

        MainViewPagerAdapter adapter = new MainViewPagerAdapter(getSupportFragmentManager());
        adapter.Add(new ProfileFragment());
        adapter.Add(new ReservesFragment());
        viewPager.setAdapter(adapter);
    }
}
