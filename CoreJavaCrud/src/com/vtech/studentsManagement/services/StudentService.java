package com.vtech.studentsManagement.services;

import java.util.ArrayList;
import java.util.Iterator;

import com.vtech.studentsManagement.models.Student;

public class StudentService {
	
	private ArrayList<Student>studentList = new ArrayList<>();
	public void addStudent(Student student) {
		studentList.add(student);
		System.out.println("student data added successfully");
		
		
	}
	public void viewStudent() {
		studentList.stream().forEach(s->System.out.println());
	}
	public void updateStudent(Student Student) {
		for(Student s : studentList ) {
			if(Student.getStudentId()==s.getStudentId()) {
				s.setName(Student.getName());
				s.setAge(Student.getAge());
				System.out.println("Data Updated.."+toString());
				
				}
			else {
				System.out.println("no student id available at"+Student.getStudentId());
			}
		}
		
	}
	public void deleteStudent(int id) { 
				Iterator<Student>iterator = studentList.iterator();
				
				while(iterator.hasNext()) {
					Student s=iterator.next();
					iterator.remove();
					System.out.println("Deleted successfully");
					return;
				}

				System.out.println("no student at"+id);
	}
	
	
}

