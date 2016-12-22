package com.example.tanvir.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class TemparatureActivity extends AppCompatActivity {

    private EditText celsius;
    private EditText fahrenheit;
    private TextView textViewC;
    private TextView textViewF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temparature);
    }


    public void convertToF(View v){
        celsius = (EditText) findViewById(R.id.editTextCelsius);
        if(celsius.getText()!= null){
            textViewF = (TextView) findViewById(R.id.textViewF);
            double f = Double.parseDouble(celsius.getText().toString());
            double result = (f*1.8)+32;
            textViewF.setText(String.format("%.2f",result));
        }
    }

    public void convertToC(View v){
        fahrenheit = (EditText) findViewById(R.id.editTextF);
        if(fahrenheit.getText()!= null){
            textViewC = (TextView) findViewById(R.id.textViewC);
            double f = Double.parseDouble(fahrenheit.getText().toString());
            double result =(f-32)/1.8;
            textViewC.setText(String.format("%.2f", result));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        textViewF = (TextView) findViewById(R.id.textViewF);
        textViewC = (TextView) findViewById(R.id.textViewC);
        savedInstanceState.putString("AnsF", textViewC.getText().toString());
        savedInstanceState.putString("AnsC", textViewF.getText().toString());

        celsius = (EditText) findViewById(R.id.editTextCelsius);
        fahrenheit = (EditText) findViewById(R.id.editTextF);
        savedInstanceState.putString("InputedC", celsius.getText().toString());
        savedInstanceState.putString("InputedF", fahrenheit.getText().toString());

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textViewF = (TextView) findViewById(R.id.textViewF);
        textViewC = (TextView) findViewById(R.id.textViewC);
        textViewC.setText(savedInstanceState.getString("AnsF"));
        textViewF.setText(savedInstanceState.getString("AnsC"));

        celsius = (EditText) findViewById(R.id.editTextCelsius);
        fahrenheit = (EditText) findViewById(R.id.editTextF);
        celsius.setText(savedInstanceState.getString("InputedC"));
        fahrenheit.setText(savedInstanceState.getString("InputedF"));

    }
}
