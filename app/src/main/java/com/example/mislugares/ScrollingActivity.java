package com.example.mislugares;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class ScrollingActivity extends AppCompatActivity {

    private Button bAcercaDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.edicion_lugar);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        /*
        bAcercaDe = findViewById(R.id.bottomAbout);
        bAcercaDe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                lanzarAcercaDe(null);
            }
        });
         */

        // Tool bar

        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void salir(View view) {
        finish();
    }

    public void lanzarAcercaDe (View view) {
        Intent intent = new Intent(this, AcercaDeActivity.class);
        startActivity(intent);
    }

    public void lanzarPreferencias (View view) {
        Intent intent = new Intent(this, PreferenciasActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.acercaDe) {
            lanzarAcercaDe(null);
            return true;
        }

        if (id == R.id.preferencias) {
            lanzarPreferencias(null);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}