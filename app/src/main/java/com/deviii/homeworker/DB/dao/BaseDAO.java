package com.deviii.homeworker.DB.dao;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.deviii.homeworker.DB.Database;

/**
 * Created by David on 23.05.2017.
 */

public class BaseDAO {
    protected Database dbHelper;
    protected SQLiteDatabase db;

    public BaseDAO(Context context) {
        dbHelper = new Database(context);
    }

    public void open() throws SQLException {
        db = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }
}
