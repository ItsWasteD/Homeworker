package com.deviii.homeworker;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.deviii.homeworker.DB.dao.ExamDAO;
import com.github.clans.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExamDAO exam = new ExamDAO(getApplicationContext());
    }

    public void startAddHomeworkActivity(View view) {
        Intent intent = new Intent(this, AddHomeworkActivity.class);
        startActivity(intent);
    }

    public void startAddExamActivity(View view) {
        Intent intent = new Intent(this, AddExamActivity.class);
        startActivity(intent);
    }
}
