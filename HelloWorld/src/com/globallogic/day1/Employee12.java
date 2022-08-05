
package com.globallogic.day1;

public class EmployeeDetail{
	int emp_id, salary;
	String name, email, designation;
	static String location = "Noida";
	
	//Getter and setters for getting and setting properties  
	public int getEmp_id() {  
	    return emp_id;  
	}  
	public void setEmp_id(int emp_id) {  
	    this.emp_id = emp_id;  
	}  
	public int getSalary() {  
	    return salary;  
	}  
	public void setSalary(int salary) {  
	    this.salary = salary;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  	
	public String getDesignation() {  
	    return designation;  
	}  
	public void setDesignation(String designation) {  
	    this.designation = designation;  
	}  
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}
	
	@Override
	public String toString() {
		return "EmployeeDetails [emp_id=" + emp_id + ", salary=" + salary + ", name=" + name + ", designation="
				+ designation + ", email=" + email + "\nlocation ="+location+ "]";
	}  
}

//Creating main class  
public class Employee12{  
  //main() method start  
  public static void main(String args[]) {  
        
      //Creating object of EmployeeDetails class  
      EmployeeDetail emp = new EmployeeDetail();  
      //Setting values to the properties  
      emp.setEmp_id(45432);  
      emp.setName("Akash Ranjan");  
      emp.setDesignation("SE");  
      emp.setSalary(15000);  
      emp.setEmail("akash.prajapati@globallogic.com");  
        
      //Showing Employee details  
      System.out.println(emp);  
        
            
  }  
}

