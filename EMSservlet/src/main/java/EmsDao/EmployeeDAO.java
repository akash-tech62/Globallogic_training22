package EmsDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import EmsModel.Employee;

/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the table users in the database.
 */

public class EmployeeDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/emp?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";
	
	private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO employee (first_name, last_name, email, contact) VALUES " 
																			+ " (?, ?, ?);";

	private static final String SELECT_EMPLOYEE_BY_ID = "select emp_id,first_name,last_name,email,contact from employee where emp_id =?";
	private static final String SELECT_ALL_EMPLOYEE = "select * from employee";
	private static final String DELETE_EMPLOYEE_SQL = "delete from employee where id = ?;";
	private static final String UPDATE_EMPLOYEE_SQL = "update employee set first_name = ?,last_name= ?,email= ?, contact =? where emp_id = ?;";

	public EmployeeDAO() {}
	
	//jdbc connection 
	
	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	//create or insert user
	
	public void insertEmployee(Employee employee) throws SQLException {
		//System.out.println(INSERT_USERS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(INSERT_EMPLOYEE_SQL)) {
			preparedStatement.setString(1, employee.getFirstname());
			preparedStatement.setString(2, employee.getLastname());
			preparedStatement.setString(3, employee.getEmail());
			preparedStatement.setString(4, employee.getContact());
			//System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//update user
	
	public boolean updateEmployee(Employee employee) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = (PreparedStatement) connection.prepareStatement(UPDATE_EMPLOYEE_SQL);) {
			statement.setString(1, employee.getFirstname());
			statement.setString(2, employee.getLastname());
			statement.setString(3, employee.getEmail());
			statement.setString(4, employee.getContact());
			statement.setInt(4, employee.getEmp_id());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
	
	
	//select user by id
	
	public Employee selectEmployee(int emp_id) {
		Employee employee = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);) {
			preparedStatement.setInt(1, emp_id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = (ResultSet) preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String first_name = rs.getString("firstname");
				String last_name = rs.getString("lastname");
				String email = rs.getString("email");
				String contact = rs.getString("contact");
				employee = new Employee(emp_id, first_name,last_name, email, contact);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	//select user
	
	public List<Employee> selectAllEmployee() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Employee> employee = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(SELECT_ALL_EMPLOYEE);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = (ResultSet) preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String first_name = rs.getString("firstname");
				String last_name = rs.getString("lastname");
				String email = rs.getString("email");
				String contact = rs.getString("contact");
				employee.add(new Employee(id, first_name,last_name, email, contact));
			}
		} catch (SQLException e) {
			e.printStackTrace();		}
		return employee;
	}
	
	
	//delete user
	
	public boolean deleteEmployee(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = (PreparedStatement) connection.prepareStatement(DELETE_EMPLOYEE_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
	

