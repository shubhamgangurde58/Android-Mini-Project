package com.shubham.spinnerlistapp1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class listView_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        Toast.makeText(this,"Welcome user !!!",Toast.LENGTH_SHORT).show();

        ArrayList<String> listview = new ArrayList<>();
        listview.add("shubham");
        listview.add("pushpadeep");
        listview.add("nawaj");
        listview.add("vinod");
        listview.add("himanshu");

        ListView listContacts = findViewById(R.id.listContacts);

            
        ArrayAdapter<String> adapter = new ArrayAdapter(listView_Activity.this,android.R.layout.simple_list_item_1,listview);
        listContacts.setAdapter(adapter);

      listContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Toast.makeText(listView_Activity.this,"Item Click "+listview.get(i),Toast.LENGTH_LONG).show();
          }
      });
    }
}
