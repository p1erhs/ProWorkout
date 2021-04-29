package com.example.proworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Αυτή η μέθοδος μετακινεί τον χρήστη σε άλλο activity όταν πατάει το button.
     * @param view
     */
    public void handleStart(View view){
        Intent intent= new Intent(MainActivity.this,ChoosePlan.class);
        startActivity(intent);
    }
}