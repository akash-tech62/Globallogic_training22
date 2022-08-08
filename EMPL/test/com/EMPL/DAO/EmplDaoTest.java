package com.EMPL.DAO;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.EMPL.Model.Employee;

class EmplDaoTest {
	private DriverManagerDataSource dataSource;
	private EmplDao dao;
	
	@BeforeEach
	void setupBeforeEach() {
		dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("8331");
		
		dao=new EmplDaoI(dataSource);
		
	}

	@Test
	void testSave() {
		Employee contact=new Employee("Bill Gates","steve@apple.com", "Cupertino,CA","1700123456789");
		int result =dao.save(contact);
		
		assertTrue(result>0);
	}

	@Test
	void testUpdate() {
		Employee contact=new Employee(2, "Bill Gates","bill.gates@apple.com", "Redmon,wA","1900123456789");
		int result =dao.update(contact);
		
		assertTrue(result>0);
	}

	@Test
	void testDelete() {
		int id=2;
		int result =dao.delete(id);
		
		assertTrue(result>0);
	}

	@Test
	void testGet() {
		int id=1;
		Employee contact=dao.get(id);
		
		if(contact!=null) {
			System.out.println(contact);
		}
		assertNotNull(contact);
	}

	@Test
	void testList() {
		List<Employee> listContacts=dao.list();
		
		for(Employee aContact : listContacts) {
			System.out.println(aContact);
		}
		
		assertTrue(!listContacts.isEmpty());
	}

}