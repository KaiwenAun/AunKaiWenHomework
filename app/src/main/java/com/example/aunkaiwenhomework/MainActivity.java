package com.example.aunkaiwenhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBoxTopping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }



    public void showButtonClicked(View view) {
        checkBoxTopping = findViewById(R.id.C_1);
        if (checkBoxTopping.isChecked()) {
            Toast.makeText(this, "Chocolate topping " , Toast.LENGTH_SHORT).show();
        }
        checkBoxTopping = findViewById(R.id.C_2);
        if (checkBoxTopping.isChecked()) {
            Toast.makeText(this, "Sprinkles topping ", Toast.LENGTH_SHORT).show();
        }
        checkBoxTopping = findViewById(R.id.C_3);
        if (checkBoxTopping.isChecked()) {
            Toast.makeText(this, "Nut topping ", Toast.LENGTH_SHORT).show();
        }
        checkBoxTopping = findViewById(R.id.C_4);
        if (checkBoxTopping.isChecked()) {
            Toast.makeText(this, "Cherry topping ", Toast.LENGTH_SHORT).show();
        }
        checkBoxTopping = findViewById(R.id.C_5);
        if (checkBoxTopping.isChecked()) {
            Toast.makeText(this, "Oreo topping ", Toast.LENGTH_SHORT).show();

    }
    }




}