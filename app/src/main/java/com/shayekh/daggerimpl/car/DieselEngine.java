package com.shayekh.daggerimpl.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private static final String TAG = "Car";

    private int horsePower;

    public DieselEngine(int horsePower){
        this.horsePower = horsePower;

    }
    @Override
    public void start() {
        Log.d(TAG, "start: Diesel" + horsePower);
    }
}
