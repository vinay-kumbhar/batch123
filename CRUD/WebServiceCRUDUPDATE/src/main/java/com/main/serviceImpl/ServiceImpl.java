package com.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Student;
import com.main.repository.HomeRepository;
import com.main.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI
{
	@Autowired
	HomeRepository hr;
	
	@Override
	public void updateuser(Student s) 
	{
		hr.save(s);
		
	}
}
