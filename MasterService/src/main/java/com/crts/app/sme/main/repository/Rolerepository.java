package com.crts.app.sme.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.Role;


@Repository
public interface Rolerepository extends CrudRepository<Role, Integer>
{
	List<Role> findAll();
	
}
