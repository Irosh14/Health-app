package com.irosh.helthapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity { // Capitalized class name
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log); // Ensure 'log.xml' exists in res/layout
    }
}
