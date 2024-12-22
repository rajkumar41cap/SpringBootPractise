package com.ait.service;

import java.util.List;

import com.ait.beans.Student;

public interface StudentService {
	public Student saveStudent(Student student);

	public Student findStudentById(int id);

	public Student updateStudentById(Student student);

	public void deleteStudent(int id);

	public List<Student> getAllStudent();

	public long countAllStudent();

	public boolean checkStudentExist(int id);

	public void deleteMultipleStudent(List<Integer> studentId);

	public Student findByNameAddress(String name, String address);

	public Student findByMailType(String mail);
}
