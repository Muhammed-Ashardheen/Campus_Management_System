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
} package com.campus.service;

import com.campus.model.Student;

public class StudentService {

    // Calculate total marks
    public int calculateTotal(Student student) {

        int[] marks = student.getMarks();

        if (marks == null) {
            return 0;
        }

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Calculate average marks
    public double calculateAverage(Student student) {

        int[] marks = student.getMarks();

        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int total = calculateTotal(student);

        return (double) total / marks.length;
    }

    // Find maximum marks
    public int findMax(Student student) {

        int[] marks = student.getMarks();

        if (marks == null || marks.length == 0) {
            return 0;
        }

        int max = marks[0];

        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }

        return max;
    }

    // Find minimum marks
    public int findMin(Student student) {

        int[] marks = student.getMarks();

        if (marks == null || marks.length == 0) {
            return 0;
        }

        int min = marks[0];

        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }

        return min;
    }
    //grade based on marks
    public char grade(Student student){
        int[]marks=student.getMarks();
        if(marks==null || marks.length==0){
            return 'F';
        }
        int total=calculateTotal(student);
        int average=(int)calculateAverage(student);
        if(average>=90){
            return 'A';
            }else if(average>=80){
                return 'B';}
            else if(average>=70){
                return 'C';}
            else if(average>=60){
                return 'D';}
            else{
                return 'F';}    
        }

                //pass or fail
                public String passorFail(Student student){
                    int[]marks=student.getMarks();
                    if(marks==null || marks.length==0){
                        return "Fail";
                    }
                    
                    int average=(int)calculateAverage(student);
                    if(average>=40){
                        return "Pass";
                    }else{
                        return "Fail";
                    }
                }
                //display report card
                public void displayReportCard(Student student){
                    System.out.println("Student ID: "+student.getStudentid());
                    System.out.println("Student Name: "+student.getStudentname());
                    System.out.println("Total marks: "+calculateTotal(student));
                    System.out.println("Average Marks: "+calculateAverage(student));
                    System.out.println(" Maximum Marks: "+findMax(student));
                    System.out.println("Minimum Marks: "+findMin(student));
                    System.out.println("Grade: "+grade(student));
                    System.out.println("Result: "+passorFail(student));
                }
}