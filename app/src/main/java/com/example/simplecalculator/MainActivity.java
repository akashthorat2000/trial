package com.example.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ADD(View view) {
        EditText ed1 = (EditText) findViewById(R.id.editTextNumber);
        EditText ed2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText ed3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(ed1.getText().toString());
        int n2 = Integer.parseInt(ed2.getText().toString());
        int result = n1+n2;

        ed3.setText("Addition Value " + result);
    }

    public void SUB(View view) {
        EditText ed1 = (EditText) findViewById(R.id.editTextNumber);
        EditText ed2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText ed3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(ed1.getText().toString());
        int n2 = Integer.parseInt(ed2.getText().toString());
        int result = n1-n2;

        ed3.setText(" substract Value " + result);
    }
    public void MUL (View view) {
        EditText ed1 = (EditText) findViewById(R.id.editTextNumber);
        EditText ed2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText ed3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(ed1.getText().toString());
        int n2 = Integer.parseInt(ed2.getText().toString());
        int result = n1*n2;

        ed3.setText("multiplication Value" + result);
    }
    public void DIV (View view) {
        EditText ed1 = (EditText) findViewById(R.id.editTextNumber);
        EditText ed2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText ed3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(ed1.getText().toString());
        int n2 = Integer.parseInt(ed2.getText().toString());
        int result = n1/n2;

        ed3.setText("divide Value" + result);
    }

}