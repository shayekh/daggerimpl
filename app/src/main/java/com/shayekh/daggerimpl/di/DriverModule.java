package com.shayekh.daggerimpl.di;

import android.content.SyncRequest;

import com.shayekh.daggerimpl.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    private String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Provides
    @Singleton
     Driver provideDriver(){
        return new Driver(driverName);
    }
}
