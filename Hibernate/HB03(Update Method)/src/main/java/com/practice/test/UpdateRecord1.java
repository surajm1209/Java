package com.practice.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.practice.Model.Student;
import com.practice.Util.HibernateUtil;

public class UpdateRecord1 
{
	public static void main(String[] args) throws Exception 
	{
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		session = HibernateUtil.getSession();
		if (session != null)
			transaction = (Transaction) session.beginTransaction();

		if (transaction != null) 
		{
			Student student = new Student();
			student.setSid(99);// Programmer should know that record with the id exists
			student.setSname("virat");
			student.setSaddress("IND");
			student.setSage(36);
			session.update(transaction);
			flag = true;
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
