package com.ait.serviceimp;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ait.beans.EmployeeBean;
import com.ait.entity.EmployeeEntity;
import com.ait.repository.EmployeeRepository;
import com.ait.service.EmployeeService;
@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public EmployeeBean findEmployeeById(int id) {
		EmployeeBean bean=new EmployeeBean();
		EmployeeEntity empById = empRepository.getEmployeeBeanById(id);
		System.out.println(empById);
		BeanUtils.copyProperties(empById, bean);
		return bean;
	}

	@Override
	public List<EmployeeBean> getAllEmployees(int page,int size) {
		EmployeeBean bean=new EmployeeBean();
		Pageable pageable=(Pageable) PageRequest.of(page, size);
		//Page<EmployeeEntity> entity = empRepository.findByDept("DEV", pageable);
		Page<EmployeeEntity> entity = empRepository.findAll(pageable);
		System.out.println(entity.getTotalElements());
		List<EmployeeEntity> content = entity.getContent();
		System.out.println(content);
		BeanUtils.copyProperties(entity, bean);
		return null;
	}

	@Override
	public EmployeeBean registerEmployee(EmployeeBean employee) {
		EmployeeEntity entity=new EmployeeEntity();
		BeanUtils.copyProperties(employee, entity);
		EmployeeEntity save = empRepository.save(entity);
		BeanUtils.copyProperties(save,employee);
		return employee;
	}

	@Override
	public EmployeeBean updateEmployee(EmployeeBean employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBean findEmpByDeptAndName(String dept, int salary) {
		List<EmployeeEntity> empByDeptAndSalary = empRepository.getEmpByDeptAndSalary(dept, salary);
		System.out.println(empByDeptAndSalary);
		return null;
	}

}
