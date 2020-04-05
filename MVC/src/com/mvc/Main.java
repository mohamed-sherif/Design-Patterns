package com.mvc;

import com.mvc.controller.Controller;
import com.mvc.model.Courses;
import com.mvc.view.CourseView;

/*
 *This code is an example on "model-view-controller" implementation.
 * in this example we are implementing a simple course application that a user will be able to
 * see/change course(name,type,id).
 *
 * @author:  Mohamed Sherif Hosny.
 */
public class Main {

    public static void main(String[] args) {
	// Model usually fetch and stores its data inside a database.
        Courses model = fetchDataFromDataBase();
        CourseView view = new CourseView();
        Controller controller = new Controller(view,model);

        controller.updateView();// load course data from model to view
        controller.setCourseName("Data Structure.");// changes course name.
        System.out.println("view after updating the course name:");
        controller.updateView();

    }
    //This Method act as database that has one course stored inside.
    private static Courses fetchDataFromDataBase(){

        Courses course = new Courses();
        course.setName("OOP");
        course.setType("Programming Course");
        course.setId(20334);
        return course;
    }
}
