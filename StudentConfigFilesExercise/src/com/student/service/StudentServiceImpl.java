package com.student.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exceptions.StudentExistsException;
import com.student.persistence.StudentDao;

@Service("service")
public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao; //keep this as the interface so that all implementations passed in by the constructor by the config file are accepted

	public StudentServiceImpl(@Autowired StudentDao dao) {
		this.dao = dao;
	}
	@Override
	public Collection<Student> getAllStudents() {
		Collection<Student> allStudents = dao.getAllStudents();
		return allStudents;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student = dao.searchStudent(id); //make sure you remember to use the methods defined in the dao impl
		return student;
	}

	@Override
	public boolean addNewStudent(Student student) throws StudentExistsException { //need to check if this is right
		if (dao.searchStudent(student.getRollNo())!=null) {
//			System.out.println("This student exists");
//			return false;
			throw new StudentExistsException("This student already exists! - from, The Service Layer");
		} 
		dao.addStudent(student);
		return true;
	}
	@Override
	public boolean removeExistingStudent(Student student) {
		if (!(dao.searchStudent(student.getRollNo())!=null)) {
			System.out.println("This student doesnt exist in the register!");
			return false;
		}
		dao.removeStudent(student);
		return true;
	}
	
	//after this we move onto the presentation interface

}
