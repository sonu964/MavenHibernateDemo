package com.crud.operation.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.crud.operation.DTO.Student;

public class StudentDao {

	
	public void saveObject(Student stu){
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		try{
			
			Transaction tx = session.beginTransaction();
			session.save(stu);
			tx.commit();
			
		}catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
		
		
	}
	
}
