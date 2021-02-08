package com.crts.app.sme.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.User;
import com.crts.app.sme.main.repository.UserRepository;


@Service
public class UserServiceImpl implements UserServiceI
{
	@Autowired
	UserRepository hr;

	@Override
	public void savedata(User user) {
		hr.save(user);
		
		
	}

	@Override
	public List<User> getdata() {
		
		return hr.findAll();
	}

		
}
