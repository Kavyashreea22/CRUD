package com.vtech.employeeManagement;

import java.util.Scanner;
import com.vtech.employeeManagement.models.Employee;
import com.vtech.employeeManagement.services.EmployeeService;

public class EmployeeCRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        int choice;

        do {
            System.out.println("\n---- Employee Management System ----");
            System.out.println("1: Add Employee");
            System.out.println("2: View Employees");
            System.out.println("3: Update Employee");
            System.out.println("4: Delete Employee");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter Employee ID: ");
                    long id = sc.nextLong();
                    sc.nextLine(); // consume leftover newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // consume leftover newline

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    service.addEmployee(new Employee(id, name, age, address));
                    break;
                }
                case 2: {
                    service.viewEmployees();
                    break;
                }
                case 3: {
                    System.out.print("Enter Employee ID to update: ");
                    long id = sc.nextLong();
                    Employee employeebyId = service.getEmployeeById(id);
                    sc.nextLine(); 
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter New Address: ");
                    String newAddress = sc.nextLine();

                    service.updateEmployee(new Employee(id, newName, newAge, newAddress));
                    break;
                }
                case 4: {
                    System.out.print("Enter Employee ID to delete: ");
                    long deleteId = sc.nextLong();
                    service.deleteEmployee(deleteId);
                    break;
                }
                case 5: {
                    System.out.println("Exiting Employee Management System.");
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Try again.");
                    break;
                }
            }

        } while (choice != 5);

        sc.close();
    }
}
