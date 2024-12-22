package com.ait.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ait.beans.Student;
import com.ait.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	public Student saveStudent(Student student) {
		Student saveStudent = studentService.saveStudent(student);
		return saveStudent;
	}

	public Student getStudentById(int id) {
		Student studentById = studentService.findStudentById(id);
		return studentById;
	}

	public Student updateStudentById(Student student) {
		Student studentById = studentService.updateStudentById(student);
		return studentById;
	}

	public void deleteStudentById(int id) {
		studentService.deleteStudent(id);
	}

	public List<Student> getAllStudent() {
		List<Student> allStudent = studentService.getAllStudent();
		return allStudent;
	}

	public long getStudentCount() {
		long countAllStudent = studentService.countAllStudent();
		return countAllStudent;
	}

	public boolean checkStudentExist(int id) {
		boolean checkStudentExist = studentService.checkStudentExist(id);
		return checkStudentExist;
	}
	
	public void deleteMultipleStudents(List<Integer> studentList) {
		studentService.deleteMultipleStudent(studentList);
	}
	
	public Student findStudentByNameAddress(String name,String address) {
		return studentService.findByNameAddress(name, address);
	}
	
	public Student findStudentByMailType(String mail) {
		return studentService.findByMailType(mail);
	}
}
