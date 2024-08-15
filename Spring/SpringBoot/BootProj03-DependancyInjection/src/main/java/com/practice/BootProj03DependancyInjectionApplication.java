package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.comp.Student;

@SpringBootApplication
public class BootProj03DependancyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BootProj03DependancyInjectionApplication.class, args);
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		
		student.preparation("java");
		
		((ConfigurableApplicationContext) context).close();
	}

}
