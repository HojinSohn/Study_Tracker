package com.studytracker.app;

public class Course {
    String name;
    String time;
    String description;

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, String time, String description) {
        this.name = name;
        this.time = time;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
