package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myenf.entities.Commission;

public interface CommissionRepository  extends JpaRepository<Commission, Integer> {

}
