package com.example.tanvir.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class DistanceActivity extends AppCompatActivity {
    private TextView result;
    private double calculatedValue;
    private CheckBox cb1;
    double mile,feet,inch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
    }

    public void distanceConversion(View v){
        EditText First = (EditText) findViewById(R.id.editText);
        EditText Second = (EditText) findViewById(R.id.editText2);
        EditText Third = (EditText) findViewById(R.id.editText3);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        result = (TextView) findViewById(R.id.textView5);


        String x = First.getText().toString().trim();
        String y = Second.getText().toString().trim();
        String z = Third.getText().toString().trim();
        if((x.isEmpty() || x.length() == 0 || x.equals("") || x == null)) {
            mile = 0;
        }
        else{
            mile= Double.parseDouble(First.getText().toString());
        }

        if((y.isEmpty() || y.length() == 0 || y.equals("") || y == null)) {
            feet = 0;
        }
        else{
            feet= Double.parseDouble(Second.getText().toString());
        }
        if((z.isEmpty() || z.length() == 0 || z.equals("") || z== null)) {
            inch = 0;
        }
        else{
            inch= Double.parseDouble(Third.getText().toString());
        }




        if (cb1.isChecked())
        {
            Double m= 5800*mile;
            Double f= 12*(m+feet);
            Double i= 2.54*(inch+f);
            Double meter= i/100;
            String c = String.format("%.2f m",meter);
            result.setText(c);
        }
        else{
            Double m= 5800*mile;
            Double f= 12*(m+feet);
            Double i= 2.54*(inch+f);
            String c = String.format("%.2f cm",i);
            result.setText(c);
        }
    }

}
