package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {

            case 0:
                return new ChatFragment();

            case 1:
                return new SearchFragment();

            case 2:
                return new ContactsFragment();

            case 3:
                return new SettingsFragment();

            default:
                return new ChatFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}