package com.crts.app.sme.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.State;
import com.crts.app.sme.main.repository.StateRepository;


@Service
public class StateServiceImpl implements StateServiceI
{
	@Autowired
	StateRepository sr;


	@Override
	public Iterable<State> getState(String countryCode) 
	{
		return sr.findAllByCountryCountryCode(countryCode);
	}


	@Override
	public void saveState(State state) 
	{
		sr.save(state);
		
	}
	

}
