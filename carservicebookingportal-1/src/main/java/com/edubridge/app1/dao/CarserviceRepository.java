package com.edubridge.app1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.app1.Entity.Carservice;

@Repository
public interface CarserviceRepository extends JpaRepository<Carservice, Long> {

}
