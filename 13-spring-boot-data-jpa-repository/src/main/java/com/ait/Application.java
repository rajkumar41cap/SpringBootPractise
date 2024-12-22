package com.ait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ait.beans.Address;
import com.ait.beans.EmployeeBean;
import com.ait.controller.EmployeeController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		EmployeeBean emp1=new EmployeeBean(
				"Astha","DEV3",24,65000,new Address("Hyderabad",500012,"TS"));
		EmployeeBean emp2=new EmployeeBean(
				"Priya","QA3",21,35000,new Address("New Delhi",634776,"Delhi"));
		EmployeeController controllerBean = run.getBean(EmployeeController.class);
		//controllerBean.registerEmployee(emp1);
		System.out.println("Employee:"+emp1.getName()+" got registered");
		//controllerBean.registerEmployee(emp2);
		System.out.println("Employee:"+emp2.getName()+" got registered");
		controllerBean.getAllEmployee(1, 2);
		controllerBean.getEmpByID(102);
		controllerBean.getEmpByDeptAndSalary("DEV",65000);
	}

}
