package com.spring01.test;
import com.spring01.comp.WishMessageGenerator;

public class MainApp 
{
	public static void main(String[] args) 
	{
		WishMessageGenerator generator = new WishMessageGenerator();
		System.out.println("Target Object Before Setter Injection is :: " + generator);

		java.util.Date date = new java.util.Date();
		System.out.println("Dependent Object is :: " + date);
		
		generator.setDate(date);

		System.out.println("Target Object after Setter Injection :: " + generator);

		System.out.println();
		
		String result = generator.generateMessage("Suraj");
		System.out.println(result);

	}

}
