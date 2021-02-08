package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;
import com.main.serviceI.ServiceI;

@RestController
public class HomeController 
{
	@Autowired
	ServiceI rs;
	
	@RequestMapping(value = "/regs",method = RequestMethod.POST)
	public Student savedata(@RequestBody Student s) 
	{
		System.out.println("In Home"+ s.getRollno());
		rs.savedata(s);
		System.out.println("Save In Home");
		System.out.println(s.getRollno());
		return s;
	}
	

}
