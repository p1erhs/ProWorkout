package com.example.proworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChoosePlan extends AppCompatActivity {
    Intent intent;
    String[] titles = new String[20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_plan);
    }
    public void handleCard1(View view){
        intent = new Intent(ChoosePlan.this,Card_layout.class);
        titles = new String[]{"Chapter One", "Chapter Two", "Chapter Three", "Chapter Four",
                "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight"};
        intent.putExtra("Title",titles);
        startActivity(intent);
    }
    public void handleCard2(View view) {
        intent = new Intent(ChoosePlan.this,Card_layout.class);
        titles = new String[]{"Day1", "Day2", "Chapter Three", "Chapter Four",
                "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight"};
        intent.putExtra("Title",titles);
        startActivity(intent);
    }

    public void handleCard3(View view) {
        intent = new Intent(ChoosePlan.this,Card_layout.class);
        titles = new String[]{"Chapter One", "Chapter Two", "Chapter Three", "Chapter Four",
                "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight"};
        intent.putExtra("Title",titles);
        startActivity(intent);
    }
    public String[] getTitles() {
        return titles;
    }
}