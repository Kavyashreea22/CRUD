package com.vtech.employeeManagement.services;

import java.util.ArrayList;
import java.util.Iterator;
import com.vtech.employeeManagement.models.Employee;

public class EmployeeService {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employee data found.");
            return;
        }

        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    public Employee getEmployeeById(long id) {
        for (Employee emp : employeeList) {
            if (id == emp.getEmployeeId()) {
                return emp;
            }
        }
        return null;  // Important to add this to avoid compilation error
    }

    public void updateEmployee(Employee updatedEmployee) {
        boolean found = false;
        for (Employee emp : employeeList) {
            if (emp.getEmployeeId() == updatedEmployee.getEmployeeId()) {
                emp.setName(updatedEmployee.getName());
                emp.setAge(updatedEmployee.getAge());
                emp.setAddress(updatedEmployee.getAddress());
                System.out.println("Employee updated: " + emp);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No employee found with ID: " + updatedEmployee.getEmployeeId());
        }
    }

    public void deleteEmployee(long id) {
        Iterator<Employee> iterator = employeeList.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getEmployeeId() == id) {
                iterator.remove();
                System.out.println("Employee with ID " + id + " deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No employee found with ID: " + id);
        }
    }
}
