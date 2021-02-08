package com.crts.app.sme.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.Country;
import com.crts.app.sme.main.service.CountryServiceI;


@CrossOrigin("*")
@RestController
public class CountryController 
{
	@Autowired
	CountryServiceI cs;

	
	@RequestMapping(value="/saveCountry",method=RequestMethod.POST)
	public Country saveCountry(@RequestBody Country country)
	{
		cs.saveCountry(country);
		return country;
		
	}
	
	@RequestMapping("/getCountry")
	public Iterable<Country> getCountry(Model model)
	{
		Iterable<Country> countries=cs.getCountry();
		model.addAttribute("data", countries);
		return countries;
		
	}

}
