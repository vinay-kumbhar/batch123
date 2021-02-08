package com.crts.app.sme.main.service;

import com.crts.app.sme.main.model.Status;

public interface StatusServiceI 
{
	public void saveStatus(Status status);

	public Iterable<Status> getStatus();

}
