package com.example.interavtivitycomm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_MY_NAME ="myname";
    public static final String KEY_BOOL ="boolean" ;
    public static final int REQ_NEW = 1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button onebtn=(Button)findViewById(R.id.onebtn);
        onebtn.setOnClickListener(MainActivity.this::onebtn);
        Button twobtn=(Button)findViewById(R.id.twobtn);
        twobtn.setOnClickListener(MainActivity.this::twobtn);
        Button threebtn=(Button)findViewById(R.id.threebtn);
        threebtn.setOnClickListener(MainActivity.this::threebtn);
    }

    private void onebtn(View view) {
        Class cls=OneActivity.class;
        Intent intent=new Intent(this,cls);
        Bundle bundle=new Bundle();
        bundle.putString(KEY_MY_NAME,"codekul");
        bundle.putBoolean(KEY_BOOL,true);
        intent.putExtras(bundle);
        //startActivity(intent);
        startActivityForResult(intent,REQ_NEW);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void twobtn(View view) {
        Intent intent=new Intent(this,TwoActivity.class);
        startActivity(intent);
    }

    private void threebtn(View view) {
        Intent intent=new Intent(this,ThreeActivity.class);
        startActivity(intent);
    }
}



