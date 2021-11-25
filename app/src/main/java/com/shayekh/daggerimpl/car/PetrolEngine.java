package com.shayekh.daggerimpl.car;

import android.util.Log;

import com.shayekh.daggerimpl.car.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";

    @Inject
    public PetrolEngine(){

    }
    @Override
    public void start() {
        Log.d(TAG, "start: Petrol");
    }
}
