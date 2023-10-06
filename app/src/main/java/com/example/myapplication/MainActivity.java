package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.models.Celsius;
import com.example.myapplication.models.Fahrenheit;
import com.example.myapplication.models.Grado;
import com.example.myapplication.models.Kelvin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Grado celsius = new Celsius(0.0, "C");

        Grado fahrenheit = new Fahrenheit(0.0, "F");
        Grado kelvin = new Kelvin(0.0, "K");


    }
}