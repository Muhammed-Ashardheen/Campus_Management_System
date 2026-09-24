package com.campus.app;



import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.StudentService;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter the student Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter the student Department: ");
        String department = sc.nextLine();
        System.out.println("number of subject");
        int n=sc.nextInt();
        int[] marks = new int[n];
        System.out.println("enter the marks of"+n+"subject");
        for(int i=0;i<n;i++){
            System.out.println("enter the marks of subject"+(i+1));
            marks[i]=sc.nextInt();  
            sc.nextLine();
        }

        Student student = new Student(studentId, studentName, age, department, marks);
        student.displayStudentInfo(true);
        Student.displayStudentCount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        sc.close();
    }
}