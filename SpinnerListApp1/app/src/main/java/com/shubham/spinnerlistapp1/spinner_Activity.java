package com.shubham.spinnerlistapp1;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class spinner_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_layout);

        Toast.makeText(this ," Welcome user !!! ", Toast.LENGTH_SHORT).show();

        ArrayList<String> namelist = new ArrayList<>();
        namelist.add("shubham");
        namelist.add("ritesh");
        namelist.add("jayesh");
        namelist.add("yogesh");
        namelist.add("chetan");

        Spinner spnContacts = findViewById(R.id.spnContacts);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                spinner_Activity.this,android.R.layout.simple_list_item_1,namelist);
        spnContacts.setAdapter(adapter);

        spnContacts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(spinner_Activity.this,"Item Clicked = "+namelist.get(i),Toast.LENGTH_LONG).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
