package com.crts.app.sme.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.State;
import com.crts.app.sme.main.service.StateServiceI;

@CrossOrigin("*")
@RestController
public class StateController 
{
	@Autowired
	StateServiceI ss;
	
	
	@PostMapping(value="/saveState")
	public State saveState(@RequestBody State state)
	{
		ss.saveState(state);
		return state;		
	}
	
	@RequestMapping(value="/getState/{countryCode}")
	public Iterable<State> getState(@PathVariable("countryCode")String countryCode)
	{
		
		Iterable<State> states=ss.getState(countryCode);
		return states;		
	}

}
