package com.java.Oops;
public class WelcomeJava {

	int a;
	String msg;
	public WelcomeJava() {
		this.a = 5;
		this.msg = "This is the example of Class and Object";		
	}
	public void display() {
		System.out.println("A = "+a);
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WelcomeJava obj = new WelcomeJava();
		obj.display();
	}
}