package com.example.interavtivitycomm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OneActivity extends AppCompatActivity {

    public static final String RES_ONE ="resone" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneactivity);

        Intent parentintent=getIntent();
        Bundle bundle= parentintent.getExtras();
        String desc=bundle.getString(MainActivity.KEY_DESC);

          ((TextView)findViewById(R.id.txtdesc)).setText(desc);
      }

      public void backbtn(View view){
          Intent intent=new Intent();
          Bundle bundle=new Bundle();
          bundle.putString(RES_ONE,"I am from one activity");
          intent.putExtras(bundle);

          setResult(RESULT_OK,intent);
          finish();
      }
}