package com.shubham.calcapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu_layout);
    }

    public void addition(View v){

        Intent i = new Intent(menu_Activity.this,addition_Activity.class);
        startActivity(i);
    }
    public void subtraction(View v){

        Intent i = new Intent(menu_Activity.this,subtraction_Activity.class);
        startActivity(i);
    }
    public void multiplication(View v){

        Intent i = new Intent(menu_Activity.this, multiplication_Activity.class);
        startActivity(i);
    }

    public void division(View v){

        Intent i = new Intent(menu_Activity.this,division_Activity.class);
        startActivity(i);
    }

    public void item(View v){
        startActivity(new Intent(menu_Activity.this,item_Activity.class));
    }
}
