package com.septian.uts.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.ornach.nobobutton.NoboButton;
import com.septian.uts.Admin.homeAdmin;
import com.septian.uts.R;

public class login extends AppCompatActivity {

    Button btnRegistrasi;
    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnLogin = (NoboButton) findViewById(R.id.btLogin);

        btnLogin.setOnClickListener((v) -> {
            Intent i = new Intent(login.this, homeAdmin.class);
            startActivity(i);
            finish();
        });

        btnRegistrasi = (Button) findViewById(R.id.Register);

        btnRegistrasi.setOnClickListener((v) -> {
            Intent i = new Intent(login.this, register.class);
            startActivity(i);
            finish();
        });
    }
}