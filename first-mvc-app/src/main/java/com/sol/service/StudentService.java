package com.sol.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sol.models.Student;

@Service
public class StudentService {
	
	private static int studentNumber = 4;
	private static List<Student> students = new ArrayList<Student>();
	
	static {
		students.add(new Student(1, "Sol ZE", "07-03-1993", true));
		students.add(new Student(2, "Jay Jay", "11-03-1991", true));
		students.add(new Student(3, "Dodo Ni", "19-04-2000", true));
		students.add(new Student(4, "Adam da", "11-04-1994", true));
	}
	
	public List<Student> readAllStudents() {
		List<Student> newList = new ArrayList<Student>();
		for (Student st : students) {
				newList.add(st);
			
		}
		return newList;
	}
	
	public void addStudent(String name, String date, boolean isActive) {
		students.add(new Student(++studentNumber, name, date, isActive));
	}
	
	//deleting user by id
	public void deleteStudent(int id) {
		Iterator<Student> it = students.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			if(student.getId() == id) {
				it.remove();
			}
		}
	}
	
	public Student getStudentInfo(int id) {
		for(Student student : students) {
			if(student.getId() == id) {
				return student;
			}
		}
		return null;
	}
	
	public void updateStudent(int id,  String name, String date, boolean isActive) {
		Iterator<Student> it = students.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			if(student.getId() == id) {
				student.setName(name);
				student.setDate(date);
				student.setActive(isActive);
			}
		}
	}

}
