package com.Student;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.activation.DataSource;

public class StudentDBUtil {

	private DataSource dataSource;
	
	//create a constructor
	public StudentDBUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	//List a student from a database...
	public List<Student> getStudents() throws Exception{
		
		List<Student> students = new ArrayList<>();
		
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			//get a connection
			myConn = dataSource.getConnection();
			
			//create sql statement
			String sql = "select * from student ";
			
			myStmt = myConn.createStatement();
			
			//execute query
			myRs = myStmt.excuteQuery(sql);
			
			//process result set
			while (myRs.next()) {
				
				//retrive data from result set row
				int id = myRs.getInt("id");
				String firstname = myRs.getString("first_name");
				String lastname = myRs.getString("last_name");
				String email = myRs.getString("email");
				
				//create new student object
				Student tempStudent = new Student(id, firstname, lastname, email);
				
				//add it to the list of students
				students.add(tempStudent);
		}
		
			return students;
		}
		finally {
			//close JDBC objects
			close(myConn, myStmt, myRs)
		}
		
		
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		//basically we will close each obj
		try {
			if(myRs != null) {
				myRs.close();
			}
			
			if(myStmt != null) {
				myStmt.close();
			}
			
			if(myConn != null) {
				myConn.close();
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}
}



