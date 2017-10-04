package com.example.sonal.interactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.sonal.interactivity.SecondActivity.SUM;
import static com.example.sonal.interactivity.ThirdActivity.SUBTRACT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
    }

    private void initButton() {
        findViewById(R.id.buttonStart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                startActivityForResult(intent,2);
            }
        });

        findViewById(R.id.btnThird).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
                startActivityForResult(intent,3);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==2) {
            if (data != null) {
                Integer sum = data.getIntExtra(SUM,0);
                ((TextView) findViewById(R.id.txtTotal)).setText(""+sum);
            }
        }
        if (requestCode==3) {
            if (data != null) {
                Integer subtract = data.getIntExtra(SUBTRACT,0);

                ((TextView) findViewById(R.id.txtTotal)).setText(""+subtract);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
