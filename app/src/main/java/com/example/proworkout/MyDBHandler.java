package com.example.proworkout;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MyDBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "weightDB.db";
    public static final String TABLE_WEIGHT = "weight";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_WEIGHT = "_weight";
    public static final String COLUMN_DATE = "_date";
    public static final String TABLE_TARGET_WEIGHT = "tW";
    public static final String COLUMN_TARGET_WEIGHT = "_tW";

    //Constructor
    public MyDBHandler (Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
            String CREATE_WEIGHT_TABLE = "CREATE TABLE " +
                    TABLE_WEIGHT + "(" +
                    COLUMN_ID + " INTEGER PRIMARY KEY," +
                    COLUMN_WEIGHT + " INTEGER," +
                    COLUMN_DATE + " STRING" + ")";

            String CREATE_TARGET_WEIGHT_TABLE = "CREATE TABLE " +
                    TABLE_WEIGHT + "(" +
                    COLUMN_ID + " INTEGER PRIMARY KEY," +
                    COLUMN_TARGET_WEIGHT + " INTEGER," + ")";

            db.execSQL(CREATE_WEIGHT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_WEIGHT);
        onCreate(db);
    }
    public void addWeight(Weight weight){
        ContentValues values = new ContentValues();
        values.put(COLUMN_WEIGHT, weight.getWeight());
        values.put(COLUMN_DATE, weight.getDate());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_WEIGHT, null, values);
        db.close();
    }
}
