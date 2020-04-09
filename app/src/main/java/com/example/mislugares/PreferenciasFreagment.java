package com.example.mislugares;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class PreferenciasFreagment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferencias, rootKey);
    }
}
