package com.example.sonal.interactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    public static final String SUM = "sum";
    private EditText edtNo1,edtNo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edtNo1 = findViewById(R.id.editNo1);
        edtNo2 = findViewById(R.id.editNo2);

        initButton();
    }

    private void initButton() {
        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Integer sum = Integer.parseInt(edtNo1.getText().toString()) + Integer.parseInt(edtNo2.getText().toString());
                Log.i("@Codekul:","Sum:"+sum);
                intent.putExtra(SUM,sum);
                setResult(2,intent);
                finish();
            }
        });

    }
}
