package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myenf.entities.Candidat;

public interface CandidatRepository extends JpaRepository<Candidat, Integer> {
  
}
