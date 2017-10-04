package com.example.sonal.interactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    public static final String SUBTRACT = "subtract";
    private EditText edtNo1,edtNo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        edtNo1 = findViewById(R.id.editNo1);
        edtNo2 = findViewById(R.id.editNo2);

        initButton();
    }

    private void initButton() {
        findViewById(R.id.btnThird).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Integer subtract = Integer.parseInt(edtNo1.getText().toString()) - Integer.parseInt(edtNo2.getText().toString());
                intent.putExtra(SUBTRACT,subtract);
                setResult(3,intent);
                finish();
            }
        });
    }
}
