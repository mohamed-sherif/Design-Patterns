package com.mvc.model;

//MODEL
public class Courses {
    private String courseName;
    private String courseType;
    private int courseId;

    public String getName() {
        return courseName;
    }

    public void setName(String courseName) {
        this.courseName = courseName;
    }

    public String getType() {
        return courseType;
    }

    public void setType(String courseType) {
        this.courseType = courseType;
    }

    public int getId() {
        return courseId;
    }

    public void setId(int courseId) {
        this.courseId = courseId;
    }
}
