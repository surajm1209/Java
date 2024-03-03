package com.practice.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.practice.Model.Student;
import com.practice.Util.HibernateUtil;

public class TestApp 
{
	public static void main(String[] args) throws Exception 
	{

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		session = HibernateUtil.getSession();

		if (session != null)
			transaction = session.beginTransaction();

		if (transaction != null) {
			Student student = new Student();
			student.setSid(99);
			student.setSname("Gayle");
			student.setSaddress("KKR");
			student.setSage(41);
			
			session.saveOrUpdate(student);			
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
