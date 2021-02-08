package com.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.main.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer> 
{

	List<Student> findAllByUsernameAndPassword(String username, String password);

}
