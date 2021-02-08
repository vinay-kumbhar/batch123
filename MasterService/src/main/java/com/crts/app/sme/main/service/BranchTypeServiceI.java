package com.crts.app.sme.main.service;

import com.crts.app.sme.main.model.BranchType;

public interface BranchTypeServiceI 
{
	public void saveBranchType(BranchType branchType);

	public Iterable<BranchType> getBranchType();

}
