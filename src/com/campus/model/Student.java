package com.campus.service;

public class Student{
    //Encapsulation - data hiding
    //instance variables
    private int studentid;
    private string studentname;
    private int age;
    private string department;
    private int[] marks;


    //static variable
    static int studentCount = 0;

    //Default constructor
    public Student() {{
        studentCount++;
    }
    //parameterized constructor
    public Student(int studentid, string studentname, int age, string department, int[] marks) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.age = age;
        this.department = department;
        this.marks = marks;
        studentCount++;
    }
    //getters
    public int getStudentid() {
        return studentid;
    }
    public string getStudentname() {
        return studentname;
    }
    public int getAge() {
        return age;
    }
    public string getDepartment() {
        return department;
    }
    public int[] getMarks() {
        return marks;
    }
    //setters
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public void setStudentname(string studentname) {
        this.studentname = studentname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(string department) {
        this.department = department;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public void displayStudentInfo() {
        System.out.println("Student ID:"+studentid);
        System.out.println("Student Nmae:"+studentname);
        System.out.println("Student Age:"+age);
        System.out.println("Student Department:"+department);
        
    }
    public void dispalystudentinfo(boolean showMarks) {
        displayStudentInfo();
        if(showMarks) {
            System.out.println("Student Marks:"+java.util.Arrays.toString(marks));
            
            }
        }
        //static method-belong to class,not to object
        public static void displayStudentCount() {
            System.out.println("total number of students:"+studentCount);
    }
    
}