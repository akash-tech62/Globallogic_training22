package com.globallogic.hello;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		System.out.println("name "+name);
		System.out.println("password "+password);
		RequestDispatcher rs = request.getRequestDispatcher("/profile.jsp");
		
		request.setAttribute("name", name);
		request.setAttribute("pass", password);
		
		rs.forward(request, response);
	}

}