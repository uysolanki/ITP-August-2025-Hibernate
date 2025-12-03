package com.itp.ITPAugustFirstHibenate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPAugustFirstHibenate.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
  
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();		//DML Queries;
    	
    	Student s1=new Student(45,"Rohit",87.5);		//commit
    	session1.save(s1);
    	tx.commit();
    	
    	session1.close();
    	factory.close();

    }
}
