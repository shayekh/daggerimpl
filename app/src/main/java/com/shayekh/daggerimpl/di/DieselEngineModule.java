package com.shayekh.daggerimpl.di;

import com.shayekh.daggerimpl.car.DieselEngine;
import com.shayekh.daggerimpl.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
     Engine privideEngine(){
        return new DieselEngine(horsePower);
    }
}
