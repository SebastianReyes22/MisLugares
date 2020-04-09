package com.example.mislugares;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mislugares.PreferenciasFreagment;

public class PreferenciasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new PreferenciasFreagment()).commit();
    }
}