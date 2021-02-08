package com.crts.app.sme.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.Branch;



@Repository
public interface Branchrepository extends CrudRepository<Branch, Integer>
{
	List<Branch> findAll();
	
}
