package com.practice.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.comp.Printer;


public class TestApp {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"com/practice/cfg/applicationContext.xml");
		System.out.println("*********Container started**********");
		System.in.read();

		Printer p1 = factory.getBean("printer", Printer.class);
		System.out.println(p1);
		
		Printer p2 = factory.getBean("printer", Printer.class);
		System.out.println(p2);

		
		factory.close();
		System.out.println("\n*********Container stopped**********");
	}

}
