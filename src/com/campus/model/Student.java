package com.campus.model;

// encapsulation - data hiding
// instance variables
public class Student {
    private int studentid;
    private String studentname;
    private int studentage;
    private String department;
    private int[] marks;    

// static variable
    static int studentCount = 0;

// default constructor
    public Student() {
        studentCount++;
    }

// parameterized constructor
    public Student(int studentid, String studentname, int studentage, String department, int[] marks) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentage = studentage;
        this.department = department;
        this.marks = marks;
        studentCount++;
    }

// getters
    public int getStudentid() {
        return studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public int getStudentage() {
        return studentage;
    }

    public String getDepartment() {
        return department;
    }

    public int[] getMarks() {
        return marks;
    }

// setters
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

//instance methods - belong to object
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentname);
        System.out.println("Student Age: " + studentage);
        System.out.println("Department: " + department);
        System.out.print("Marks: ");
    }

    public void displayStudentInfo(boolean showMarks) {
        displayStudentInfo();

        if(showMarks) {
            System.out.println("Marks: " + java.util.Arrays.toString(marks));
        }
    }

// static method - belong to class not object
    public static void displayStudentCount() {
        System.out.println("Total Students: " + studentCount);
    }

}
