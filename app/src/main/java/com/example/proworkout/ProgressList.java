package com.example.proworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ProgressList extends AppCompatActivity {

    MyDBHandler db;
    ArrayList<String> listItem;
    ArrayAdapter adapter;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_list);

        db = new MyDBHandler(this, null, null,1);
        listItem = new ArrayList<>();
        list = findViewById(R.id.weight_list);
        showData();
    }

    public void showData(){
        Cursor cursor= db.viewData();
        if (cursor.getCount() == 0){
            Toast.makeText(ProgressList.this,"No progress to show", Toast.LENGTH_SHORT).show();
        }
        else{
            while (cursor.moveToNext()){
                listItem.add(cursor.getString(2) + ":          " + cursor.getString(1) + " Kg");
            }

            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItem);
            list.setAdapter(adapter);
        }
    }
}