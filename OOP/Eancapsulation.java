package com.java.Oops;

public class Eancapsulation {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Eancapsulation obj = new Eancapsulation();
		obj.setAge(27);
		obj.setName("Suraj");
		System.out.println("My Name is :"+ obj.getName());
		System.out.println("My Age is :"+ obj.getAge());
	}
	
}