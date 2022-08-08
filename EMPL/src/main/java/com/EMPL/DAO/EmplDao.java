package com.EMPL.DAO;


import java.util.List;

import com.EMPL.Model.Employee;

public interface EmplDao {
	public int save(Employee contact);
	
	public int update(Employee contact);
    
    public int delete(int id);
     
    public Employee get(int id);
     
    public List<Employee> list();

}