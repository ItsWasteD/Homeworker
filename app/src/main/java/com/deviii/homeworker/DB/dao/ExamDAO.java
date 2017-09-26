package com.deviii.homeworker.DB.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.deviii.homeworker.DB.model.Exam;
import com.deviii.homeworker.DB.table.ExamSqlTable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 23.05.2017.
 */

public class ExamDAO extends BaseDAO {

    public ExamDAO(Context context) {
        super(context);
    }

    private String[] projection;
    private String title;
    private String description;
    private String date;

    public long insertExam(Exam exam) {
        ContentValues values = new ContentValues();
        values.put(ExamSqlTable.COLUMN_NAME_TITLE, exam.getTitle());
        values.put(ExamSqlTable.COLUMN_NAME_DESCRIPTION, exam.getDescription());
        values.put(ExamSqlTable.COLUMN_NAME_DATE, exam.getDate());

        long id = db.insert(
                ExamSqlTable.TABLE_NAME,
                null,
                values
        );

        return id;
    }

    public Exam getExamById(long id) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String[] args = {Long.toString(id)};
        Cursor cursor = db.query(ExamSqlTable.TABLE_NAME, null, "_id = ?", args, null, null, null);

        cursor.moveToFirst();
        Exam exam = new Exam();

        while (!cursor.isAfterLast()) {
            exam = cursorToExam(cursor);
            cursor.moveToNext();
        }

        return exam;
    }

    public List<Exam> getExams() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query(ExamSqlTable.TABLE_NAME, null, null, null, null, null, null);

        cursor.moveToFirst();

        List<Exam> exams = new ArrayList<>();
        while(!cursor.isAfterLast()) {
            exams.add(cursorToExam(cursor));
            cursor.moveToNext();
        }

        cursor.close();
        return exams;
    }

    private Exam cursorToExam(Cursor cursor) {
        Exam exam = new Exam();
        exam.setId(cursor.getLong(0));
        exam.setTitle(cursor.getString(1));
        exam.setDescription(cursor.getString(2));
        exam.setDate(cursor.getString(3));

        return exam;
    }
}
