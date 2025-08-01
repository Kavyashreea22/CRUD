package com.vtech.studentsManagement;

import java.util.Scanner;
import com.vtech.studentsManagement.models.Student;
import com.vtech.studentsManagement.services.StudentService;

public class StudentCRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService(); // Instantiate the service
        int choice;

        do {
            System.out.println("\n---- Student Management System ----");
            System.out.println("1: Add Student");
            System.out.println("2: View Students");
            System.out.println("3: Update a Student");
            System.out.println("4: Delete a Student");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    service.addStudent(new Student(id, name, age));
                    break;
                }
                case 2: {
                    service.viewStudent();
                    break;
                }
                case 3: {
                    System.out.print("Enter the student ID to update: ");
                    int id = sc.nextInt();

                    System.out.print("Enter new Name: ");
                    String newName = sc.next();

                    System.out.print("Enter new Age: ");
                    int newAge = sc.nextInt();

                    service.updateStudent(new Student(id, newName, newAge));
                    break;
                }
                case 4: {
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    service.deleteStudent(deleteId);
                    break;
                }
                case 5: {
                    System.out.println("Exiting from the console.");
                    break;
                }
                default: {
                    System.out.println("Invalid Choice... Try Again.");
                    break;
                }
            }
        } while (choice != 5);

        sc.close();
    }
}
