package com.dipakkr.github.moviesapi.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dipakkr.github.moviesapi.R;
import com.dipakkr.github.moviesapi.fragment.AiringToday;
import com.dipakkr.github.moviesapi.fragment.HighRatedMovies;
import com.dipakkr.github.moviesapi.fragment.LatestTv;
import com.dipakkr.github.moviesapi.fragment.NowPlayingMovies;
import com.dipakkr.github.moviesapi.fragment.OnTheAir;
import com.dipakkr.github.moviesapi.fragment.PopularMovies;
import com.dipakkr.github.moviesapi.fragment.PopularTv;
import com.dipakkr.github.moviesapi.fragment.TopRatedTv;
import com.dipakkr.github.moviesapi.fragment.UpcomingMovies;

/**
 * Created by root on 7/18/17.
 */

public class TvPagerAdapter extends FragmentPagerAdapter {

    Context mContext;

    public TvPagerAdapter(Context context,FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new OnTheAir();
        }
        else if(position == 1){

            return new LatestTv();
        }
        else if(position == 2){

            return new AiringToday();

        }else if(position == 3 )
        {
            return new PopularTv();

        }else if(position == 4){

            return new TopRatedTv();

        }
        else {
            return  new HighRatedMovies();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0 : return mContext.getResources().getString(R.string.tv_onair);

            case 1 : return mContext.getResources().getString(R.string.tv_latest);

            case 2 : return mContext.getResources().getString(R.string.tv_air_today);

            case 3 : return mContext.getResources().getString(R.string.tv_popular);

            case 4 : return mContext.getResources().getString(R.string.tv_toprated);

        }
        return super.getPageTitle(position);
    }
}
