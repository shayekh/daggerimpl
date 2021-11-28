package com.shayekh.daggerimpl;

import android.app.Application;

import com.shayekh.daggerimpl.di.AppComponent;
import com.shayekh.daggerimpl.di.DaggerAppComponent;
import com.shayekh.daggerimpl.di.DriverModule;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.factory().create(new DriverModule("Hans"));
    }

    public AppComponent getAppComponent()
    {
        return component;
    }
}
