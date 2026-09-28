package com.campus.app;
import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.StudentService;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //input from users
        System.out.print("Enter student id: ");
        int studentid = sc.nextInt();
        System.out.print("Enter student name: ");
        String studentname = sc.next();
        System.out.print("Enter student age: ");
        int age=sc.nextInt();
        System.out.print("Enter your department: ");
        String department = sc.next();
        System.out.print("Enter the number of subjects: ");
        int n=sc.nextInt();
        int[] marks = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Subject no: "+(i+1)+":");
            marks[i]=sc.nextInt();
            sc.nextLine();
        }
        Student student = new Student(studentid,studentname,age,department,marks);
        Student student1 = new Student(studentid,studentname,age,department,marks);
        
        student.displayStudentInfo(true);
        Student.displayStudentCount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        sc.close();

        


    }
}