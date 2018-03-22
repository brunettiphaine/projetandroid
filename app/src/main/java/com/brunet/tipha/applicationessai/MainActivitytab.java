package com.brunet.tipha.applicationessai;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivitytab extends AppCompatActivity {
public ListView mListView;
private String[] prenom = new String[]{"Antoine","Benoit","Cyril"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintab);

        mListView=(ListView)findViewById(R.id.mListView);

        final ArrayAdapter<String>adapter = new ArrayAdapter<>(MainActivitytab.this, android.R.layout.simple_list_item_1, prenom);
        mListView.setAdapter(adapter);


//        mListView.setOnClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.wtf("mon-projet", prenom[position]);
//            }
//        });
    }



}
