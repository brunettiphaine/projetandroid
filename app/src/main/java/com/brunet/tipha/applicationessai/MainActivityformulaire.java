package com.brunet.tipha.applicationessai;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityformulaire extends AppCompatActivity {
public Button valider;
public SharedPreferences sharedPref;
public EditText pseudo;
public EditText numero;
public EditText motdepasse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainformulaire);
        sharedPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        pseudo = (EditText) findViewById(R.id.pseudo);
        numero = (EditText) findViewById(R.id.numero);
        motdepasse = (EditText) findViewById(R.id.motdepasse);
        valider = (Button) findViewById(R.id.valider);
        valider.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivityformulaire.this, MainActivitytab.class));
                        sharedPref.edit()
                                .putString("pseudo","")
                                .putString("numero","")
                                .putString("motdepasse","")
                                .apply();
                    }
                }
        );

        EditText Pseudo = (EditText)findViewById(R.id.pseudo);
        if( Pseudo.getText().toString().length() == 0 )
            Pseudo.setError( "Pseudo est requis!" );

        EditText Motdepasse = (EditText)findViewById(R.id.motdepasse);
        if( Motdepasse.getText().toString().length() == 0 )
            Motdepasse.setError( "Mot de passe est requis!" );
    }
}
