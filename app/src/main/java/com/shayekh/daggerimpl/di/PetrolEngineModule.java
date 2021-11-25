package com.shayekh.daggerimpl.di;

import com.shayekh.daggerimpl.car.Engine;
import com.shayekh.daggerimpl.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
