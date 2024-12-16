package com.edubridge.app1.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Carservice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

     private String name;

     private String description; 

     private Double price;
	

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private CarserviceCategory category;

}
