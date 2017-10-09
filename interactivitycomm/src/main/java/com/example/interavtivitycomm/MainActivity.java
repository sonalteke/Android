package com.example.interavtivitycomm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_DESC = "desc";
    public static final int REQ_ONE = 1234;
    public static final int REQ_TWO = 1235;
    public static final int REQ_THREE = 1236;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onebtn(View view) {
        Class cls = OneActivity.class;

        Bundle bundle = new Bundle();
        bundle.putString(KEY_DESC, "This is one number");

        Intent intent = new Intent(this, cls);
        intent.putExtras(bundle);
        //startActivity(intent);
        startActivityForResult(intent, REQ_ONE);
    }

    public void twobtn(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_DESC,"This is two number");

        Intent intent = new Intent(this, TwoActivity.class);
        intent.putExtras(bundle);
        // startActivity(intent);
        startActivityForResult(intent, REQ_TWO);
    }

    public void threebtn(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_DESC,"This is three number");

        Intent intent = new Intent(this, ThreeActivity.class);
        intent.putExtras(bundle);
        //startActivity(intent);
        startActivityForResult(intent, REQ_THREE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQ_ONE) {
            if (resultCode == RESULT_OK) {
                Bundle bnd1 = data.getExtras();
                if (bnd1 != null) {
                    ((Button) findViewById(R.id.onebtn)).setText(bnd1.getString(OneActivity.RES_ONE));
                }
            }
        } else if (requestCode == REQ_TWO) {
            if (resultCode == RESULT_OK) {
                Bundle bnd1 = data.getExtras();
                if (bnd1 != null) {
                    ((Button) findViewById(R.id.twobtn)).setText(bnd1.getString(TwoActivity.RES_TWO));
                }
            }
        } else if (requestCode == REQ_THREE) {
            if (resultCode == RESULT_OK) {
                Bundle bnd1 = data.getExtras();
                if (bnd1 != null) {
                    ((Button) findViewById(R.id.threebtn)).setText(bnd1.getString(ThreeActivity.RES_THREE));
                }
            }
        } else {
            if (resultCode == RESULT_OK) {
            }
        }
    }
}


