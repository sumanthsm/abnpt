package com.fblu.npi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fblu.npi.model.FloridaBluPojo;

@Service
public interface NpiService {
	
	
	public FloridaBluPojo getData(String name,List<String> zipCodes);

}
