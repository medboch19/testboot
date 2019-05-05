package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myenf.entities.Surveillant;

public interface SurveillantRepository  extends JpaRepository<Surveillant, Integer> {

}
