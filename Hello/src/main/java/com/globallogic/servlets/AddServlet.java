package com.globallogic.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		
		//it will get the number1 and number2 from the user input and convert into integer
		int i = Integer.parseInt(req.getParameter("num1")); 
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		System.out.println("result is "+ k);
	}

}
