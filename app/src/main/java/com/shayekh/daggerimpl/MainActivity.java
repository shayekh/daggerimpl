package com.shayekh.daggerimpl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shayekh.daggerimpl.car.Car;
import com.shayekh.daggerimpl.di.ActivityComponent;
import com.shayekh.daggerimpl.di.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


//    private Car car;

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent().getActivityComponentFactory()
                .create(150, 1400);
        component.inject(this);

//        car =  component.getCar();
        car1.drive();
        car2.drive();
    }
}