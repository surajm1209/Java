package com.practice.test;

import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.practice.comp.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"com/practice/cfg/applicationContext.xml");
		System.out.println("Bean count is :: " + factory.getBeanDefinitionCount());
		System.out.println("Bean id is    :: " + Arrays.toString(factory.getBeanDefinitionNames()));

		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("\n" + wmg);

		factory.close();
	}

}
