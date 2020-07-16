package com.fblu.npi.model;

import java.util.List;

public class FloridaBluPojo {
	
	
	private List<NpiPojo> npis;
	
	private List<List<ContractPojo>> contractPojos;

	public List<NpiPojo> getNpis() {
		return npis;
	}

	public void setNpis(List<NpiPojo> npis) {
		this.npis = npis;
	}

	public List<List<ContractPojo>> getContractPojos() {
		return contractPojos;
	}

	public void setContractPojos(List<List<ContractPojo>> contractPojos) {
		this.contractPojos = contractPojos;
	}
	
}
