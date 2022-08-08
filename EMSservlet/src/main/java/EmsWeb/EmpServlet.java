package EmsWeb;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import EmsDao.EmployeeDAO;
import EmsModel.Employee;


/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * @email
 */

@WebServlet("/")

public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeDAO employeeDAO;
	
	public void init() {
		employeeDAO = new EmployeeDAO();
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
				
			case "/insert":
				insertEmployee(request, response);
				break;
				
			case "/delete":
				deleteEmployee(request, response);
				break;
				
			case "/edit":
				showEditForm(request, response);
				break;
				
			case "/update":
				updateEmployee(request, response);
				break;
				
			default:
				listEmployee(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
    
    
    private void listEmployee(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		
    	List<Employee> listEmployee = employeeDAO.selectAllEmployee();
		request.setAttribute("listEmployee", listEmployee);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Employee-list.jsp");
		dispatcher.forward(request, response);
	}

	
    
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("Employee-form.jsp");
		dispatcher.forward(request, response);
	}

	
    
    
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("emp_id"));
		Employee existingEmployee = employeeDAO.selectEmployee(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Employee-form.jsp");
		request.setAttribute("employee", existingEmployee);
		dispatcher.forward(request, response);

	}

	
    
    private void insertEmployee(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		//int emp_id = request.getParameter("emp_id");
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		Employee newEmployee = new Employee(first_name, last_name, email, contact);
		employeeDAO.insertEmployee(newEmployee);
		response.sendRedirect("list");
	}

	
    
    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");

		Employee book = new Employee(id, first_name, last_name, email, contact);
		employeeDAO.updateEmployee(book);
		response.sendRedirect("list");
	}

	
    
    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		employeeDAO.deleteEmployee(id);
		response.sendRedirect("list");

	}


}
