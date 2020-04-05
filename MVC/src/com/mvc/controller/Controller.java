package com.mvc.controller;

import com.mvc.view.CourseView;
import com.mvc.model.Courses;

/*
 * Controller acts as an interface between the application's logic "model" and user interface "view".
 */
public class Controller {
    private CourseView courseView;
    private Courses courses;

    public Controller(CourseView courseView, Courses courses) {
        this.courseView = courseView;
        this.courses = courses;
    }
    //=======================================================================================
    //           Controller operations to set and get course values from model.
    //=======================================================================================
    public String getCourseName(){
        return courses.getName();
    }
    public void setCourseName(String courseName){
        courses.setName(courseName);
    }

    public String getCourseType(){
        return courses.getType();
    }
    public void setCourseType(String courseType){
        courses.setType(courseType);
    }

    public int getCourseId(){
        return courses.getId();
    }
    public void setCourseId(int id){
        courses.setId(id);
    }
    //This Method is responsible for updating the user interface with the course's data
    public void updateView(){
        //fetching courses data from model then send it to the user's view.
        courseView.printCourseDetails(courses.getName(),courses.getType(),courses.getId());
    }
}
