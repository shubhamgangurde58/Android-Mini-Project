package com.shubham.callapp1;

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

    public void calling(View v){

        startActivity(new Intent(menu_Activity.this,call_Activity.class));
    }

    public void sendMail(View v){
        Intent i = new Intent(menu_Activity.this, mail_Activity.class);
        startActivity(i);
    }

}
