package com.brunet.tipha.applicationessai;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class MainActivity extends AppCompatActivity {
public Button inscrire;
public Button connection;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inscrire = (Button) findViewById(R.id.inscrire);
        inscrire.setOnClickListener(

                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        startActivity(new Intent(MainActivity.this, MainActivityformulaire.class));
                    }
                }


        );
        connection = (Button) findViewById(R.id.connection1);
        connection.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, MainActivitylogin.class));
                    }
                }
        );

    }
}
