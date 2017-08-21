package com.example.prate.cricketscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import com.example.prate.cricketscorer.data.CricketDbHelper;
import com.example.prate.cricketscorer.data.CricketInfo.CricketEntry;

public class MainActivity extends AppCompatActivity {
    private CricketDbHelper cricketDbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Editor1.class);
                startActivity(intent);
            }
        });
        this.cricketDbHelper = new CricketDbHelper(this);
        displayDatabaseInfo();
    }
    protected void onStart() {
        super.onStart();
        displayDatabaseInfo();
    }

    public void displayDatabaseInfo() {
        Cursor cursor = this.cricketDbHelper.getReadableDatabase().query(CricketEntry.TABLE_NAME, new String[]{CricketEntry._ID, CricketEntry.COLUMN_SCORE, CricketEntry.COLUMN_WICKET, CricketEntry.COLUMN_OVERS, CricketEntry.COLUMN_SCORE1, CricketEntry.COLUMN_WICKET1, CricketEntry.COLUMN_OVERS1, CricketEntry.COLUMN_TEAM, CricketEntry.COLUMN_TEAM1}, null, null, null, null, null);
        ListView listview = (ListView) findViewById(R.id.list_main);
        listview.setEmptyView(findViewById(R.id.empty));
        listview.setAdapter(new CricketCursorAdapter(this, cursor));
    }

    public void insertpet() {
        SQLiteDatabase db = this.cricketDbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(CricketEntry.COLUMN_SCORE, Integer.valueOf(20));
        values.put(CricketEntry.COLUMN_WICKET, Integer.valueOf(30));
        values.put(CricketEntry.COLUMN_OVERS, Integer.valueOf(50));
        values.put(CricketEntry.COLUMN_SCORE1, Integer.valueOf(20));
        values.put(CricketEntry.COLUMN_WICKET1, Integer.valueOf(30));
        values.put(CricketEntry.COLUMN_OVERS1, Integer.valueOf(50));
        values.put(CricketEntry.COLUMN_TEAM, "ABC");
        values.put(CricketEntry.COLUMN_TEAM1, "DEF");
        db.insert(CricketEntry.TABLE_NAME, null, values);
    }
}
