package com.brunet.tipha.applicationessai;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
public Button sinscrire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sinscrire = (Button) findViewById(R.id.inscrire);
        sinscrire.setOnclickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        startActivity(new Intent(MainActivity.this, MainActivity.class));
                    }
                }


        )

    }
}
