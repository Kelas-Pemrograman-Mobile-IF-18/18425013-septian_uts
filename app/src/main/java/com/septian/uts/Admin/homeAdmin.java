package com.septian.uts.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.septian.uts.R;

public class homeAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeadmin);
        getSupportActionBar().hide();
    }
}