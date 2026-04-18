package com.shubham.callapp1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class call_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_layout);
    }

    public void makecall(View v){

        EditText txtmobileno = findViewById(R.id.txtmobileno);

        Intent i = new Intent(Intent.ACTION_CALL);

        i.setData(Uri.parse("tel:"+txtmobileno.getText().toString()));
        startActivity(i);

    }

}
