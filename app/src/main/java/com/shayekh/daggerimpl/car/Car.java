package com.shayekh.daggerimpl.car;

import android.util.Log;

import com.shayekh.daggerimpl.di.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "CAR";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " " +driver.name + "drives " + this);
    }
}
