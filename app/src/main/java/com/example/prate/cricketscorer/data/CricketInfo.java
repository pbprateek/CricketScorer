package com.example.prate.cricketscorer.data;

/**
 * Created by prate on 21-08-2017.
 */

import android.provider.BaseColumns;

public class CricketInfo {

    public static final class CricketEntry implements BaseColumns {
        public static final String COLUMN_OVERS = "overs";
        public static final String COLUMN_OVERS1 = "overs1";
        public static final String COLUMN_SCORE = "score";
        public static final String COLUMN_SCORE1 = "score1";
        public static final String COLUMN_TEAM = "team";
        public static final String COLUMN_TEAM1 = "team1";
        public static final String COLUMN_WICKET = "wicket";
        public static final String COLUMN_WICKET1 = "wicket1";
        public static final String TABLE_NAME = "crickets";
        public static final String _ID = "_id";
    }

    private CricketInfo() {
    }
}

