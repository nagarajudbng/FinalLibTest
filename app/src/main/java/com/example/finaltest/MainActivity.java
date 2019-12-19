package com.example.finaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mymath.Calculate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int result  = Calculate.add(10,90);
    }
}
