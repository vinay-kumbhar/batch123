package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;
import com.main.serviceI.ServiceI;

@RestController
public class HomeController 
{
	@Autowired
	ServiceI rs;
	@RequestMapping("/update")
	public Student updatedata(@RequestBody Student s)
	{
		rs.updateuser(s);
		return s;
	}
	

}
