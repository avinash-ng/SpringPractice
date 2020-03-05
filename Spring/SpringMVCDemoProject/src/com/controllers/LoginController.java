package com.controllers;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beans.Login;
import com.beans.Person;

@Controller /* it is a type of component */
@RequestMapping(value = "login/")
public class LoginController {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		return "Login";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String loginPostProcessing(@ModelAttribute("loginForm") Login obj, ModelMap model) {
		String email = obj.getEmail();
		String password = obj.getPassword();
		
		
		SessionFactory sFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		NativeQuery sql = session.createSQLQuery("select * from Person where email="+"\""+email+"\""+" and password = "+"\""+password+"\"");
		List<Object[]> list =  sql.getResultList();
		
		
		if (list.size() >= 1) {
			Object[] object = list.get(0);
			model.addAttribute("firstname", object[1]);
			model.addAttribute("lastname", object[2]);
			return "LoginSuccessFull";
		}
		return "InvalidLogin";
	}

}
