package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myenf.entities.Salle;

public interface SalleRepository  extends JpaRepository<Salle, Integer> {

}
