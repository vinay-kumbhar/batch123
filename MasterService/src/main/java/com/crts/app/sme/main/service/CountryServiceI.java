package com.crts.app.sme.main.service;

import com.crts.app.sme.main.model.Country;

public interface CountryServiceI 
{
	public void saveCountry(Country country);

	public Iterable<Country> getCountry();

}
