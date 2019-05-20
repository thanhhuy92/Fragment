package com.example.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements FirstFragment.FirstFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(int fontsize, String text) {

        SecondFragment textFragment =
                (SecondFragment)getSupportFragmentManager().findFragmentById
                (R.id.second_fragment);
        textFragment.changeTextProperties(fontsize, text);

    }
}
