package com.crts.app.sme.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.crts.app.sme.main.model.Branch;
import com.crts.app.sme.main.model.BranchAddress;
import com.crts.app.sme.main.service.BranchServiceI;

@CrossOrigin("*")
@RestController
public class Branchcontroller 
{
	@Autowired
	BranchServiceI hs;
	
	@RequestMapping("/branch")
	public Branch presave()
	
	{
		BranchAddress a=new BranchAddress();
		a.setHouseNo("111");;
		a.setStreetName("sss");
		a.setArea("war");
		a.setLandMark("ll");
		a.setCity("wardha");
		a.setTaluka("aa");
		a.setDistrict("aaa");
		a.setState("mh");
		a.setPincode("111");
		a.setCountry("India");

		Branch b=new Branch();
		b.setBranchName("boi");
		b.setBranchType("main");
		b.setIfscCode("23423");
		b.setMicrCode(32423);
		b.setBranchCode(1231);
		b.setBranchContactno(32423);
		b.setBranchEmailid("wagh.diu");
		b.setBranchAddress(a);

		return b;
	}

	 @RequestMapping(value = "/postbranch",method = RequestMethod.POST)
	 public void post(@RequestBody Branch b)
	 {
		
			 System.out.println(b.getBranchId());
			 System.out.println(b.getBranchName());
			 System.out.println(b.getBranchType());
			 System.out.println(b.getMicrCode());
			 System.out.println(b.getIfscCode());
			 System.out.println(b.getBranchType());
			 System.out.println(b.getBranchCode());
			 System.out.println(b.getBranchContactno());
			 System.out.println(b.getBranchEmailid());
			 System.out.println(b.getBranchAddress().getAddressId());
			 System.out.println(b.getBranchAddress().getHouseNo());
			 System.out.println(b.getBranchAddress().getStreetName());
			 System.out.println(b.getBranchAddress().getArea());
			 System.out.println(b.getBranchAddress().getLandMark());
			 System.out.println(b.getBranchAddress().getCity());
			 System.out.println(b.getBranchAddress().getTaluka());
			 System.out.println(b.getBranchAddress().getDistrict());
			 System.out.println(b.getBranchAddress().getState());
			 System.out.println(b.getBranchAddress().getPincode());
			 System.out.println(b.getBranchAddress().getCountry());
		
		      hs.addnewdata(b);
	 }
	 
	 @RequestMapping("/getbranch")
	 public List<Branch> get()
	 {
		 
		 List<Branch> l=hs.getdata();
		 for(Branch b:l)
		 {

			 System.out.println(b.getBranchId());
			 System.out.println(b.getBranchName());
			 System.out.println(b.getBranchType());
			 System.out.println(b.getMicrCode());
			 System.out.println(b.getIfscCode());
			 System.out.println(b.getBranchType());
			 System.out.println(b.getBranchCode());
			 System.out.println(b.getBranchContactno());
			 System.out.println(b.getBranchEmailid());
			 System.out.println(b.getBranchAddress().getAddressId());
			 System.out.println(b.getBranchAddress().getHouseNo());
			 System.out.println(b.getBranchAddress().getStreetName());
			 System.out.println(b.getBranchAddress().getArea());
			 System.out.println(b.getBranchAddress().getLandMark());
			 System.out.println(b.getBranchAddress().getCity());
			 System.out.println(b.getBranchAddress().getTaluka());
			 System.out.println(b.getBranchAddress().getDistrict());
			 System.out.println(b.getBranchAddress().getState());
			 System.out.println(b.getBranchAddress().getPincode());
			 System.out.println(b.getBranchAddress().getCountry());
		 }
		return l;
	 }
	 

	
}
