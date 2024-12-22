package com.ait.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ait.beans.EmployeeBean;
import com.ait.entity.EmployeeEntity;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {
	Page<EmployeeEntity> findByDept(String dept,Pageable pageable);
	
	@Query(value = "SELECT * FROM Employee_Records WHERE ID=:id ",nativeQuery = true)
	public EmployeeEntity getEmployeeBeanById(int id);
	
	@Query(value = "SELECT * FROM Employee_Records WHERE Dept=:dept AND Salary=:salary",nativeQuery = true)
	public List<EmployeeEntity> getEmpByDeptAndSalary(String dept,int salary);
}
