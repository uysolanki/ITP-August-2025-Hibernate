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
public class DeleteDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
  
    	Session session1=factory.openSession();			//when we open the session it is blank/empty
    	Transaction tx=session1.beginTransaction();	
    	
    	Student stud1=session1.get(Student.class, 18);	//select displayed on the console;
    	session1.remove(stud1);
    	System.out.println("Object deleted");
    	tx.commit();
    	
    	session1.close();
    	factory.close();

    }
}
