package com.vtech.employeeManagement.models;

public class Employee {
	    private long employeeId;
	    private String name;
	    private int age;
	    private String address;

	    public Employee(long employeeId, String name, int age, String address) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    public long getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(long employeeId) {
	        this.employeeId = employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    @Override
	    public String toString() {
	        return "Employee ID: " + employeeId + ", Name: " + name + ", Age: " + age + ", Address: " + address;
	    }
	}



