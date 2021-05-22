package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	
	public int save(Student s) throws Exception;
	public List<Student> findAll() throws Exception;

}
