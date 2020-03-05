/*
 * dynamic web project - servlets
 */

package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
/*
 * extending httpservlet
 * implementing servlet interface
 * 
 */
public class AddServlet extends HttpServlet 
{
	
	public void init() {
		System.out.println(" Servlet initialized ");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		
		PrintWriter out = res.getWriter();
		Enumeration enumeration = req.getHeaderNames();
		while(enumeration.hasMoreElements()) {
			String str = (String) enumeration.nextElement();
			String ans = req.getHeader(str);
			out.print(str+"     "+ans+"\n");
			
		}
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		
		String s = "The output is "+k;
		out.print(s);
	}

}
