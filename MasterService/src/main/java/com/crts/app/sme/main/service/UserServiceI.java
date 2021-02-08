package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.model.User;

public interface UserServiceI
{
	public void savedata(User user);
	public List<User> getdata();
}
