package com.practice.test;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.practice.Model.Student;
import com.practice.Util.HibernateUtil;

public class DeleteRecord2 
{
	public static void main(String[] args) throws Exception 
	{
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		session = HibernateUtil.getSession();
		int id = 18;
		Student student = session.get(Student.class, id);
		if (session != null)
			transaction = session.beginTransaction();

		if (transaction != null) 
		{
			if (student != null) 
			{
				session.delete(student);
				flag = true;
			} 
			else 
			{
				System.out.println("Record not available for deletion:: " + id);
			}
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
