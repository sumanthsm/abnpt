package com.fblu.npi.repository;

import java.util.List;

import com.fblu.npi.model.ContractPojo;
import com.fblu.npi.model.NpiPojo;

public interface NpiRepository {
	
	List<NpiPojo> findByProviderNameAndZipCode(String name,List<String> zipcodes);
	
	
	List<String> getContractIDs(String npiId);
	
	List<ContractPojo> getContractPojos(String contractId);

}
