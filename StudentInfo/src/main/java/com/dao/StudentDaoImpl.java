package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import com.model.Student;

public class StudentDaoImpl implements StudentDao {
	
	private DataSource ds;
	
	

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int save(Student s) throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?,?,?)");
		pstmt.setInt(1, s.getId());
		pstmt.setString(2, s.getSname());
		pstmt.setFloat(3, s.getPercentage());
		pstmt.setString(4, s.getGrade());
		return pstmt.executeUpdate();
	}

	@Override
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
