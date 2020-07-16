package com.fblu.npi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fblu.npi.model.ContractPojo;
import com.fblu.npi.model.FloridaBluPojo;
import com.fblu.npi.model.NpiPojo;
import com.fblu.npi.repository.NpiRepository;
import com.fblu.npi.service.NpiService;

public class NpiServiceImpl implements NpiService{
	
	@Autowired
	NpiRepository npiRepository;

	@Override
	public FloridaBluPojo getData(String name, List<String> zipCodes) {
		FloridaBluPojo floridaBluPojo = new FloridaBluPojo();
		List<List<ContractPojo>> contractPojos = new ArrayList<>();
		List<NpiPojo> npiPojos = npiRepository.findByProviderNameAndZipCode(name, zipCodes);
		npiPojos.stream().forEach((npiPojo)->{
			List<String> contractIds = npiRepository.getContractIDs(npiPojo.getNpi_id());
			contractIds.stream().forEach((contractId)->{
				List<ContractPojo> contractPojo = npiRepository.getContractPojos(contractId);
				contractPojos.add(contractPojo);
			});;
		});
		floridaBluPojo.setContractPojos(contractPojos);
		floridaBluPojo.setNpis(npiPojos);
		return floridaBluPojo;
	}
	
	
	

}
