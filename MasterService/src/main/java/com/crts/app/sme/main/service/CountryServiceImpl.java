package com.crts.app.sme.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.Country;
import com.crts.app.sme.main.repository.CountryRepository;



@Service
public class CountryServiceImpl implements CountryServiceI
{
	@Autowired
	CountryRepository cr;

	@Override
	public void saveCountry(Country country) 
	{
		cr.save(country);
		
	}

	@Override
	public Iterable<Country> getCountry() 
	{
		return cr.findAll();
	}
	

}
