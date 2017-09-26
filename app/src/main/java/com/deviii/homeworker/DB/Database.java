package com.deviii.homeworker.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.deviii.homeworker.DB.table.ExamSqlTable;

/**
 * Created by David on 23.05.2017.
 */

public class Database extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Homeworker.db";

    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ExamSqlTable.getSqlQueryForCreateTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ExamSqlTable.getSqlQueryForDropTable());
        onCreate(db);
    }
}
