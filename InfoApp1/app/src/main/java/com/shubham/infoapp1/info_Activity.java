package com.shubham.infoapp1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class info_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);

        EditText txtusername = findViewById(R.id.txtusername);
        EditText txtpassword = findViewById(R.id.txtpassword);

        Bundle B = getIntent().getExtras();
        txtusername.setText(B.get("USERNAME").toString());
        txtpassword.setText(B.get("PASSWORD").toString());

    }


}
