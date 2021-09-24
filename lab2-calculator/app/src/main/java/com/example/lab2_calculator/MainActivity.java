package com.example.lab2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText text1 = (EditText) findViewById(R.id.Num1);
        int num1 = Integer.parseInt(text1.getText().toString());

        EditText text2 = (EditText) findViewById(R.id.Num2);
        int num2 = Integer.parseInt(text2.getText().toString());

        int result = num1 + num2;
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("resultVal", String.valueOf(result));
        startActivity(intent);
    }
    public void subtract(View view) {
        EditText text1 = (EditText) findViewById(R.id.Num1);
        int num1 = Integer.parseInt(text1.getText().toString());

        EditText text2 = (EditText) findViewById(R.id.Num2);
        int num2 = Integer.parseInt(text2.getText().toString());

        int result = num1 - num2;
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("resultVal", String.valueOf(result));
        startActivity(intent);
    }
    public void multiply(View view) {
        EditText text1 = (EditText) findViewById(R.id.Num1);
        int num1 = Integer.parseInt(text1.getText().toString());

        EditText text2 = (EditText) findViewById(R.id.Num2);
        int num2 = Integer.parseInt(text2.getText().toString());

        int result = num1 * num2;
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("resultVal", String.valueOf(result));
        startActivity(intent);
    }
    public void divide(View view) {
        EditText text1 = (EditText) findViewById(R.id.Num1);
        int num1 = Integer.parseInt(text1.getText().toString());

        EditText text2 = (EditText) findViewById(R.id.Num2);
        int num2 = Integer.parseInt(text2.getText().toString());

        int result = num1 / num2;
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("resultVal", String.valueOf(result));
        startActivity(intent);
    }
}