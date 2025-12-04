package com.itp.ITPAugustFirstHibenate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPAugustFirstHibenate.entity.ChiefMinister;
import com.itp.ITPAugustFirstHibenate.entity.State;
import com.itp.ITPAugustFirstHibenate.entity.Student;

/**
 * Hello world!
 *
 */
public class OneToOneDemo2 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
  
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();		//DML Queries;
    	
    	
    	
    	State state1=session1.get(State.class, 1);
    	session1.remove(state1);
    	
    	tx.commit();
    	
    	session1.close();
    	factory.close();

    }
}
