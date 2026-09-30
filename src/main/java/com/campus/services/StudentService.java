package com.campus.services;

import java.util.List;
import java.util.ArrayList;

public class StudentService{
    private static final List<String> student=new ArrayList<>();
    //get student
    public StudentService(){
        student.add("101-Billa-java");
        student.add("102-steve-python");
        student.add("103-john-c++");

    }

    public List<String> getStudents(){
        return student;
    }
//add student
public void addStudent(String name,String course){
    student.add(String.valueOf(student.size()+101)+"-"+name+"-"+course);
}

}