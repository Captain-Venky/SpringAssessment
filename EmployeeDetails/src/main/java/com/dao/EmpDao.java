package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.model.Employee;

public class EmpDao {
	
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}        
	public List<Employee> getEmployees(){    
	    return template.query("select * from Employee",new RowMapper<Employee>(){    
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
	        	Employee e=new Employee();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setSalary(rs.getFloat(3));    
	            e.setDesignation(rs.getString(4));    
	            return e;    
	        }    
	    });    
	}  

}
