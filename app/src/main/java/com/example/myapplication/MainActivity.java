package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        bottomNavigation = findViewById(R.id.bottomNavigation);

        ViewPagerAdapter adapter =
                new ViewPagerAdapter(this);

        viewPager.setAdapter(adapter);

        bottomNavigation.setOnItemSelectedListener(item -> {

            if(item.getItemId() == R.id.nav_chats){
                viewPager.setCurrentItem(0);
                return true;
            }

            if(item.getItemId() == R.id.nav_search){
                viewPager.setCurrentItem(1);
                return true;
            }

            if(item.getItemId() == R.id.nav_contacts){
                viewPager.setCurrentItem(2);
                return true;
            }

            if(item.getItemId() == R.id.nav_settings){
                viewPager.setCurrentItem(3);
                return true;
            }

            return false;
        });

        viewPager.registerOnPageChangeCallback(
                new ViewPager2.OnPageChangeCallback() {

                    @Override
                    public void onPageSelected(int position) {

                        switch(position){

                            case 0:
                                bottomNavigation.setSelectedItemId(R.id.nav_chats);
                                break;

                            case 1:
                                bottomNavigation.setSelectedItemId(R.id.nav_search);
                                break;

                            case 2:
                                bottomNavigation.setSelectedItemId(R.id.nav_contacts);
                                break;

                            case 3:
                                bottomNavigation.setSelectedItemId(R.id.nav_settings);
                                break;
                        }
                    }
                });
    }
}