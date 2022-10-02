package com.student.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.sms.entity.Student;
import com.student.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student("Ramesh","Tiwari","Ramesh@abc.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("samesh","Tiwari","samesh@abc.com");
//		studentRepository.save(student2);
//		
//		Student student3=new Student("Tamesh","Tiwari","Tamesh@abc.com");
//		studentRepository.save(student3);
//		
//		Student student4=new Student("Jamesh","Tiwari","Jamesh@abc.com");
//		studentRepository.save(student4);
//		
//		Student student5=new Student("Pamesh","Tiwari","Pamesh@abc.com");
//		studentRepository.save(student5);
//		
	}
	

}
