package com.example.karelvendla.starbucks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class DrinkCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        String[] drinks ={"Latte","Cappuccino","Filters"};


        ListView Drinks = (ListView) findViewById(R.id.drinks);

        ListAdapter Adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,drinks);
        Drinks.setAdapter(Adapter);

        Drinks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==0)
                {
                    Intent intent = new Intent( DrinkCategory .this,Latte.class);
                    startActivity(intent);
                }
                if (position ==1)
                {
                    Intent intent = new Intent( DrinkCategory .this,Cappuccino.class);
                    startActivity(intent);
                }
                if ( position == 2)
                {
                    Intent intent=new Intent(DrinkCategory.this,Filter.class);
                    startActivity(intent);
                }
            }
        });
    }
}
