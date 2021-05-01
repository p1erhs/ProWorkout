package com.example.proworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChoosePlan extends AppCompatActivity {
    Intent intent;
    String[] titles = new String[25];
    String[] details = new String[25];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_plan);
    }
    public void handleCard1(View view){
        intent = new Intent(ChoosePlan.this,Card_layout.class);
        titles = new String[]{"Day 1", "Day 1", "Day 1", "Day 1",
                "Day 1", "Day 1", "Day 1","Day 2", "Day 2", "Day 2", "Day 2",
                "Day 2", "Day 2", "Day 2","Day 3", "Day 3", "Day 3", "Day 3",
                "Day 3", "Day 3", "Day 3" };
        details = new String[]{"Squats (5x5)",
                "Bench Press (5x5)",
                "Barbell Row (5x5)" ,
                "Upright Row (3x10)",
                "Skullcrushers (3x10)",
                "Dumbbell Curls (3x10)",
                "Leg Curls (3x12)" ,
                "Deadlifts (3x5)",
                "Romanian Deadlift (2x8)",
                "Overhead Press	(3x8)",
                "Pull Ups (3x10)",
                "Dips (3x10)",
                "Barbell Shrugs	(3x10)",
                "Calf Raise	(3x12)",
                "Squats (3x5)",
                "Incline Dumbbell Bench Press (3x10)",
                "One Arm Dumbbell Row (3x10)",
                "Seated Arnold Press (3x10)",
                "Cable Tricep Extensions (3x10)",
                "Barbell Curls	(3x10)",
                "Leg Curls (3x12)"};
        intent.putExtra("Title",titles);
        intent.putExtra("Detail",details);
        startActivity(intent);
    }
    public void handleCard2(View view) {
        intent = new Intent(ChoosePlan.this,Card_layout.class);
        titles = new String[]{"Day1", "Day2", "Chapter Three", "Chapter Four",
                "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight"};
        intent.putExtra("Title",titles);
        intent.putExtra("Detail",details);
        startActivity(intent);
    }

    public void handleCard3(View view) {
        intent = new Intent(ChoosePlan.this,Card_layout.class);
        titles = new String[]{"Chapter One", "Chapter Two", "Chapter Three", "Chapter Four",
                "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight"};
        intent.putExtra("Title",titles);
        intent.putExtra("Detail",details);
        startActivity(intent);
    }
}