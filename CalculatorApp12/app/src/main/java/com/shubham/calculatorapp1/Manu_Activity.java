package com.shubham.calculatorapp1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Manu_Activity  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.manu_layout);

        EditText txtno1 = findViewById(R.id.txtNo1);
        EditText txtno2 = findViewById(R.id.txtNo2);
        TextView lblresult = findViewById(R.id.lblresult);
        Button btnadd = findViewById(R.id.btnadd);
        Button btnsub = findViewById(R.id.btnsub);
        Button btnmulti = findViewById(R.id.btnmulti);
        Button btndivi = findViewById(R.id.btndivi);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txtno1.getText().toString());
                int b = Integer.parseInt(txtno2.getText().toString());
                int c = a+b;
                lblresult.setText("Addition = "+String.valueOf(c));
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txtno1.getText().toString());
                int b = Integer.parseInt(txtno2.getText().toString());
                int c = a-b;
                lblresult.setText("Subtraction = "+String.valueOf(c));
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txtno1.getText().toString());
                int b = Integer.parseInt(txtno2.getText().toString());
                int c = a*b;
                lblresult.setText("Multiplication = "+String.valueOf(c));
            }
        });

        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txtno1.getText().toString());
                int b = Integer.parseInt(txtno2.getText().toString());
                int c = a/b;
                lblresult.setText("Division = "+String.valueOf(c));
            }
        });


    }
}
