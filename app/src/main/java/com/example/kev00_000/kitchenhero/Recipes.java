package com.example.kev00_000.kitchenhero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Recipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        Button MyRecipeButton = (Button) findViewById(R.id.MyRecipeButton);
        Button AddRecipeButton = (Button) findViewById(R.id.AddRecipeButton);

        MyRecipeButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View arg0) {

                        // Start FoodItems.class
                        Intent myIntent = new Intent(Recipes.this,
                                MyRecipes.class);
                        startActivity(myIntent);
                    }
                });

        AddRecipeButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View arg0) {

                        // Start FoodItems.class
                        Intent myIntent = new Intent(Recipes.this,
                                AddRecipe.class);
                        startActivity(myIntent);
                    }
                });
    }
}
