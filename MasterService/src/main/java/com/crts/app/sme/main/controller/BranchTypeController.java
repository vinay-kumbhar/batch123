package com.crts.app.sme.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.BranchType;
import com.crts.app.sme.main.service.BranchTypeServiceI;

@CrossOrigin("*")
@RestController
public class BranchTypeController 
{
	@Autowired
	BranchTypeServiceI hs;

	@RequestMapping("/getbranchtype")
	public BranchType preSave()
	{
		BranchType b=new BranchType();
		b.setBranchType("A");
		b.setBranchTypeCode(1);
		b.setStatus("Active");
		return b;	
	}
	
	/* @RequestMapping(value="/saveBranchType",method=RequestMethod.POST) */
	@PostMapping(value="/saveBranchType")
	public BranchType saveBranchType(@RequestBody BranchType branchType)
	{
		hs.saveBranchType(branchType);
		return branchType;
		
	}
	
	@RequestMapping("/get")
	public Iterable<BranchType> getBranchType(Model model)
	{
		Iterable<BranchType> branchType=hs.getBranchType();
		model.addAttribute("data", branchType);
		return branchType;
		
	}

}
