package com.crts.app.sme.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>
{
	List<User> findAll();
	
}
