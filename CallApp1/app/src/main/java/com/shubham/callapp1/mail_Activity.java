package com.shubham.callapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class mail_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mail_layout);
    }
    public void sendMail(View v){
        EditText txtmailid = findViewById(R.id.txtmailid);
        EditText txtsubject = findViewById(R.id.txtsubject);
        EditText txtmessage = findViewById(R.id.txtmessage);

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL,new String[]{txtmailid.getText().toString()});
        i.putExtra(Intent.EXTRA_SUBJECT,txtsubject.getText().toString());
        i.putExtra(Intent.EXTRA_TEXT,txtmessage.getText().toString());

        startActivity(Intent.createChooser(i,"Send my mail using"));
    }

}
