package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.SalleRepository;
import com.myenf.entities.Salle;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SalleService {

	@Autowired
	private SalleRepository salleRepository ;
	@RequestMapping(value="/salles", method=RequestMethod.GET)
	public List<Salle> getSalles() {
		
		return salleRepository.findAll();
	}
	
	@RequestMapping(value="/salles", method=RequestMethod.POST)
	public Salle save(@RequestBody Salle c) {
		
		return salleRepository.save(c);
	}
	
	
	@RequestMapping(value="/salles/{id}", method=RequestMethod.GET)
	public Salle getCoondidats(@PathVariable Integer id) {
		
		return salleRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/salles/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		salleRepository.delete(id);
		
	}
	
	@RequestMapping(value="/salles/{id}", method=RequestMethod.PUT)
	public Salle save(@PathVariable Integer id, @RequestBody Salle c) {
		c.setNumeroSalle(id);
		return salleRepository.save(c);
	}
	
}
