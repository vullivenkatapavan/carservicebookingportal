package com.edubridge.app1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app1.dao.CarserviceRepository;


@Service
public class CarserviceService {
	
	@Autowired
	private CarserviceRepository repo;

}
