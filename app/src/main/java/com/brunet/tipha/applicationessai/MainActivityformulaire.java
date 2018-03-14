package com.brunet.tipha.applicationessai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivityformulaire extends AppCompatActivity {
public Button valider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainformulaire);

        valider = (Button) findViewById(R.id.valider);
        valider.setOnClickListener();


    }
}
