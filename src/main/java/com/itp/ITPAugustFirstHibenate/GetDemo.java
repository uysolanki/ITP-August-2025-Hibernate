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
public class GetDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
  
    	Session session1=factory.openSession();			//when we open the session it is blank/empty
    	Student stud1=session1.get(Student.class, 18);	//select displayed on the console;
    	System.out.println(stud1);
    	
    	Student stud2=session1.get(Student.class, 18);	//select NOT displayed on the console;
    	System.out.println(stud2);
    	
    	System.out.println(stud1==stud2);
    	
    	Student stud3=session1.get(Student.class, 63);	//select NOT displayed on the console;
    	System.out.println(stud3);
    	session1.close();
    	factory.close();

    }
}
