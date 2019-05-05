package com.myenf.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myenf.entities.Note;

public interface NoteRepository  extends JpaRepository<Note, Integer> {

}
