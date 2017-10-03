package com.example.interavtivitycomm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OneActivity extends AppCompatActivity {

    public static final String KEY_MY_RESULT ="backbtn" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneactivity);

        Intent oneintent = getIntent();
        Bundle bundle = oneintent.getExtras();
        if (bundle != null) {
            String myname = bundle.getString(MainActivity.KEY_MY_NAME);
            Boolean bool = bundle.getBoolean(MainActivity.KEY_BOOL);

            ((TextView)findViewById(R.id.buttonone)).setText(myname + System.currentTimeMillis());
        }
        findViewById(R.id.backbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent();

                Bundle bundleback=new Bundle();
                bundleback.putString(KEY_MY_RESULT,((TextView)findViewById(R.id.backbtn)).getText().toString());
            }
        });
    }
}