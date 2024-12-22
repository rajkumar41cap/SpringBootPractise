package com.ait.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ait.entity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
	public StudentEntity findByNameAndAddress(String name,String address);
	public StudentEntity findByMailType(String mail);
}
