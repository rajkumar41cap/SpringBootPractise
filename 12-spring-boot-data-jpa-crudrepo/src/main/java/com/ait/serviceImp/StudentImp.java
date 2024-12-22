package com.ait.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.beans.Student;
import com.ait.entity.StudentEntity;
import com.ait.repository.StudentRepository;
import com.ait.service.StudentService;
@Service
public class StudentImp implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student saveStudent(Student student) {
		StudentEntity entity=new StudentEntity();
		entity.setId(student.getId());
		entity.setName(student.getName());
		entity.setEmail(student.getEmail());
		entity.setYear(student.getYear());
		entity.setAddress(student.getAddress());
		studentRepository.save(entity);
		//BeanUtils.copyProperties(student, entity);
		//StudentEntity save=studentRepository.save(entity);
		//BeanUtils.copyProperties(save, student);
		return student;
	}

	@Override
	public Student findStudentById(int id) {
		Student stu=new Student();
		Optional<StudentEntity> student=studentRepository.findById(id);
		StudentEntity studentEntity=student.get();
		BeanUtils.copyProperties(studentEntity, stu);
		return stu;
	}

	@Override
	public Student updateStudentById(Student student) {
		StudentEntity entity=new StudentEntity();
		BeanUtils.copyProperties(student, entity);
		StudentEntity save = studentRepository.save(entity);
		BeanUtils.copyProperties(save,student);
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);

	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> student=new ArrayList<>();
		List<StudentEntity> allStudent = (List<StudentEntity>) studentRepository.findAll();
		allStudent.forEach(data->{
			Student s1=new Student();
			BeanUtils.copyProperties(data, s1);
			student.add(s1);
		});
		return student;
	}

	@Override
	public long countAllStudent() {
		long count=studentRepository.count();
		return count;
	}

	@Override
	public boolean checkStudentExist(int id) {
		boolean existsById = studentRepository.existsById(id);
		return existsById;
	}

	@Override
	public void deleteMultipleStudent(List<Integer> studentId) {
		ListIterator<Integer> listIterator = studentId.listIterator();
		studentRepository.deleteAllById((Iterable<? extends Integer>) listIterator);
	}

	@Override
	public Student findByNameAddress(String name, String address) {
		Student student=new Student();
		StudentEntity byNameAdd=studentRepository.findByNameAndAddress(name, address);
		BeanUtils.copyProperties(byNameAdd,student);
		return student;
	}

	@Override
	public Student findByMailType(String mail) {
		Student student=new Student();
		StudentEntity byMail=studentRepository.findByMailType(mail);
		BeanUtils.copyProperties(byMail,student);
		return student;
	}
	
}
