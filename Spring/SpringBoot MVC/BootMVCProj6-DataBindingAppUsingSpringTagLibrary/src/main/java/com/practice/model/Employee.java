package com.practice.model;

import lombok.Data;

@Data
public class Employee {
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	private Integer eno;
	private String ename="sachin";
	private String edesg;
	private Double salary;	
	public Employee(){
		System.out.println("ZERO PARAM CONSTRUCTOR IS USED BY DS");
	}
}
