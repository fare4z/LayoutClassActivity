package com.fareez.layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class GridLayoutActivity extends AppCompatActivity {
CardView menuBmi,menuBloodPressure,menuDiabetic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);

        menuBmi = findViewById(R.id.menuBmi);
        menuBloodPressure = findViewById(R.id.menuBloodPressure);
        menuDiabetic = findViewById(R.id.menuDiabetic);

        menuBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                                "You click BMI Test",
                                Toast.LENGTH_LONG)
                        .show();
            }
        });

 menuBloodPressure.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Toast.makeText(getApplicationContext(),
                 "You click Blood Pressure",
                 Toast.LENGTH_LONG)
                 .show();

     }
 });

        menuDiabetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "You click Diabetes Test",
                        Toast.LENGTH_LONG)
                        .show();

            }
        });

    }


}