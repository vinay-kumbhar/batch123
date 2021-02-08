package com.crts.app.sme.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.City;
import com.crts.app.sme.main.model.Country;
import com.crts.app.sme.main.model.State;
import com.crts.app.sme.main.service.CityServiceI;

@CrossOrigin("*")
@RestController
public class CityController 
{
	@Autowired
	CityServiceI cs;
	
	@RequestMapping("/city")
	public City preCity()
	{
		Country c=new Country();
		c.setCountryCode("+91");
		c.setCountryName("India");
		
		State s=new State();
		s.setStateCode("MH-27");
		s.setStateName("Maharashtra");
		s.setCountry(c);
		
		City city=new City();
		city.setCityCode(101);
		city.setCityName("Pune");
		city.setState(s);
		
		return city;
		
	}
	
	
	@RequestMapping(value="/saveCity",method=RequestMethod.POST)
	public City saveCity(@RequestBody City city)
	{
		cs.saveCity(city);
		return city;		
	}
	
	@RequestMapping(value="/getCity/{stateCode}")
	public Iterable<City> getCity(@PathVariable("stateCode")String state)
	{
		System.out.println(state);
		Iterable<City> city=cs.getCity(state);
		return city;		
	}

}
