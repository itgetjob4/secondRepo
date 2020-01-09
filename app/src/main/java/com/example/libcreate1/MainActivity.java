package com.example.libcreate1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mylibrary.FirstClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstClass.myFun();
    }
}
