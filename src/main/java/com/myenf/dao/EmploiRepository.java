package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myenf.entities.Emploi;

public interface EmploiRepository  extends JpaRepository<Emploi, Integer> {

}
