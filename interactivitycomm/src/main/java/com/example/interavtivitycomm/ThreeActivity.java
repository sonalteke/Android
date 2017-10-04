package com.example.interavtivitycomm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThreeActivity extends AppCompatActivity {

    public static final String RES_THREE ="resthree" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        Intent parentintent=getIntent();
        Bundle bundle=parentintent.getExtras();
        String desc=bundle.getString(MainActivity.KEY_DESC);

        ((TextView)findViewById(R.id.txtdesc)).setText(desc);
    }

    public void backbtn2(View view){
        Intent intent=new Intent();
        Bundle bundle=new Bundle();
        bundle.putString(RES_THREE,"I am from three activity");
        intent.putExtras(bundle);

        setResult(RESULT_OK,intent);
        finish();
    }
}
