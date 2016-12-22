package com.example.tanvir.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button selectTempButton;
    private static Button selectDistanceButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectTempButton = (Button) findViewById(R.id.temparatureBtn);
        selectTempButton.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v){
                        Intent intent = new Intent("com.example.tanvir.assignment3.TemparatureActivity");
                        startActivity(intent);
                    }
                }
        );

        selectDistanceButton = (Button) findViewById(R.id.distanceBtn);
        selectDistanceButton.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View v){
                        Intent intent2 = new Intent("com.example.tanvir.assignment3.DistanceActivity");
                        startActivity(intent2);
                    }
                }
        );
    }


}

