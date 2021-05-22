package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Student;

public class StudentDao {

JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Student p){  
	    String sql="insert into Student(id,sname,percentage,grade) values("+p.getId()+",'"+p.getSname()+"',"+p.getPercentage()+",'"+p.getGrade()+"')";  
	    return template.update(sql);  
	}  
	
	public List<Student> getStudents(){    
	    return template.query("select * from student",new RowMapper<Student>(){    
	        public Student mapRow(ResultSet rs, int row) throws SQLException {    
	        	Student e=new Student();    
	            e.setId(rs.getInt(1));    
	            e.setSname(rs.getString(2));    
	            e.setPercentage(rs.getFloat(3));    
	            e.setGrade(rs.getString(4));    
	            return e;    
	        }    
	    });    
	}  

}
