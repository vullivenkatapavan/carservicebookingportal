package com.edubridge.app1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app1.Entity.Carservice;
import com.edubridge.app1.service.CarserviceCategoryService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class CarserviceCategoryController {
	
	@Autowired
	private CarserviceCategoryService carserviceCategoryService;
	
	/*
	 
	 http://localhost:8181/api/v1/category/1/carservices
	 
	 */
	
	@PostMapping("/category/{categoryId}/carservice")
	public ResponseEntity<Carservice> addCarserviceToCategory(@PathVariable Long categoryId, @RequestBody Carservice carservice){
		
		carserviceCategoryService.addProductToCategory(categoryId, carservice);
		
		return new ResponseEntity<>(HttpStatus.OK);
		
		
	}


}
