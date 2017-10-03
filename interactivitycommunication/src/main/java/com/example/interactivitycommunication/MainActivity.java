package com.example.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button capbtn=(Button)findViewById(R.id.capbtn);
        capbtn.setOnClickListener(MainActivity.this::capbtn);
    }

    private void capbtn(View view) {
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
