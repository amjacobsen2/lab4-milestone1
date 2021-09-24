package com.example.lab2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView= (TextView) findViewById(R.id.textView5);
        Intent intent = getIntent();
        String str = intent.getStringExtra("resultVal");
        textView.setText(str);
    }
}