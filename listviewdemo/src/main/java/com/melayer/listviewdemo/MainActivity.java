package com.melayer.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String technology[] = {"Android","iOS","Spring","AngularJS","Java","Kotlin","PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.custom_textview,technology);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),technology[i], Toast.LENGTH_SHORT).show();

            }
        });
    }

    private List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("Sonal");
        list.add("Pooja1");
        list.add("Pooja2");
        list.add("Rohan");
        return list;
    }
}
