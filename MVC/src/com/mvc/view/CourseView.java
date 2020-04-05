package com.mvc.view;

//VIEW
public class CourseView {
    public void printCourseDetails(String courseName,String courseType,int courseId){
        System.out.println("Course Details:");
        System.out.println("CourseName:"+courseName);
        System.out.println("CourseType:"+courseType);
        System.out.println("CourseId:"+courseId);
    }
}