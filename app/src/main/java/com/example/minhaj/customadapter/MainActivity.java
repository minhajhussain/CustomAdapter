package com.example.minhaj.customadapter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String Numbers[]={"0","1","2","3","4","5","6","7","8","9"};


        ListAdapter myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Numbers);
        ListView myListView = (ListView) findViewById(R.id.MyAdapter);
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String data = String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(MainActivity.this,"Haly Loya " + data,Toast.LENGTH_SHORT).show();
                    }
                }

        );

    }
}
