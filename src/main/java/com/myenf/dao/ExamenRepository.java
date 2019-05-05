package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myenf.entities.Examen;

public interface ExamenRepository  extends JpaRepository<Examen, Integer> {

}
