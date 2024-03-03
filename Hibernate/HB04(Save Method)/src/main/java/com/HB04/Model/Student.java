package com.HB04.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int Roll;
	private String Name;
	private String City;
	public Student(int roll, String name, String city) {
		super();
		Roll = roll;
		Name = name;
		City = city;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
}
