package com.fblu.npi.model;

public class NpiPojo {
	
    public NpiPojo() {
    	
    }

	public NpiPojo(String npi_id,String tax_id,String address,String speciality) {
		this.npi_id = npi_id;
		this.tax_id = tax_id;
		this.address = address;
		this.speciality = speciality;
	}
	
	
	private String npi_id;
	
	private String tax_id;
	
	private String address;
	
	private String speciality;

	public String getNpi_id() {
		return npi_id;
	}

	public void setNpi_id(String npi_id) {
		this.npi_id = npi_id;
	}


	public String getTax_id() {
		return tax_id;
	}

	public void setTax_id(String tax_id) {
		this.tax_id = tax_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
	

}
