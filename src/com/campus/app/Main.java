package com.campus.app;
import com.campus.model.Student;
import com.campus.service.StudentService;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input from user
        System.out.print("Enter Student ID: ");
        int studentid = scanner.nextInt();
        System.out.print("Enter Student Name: ");
        String studentname = scanner.next();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Department: ");
        String department = scanner.next();
        System .out.println("number of subjects: ");
        int numSubjects = scanner.nextInt();
        int[] marks = new int[numSubjects];
        System.out.println("Enter marks for " + numSubjects + " subjects: ");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();   
            scanner.nextLine(); 
        }


Student student = new Student(studentid, studentname, age, department, marks);
        student.displayStudentinfo(true);
        Student.displayStudentCount();
        student.displayResults(student);
    }
}
