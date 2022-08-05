package com.globallogic.day7;
//Java program to Demonstrate List Interface

//Importing all utility classes
import java.util.*;

//Create a List with student class and perform the following operation
//1. Add the employee to list
//2. Delete the employee from list
//3. Search the employee name
//4. Update the employee value using name or name
//5. Sort the data of employee

//6. Provide the sum of salary of employee
//7 search for highest paid salary
//8 search for minimum paid salary
//create a menu base program for above problem

class Employee
{
	private int Id;
	private String Name;
	
	private double Salary;
	
	public Employee(int id2, String Name, Double sal)
	{
		this.Id=id2;
		this.Name=Name;
		
		this.Salary=sal;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}

public String toString() 
{ 
	return this.Id+"\t"+this.Name+"\t"+this.Salary+"\n";
}

}

public class MenuBased {




//Main class
//ListDemo class


	// Main driver method
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Creating an object of List interface
		// implemented by the ArrayList class
		//List<String> l1 = new ArrayList<String>();
		ArrayList<Employee> EmpList = new ArrayList<Employee>();
		// Adding elements to object of List interface
		// Custom inputs
		System.out.println( "\n//1. Add the employee to list\r\n"
				+ "//2. Search the employee name\r\n"
				+ "//3. Delete the employee from list\r\n"
				+ "//4. Update the employee value using name or name\r\n"
				+ "//5. Sort the data of employee\r\n"
				+ "//6. Provide the sum of salary of employee\r\n"
				+ "//7 search for highest paid salary\r\n"
				+ "//8 search for minimum paid salary");
		
		while(true) {
			System.out.print("\nMake your choice: "); 
			int choice = sc.nextInt();
			switch(choice) {
		
				case 1: //add an employee -->
						System.out.println("Enter the employee Id"); int id=sc.nextInt();
						System.out.println("Enter the employee name"); String name=sc.next();
						System.out.println("Enter the employee Salary");Double sal=sc.nextDouble();
						Employee ob=new Employee(id,name, sal);
						
						EmpList.add(ob);
						System.out.println("Data addded sucessfully");
						System.out.println(EmpList);
						break;
				case 2: //remove an employee -->
						System.out.println("Enter Employee name to remove : ");
						String n = sc.next();
						boolean flag = false;
						int a= 0;   // 'a' for finding the index for respective name
						for(Employee e:EmpList) {
							if(e.getName().equalsIgnoreCase(n)) {
								flag = true;
								break;
							}
							else {
								a++;
							}}
							if(flag) {
								EmpList.remove(a);
								System.out.println("Sucessfully remove employee");
								System.out.println(EmpList);
							}
							else {
								System.out.println("Employee not found");
						}
						break;
				case 3: //search an employee
						System.out.println("Enter Employee name to search : ");
						String b = sc.next();
						boolean f = false;
						
						for(Employee e:EmpList) {
							if(e.getName().equalsIgnoreCase(b)) {
								f = true;
								
								
							}
						}
							
							if(f) {
								
								System.out.println("Employee found ..");
							}
							else {
								System.out.println("Employee not found ");
						}
			
						break;
				case 4: //update employee values
						System.out.println("Enter Employee name to update : ");
						String c = sc.next();
						System.out.println("Enter Employee id to update : ");
						int ied = sc.nextInt();
						System.out.println("Enter Employee salary to update : ");
						int s = sc.nextInt();
						for(Employee e:EmpList) {
							if(e.getName().equalsIgnoreCase(c)) {
								e.setId(ied);
								e.setSalary(s);
							}
						}
						break;
				case 5: //sort Employee
						break;
				case 6: //sum of salary of employee
						double sum=0;
						for(Employee e:EmpList)
							sum= sum+e.getSalary();
						System.out.println("Sum of salary of all employee is : ");
				case 7: //max salary
						double max_sal= Integer.MAX_VALUE;
						for(Employee e:EmpList)
							if(max_sal < e.getSalary()) {
								max_sal = e.getSalary();
							}
						System.out.println("Sum of salary of all employee is : ");
				case 8: //min salary
						double min_sal= Integer.MAX_VALUE;
						for(Employee e:EmpList)
							if(min_sal > e.getSalary()) {
								max_sal = e.getSalary();
							}
						System.out.println("Sum of salary of all employee is : ");
				case 9: //see list
					System.out.println(EmpList);
			}
		}
	}
}
//				case 2:l1.remove(sc.next());
//						System.out.println("element is removed :"+l1);break;
//				
//				case 3:{System.out.println("Enter search element");
//						String e = sc.next();
//						boolean retval = l1.contains(e); 
//	        
//						if (retval == true) {
//							System.out.println("element  contained in the list");
//						} else {
//							System.out.println("element  not contained in the list");
//						}
//				}break;
//				
//				case 4: {
//					System.out.println("press the element index which you want to update starting from 0 :");
//					int i = sc.nextInt();
//					System.out.println("Enter update name : ");
//					String s = sc.next();
//					l1.set(i,s);
//				}break;
//				
//				case 5: Collections.sort(l1);
//						System.out.println("Sorted list is : "+l1);
//						
//						break;
//						
//		
//		}
//		}
////		l1.add(0, 1);
////		l1.add(1, 2);
////
////		// Print the elements inside the object
////		System.out.println(l1);
////
////		// Now creating another object of the List
////		// interface implemented ArrayList class
////		// Declaring object of integer type
////		List<Integer> l2 = new ArrayList<Integer>();
////
////		// Again adding elements to object of List interface
////		// Custom inputs
////		l2.add(1);
////		l2.add(2);
////		l2.add(3);
////
////		// Will add list l2 from 1 index
////		l1.addAll(1, l2);
////
//		//System.out.println(l1);
////
////		// Removes element from index 1
////		l1.remove(1);
////
////		// Printing the updated List 1
////		System.out.println(l1);
////
////		// Prints element at index 3 in list 1
////		// using get() method
////		System.out.println(l1.get(3));
////
////		// Replace 0th element with 5
////		// in List 1
////		l1.set(0, 5);
////
////		// Again printing the updated List 1
////		System.out.println(l1);
//	}
//}
