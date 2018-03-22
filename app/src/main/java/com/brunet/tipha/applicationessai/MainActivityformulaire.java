package com.brunet.tipha.applicationessai;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityformulaire extends AppCompatActivity {
public Button valider;
public SharedPreferences sharedPref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainformulaire);

        valider = (Button) findViewById(R.id.valider);
        valider.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivityformulaire.this, MainActivitytab.class));
                    }
                }
        );
//        sharedPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//        String myValue = sharedPref.getString('@+id/pseudo','');

    }
}
