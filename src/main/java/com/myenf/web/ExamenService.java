package com.myenf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myenf.dao.ExamenRepository;
import com.myenf.entities.Examen;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ExamenService {
	@Autowired
	private ExamenRepository examenRepository ;
	@RequestMapping(value="/examens", method=RequestMethod.GET)
	public List<Examen> getExamens() {
		
		return examenRepository.findAll();
	}
	
	@RequestMapping(value="/examens", method=RequestMethod.POST)
	public Examen save(@RequestBody Examen c) {
		
		return examenRepository.save(c);
	}
	
	
	@RequestMapping(value="/examens/{id}", method=RequestMethod.GET)
	public Examen getCoondidats(@PathVariable Integer id) {
		
		return examenRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/examens/{id}", method=RequestMethod.DELETE)
	public void supprimer(@PathVariable Integer id) {
		 
		examenRepository.delete(id);
		
	}
	
	@RequestMapping(value="/examens/{id}", method=RequestMethod.PUT)
	public Examen save(@PathVariable Integer id, @RequestBody Examen c) {
		c.setCodeExamen(id);
		return examenRepository.save(c);
	}
	
}
