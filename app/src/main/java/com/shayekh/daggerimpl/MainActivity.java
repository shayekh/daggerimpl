package com.shayekh.daggerimpl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shayekh.daggerimpl.car.Car;
import com.shayekh.daggerimpl.di.CarComponent;
import com.shayekh.daggerimpl.di.DaggerCarComponent;
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

        CarComponent component = DaggerCarComponent.builder()
//                dieselEngineModule(new DieselEngineModule(100))
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component.inject(this);

//        car =  component.getCar();
        car1.drive();
        car2.drive();
    }
}