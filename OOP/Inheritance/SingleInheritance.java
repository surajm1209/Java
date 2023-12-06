package com.java.Oops;

class Person {		
    String getName(){
        return "Suraj Mishra";
    }
}

class Programmer extends Person{
    String getProgrammingLanguage(){
        return "Java";
    }
}
 
public class SingleInheritance {

	public static void main(String[] args) {
		Programmer programmer = new Programmer();
        System.out.println(" I am "+programmer.getName()+" and I used to programe in "+ programmer.getProgrammingLanguage()+" languege");
	}    
}


