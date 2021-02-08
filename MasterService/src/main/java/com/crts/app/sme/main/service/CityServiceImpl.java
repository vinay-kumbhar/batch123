package com.crts.app.sme.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.City;
import com.crts.app.sme.main.repository.CityRepository;
import com.crts.app.sme.main.service.CityServiceI;

@Service
public class CityServiceImpl implements CityServiceI {
	@Autowired
	CityRepository cr;

	@Override
	public void saveCity(City city) {
		cr.save(city);

	}

	@Override
	public Iterable<City> getCity(String stateCode) 
	{
		
		return cr.findAllByStateStateCode(stateCode);
	}

}
