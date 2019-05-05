package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myenf.entities.Grade;

public interface GradeRepository  extends JpaRepository<Grade, Integer> {

}
