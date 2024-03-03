package com.practice.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.practice.Model.Student;
import com.practice.Util.HibernateUtil;

public class UpdateRecord3 
{
	public static void main(String[] args) throws Exception 
	{

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		session = HibernateUtil.getSession();
		Student student = session.get(Student.class, 18);

		if (session != null)
			transaction = session.beginTransaction();

		if (transaction != null) 
		{
			if (student != null) 
			{
				System.out.println(student);
				System.out.println();

				student.setSaddress("IND");
				student.setSname("kohli");
				flag = true;
			} 
			else 
			{
				System.out.println("Record not available for updation...");
			}
		}
		if (flag) 
		{
			System.in.read();
			transaction.commit();
			System.out.println("Object updated to database....");
		} 
		else 
		{
			transaction.rollback();
			System.out.println("Object not updated to database...");
		}

		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();		
	}

}
