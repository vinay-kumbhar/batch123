package com.main.serviceI;

import java.util.List;

import com.main.model.Student;


public interface ServiceI 
{
	
	public List<Student> logincheck(String username, String password);
	
}
