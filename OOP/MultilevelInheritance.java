package com.java.Oops;

class Person1 {		
    String getName(){
        return "Suraj Mishra";
    }
}

class Programmer1 extends Person1{
    String getProgrammingLanguage(){
        return "Java";
    }
}

class Program extends  Programmer1{
    int getLineOfCode(){
        return 29;
    }
}
    
public class MultilevelInheritance {

	public static void main(String[] args) {
		Program program = new Program();
        System.out.println(" I am "+program.getName()+" and I code in "+ program.getProgrammingLanguage()+
                " . This program has "+program.getLineOfCode()+" lines");
	}

}
