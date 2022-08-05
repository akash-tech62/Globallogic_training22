package com.globallogic.day1;

public class Employee {
	
	private int id, age;
	private String name, designation;
	private float salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float d) {
		this.salary= d;
	}
	public String toString() {
		return this.name + " " + this.age;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(23455);
		e.setName("Akash");
		e.setDesignation("Trainee Engineer");
		e.setAge(22);
		e.setSalary(10.6f);
		
		System.out.println("Id is "+ e.getId());
		System.out.println("Name is "+ e.getName());
		System.out.println("Designation is "+ e.getDesignation());
		System.out.println("Age is "+ e.getAge());
		System.out.println("Salary is "+ e.getSalary());
		
	}
}
	
