package com.globallogic.hello;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
//@WebServlet("/home1")
public class MyFirstServlet extends HttpServlet {
    
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servicing");
		RequestDispatcher rs= request.getRequestDispatcher("/home.html");
		rs.forward(request, response);
	}

}
