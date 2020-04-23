package com.example.newrestaurant;

import android.content.Context;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyRestaurantsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mRestaurants;
    private String[] mCuisines;

    // generated constructor

    public MyRestaurantsArrayAdapter(Context mContext, int resource, String[] mRestaurants, String[] mCuisines) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mRestaurants = mRestaurants;
        this.mCuisines = mCuisines;
    }

    //generate overide methods i.e getters for customization of out put in generate methods(select two on all of them)


    @Override
    public int getCount() {
        return mRestaurants.length;
    }


    @Override
    public Object getItem(int position) {

        //add code
        String restaurants = mRestaurants[position];
        String cuisines = mCuisines[position];

        return String.format("%s \nServes great: %s", restaurants, cuisines);
    }
}
