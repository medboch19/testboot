package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myenf.entities.Formateur;

public interface FormateurRepository  extends JpaRepository<Formateur, Integer> {

}
