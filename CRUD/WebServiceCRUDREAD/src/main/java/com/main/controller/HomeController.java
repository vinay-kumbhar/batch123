package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.main.model.Student;
import com.main.serviceI.ServiceI;

@RestController
public class HomeController 
{
	@Autowired
	ServiceI rs;
@Autowired
	RestTemplate rt;
	
	@RequestMapping("/log/{username}/{password}")
	public List<Student> logincheck(@PathVariable("username") String username, @PathVariable("password") String password)
	{
		List<Student> sl=rs.logincheck(username, password);
		//rt.postForObject("http://localhost:8081/reg", sl, Student.class);
		return sl;
	}
	
	
	@RequestMapping(value = "/reg",method = RequestMethod.POST)
	public Student savedata(@RequestBody Student s)
	{
		System.out.println("hiiii"+s);
		String url="http://localhost:8081/regs";
		Student s1=rt.postForObject(url, s, Student.class);
		System.out.println(s1);
		return s1;
	
	}
	

}
