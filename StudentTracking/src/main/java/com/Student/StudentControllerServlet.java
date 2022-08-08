package com.Student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDBUtil studentDBUtil;
	
	@Resource(name="jdbc/web_student_tracker");
	private DataSource dataSource;
	
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		//create our student db util ... and pass in the conn pool / datasource
		try {
			studentDBUtil = new StudentDBUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}



	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//list the student ... in mvc fashion
		listStudents(request, response);
	}




	private void listStudents(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		//get student from db util
		List<Student> students = studentDBUtil.getStudents();
		
		//add student to the request
		request.setAttribute("STUDENT_LIST", students);
		
		//send to JSP page(view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-student.jsp");
		dispatcher.forward(request, response);
	}

}
