package com.example.proworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChoosePlan extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_plan);
    }

    public void handleCard1(View view) {
        Intent intent = new Intent(ChoosePlan.this,Card_layout.class);
        String[] titles = {"Day1","Day2","Day3"};
        intent.putExtra("titles",titles);
        intent.putExtra("plan","1");
        startActivity(intent);
    }

    public void handleCard2(View view) {
        Intent intent = new Intent(ChoosePlan.this,Card_layout.class);
        String[] titles = {"Day1","Day2","Day3","Day4"};
        intent.putExtra("titles",titles);
        intent.putExtra("plan","2");
        startActivity(intent);
    }

    public void handleCard3(View view) {
        Intent intent = new Intent(ChoosePlan.this,Card_layout.class);
        String[] titles = {"Day1","Day2","Day3","Day4","Day5","Day6"};
        intent.putExtra("titles",titles);
        intent.putExtra("plan","3");
        startActivity(intent);
    }
}