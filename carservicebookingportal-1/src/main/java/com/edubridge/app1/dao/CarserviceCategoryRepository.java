package com.edubridge.app1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edubridge.app1.Entity.CarserviceCategory;



@RepositoryRestResource(collectionResourceRel = "carserviceCategory", path = "carservice-category")
public interface CarserviceCategoryRepository extends JpaRepository<CarserviceCategory,Long>{

}
