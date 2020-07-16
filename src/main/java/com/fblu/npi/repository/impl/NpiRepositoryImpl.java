package com.fblu.npi.repository.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.fblu.npi.model.ContractPojo;
import com.fblu.npi.model.NpiPojo;
import com.fblu.npi.repository.NpiRepository;

public class NpiRepositoryImpl implements NpiRepository{
	
	
	@Autowired
	JdbcTemplate template;
	
	@Autowired
	JdbcTemplate db2template;

	@Override
	public List<NpiPojo> findByProviderNameAndZipCode(String name, List<String> zipcodes) {
		
		String inSql = String.join(",", Collections.nCopies(zipcodes.size(), "?"));
		
		return template.query(String.format("select npi_id,tax_id,address,speciality from npi_prd_repository where name like ? and zipcode in (%s)",inSql),zipcodes.toArray(), (rs,rowNum)->
		new NpiPojo(rs.getString("npi_id"),rs.getString("tax_id"),rs.getString("address"),rs.getString("speciality")));
	}

	@Override
	public List<String> getContractIDs(String npiId) {
		// logic need to be added based on the query
		return null;
	}

	@Override
	public List<ContractPojo> getContractPojos(String contractId) {
		// logic need to be added based on the query
		return null;
	}
	
	
	

}
