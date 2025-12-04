package com.itp.ITPAugustFirstHibenate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.itp.ITPAugustFirstHibenate.entity.Dept;
import com.itp.ITPAugustFirstHibenate.entity.Employee;

/**
 * Hello world!
 *
 */
public class FetchTypeDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
  
    	Session session1=factory.openSession();
    	Dept dept=session1.get(Dept.class, 1);
    	
    	
    	for(Employee emp:dept.getEmployees())
    	{
    		System.out.println(emp.getEname());
    	}
    	
    	    	
    	session1.close();
    	factory.close();

    }
}
