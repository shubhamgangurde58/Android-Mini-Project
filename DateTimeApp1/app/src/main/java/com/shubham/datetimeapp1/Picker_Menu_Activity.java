package com.shubham.datetimeapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Picker_Menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picker_menu_layout);

    }
    public void openDPicker(View v){

        Intent i = new Intent(Picker_Menu_Activity.this,Date_Picker_Activity.class);
        startActivity(i);
    }

    public void openTPicker(View v){
        Intent i = new Intent(Picker_Menu_Activity.this,Time_Picker_Activity.class);
        startActivity(i);
    }

}
