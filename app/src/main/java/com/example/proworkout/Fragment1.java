package com.example.proworkout;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    private int x;
    Activity context;
    private Button btn_cw;
    private Button btn_tw;
    private EditText twText;
    private TextView twView;
    SharedPreferences prefs;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context = getActivity();
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
        x = prefs.getInt("tW",0);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }
    public void onStart(){
        super.onStart();

        twText = context.findViewById(R.id.targetWeight);
        btn_tw = context.findViewById(R.id.targetButton);
        twView = context.findViewById(R.id.txttargetweight);

        btn_tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=Integer.parseInt(twText.getText().toString());
                prefs.edit().putInt("tW",x).apply();
                twView.setText("Target Weight: " + prefs.getInt("tW",x));
            }
        });
    }
}