package com.hibernate;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
  
public class StoreData {  
  
    public static void main( String[] args )  
    {  
    	   	
    	SessionFactory sFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       
    	Session session = sFactory.openSession();  
        
    	try {
    		
    		Employee e1=new Employee();    
    		e1.setId(1);    
    		e1.setFirstName("Gaurav");    
    		e1.setLastName("Chawla");    
    		e1.setAge(20);
    		Transaction tx = session.beginTransaction();     
    		session.save(e1);  
	       
    		tx.commit();  
    		
	       
    	}
    	finally {
    		session.close();
    		sFactory.close();
    	}
    	
    	
    	

    }  
}  
