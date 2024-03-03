package com.HB05.test;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HB05.Model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration();
    	con.configure();
    	SessionFactory factory = con.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Student s=null;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter roll number : ");
    	int roll = sc.nextInt();
    	
    	s = (Student)session.load(Student.class, roll);
    	if(s != null)
    		System.out.println(s);
    	else
    		System.out.println("Student record not exist");
    	
    	
    	session.close();
    }
}
