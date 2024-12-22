package com.ait.service;

import java.util.List;

import com.ait.beans.EmployeeBean;

public interface EmployeeService {
	public EmployeeBean findEmployeeById(int id);
	public List<EmployeeBean> getAllEmployees(int page,int size);
	public EmployeeBean registerEmployee(EmployeeBean employee);
	public EmployeeBean updateEmployee(EmployeeBean employee);
	public EmployeeBean findEmpByDeptAndName(String dept,int salary);
}
