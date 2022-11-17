package com.student.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.student.persistence.StudentDaoImpl;
import com.student.presentation.StudentPresentationImpl;
import com.student.service.StudentServiceImpl;

@Configuration
@ComponentScan(basePackages  = "com.student")
public class StudentConfiguration {

	//come here after preparing the presentation layer with basic TBI lines
	
	// below is using beans, however we use annotations so dont need to individually define the beans
	
//	@Bean(name="dao")
//	public StudentDaoImpl getPersistence() {
//		//constructor injection?
//		return new StudentDaoImpl(); //why is there nothing in the brackets - this is the 
//	}
//	
//	@Bean(name="service")
//	public StudentServiceImpl getStudentService() {
//		return new StudentServiceImpl(getPersistence()); //
//	}
//	
//	@Bean(name="studentPresentation")
//	public StudentPresentationImpl getStudentPresentation() { //constructor injector should work?
//		StudentPresentationImpl presentation = new StudentPresentationImpl();
//		presentation.setStudentService(getStudentService()); //getBookService?
//		return presentation;
//	}
//	//returns everything backwards - in the client file the presentation implementation file is called, which then here calls everything else
}
