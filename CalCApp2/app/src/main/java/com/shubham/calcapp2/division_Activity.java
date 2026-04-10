package com.shubham.calcapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class division_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.division_layout);

        EditText txtno1 = findViewById(R.id.txtno1);
        EditText txtno2 = findViewById(R.id.txtno2);
        Button btndivi = findViewById(R.id.btndivi);
        TextView lbldivision = findViewById(R.id.lbldivision);

        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txtno1.getText().toString());
                int b = Integer.parseInt(txtno2.getText().toString());
                int c = a/b;
                lbldivision.setText("Division ="+String.valueOf(c));
            }
        });

    }

}
