package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.NoteRepository;
import com.myenf.entities.Cand_unite_note;
import com.myenf.entities.Note;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class NoteService {
	@Autowired
	private NoteRepository noteRepository ;
	@RequestMapping(value="/notes", method=RequestMethod.GET)
	public List<Note> getNotes() {
		
		return noteRepository.findAll();
	}
	
	@RequestMapping(value="/notes", method=RequestMethod.POST)
	public Note save(@RequestBody Note c) {
		
		return noteRepository.save(c);
	}
	
	
	@RequestMapping(value="/notes/{id}", method=RequestMethod.GET)
	public Note getCoondidats(@PathVariable Integer id) {
		
		return noteRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/notes/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		noteRepository.delete(id);
		
	}
	
	@RequestMapping(value="/notes/{id}", method=RequestMethod.PUT)
	public Note save(@PathVariable Cand_unite_note  id, @RequestBody Note c) {
		c.setIdnote(id);
		return noteRepository.save(c);
	}
	

}
