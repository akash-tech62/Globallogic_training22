package com.globallogic.day1;


class Empl {
	int emp_id, salary;
	String name, designation, email;
	static String loc=" Noida";
	
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
		return "EmployeeDetails \n[emp_id=" + emp_id + ",\nsalary=" + salary + ", \nname=" + name + ", \ndesignation="
				+ designation + ", \nemail=" + email + "\nlocation ="+loc+"]";
	}  
}

//Creating main class  
public class E{  
  //main() method start  
  public static void main(String args[]) {  
        
      //Creating object of EmployeeDetails class  
      Empl emp = new Empl();  
      //Setting values to the properties  
      emp.setEmp_id(657463);  
      
      emp.setName("Akash Ranjan");  
      emp.setDesignation("SE");  
      emp.setSalary(10000);  
      emp.setEmail("akash.prajapati@globallogic.com");  
        
      //Showing Employee details  
      System.out.println(emp);  
        
            
  }  
}