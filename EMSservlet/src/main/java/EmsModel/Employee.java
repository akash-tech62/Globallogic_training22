package EmsModel;

public class Employee {
	private int emp_id;
	private String firstname;
	private String lastname;
	private String email;
	private String contact;
	
	
	public Employee(int emp_id, String firstname, String lastname, String email, String contact) {
		super();
		this.emp_id = emp_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.contact = contact;
	}
	
	
	
	public Employee(String firstname, String lastname, String email, String contact) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.contact = contact;
	}



	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

}
