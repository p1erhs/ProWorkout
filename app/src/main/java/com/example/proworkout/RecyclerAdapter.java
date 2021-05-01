package com.example.proworkout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private String[] titles;
    private String plan;
    private FullBodyWorkout fullBodyWorkout;
    public RecyclerAdapter (String[] titles,String plan)
    { this.titles = titles;
      this.plan = plan;}




    class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle;
        public ViewHolder(View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();
                    Context context = itemView.getContext();

                    if(plan.equals("1")){
                        Intent intent = new Intent(context,FullBodyWorkout.class);
                        String[] a;
                        switch (position){
                            case 0:
                                a = new String[]{"Squats (5x5)",
                                        "Bench Press (5x5)",
                                        "Barbell Row (5x5)",
                                        "Upright Row (3x10)",
                                        "Skullcrushers (3x10)",
                                        "Dumbbell Curls (3x10)",
                                        "Leg Curls (3x12)"};

                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 1:
                                a = new String[]{"Deadlifts (3x5)",
                                        "Romanian Deadlift (2x8)",
                                        "Overhead Press	(3x8)",
                                        "Pull Ups (3x10)",
                                        "Dips (3x10)",
                                        "Barbell Shrugs	(3x10)",
                                        "Calf Raise	(3x12)"};
                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                            case 2:
                                 a = new String[]{ "Squats (3x5)",
                                         "Dumbbell BenchPress(3x10)",
                                         "One Arm Dumbbell Row (3x10)",
                                         "Seated Arnold Press (3x10)",
                                         "Cable Tricep Extensions (3x10)",
                                         "Barbell Curls	(3x10)",
                                         "Leg Curls (3x12)"};
                                intent.putExtra("a",a);
                                context.startActivity(intent);
                                break;
                        }
                    }
                    if(plan.equals("2")){

                    }
                    if(plan.equals("3")){

                    }
                }
            });
        }
    }
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_layout,parent,false);
        RecyclerAdapter.ViewHolder holder = new RecyclerAdapter.ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        holder.itemTitle.setText(titles[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

}
