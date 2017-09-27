package com.example.imagething;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnboy = findViewById(R.id.btnboy);
        Button btnbus = findViewById(R.id.btnbus);
        Button btncycle = findViewById(R.id.btncycle);

        btnboy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView)findViewById(R.id.imgcrd)).setImageResource(R.drawable.ic_boy);
            }
        });

        //lambda expression
        btnbus.setOnClickListener(view -> ((ImageView)findViewById(R.id.imgcrd))
                .setImageResource(R.drawable.ic_bus));

        //method reference
        btncycle.setOnClickListener(this::oncycle);
    }
            private void oncycle(View view){
                ((ImageView)findViewById(R.id.imgcrd)).setImageResource(R.drawable.ic_cycle);
            }

        public void onImgClick(View view){
            ((ImageView)findViewById(R.id.imgcrd)).setImageResource(R.drawable.ic_launcher_background);
    }
}
