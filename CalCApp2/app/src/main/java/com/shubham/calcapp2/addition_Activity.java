package com.shubham.calcapp2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class addition_Activity  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.addition_layout);

        EditText txtno1 = findViewById(R.id.txtno1);
        EditText txtno2 = findViewById(R.id.txtno2);
        Button btnadd = findViewById(R.id.btnadd);
        TextView lbladdition = findViewById(R.id.lbladdition);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txtno1.getText().toString());
                int b = Integer.parseInt( txtno2.getText().toString());
                int c = a+b;
                lbladdition.setText("Addition = "+String.valueOf(c));
            }
        });

    }
}
