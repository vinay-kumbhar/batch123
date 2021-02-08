package com.crts.app.sme.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.Role;
import com.crts.app.sme.main.repository.Rolerepository;

@Service
public class RoleServiceimpl implements RoleserviceI
{

	@Autowired
	Rolerepository hr;

	@Override
	public void addnewdata(Role r) {
		hr.save(r);
		
	}

	@Override
	public List<Role> getdata() {
		
		return hr.findAll();
	}

}
