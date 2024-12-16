package com.edubridge.app1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app1.Entity.Carservice;
import com.edubridge.app1.Entity.CarserviceCategory;
import com.edubridge.app1.dao.CarserviceCategoryRepository;
import com.edubridge.app1.dao.CarserviceRepository;

@Service
public class CarserviceCategoryService {
	
	@Autowired
	private CarserviceCategoryRepository carserviceCategoryRepository; 
	
	@Autowired
	private CarserviceRepository  carserviceRepository;
	
	public Carservice addProductToCategory(Long categoryId, Carservice carservice) {
		
	 Optional<CarserviceCategory> optional = carserviceCategoryRepository.findById(categoryId);
	 
	 if(optional.isPresent()) {
		 CarserviceCategory category = optional.get();
		 carservice.setCategory(category);
		 return  carserviceRepository.save(carservice);
		 
	 }else {
		 throw new RuntimeException("Category not found");
	 }
		
		
	}

}
