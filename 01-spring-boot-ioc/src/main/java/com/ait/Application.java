package com.ait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ait.bean.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		Student student = run.getBean(Student.class);
		student.setName("raja");
		student.setRollno(100);
		student.setMarks(400);
		System.out.println(student);
	}

}
