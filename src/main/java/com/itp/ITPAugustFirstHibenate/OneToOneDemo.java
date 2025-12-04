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
public class OneToOneDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
  
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();		//DML Queries;
    	
    	
    	
    	ChiefMinister cm1=ChiefMinister.builder()
    			.cmName("Fadnavis")
    			.age(55)
    			.build();
    	
    	ChiefMinister cm2=ChiefMinister.builder()
    			.cmName("Sharma")
    			.age(60)
    			.build();
    	
    	ChiefMinister cm3=ChiefMinister.builder()
    			.cmName("Patel")
    			.age(65)
    			.build();
    	
    	State s1=State.builder()
    			.sname("Maharashtra")
    			.capital("Mumbai")
    			.chiefMinister(cm1)
    			.build();
    	
    	State s2=State.builder()
    			.sname("Rajasthan")
    			.capital("Jaipur")
    			.chiefMinister(cm2)
    			.build();
    	
    	State s3=State.builder()
    			.sname("Gujarat")
    			.capital("Ahmedabad")
    			.chiefMinister(cm3)
    			.build();
    	session1.save(s1);
    	session1.save(s2);
    	session1.save(s3);
    	
    	tx.commit();
    	
    	session1.close();
    	factory.close();

    }
}
