package com.campus.model;

public class Student {
    private int studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;

    static int studentcount = 0;

    public Student() {
        studentcount++;
    } 
    //parameterized constructor
    public Student(int studentid, String studentname, int age, String department, int[] marks) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.age = age;
        this.department = department;
        this.marks = marks;
        studentcount++;
    }
    //getter and setter methods
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    // instance method - belongs to object
    
    }

