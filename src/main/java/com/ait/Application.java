package com.ait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ait.beans.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(Application.class, args);
		Student bean = run.getBean(Student.class);
		bean.setId(100);
		bean.setName("Raj");
		System.out.println(bean.getName());
		
	}

}
