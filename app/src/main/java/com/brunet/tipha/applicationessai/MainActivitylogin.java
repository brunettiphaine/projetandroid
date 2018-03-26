package com.brunet.tipha.applicationessai;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivitylogin extends AppCompatActivity {
    public Button connection;
    public SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlogin);

        connection = (Button) findViewById(R.id.connection);
        connection.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivitylogin.this, MainActivitytab.class));
                    }
                }
        );
        sharedPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String myValue = sharedPref.getString('@+id/pseudo','');

    }
}
