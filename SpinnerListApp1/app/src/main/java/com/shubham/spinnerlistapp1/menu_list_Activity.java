package com.shubham.spinnerlistapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class menu_list_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list_layout);
    }

    public void spinner(View v){

        Intent i = new Intent(menu_list_Activity.this, spinner_Activity.class);
        startActivity(i);
    }

    public void listview(View v){

        Intent i= new Intent(menu_list_Activity.this, listView_Activity.class);
        startActivity(i);
    }
}
