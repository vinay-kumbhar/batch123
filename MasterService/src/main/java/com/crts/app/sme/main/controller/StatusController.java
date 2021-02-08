package com.crts.app.sme.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.Status;
import com.crts.app.sme.main.service.StatusServiceI;

@CrossOrigin("*")
@RestController
public class StatusController 
{
	@Autowired
	StatusServiceI hs;

	
	@RequestMapping(value="/saveStatus",method=RequestMethod.POST)
	public Status saveStatus(@RequestBody Status status)
	{
		hs.saveStatus(status);
		return status;
		
	}
	
	@RequestMapping("/getStatus")
	public Iterable<Status> getStatus(Model model)
	{
		Iterable<Status> status=hs.getStatus();
		model.addAttribute("data", status);
		return status;
		
	}

}
