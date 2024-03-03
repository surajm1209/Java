package com.HB04.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HB04.Model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
    	config.configure();
    	SessionFactory factory = config.buildSessionFactory();
    	
    	//Creating Student object
    	Student s = new Student();
    	s.setName("Suraj");
    	s.setCity("Bilimora");
    	
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(s);
    	
    	tx.commit();
    	session.close();
    	System.out.println("Record added sucessfuly");
    	
    }
}
