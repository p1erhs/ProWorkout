package com.example.proworkout;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Weight {
    private int _id;
    private int _weight;
    private String date;

    public Weight(){
    }
    public Weight(int id, int weight, String date){
        this._id=id;
        this._weight=weight;
        this.date=date;
    }

    public void setId(int _id) {
        this._id = _id;
    }
    public int getId(){
        return this._id;
    }
    public void setWeight(int _weight) {
        this._weight = _weight;
    }
    public int getWeight() {
        return _weight;
    }
    public void setDate(String date) {
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
        String formattedDate = df.format(c);
        this.date = formattedDate;
    }
    public String getDate() {
        return date;
    }
}
