package com.example.prate.cricketscorer;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.prate.cricketscorer.data.CricketDbHelper;
import com.example.prate.cricketscorer.data.CricketInfo;

public class Editor1 extends AppCompatActivity {
    Button button;
    EditText mOver;
    EditText mOver1;
    EditText mScore;
    EditText mScore1;
    EditText mWicket;
    EditText mWicket1;
    EditText mteam;
    EditText mteam1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor1);
        mScore = (EditText) findViewById(R.id.score);
        mWicket = (EditText) findViewById(R.id.wicket);
        mOver = (EditText) findViewById(R.id.overs);
        mteam = (EditText) findViewById(R.id.team);
        mScore1 = (EditText) findViewById(R.id.score1);
        mWicket1 = (EditText) findViewById(R.id.wicket1);
        mOver1 = (EditText) findViewById(R.id.overs1);
        mteam1 = (EditText) findViewById(R.id.team1);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertData();
                finish();
            }
        });

    }
    private void insertData() {
        SQLiteDatabase db = new CricketDbHelper(this).getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(CricketInfo.CricketEntry.COLUMN_SCORE, Integer.valueOf(Integer.parseInt(this.mScore.getText().toString())));
        values.put(CricketInfo.CricketEntry.COLUMN_WICKET, Integer.valueOf(Integer.parseInt(this.mWicket.getText().toString())));
        values.put(CricketInfo.CricketEntry.COLUMN_OVERS, Integer.valueOf(Integer.parseInt(this.mOver.getText().toString())));
        values.put(CricketInfo.CricketEntry.COLUMN_SCORE1, Integer.valueOf(Integer.parseInt(this.mScore1.getText().toString())));
        values.put(CricketInfo.CricketEntry.COLUMN_WICKET1, Integer.valueOf(Integer.parseInt(this.mWicket1.getText().toString())));
        values.put(CricketInfo.CricketEntry.COLUMN_OVERS1, Integer.valueOf(Integer.parseInt(this.mOver1.getText().toString())));
        values.put(CricketInfo.CricketEntry.COLUMN_TEAM, this.mteam.getText().toString());
        values.put(CricketInfo.CricketEntry.COLUMN_TEAM1, this.mteam1.getText().toString());
        db.insert(CricketInfo.CricketEntry.TABLE_NAME, null, values);
    }
}
