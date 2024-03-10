package com.practice.test;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.practice.Model.Student;
import com.practice.Util.HibernateUtil;

public class DeleteRecord1 
{
	public static void main(String[] args) throws Exception 
	{
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		session = HibernateUtil.getSession();

		if (session != null)
			transaction = session.beginTransaction();

		if (transaction != null) 
		{
			Student student = new Student();
			student.setSid(1);	// programmer should remember the id of the record
			session.delete(student);
			flag = true;
		}

		if (flag) 
		{
			System.in.read();
			transaction.commit();
			System.out.println("Object delete from the database....");
		} 
		else 
		{
			transaction.rollback();
			System.out.println("Object not deleted from the database...");
		}
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}
}
