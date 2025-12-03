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
public class LoadDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
  
    	Session session1=factory.openSession();			//when we open the session it is blank/empty
    	Student stud1=session1.load(Student.class, 63);	//select displayed on the console : NO;
    	System.out.println("Hiiiii");
    	
    	System.out.println(stud1.getRno());
    	System.out.println("Byeee");
    	
    	System.out.println(stud1.getSname());    //Query
    	session1.close();
    	factory.close();

    }
}
