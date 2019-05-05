package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myenf.entities.Session;

public interface SessionRepository  extends JpaRepository<Session, Integer> {

}
