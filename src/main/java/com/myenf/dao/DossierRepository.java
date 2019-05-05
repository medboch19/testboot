package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myenf.entities.Dossier;

public interface DossierRepository  extends JpaRepository<Dossier, Integer> {

}
