package com.example.prate.cricketscorer;

/**
 * Created by prate on 21-08-2017.
 */


        import android.content.Context;
        import android.database.Cursor;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.CursorAdapter;
        import android.widget.TextView;
        import com.example.prate.cricketscorer.data.CricketInfo.CricketEntry;

public class CricketCursorAdapter extends CursorAdapter {
    CricketCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        TextView a = (TextView) view.findViewById(R.id.scores);
        TextView b = (TextView) view.findViewById(R.id.wickets);
        TextView c = (TextView) view.findViewById(R.id.overs);
        TextView a1 = (TextView) view.findViewById(R.id.scores1);
        TextView b1 = (TextView) view.findViewById(R.id.wickets1);
        TextView c1 = (TextView) view.findViewById(R.id.overs1);
        TextView t = (TextView) view.findViewById(R.id.team);
        TextView t1 = (TextView) view.findViewById(R.id.team1);
        int d = cursor.getColumnIndex(CricketEntry.COLUMN_SCORE);
        int e = cursor.getColumnIndex(CricketEntry.COLUMN_WICKET);
        int f = cursor.getColumnIndex(CricketEntry.COLUMN_OVERS);
        int g = cursor.getColumnIndex(CricketEntry.COLUMN_TEAM);
        int d1 = cursor.getColumnIndex(CricketEntry.COLUMN_SCORE1);
        int e1 = cursor.getColumnIndex(CricketEntry.COLUMN_WICKET1);
        int f1 = cursor.getColumnIndex(CricketEntry.COLUMN_OVERS1);
        int g1 = cursor.getColumnIndex(CricketEntry.COLUMN_TEAM1);
        int score = cursor.getInt(d);
        int wickets = cursor.getInt(e);
        int over = cursor.getInt(f);
        String team = cursor.getString(g);
        int score1 = cursor.getInt(d1);
        int wickets1 = cursor.getInt(e1);
        int over1 = cursor.getInt(f1);
        String team1 = cursor.getString(g1);
        a.setText("SCORE - " + score);
        b.setText("WICKET - " + wickets);
        c.setText("OVER - " + over);
        t.setText(team);
        a1.setText("SCORE - " + score1);
        b1.setText("WICKET - " + wickets1);
        c1.setText("OVER - " + over1);
        t1.setText(team1);
    }
}

