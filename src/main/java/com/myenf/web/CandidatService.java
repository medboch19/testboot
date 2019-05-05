package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.myenf.entities.*;
import com.myenf.dao.CandidatRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CandidatService {

	@Autowired
	private CandidatRepository candidatRepository ;
	@RequestMapping(value="/candidats", method=RequestMethod.GET)
	public List<Candidat> getCandidats() {
		
		return candidatRepository.findAll();
	}
	
	@RequestMapping(value="/candidats", method=RequestMethod.POST)
	public Candidat save(@RequestBody Candidat c) {
		
		return candidatRepository.save(c);
	}
	
	
	@RequestMapping(value="/candidats/{id}", method=RequestMethod.GET)
	public Candidat getCoondidats(@PathVariable Integer id) {
		
		return candidatRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/candidats/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		candidatRepository.delete(id);
		
	}
	
	@RequestMapping(value="/candidats/{id}", method=RequestMethod.PUT)
	public Candidat save(@PathVariable Integer id, @RequestBody Candidat c) {
		c.setIdCandidat(id);
		return candidatRepository.save(c);
	}
	
	
	
}
