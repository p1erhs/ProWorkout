package com.example.proworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class Card_layout extends AppCompatActivity{
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter recyclerAdapter;

    String[] titles = new String[25];
    String[] details = new String[25];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workouts);

        titles = getIntent().getStringArrayExtra("Title");
        details = getIntent().getStringArrayExtra("Detail");


        recyclerView = findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerAdapter = new RecyclerAdapter(titles,details);
        recyclerView.setAdapter(recyclerAdapter);
    }
}