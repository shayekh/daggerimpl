package com.shayekh.daggerimpl.di;

import com.shayekh.daggerimpl.MainActivity;
import com.shayekh.daggerimpl.car.Car;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
