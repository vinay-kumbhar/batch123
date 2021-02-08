package com.crts.app.sme.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.Status;
import com.crts.app.sme.main.repository.StatusRepository;
import com.crts.app.sme.main.service.StatusServiceI;

@Service
public class StatusServiceImpl implements StatusServiceI
{
	@Autowired
	StatusRepository hr;

	@Override
	public void saveStatus(Status status) 
	{
		hr.save(status);
		
	}

	@Override
	public Iterable<Status> getStatus() 
	{
		return hr.findAll();
	}
	

}
