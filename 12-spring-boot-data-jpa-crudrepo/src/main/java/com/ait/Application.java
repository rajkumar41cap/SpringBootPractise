package com.ait;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ait.beans.Student;
import com.ait.controller.StudentController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		StudentController bean = run.getBean(StudentController.class);
		Student s1=new Student();
		s1.setId(3);
		s1.setName("Rani");
		s1.setYear("2");
		s1.setAddress("Mysore");
		s1.setEmail("rani@gmail.com");
		Student saveStudent = bean.saveStudent(s1);
		System.out.println(saveStudent);
		Student studentById = bean.getStudentById(0);
		System.out.println(studentById);
		Student updateStudent=bean.updateStudentById(s1);
		System.out.println(updateStudent);
		bean.deleteStudentById(1);
		System.out.println(bean.getAllStudent());
		System.out.println(bean.getStudentCount());
		System.out.println(bean.checkStudentExist(0));
		List<Integer> studentId=new ArrayList<>();
		studentId.add(0);
		studentId.add(1);
		bean.deleteMultipleStudents(studentId);
		bean.findStudentByNameAddress("raja", "delhi");
		bean.findStudentByMailType("@gmail.com");
	}

}
