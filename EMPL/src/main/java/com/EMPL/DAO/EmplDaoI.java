package com.EMPL.DAO;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.EMPL.Model.Employee;


public class EmplDaoI implements EmplDao {
 
	private JdbcTemplate jdbcTemplate;
	
	public EmplDaoI(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
 
	@Override
	public int save(Employee c) {
		String sql="INSERT INTO EMPLTable (name, email,address, phone) VALUES (?,?,?,?)";
		return jdbcTemplate.update(sql,c.getName(),c.getEmail(),c.getAddress(),c.getPhone());
		
	}

	@Override
	public int update(Employee c) {
		String sql="UPDATE EMPLTable SET name=?,email=?,address=?,phone=? WHERE id=?";
		return jdbcTemplate.update(sql,c.getName(),c.getEmail(),c.getAddress(),c.getPhone(),c.getId());
	}

	@Override
	public int delete(int id) {
		String sql="DELETE FROM EMPLTable WHERE id="+id;
		return jdbcTemplate.update(sql);

	}

	@Override
	public Employee get(int id) {
		String sql="SELECT * FROM EMPLTable WHERE id="+ id;
		
		ResultSetExtractor<Employee> extractor=new ResultSetExtractor<Employee>() {
			@Override
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException{
				if(rs.next()) {
					String name=rs.getString("name");
					String email=rs.getString("email");
					String address=rs.getString("address");
					String phone=rs.getString("phone");
					
					return new Employee(id,name,email,address,phone);
				}
				return null;
			}
		};
		
		
		
		return jdbcTemplate.query(sql, extractor);
	}

	@Override
	public List<Employee> list() {
		String sql="SELECT * FROM EMPLTable";
		
		RowMapper<Employee> rowMapper=new RowMapper<Employee>() {
			
			@Override
			public Employee mapRow(ResultSet rs,int rowNum) throws SQLException{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				String address=rs.getString("address");
				String phone=rs.getString("phone");
				
				return new Employee(id,name,email,address,phone);
			}
		};
		
		return jdbcTemplate.query(sql, rowMapper);
		
	}

}