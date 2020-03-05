package com.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.beans.Person;


@Controller
public class MyController {
    
	@GetMapping("/")
    public String helloView(Model model) {
       
        return "Home";
    }
    

//    @GetMapping("signup/") 
//    public String signUpForm() {
//    	
//    	return "SignUp";
//    }
//    
//   
//    
//    @GetMapping("registered/")
//    public String save() {
//    	SessionFactory sFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//        
//    	Session session = sFactory.openSession();  
//        
//    	
//    	String title = "";
//    	String first_name = "";
//    	String last_name = "";
//    	try {
//    		
//    		Person e1=new Person();    
//    		e1.setTitle(title);    
//    		e1.setFirstName(first_name);    
//    		e1.setLastName(last_name);    
//    		
//    		Transaction tx = session.beginTransaction();     
//    		session.save(e1);  
//	       
//    		tx.commit();  
//    		
//	       
//    	}
//    	finally {
//    		session.close();
//    		sFactory.close();
//    	}
//    	return "Successfull";
//    }
    
}

