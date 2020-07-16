package com.fblu.npi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fblu.npi.model.FloridaBluPojo;
import com.fblu.npi.service.NpiService;

@RestController
public class NpiController {
	
	@Autowired
	NpiService npiService;
	
	
	@GetMapping("/getData")
	public ResponseEntity<FloridaBluPojo> getData(@PathVariable(value = "providerName") String name, @PathVariable(value = "zipcodes") List<String> zipCodes) {
		FloridaBluPojo floridaBluPojo = npiService.getData(name, zipCodes);
		return new ResponseEntity<>(floridaBluPojo,HttpStatus.OK);
	}
	
	

}
