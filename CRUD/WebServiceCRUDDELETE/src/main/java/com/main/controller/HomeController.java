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
	@RequestMapping("/delete/{rollno}")
	public void deletedata(@PathVariable("rollno") int rollno)
	{
		rs.deleteuser(rollno);
	}
	

}
