package com.crts.app.sme.main.service;

import com.crts.app.sme.main.model.City;

public interface CityServiceI 
{

	public void saveCity(City city);

	public Iterable<City> getCity(String stateCode);

}
