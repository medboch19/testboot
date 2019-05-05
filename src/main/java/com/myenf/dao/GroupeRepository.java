package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myenf.entities.Groupe;

public interface GroupeRepository  extends JpaRepository<Groupe, Integer> {

}
