package com.campus.model;
import com.campus.contract.StudentOpration;



public abstract class  Student implements StudentOperation {
// Encapsulation - data hiding
// Instance variables
    private int studentid;
    private String studentname;
    private int studentage;
    private String department;
    private int[] marks;

    // Static variable
    static int studentCount = 0;

    // Default constructor
    public Student() {
        studentCount++;
    }

    // Parameterized constructor
    public Student(int studentid, String studentname, int studentage,
                   String department, int[] marks) {

        this.studentid = studentid;
        this.studentname = studentname;
        this.studentage = studentage;
        this.department = department;
        this.marks = marks;

        studentCount++;
    }

    // Getters
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

    // Setters
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

    // Instance method - belongs to object
    public void displayStudentInfo() {

        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentname);
        System.out.println("Student Age: " + studentage);
        System.out.println("Department: " + department);

        System.out.print("Marks: ");
    }

    // Method overloading
    public void displayStudentInfo(boolean showMarks) {

        displayStudentInfo();

        if (showMarks) {
            System.out.println(
                "Marks: " + java.util.Arrays.toString(marks)
            );
        }
    }

    // Static method - belongs to class, not object
    public static void displayStudentCount() {

        System.out.println(
            "Total Students: " + studentCount
        );
    }
}