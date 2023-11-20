package com.java.Oops;

class Animal 
{
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}
class Dog extends Animal 
{
   public void displayInfo() {
      System.out.println("I am a dog.");
   }
}
public class Overridding {

	public static void main(String[] args) 
	{
		Animal a = new Animal();
		Dog d = new Dog();
		a.displayInfo();
		d.displayInfo();
	}

}
