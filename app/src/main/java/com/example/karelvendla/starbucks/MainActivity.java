package com.example.karelvendla.starbucks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] drinks ={"Drinks","Food","Cafe"};

        ListView Choices = (ListView) findViewById(R.id.list_choices);

        ListAdapter Adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,drinks);
        Choices.setAdapter(Adapter);

        Choices.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==0)
                {
                    Intent intent = new Intent(MainActivity.this, DrinkCategory.class);
                    startActivity(intent);
                }
            }
        });
    }
}
