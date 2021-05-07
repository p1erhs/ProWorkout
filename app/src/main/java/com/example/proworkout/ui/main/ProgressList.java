package com.example.proworkout.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.proworkout.MyDBHandler;
import com.example.proworkout.R;
import com.example.proworkout.Weight;

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

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = list.getItemAtPosition(position).toString();
                Toast.makeText(ProgressList.this,"" + text, Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void showData(){
        Cursor cursor= db.viewData();
        if (cursor.getCount() == 0){
            Toast.makeText(ProgressList.this,"No progress to show", Toast.LENGTH_LONG).show();
        }
        else{
            while (cursor.moveToNext()){
                listItem.add(cursor.getString(1));
            }

            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItem);
            list.setAdapter(adapter);
        }
    }
}