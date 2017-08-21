package com.example.prate.cricketscorer.data;

/**
 * Created by prate on 21-08-2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CricketDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Cricket.db";
    private static final int DATABASE_VERSION = 1;

    public CricketDbHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE crickets (_id INTEGER PRIMARY KEY AUTOINCREMENT, score INTEGER NOT NULL DEFAULT 0, wicket INTEGER NOT NULL DEFAULT 0, overs INTEGER NOT NULL DEFAULT 0, score1 INTEGER NOT NULL DEFAULT 0, wicket1 INTEGER NOT NULL DEFAULT 0, overs1 INTEGER NOT NULL DEFAULT 0, team TEXT NOT NULL,team1 TEXT NOT NULL);");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
