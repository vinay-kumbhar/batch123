package com.crts.app.sme.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.Branch;
import com.crts.app.sme.main.repository.Branchrepository;


@Service
public class BranchServiceimpl implements BranchServiceI
{

	@Autowired
	Branchrepository hr;

	@Override
	public void addnewdata(Branch b) {
		hr.save(b);
		
	}

	@Override
	public List<Branch> getdata() {
		
		return hr.findAll();
	}

}
