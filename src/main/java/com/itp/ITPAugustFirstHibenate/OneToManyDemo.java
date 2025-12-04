package com.itp.ITPAugustFirstHibenate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPAugustFirstHibenate.entity.Dept;
import com.itp.ITPAugustFirstHibenate.entity.Employee;

/**
 * Hello world!
 *
 */
public class OneToManyDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
  
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();		//DML Queries;
    	
    	
    	
    	Employee e1=Employee.builder()
    			.ename("Alice")
    			.sal(800)
    			.build();
    	
    	Employee e2=Employee.builder()
    			.ename("Ben")
    			.sal(900)
    			.build();
    	
    	Employee e3=Employee.builder()
    			.ename("Chris")
    			.sal(1000)
    			.build();
    	
    	Employee e4=Employee.builder()
    			.ename("David")
    			.sal(1100)
    			.build();
    	
    	
    	Dept d1=Dept.builder()
    			.dname("IT")
    			.city("Pune")
    			.employees(new ArrayList(Arrays.asList(e1,e2)))
    			.build();
    	
    	
    	Dept d2=Dept.builder()
    			.dname("Sales")
    			.employees(new ArrayList(Arrays.asList(e3,e4)))
    			.city("Delhi")
    			.build();
    	
    	
    	Dept d3=Dept.builder()
    			.dname("Mark")
    			.city("Jaipur")
    			.build();
    	
    	session1.save(d1);
    	session1.save(d2);
    	session1.save(d3);
    	
    	tx.commit();
    	
    	session1.close();
    	factory.close();

    }
}
