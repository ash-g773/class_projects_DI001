package com.student.persistence;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.student.database.StudentDatabase;
import com.student.entity.Student;

@Repository("dao") //when using annotations, name each layer as a component to enable dependency injection
//through constructor injection for the dao
public class StudentDaoImpl implements StudentDao {
	
	//we come here after creating the implemented interface
	
	//all methods just return stuff from the dao directly i.e. everything is in the return line (?)
	
	//this class doesnt depend on any other classes SO doesnt need a constructor
	
	@Override
	public Collection<Student> getAllStudents() {
		return StudentDatabase.getStudentList().values(); // so we refer to the class, call the method , then call values() to get just values of the map
	}

	@Override
	public Student searchStudent(int id) {
		return StudentDatabase.getStudentList().get(id); //class . from list of all student . get() student with id 'id'
	}

	@Override
	public Student addStudent(Student student) {
		return StudentDatabase.getStudentList().put(student.getRollNo(), student); // class .  from list of all students . put ( student passed in roll# as id / key , student object )
	}

	@Override
	public Student removeStudent(Student student) {
		return StudentDatabase.getStudentList().remove(student.getRollNo());
	}
	
	//from here we move to the service layer implementation

}
