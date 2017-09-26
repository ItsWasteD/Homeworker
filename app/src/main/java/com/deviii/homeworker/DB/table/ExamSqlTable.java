package com.deviii.homeworker.DB.table;

/**
 * Created by David on 23.05.2017.
 */

public abstract class ExamSqlTable extends BaseSqlTable {

    public static final String TABLE_NAME = "exam";
    public static final String COLUMN_NAME_TITLE = "title";
    public static final String COLUMN_NAME_DESCRIPTION = "description";
    public static final String COLUMN_NAME_DATE = "date";

    public static String getSqlQueryForCreateTable() {
        return "CREATE TABLE " + ExamSqlTable.TABLE_NAME + " (" +
                ExamSqlTable._ID + ExamSqlTable.INTEGER_TYPE + " PRIMARY KEY," +
                ExamSqlTable.COLUMN_NAME_TITLE + TEXT_TYPE + COMMA_SEP +
                ExamSqlTable.COLUMN_NAME_DESCRIPTION + TEXT_TYPE + COMMA_SEP +
                ExamSqlTable.COLUMN_NAME_DATE + TEXT_TYPE + " )";

    }

    public static String getSqlQueryForDropTable() {
        return "DROP TABLE IF EXISTS " + ExamSqlTable.TABLE_NAME;
    }

}
