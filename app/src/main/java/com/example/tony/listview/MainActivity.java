package com.example.tony.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] favoriteTVShows = {"dfasdf","dsfdsafef","dfewfdf","erwqefds","erewfdsaf","fddsfdsaf"};

        ListAdapter theAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,favoriteTVShows);

        ListView theListView = (ListView) findViewById(R.id.theListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String TVShowPicked = "You selected " + String.valueOf(adapterView.getItemAtPosition(position));

                Toast.makeText(MainActivity.this, TVShowPicked, Toast.LENGTH_SHORT).show();


            }
        });
    }
}
