package com.crts.app.sme.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.BranchType;
import com.crts.app.sme.main.repository.BranchTypeRepository;
import com.crts.app.sme.main.service.BranchTypeServiceI;

@Service
public class BranchTypeServiceImpl implements BranchTypeServiceI
{
	@Autowired
	BranchTypeRepository hr;

	@Override
	public void saveBranchType(BranchType branchType) 
	{
		hr.save(branchType);
		
	}

	@Override
	public Iterable<BranchType> getBranchType() 
	{
		return hr.findAll();
	}
	

}
