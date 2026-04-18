package com.shubham.datetimeapp1;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Date_Picker_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_picker_layout);
    }

    public void openDPicker(View view)
    {
        TextView txtDate = findViewById(R.id.txtDate);

        DatePickerDialog dpd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                txtDate.setText("Date :"+i2+"/"+(i1+1)+"/"+i);
            }
        },2000,1,1);
        dpd.show();
    }

}
