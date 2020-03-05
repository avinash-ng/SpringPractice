package com.controllers;

import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beans.Person;
import com.mail.SendEmail;


@Controller
@RequestMapping(value = "signup/")
public class RegistrationController {
	
	
	 
	@RequestMapping(method = RequestMethod.GET)
    public String signUpForm() {
    	
//		Person personForm = new Person();
//		model.put("personForm", personForm);
    	return "SignUp";
    }
    
//, Map<String, Object> model
    
    @RequestMapping(method = RequestMethod.POST)
    public String save(@ModelAttribute("personForm") Person person) {
    	SessionFactory sFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
    	Session session = sFactory.openSession();  
        
    	
    	String mail = person.getEmail();
    	String first_name = person.getFirstName();
    	String last_name = person.getLastName();
    	System.out.println(mail+" "+first_name+" "+last_name);
    	try {
    		
//    		Person e1=new Person();    
//    		e1.setTitle(title);    
//    		e1.setFirstName(first_name);    
//    		e1.setLastName(last_name);    
   		
    		
    		Transaction tx = session.beginTransaction();     
    		session.save(person);  
	       
    		tx.commit();  
    		
    		SendEmail sendmail = new SendEmail();
    		sendmail.setToAddress(mail);
    		sendmail.sendMail();
    	}
    	finally {
    		session.close();
    		sFactory.close();
    	}
    	return "Successful";
    }

	
}
