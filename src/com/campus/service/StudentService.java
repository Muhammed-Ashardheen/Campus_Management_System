package com.campus.service;
 
import com.campus.model.Student;

public class StudentService {
    //calculate total marks of student
    public int calculateTotalMarks(Student student) {
        int total = 0;
        for (int mark : student.getMarks()) {
            total += mark;     
}
    return total;
}   
 //calculate average marks of student
    public double calculateAverageMarks(Student student) {
        int total = calculateTotalMarks(student);
        return (double) total / student.getMarks().length;
    }
    //find maximum marks of student
    public int findMaximumMarks(Student student) {
        int max = Integer.MIN_VALUE;
        for (int mark : student.getMarks()) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }
    //find minimum marks of student
    public int findMinimumMarks(Student student) {

        int min = Integer.MAX_VALUE;
        for (int mark : student.getMarks()) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }
    //grade based on marks
    public String calculateGrade(Student student) {
        double average = calculateAverageMarks(student);
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";     
    } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {    
            return "F";
        }
    }
    //pass or fail based on marks
    public String checkPassOrFail(Student student) {
        double average = calculateAverageMarks(student);
        if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";          
        }
    }
    //display results of student
    public void displayResults(Student student) {
        System.out.println("Student ID: " + student.getStudentid());
        System.out.println("Student Name: " + student.getStudentname());
        System.out.println("Age: " + student.getAge());                             
}      