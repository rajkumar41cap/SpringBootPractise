package com.ait.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ait.beans.EmployeeBean;
import com.ait.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	
	public EmployeeBean registerEmployee(EmployeeBean emp) {
		EmployeeBean employee = empService.registerEmployee(emp);
		return employee;
	}
	public List<EmployeeBean> getAllEmployee(int page,int size){
		List<EmployeeBean> allEmp=empService.getAllEmployees(page, size);
		return allEmp;
	}
	public EmployeeBean getEmpByID(int id) {
		EmployeeBean employeeById = empService.findEmployeeById(id);
		return employeeById;
	}
	public EmployeeBean getEmpByDeptAndSalary(String dept,int salary) {
		empService.findEmpByDeptAndName(dept, salary);
		return null;
	}
}
