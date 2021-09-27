package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        EditText operand1 = (EditText) findViewById(R.id.operand1);
        EditText operand2 = (EditText) findViewById(R.id.operand2);
        String op1 = operand1.getText().toString();
        String op2 = operand2.getText().toString();
        Button button = (Button) findViewById(view.getId());
        char operator = button.getText().toString().charAt(0);
        int result = 0;
        if(operator == '+') {
            result = Integer.parseInt(op1) + Integer.parseInt(op2);
        }
        else if(operator == '-') {
            result = Integer.parseInt(op1) - Integer.parseInt(op2);
        }
        else if(operator == 'x') {
            result = Integer.parseInt(op1) * Integer.parseInt(op2);
        }
        else {
            result = Integer.parseInt(op1) / Integer.parseInt(op2);
        }
        goToActivity2(String.valueOf(result));
    }

    public void goToActivity2(String result) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", result);
        startActivity(intent);
    }
}