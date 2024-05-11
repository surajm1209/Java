package com.practice.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.comp.Student;

public class TestApp 
{

	public static void main(String[] args) throws Exception 
	{
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"com/practice/cfg/applicationContext.xml");
		System.out.println("*********Container started**********");
		System.out.println("Bean id is :: " + Arrays.toString(factory.getBeanDefinitionNames()));

		System.in.read();

		Student stud1 = factory.getBean("com.practice.comp.Student#0", Student.class);
		System.out.println(stud1);
		
		Student stud2 = factory.getBean("com.practice.comp.Student#1", Student.class);
		System.out.println(stud2);

		factory.close();
		System.out.println("\n*********Container stopped**********");
	}

}
