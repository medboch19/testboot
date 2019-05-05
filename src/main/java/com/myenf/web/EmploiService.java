package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.EmploiRepository;
import com.myenf.entities.Emploi;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmploiService {
	
	@Autowired
	private EmploiRepository emploiRepository ;
	@RequestMapping(value="/emplois", method=RequestMethod.GET)
	public List<Emploi> getEmplois() {
		
		return emploiRepository.findAll();
	}
	
	@RequestMapping(value="/emplois", method=RequestMethod.POST)
	public Emploi save(@RequestBody Emploi c) {
		
		return emploiRepository.save(c);
	}
	
	
	@RequestMapping(value="/emplois/{id}", method=RequestMethod.GET)
	public Emploi getCoondidats(@PathVariable Integer id) {
		
		return emploiRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/emplois/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		emploiRepository.delete(id);
		
	}
	
	@RequestMapping(value="/emplois/{id}", method=RequestMethod.PUT)
	public Emploi save(@PathVariable Integer id, @RequestBody Emploi c) {
		c.setIdEmploi(id);
		return emploiRepository.save(c);
	}
	

}
