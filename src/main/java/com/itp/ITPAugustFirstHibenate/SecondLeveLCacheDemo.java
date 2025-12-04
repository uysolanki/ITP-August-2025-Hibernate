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
public class SecondLeveLCacheDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
  
    	Session session1=factory.openSession();	
    	Session session2=factory.openSession();	
    	
    	Student stud1=session1.get(Student.class, 1);	
    	System.out.println(stud1);
    	
    	Student stud2=session2.get(Student.class, 2);	
    	System.out.println(stud2);
    	
    	
    	session1.close();
    	session2.close();
    	factory.close();

    }
}
