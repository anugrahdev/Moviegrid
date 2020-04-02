package com.anugraha.project.moviegrid.PagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.anugraha.project.moviegrid.FragmentFavorite.FavoriteMovieFragment;
import com.anugraha.project.moviegrid.FragmentFavorite.FavoriteTVFragment;
import com.anugraha.project.moviegrid.FragmentRated.RatedMovieFragment;
import com.anugraha.project.moviegrid.FragmentRated.RatedTVFragment;

public class PagerRated extends FragmentStatePagerAdapter {
    int tabCount;

    public PagerRated(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                RatedMovieFragment tab1 = new RatedMovieFragment();
                return tab1;
            case 1:
                RatedTVFragment tab2 = new RatedTVFragment();
                return tab2;

            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }

}
