package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myenf.entities.Discipline;

public interface DisciplineRepository  extends JpaRepository<Discipline, Integer> {

}
