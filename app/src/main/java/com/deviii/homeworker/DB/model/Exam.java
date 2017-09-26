package com.deviii.homeworker.DB.model;

import java.sql.Date;

/**
 * Created by David on 23.05.2017.
 */

public class Exam {

    private long id ;
    private String title;
    private String description;
    private String date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
