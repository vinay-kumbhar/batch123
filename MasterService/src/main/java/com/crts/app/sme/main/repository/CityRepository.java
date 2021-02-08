package com.crts.app.sme.main.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, String>
{

	public Iterable<City> findAllByStateStateCode(String stateCode);

}
