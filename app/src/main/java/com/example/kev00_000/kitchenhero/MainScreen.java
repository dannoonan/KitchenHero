package com.example.kev00_000.kitchenhero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Create the homepage
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        // Locate the button in activity_main.xml
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);

        // Capture button clicks
        button1.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View arg0) {

                        // Start FoodItems.class
                        Intent myIntent = new Intent(MainScreen.this,
                                FoodItems.class);
                        startActivity(myIntent);
                    }
                });


    }
}

