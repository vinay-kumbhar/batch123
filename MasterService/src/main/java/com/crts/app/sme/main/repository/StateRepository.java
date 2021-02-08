package com.crts.app.sme.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.State;

@Repository
public interface StateRepository extends CrudRepository<State, String>
{
	public Iterable<State> findAllByCountryCountryCode(String countryCode);

}
