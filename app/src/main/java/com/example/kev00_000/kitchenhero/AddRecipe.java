package com.example.kev00_000.kitchenhero;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddRecipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);

        final EditText Title = (EditText) findViewById(R.id.Title);
        final EditText Ingredients = (EditText) findViewById(R.id.Ingredients);
        final EditText Method = (EditText) findViewById(R.id.Method);

        final SQLiteDatabase db = openOrCreateDatabase("RecipesTable", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(Title VARCHAR,Ingredients VARCHAR,Method VARCHAR);");

        Button Add=(Button)findViewById(R.id.Add);

        Add.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View arg0) {
                        if (Title.getText().toString().trim().length() == 0 ||
                                Ingredients.getText().toString().trim().length() == 0 ||
                                Method.getText().toString().trim().length() == 0) {
                            showMessage("Error", "Please enter all values");
                            return;
                        }
                        // Inserting record
                        db.execSQL("INSERT INTO student VALUES('" + Title.getText() + "','" + Ingredients.getText() +
                                "','" + Method.getText() + "');");
                        showMessage("Success", "Record added");
                        Intent myIntent = new Intent(AddRecipe.this,
                                MainScreen.class);
                        startActivity(myIntent);
                    }
                });
    }
    public void showMessage(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
