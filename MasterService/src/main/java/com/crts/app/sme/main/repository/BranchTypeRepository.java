package com.crts.app.sme.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.BranchType;


@Repository
public interface BranchTypeRepository extends CrudRepository<BranchType, Integer>
{




}
